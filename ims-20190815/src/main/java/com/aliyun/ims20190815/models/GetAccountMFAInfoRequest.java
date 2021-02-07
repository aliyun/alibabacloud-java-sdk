// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountMFAInfoRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetAccountMFAInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountMFAInfoRequest self = new GetAccountMFAInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountMFAInfoRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
