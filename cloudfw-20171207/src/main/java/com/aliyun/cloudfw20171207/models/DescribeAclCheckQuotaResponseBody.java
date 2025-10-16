// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeAclCheckQuotaResponseBody extends TeaModel {
    @NameInMap("Quota")
    public DescribeAclCheckQuotaResponseBodyQuota quota;

    /**
     * <strong>example:</strong>
     * <p>7D5483BF-2262-586D-8706-BDDB8B42****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAclCheckQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAclCheckQuotaResponseBody self = new DescribeAclCheckQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAclCheckQuotaResponseBody setQuota(DescribeAclCheckQuotaResponseBodyQuota quota) {
        this.quota = quota;
        return this;
    }
    public DescribeAclCheckQuotaResponseBodyQuota getQuota() {
        return this.quota;
    }

    public DescribeAclCheckQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAclCheckQuotaResponseBodyQuota extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("AvailableQuota")
        public Long availableQuota;

        /**
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("ConsumedQuota")
        public Long consumedQuota;

        /**
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("TotalQuota")
        public Long totalQuota;

        /**
         * <strong>example:</strong>
         * <p>1724982259</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeAclCheckQuotaResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            DescribeAclCheckQuotaResponseBodyQuota self = new DescribeAclCheckQuotaResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public DescribeAclCheckQuotaResponseBodyQuota setAvailableQuota(Long availableQuota) {
            this.availableQuota = availableQuota;
            return this;
        }
        public Long getAvailableQuota() {
            return this.availableQuota;
        }

        public DescribeAclCheckQuotaResponseBodyQuota setConsumedQuota(Long consumedQuota) {
            this.consumedQuota = consumedQuota;
            return this;
        }
        public Long getConsumedQuota() {
            return this.consumedQuota;
        }

        public DescribeAclCheckQuotaResponseBodyQuota setTotalQuota(Long totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }
        public Long getTotalQuota() {
            return this.totalQuota;
        }

        public DescribeAclCheckQuotaResponseBodyQuota setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
