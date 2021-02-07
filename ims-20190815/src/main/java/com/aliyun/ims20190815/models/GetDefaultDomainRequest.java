// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetDefaultDomainRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetDefaultDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultDomainRequest self = new GetDefaultDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultDomainRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
