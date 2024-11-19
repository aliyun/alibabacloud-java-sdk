// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCustomDomainSampleRateRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    public static DescribeCustomDomainSampleRateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomDomainSampleRateRequest self = new DescribeCustomDomainSampleRateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomDomainSampleRateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
