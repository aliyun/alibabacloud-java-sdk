// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetPasswordPolicyRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetPasswordPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPasswordPolicyRequest self = new GetPasswordPolicyRequest();
        return TeaModel.build(map, self);
    }

    public GetPasswordPolicyRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
