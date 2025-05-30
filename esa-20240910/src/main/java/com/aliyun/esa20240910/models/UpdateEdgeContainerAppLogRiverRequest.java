// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppLogRiverRequest extends TeaModel {
    /**
     * <p>The application ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2852396.html">ListEdgeContainerApps</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The log path of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/hello.log</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Specifies whether to collect the standard output of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Stdout")
    public Boolean stdout;

    public static UpdateEdgeContainerAppLogRiverRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeContainerAppLogRiverRequest self = new UpdateEdgeContainerAppLogRiverRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeContainerAppLogRiverRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public UpdateEdgeContainerAppLogRiverRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public UpdateEdgeContainerAppLogRiverRequest setStdout(Boolean stdout) {
        this.stdout = stdout;
        return this;
    }
    public Boolean getStdout() {
        return this.stdout;
    }

}
