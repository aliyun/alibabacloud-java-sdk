// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAppSecretRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     */
    @NameInMap("AppId")
    public String appId;

    public static CreateAppSecretRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppSecretRequest self = new CreateAppSecretRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppSecretRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
