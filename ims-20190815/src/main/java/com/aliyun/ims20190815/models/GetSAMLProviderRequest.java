// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSAMLProviderRequest extends TeaModel {
    @NameInMap("SAMLProviderName")
    public String SAMLProviderName;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetSAMLProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSAMLProviderRequest self = new GetSAMLProviderRequest();
        return TeaModel.build(map, self);
    }

    public GetSAMLProviderRequest setSAMLProviderName(String SAMLProviderName) {
        this.SAMLProviderName = SAMLProviderName;
        return this;
    }
    public String getSAMLProviderName() {
        return this.SAMLProviderName;
    }

    public GetSAMLProviderRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
