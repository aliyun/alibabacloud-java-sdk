// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCertificateInfoRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnDomainCertificateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCertificateInfoRequest self = new DescribeDcdnDomainCertificateInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCertificateInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
