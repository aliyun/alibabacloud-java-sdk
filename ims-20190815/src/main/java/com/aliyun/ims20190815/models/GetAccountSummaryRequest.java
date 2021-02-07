// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSummaryRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetAccountSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSummaryRequest self = new GetAccountSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountSummaryRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
