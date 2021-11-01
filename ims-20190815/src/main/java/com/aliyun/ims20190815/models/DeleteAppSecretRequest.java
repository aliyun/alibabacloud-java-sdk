// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAppSecretRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

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
