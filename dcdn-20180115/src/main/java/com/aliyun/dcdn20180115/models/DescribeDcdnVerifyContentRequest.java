// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnVerifyContentRequest extends TeaModel {
    /**
     * <p>The verification content.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeDcdnVerifyContentRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnVerifyContentRequest self = new DescribeDcdnVerifyContentRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnVerifyContentRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
