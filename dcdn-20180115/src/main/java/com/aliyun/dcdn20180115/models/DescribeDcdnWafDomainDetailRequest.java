// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnWafDomainDetailRequest extends TeaModel {
    /**
     * <p>The types of the protection policies.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnWafDomainDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnWafDomainDetailRequest self = new DescribeDcdnWafDomainDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnWafDomainDetailRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
