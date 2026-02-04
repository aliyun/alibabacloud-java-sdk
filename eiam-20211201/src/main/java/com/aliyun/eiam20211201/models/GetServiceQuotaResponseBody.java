// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetServiceQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceQuota")
    public GetServiceQuotaResponseBodyServiceQuota serviceQuota;

    public static GetServiceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceQuotaResponseBody self = new GetServiceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceQuotaResponseBody setServiceQuota(GetServiceQuotaResponseBodyServiceQuota serviceQuota) {
        this.serviceQuota = serviceQuota;
        return this;
    }
    public GetServiceQuotaResponseBodyServiceQuota getServiceQuota() {
        return this.serviceQuota;
    }

    public static class GetServiceQuotaResponseBodyServiceQuota extends TeaModel {
        /**
         * <p>Quota 配额的唯一标识。</p>
         * 
         * <strong>example:</strong>
         * <p>instanceTrialNumber</p>
         */
        @NameInMap("QuotaType")
        public String quotaType;

        /**
         * <p>Quota 配额的值。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("QuotaValue")
        public Long quotaValue;

        /**
         * <p>Quota 配额的当前用量。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UsedQuotaValue")
        public Long usedQuotaValue;

        public static GetServiceQuotaResponseBodyServiceQuota build(java.util.Map<String, ?> map) throws Exception {
            GetServiceQuotaResponseBodyServiceQuota self = new GetServiceQuotaResponseBodyServiceQuota();
            return TeaModel.build(map, self);
        }

        public GetServiceQuotaResponseBodyServiceQuota setQuotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }
        public String getQuotaType() {
            return this.quotaType;
        }

        public GetServiceQuotaResponseBodyServiceQuota setQuotaValue(Long quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public Long getQuotaValue() {
            return this.quotaValue;
        }

        public GetServiceQuotaResponseBodyServiceQuota setUsedQuotaValue(Long usedQuotaValue) {
            this.usedQuotaValue = usedQuotaValue;
            return this;
        }
        public Long getUsedQuotaValue() {
            return this.usedQuotaValue;
        }

    }

}
