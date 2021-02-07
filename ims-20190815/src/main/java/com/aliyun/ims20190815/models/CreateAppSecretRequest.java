// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class CreateAppSecretRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

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

    public CreateAppSecretRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
