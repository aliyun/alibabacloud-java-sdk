// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteEdgeContainerAppVersionRequest extends TeaModel {
    /**
     * <p>The application ID, which can be obtained by calling the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-96253477062511****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the version that you want to delete. To obtain the version ID, call the <a href="~~ListEdgeContainerAppVersions~~">ListEdgeContainerAppVersions</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ver-89884764010378****</p>
     */
    @NameInMap("VersionId")
    public String versionId;

    public static DeleteEdgeContainerAppVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteEdgeContainerAppVersionRequest self = new DeleteEdgeContainerAppVersionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteEdgeContainerAppVersionRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteEdgeContainerAppVersionRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
