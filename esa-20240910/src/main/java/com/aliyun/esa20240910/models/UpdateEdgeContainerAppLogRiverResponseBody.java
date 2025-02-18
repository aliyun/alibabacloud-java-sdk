// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppLogRiverResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>/root/hello.log</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <strong>example:</strong>
     * <p>42DE97FA-45D2-5615-9A31-55D9EC0D7563</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Stdout")
    public Boolean stdout;

    public static UpdateEdgeContainerAppLogRiverResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeContainerAppLogRiverResponseBody self = new UpdateEdgeContainerAppLogRiverResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeContainerAppLogRiverResponseBody setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateEdgeContainerAppLogRiverResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEdgeContainerAppLogRiverResponseBody setStdout(Boolean stdout) {
        this.stdout = stdout;
        return this;
    }
    public Boolean getStdout() {
        return this.stdout;
    }

}
