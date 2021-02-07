// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetCredentialReportRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GetCredentialReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialReportRequest self = new GetCredentialReportRequest();
        return TeaModel.build(map, self);
    }

    public GetCredentialReportRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
