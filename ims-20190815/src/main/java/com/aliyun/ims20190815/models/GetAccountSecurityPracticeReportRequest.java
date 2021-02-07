// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetAccountSecurityPracticeReportRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetAccountSecurityPracticeReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAccountSecurityPracticeReportRequest self = new GetAccountSecurityPracticeReportRequest();
        return TeaModel.build(map, self);
    }

    public GetAccountSecurityPracticeReportRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
