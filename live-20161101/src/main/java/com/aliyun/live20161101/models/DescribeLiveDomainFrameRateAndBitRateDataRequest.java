// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainFrameRateAndBitRateDataRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("QueryTime")
    public String queryTime;

    public static DescribeLiveDomainFrameRateAndBitRateDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainFrameRateAndBitRateDataRequest self = new DescribeLiveDomainFrameRateAndBitRateDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainFrameRateAndBitRateDataRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLiveDomainFrameRateAndBitRateDataRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainFrameRateAndBitRateDataRequest setQueryTime(String queryTime) {
        this.queryTime = queryTime;
        return this;
    }
    public String getQueryTime() {
        return this.queryTime;
    }

}
