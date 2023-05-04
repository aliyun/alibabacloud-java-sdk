// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCertificateInfoRequest extends TeaModel {
    /**
     * <p>The information about the SSL certificate.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDomainCertificateInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCertificateInfoRequest self = new DescribeDomainCertificateInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCertificateInfoRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
