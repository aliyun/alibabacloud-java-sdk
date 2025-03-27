// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppLogRiverResponseBody extends TeaModel {
    /**
     * <p>The log path of the container. It must be an absolute path that starts with a forward slash (/). You can use asterisks (\*) and question marks (?) as wildcards.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/hello.log</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the standard output of the container is collected.</p>
     */
    @NameInMap("Stdout")
    public Boolean stdout;

    public static GetEdgeContainerAppLogRiverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppLogRiverResponseBody self = new GetEdgeContainerAppLogRiverResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppLogRiverResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public GetEdgeContainerAppLogRiverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeContainerAppLogRiverResponseBody setStdout(Boolean stdout) {
        this.stdout = stdout;
        return this;
    }
    public Boolean getStdout() {
        return this.stdout;
    }

}
