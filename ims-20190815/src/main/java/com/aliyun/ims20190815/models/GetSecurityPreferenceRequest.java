// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetSecurityPreferenceRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetSecurityPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityPreferenceRequest self = new GetSecurityPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public GetSecurityPreferenceRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
