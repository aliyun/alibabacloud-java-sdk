// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteAppRequest extends TeaModel {
    /**
     * <p>The ID of the application to be deleted. <strong>This parameter is required</strong>, and the application must belong to the current account. You must dissociate the image references from the target application or version before deletion.</p>
     * 
     * <strong>example:</strong>
     * <p>app-bp1example****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the application version to be deleted. If specified, only the adapter corresponding to this application version is deleted. If omitted, the entire application and its adapters are deleted. If the application has no other adapters after the version is deleted, the application record is also deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>apv-bp1example****</p>
     */
    @NameInMap("AppVersionId")
    public String appVersionId;

    public static DeleteAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppRequest self = new DeleteAppRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppRequest setAppVersionId(String appVersionId) {
        this.appVersionId = appVersionId;
        return this;
    }
    public String getAppVersionId() {
        return this.appVersionId;
    }

}
