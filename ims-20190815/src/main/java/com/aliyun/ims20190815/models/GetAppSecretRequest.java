// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAppSecretRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The ID of the application secret.</p>
     */
    @NameInMap("AppSecretId")
    public String appSecretId;

    public static GetAppSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSecretRequest self = new GetAppSecretRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSecretRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetAppSecretRequest setAppSecretId(String appSecretId) {
        this.appSecretId = appSecretId;
        return this;
    }
    public String getAppSecretId() {
        return this.appSecretId;
    }

}
