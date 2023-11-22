// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnOriginSiteHealthStatusRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnOriginSiteHealthStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnOriginSiteHealthStatusRequest self = new DescribeDcdnOriginSiteHealthStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnOriginSiteHealthStatusRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
