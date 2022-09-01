// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2VipsRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnL2VipsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2VipsRequest self = new DescribeDcdnL2VipsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2VipsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
