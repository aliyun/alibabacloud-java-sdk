// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetInstanceQuotaResponseBody extends TeaModel {
    @NameInMap("Quota")
    public GetInstanceQuotaResponseBodyQuota quota;

    /**
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetInstanceQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceQuotaResponseBody self = new GetInstanceQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInstanceQuotaResponseBody setQuota(GetInstanceQuotaResponseBodyQuota quota) {
        this.quota = quota;
        return this;
    }
    public GetInstanceQuotaResponseBodyQuota getQuota() {
        return this.quota;
    }

    public GetInstanceQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetInstanceQuotaResponseBodyQuota extends TeaModel {
        /**
         * <p>Quota 配额的Key，同请求参数</p>
         * 
         * <strong>example:</strong>
         * <p>userMaxNumber</p>
         */
        @NameInMap("QuotaKey")
        public String quotaKey;

        /**
         * <p>Quota 配额的值。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("QuotaValue")
        public Integer quotaValue;

        public static GetInstanceQuotaResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            GetInstanceQuotaResponseBodyQuota self = new GetInstanceQuotaResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public GetInstanceQuotaResponseBodyQuota setQuotaKey(String quotaKey) {
            this.quotaKey = quotaKey;
            return this;
        }
        public String getQuotaKey() {
            return this.quotaKey;
        }

        public GetInstanceQuotaResponseBodyQuota setQuotaValue(Integer quotaValue) {
            this.quotaValue = quotaValue;
            return this;
        }
        public Integer getQuotaValue() {
            return this.quotaValue;
        }

    }

}
