// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainCertificateInfoRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    public static DescribeLiveDomainCertificateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainCertificateInfoRequest self = new DescribeLiveDomainCertificateInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainCertificateInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
