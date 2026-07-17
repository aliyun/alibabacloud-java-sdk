// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerAppVersionRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The version ID. You can call the <a href="~~ListEdgeContainerAppVersions~~">ListEdgeContainerAppVersions</a> operation to obtain the version ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ver-87962637161651****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static GetEdgeContainerAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerAppVersionRequest self = new GetEdgeContainerAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerAppVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetEdgeContainerAppVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
