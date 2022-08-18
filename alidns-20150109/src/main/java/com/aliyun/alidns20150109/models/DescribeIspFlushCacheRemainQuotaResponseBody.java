// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeIspFlushCacheRemainQuotaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TelecomRemainQuota")
    public Integer telecomRemainQuota;

    public static DescribeIspFlushCacheRemainQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIspFlushCacheRemainQuotaResponseBody self = new DescribeIspFlushCacheRemainQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIspFlushCacheRemainQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIspFlushCacheRemainQuotaResponseBody setTelecomRemainQuota(Integer telecomRemainQuota) {
        this.telecomRemainQuota = telecomRemainQuota;
        return this;
    }
    public Integer getTelecomRemainQuota() {
        return this.telecomRemainQuota;
    }

}
