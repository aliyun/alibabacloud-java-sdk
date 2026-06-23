// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UpdateEdgeContainerAppLogRiverRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="https://help.aliyun.com/document_detail/2852396.html">ListEdgeContainerApps</a> operation to obtain the application ID.</p>
     * <blockquote>
     * <p>Notice: The AppId is in the format of the app- prefix followed by a numeric suffix, with a total length of 20 to 64 characters (example: app-8806886***83794688). Call ListEdgeContainerApps to obtain an existing AppId, or call CreateEdgeContainerApp to create an application first.</notice>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The log file of the container.</p>
     * 
     * <strong>example:</strong>
     * <p>/root/hello.log</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Specifies whether to enable standard output collection for the container.</p>
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
