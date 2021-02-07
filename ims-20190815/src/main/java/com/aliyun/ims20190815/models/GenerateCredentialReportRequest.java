// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GenerateCredentialReportRequest extends TeaModel {
    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

    public static GenerateCredentialReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateCredentialReportRequest self = new GenerateCredentialReportRequest();
        return TeaModel.build(map, self);
    }

    public GenerateCredentialReportRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
