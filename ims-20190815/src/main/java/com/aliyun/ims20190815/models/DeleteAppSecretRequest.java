// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAppSecretRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>472457090344041****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the application secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2efd5004-005c-4f05-83c6-5b1dd176****</p>
     */
    @NameInMap("AppSecretId")
    public String appSecretId;

    public static DeleteAppSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppSecretRequest self = new DeleteAppSecretRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppSecretRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppSecretRequest setAppSecretId(String appSecretId) {
        this.appSecretId = appSecretId;
        return this;
    }
    public String getAppSecretId() {
        return this.appSecretId;
    }

}
