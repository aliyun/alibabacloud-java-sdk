// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePrivateDnsStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1726305596</p>
     */
    @NameInMap("DomainNameCreatedEndTime")
    public Long domainNameCreatedEndTime;

    /**
     * <strong>example:</strong>
     * <p>1725864531</p>
     */
    @NameInMap("DomainNameCreatedStartTime")
    public Long domainNameCreatedStartTime;

    public static DescribePrivateDnsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePrivateDnsStatisticsRequest self = new DescribePrivateDnsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePrivateDnsStatisticsRequest setDomainNameCreatedEndTime(Long domainNameCreatedEndTime) {
        this.domainNameCreatedEndTime = domainNameCreatedEndTime;
        return this;
    }
    public Long getDomainNameCreatedEndTime() {
        return this.domainNameCreatedEndTime;
    }

    public DescribePrivateDnsStatisticsRequest setDomainNameCreatedStartTime(Long domainNameCreatedStartTime) {
        this.domainNameCreatedStartTime = domainNameCreatedStartTime;
        return this;
    }
    public Long getDomainNameCreatedStartTime() {
        return this.domainNameCreatedStartTime;
    }

}
