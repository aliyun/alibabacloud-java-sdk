// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetUserSsoSettingsRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetUserSsoSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserSsoSettingsRequest self = new GetUserSsoSettingsRequest();
        return TeaModel.build(map, self);
    }

    public GetUserSsoSettingsRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
