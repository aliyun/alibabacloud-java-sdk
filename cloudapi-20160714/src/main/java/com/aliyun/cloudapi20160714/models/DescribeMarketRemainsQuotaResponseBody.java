// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeMarketRemainsQuotaResponseBody extends TeaModel {
    @NameInMap("RemainsQuota")
    public Long remainsQuota;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMarketRemainsQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMarketRemainsQuotaResponseBody self = new DescribeMarketRemainsQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMarketRemainsQuotaResponseBody setRemainsQuota(Long remainsQuota) {
        this.remainsQuota = remainsQuota;
        return this;
    }
    public Long getRemainsQuota() {
        return this.remainsQuota;
    }

    public DescribeMarketRemainsQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
