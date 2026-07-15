// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteFeaturesMatchPlanResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the features of the current site are compatible with the target instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsPassed")
    public Boolean isPassed;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>65705631-908C-5D24-997C-17E0397721C8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about site quotas that do not meet the requirements.</p>
     */
    @NameInMap("UnPassedSiteQuotas")
    public java.util.List<CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas> unPassedSiteQuotas;

    public static CheckSiteFeaturesMatchPlanResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteFeaturesMatchPlanResponseBody self = new CheckSiteFeaturesMatchPlanResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSiteFeaturesMatchPlanResponseBody setIsPassed(Boolean isPassed) {
        this.isPassed = isPassed;
        return this;
    }
    public Boolean getIsPassed() {
        return this.isPassed;
    }

    public CheckSiteFeaturesMatchPlanResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckSiteFeaturesMatchPlanResponseBody setUnPassedSiteQuotas(java.util.List<CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas> unPassedSiteQuotas) {
        this.unPassedSiteQuotas = unPassedSiteQuotas;
        return this;
    }
    public java.util.List<CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas> getUnPassedSiteQuotas() {
        return this.unPassedSiteQuotas;
    }

    public static class CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas extends TeaModel {
        /**
         * <p>The quota value of the current site.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CurrentQuotaValue")
        public String currentQuotaValue;

        /**
         * <p>The quota value of the target instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DestQuotaValue")
        public String destQuotaValue;

        /**
         * <p>The quota name.</p>
         * 
         * <strong>example:</strong>
         * <p>cache_reserve</p>
         */
        @NameInMap("QuotaName")
        public String quotaName;

        public static CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas build(java.util.Map<String, ?> map) throws Exception {
            CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas self = new CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas();
            return TeaModel.build(map, self);
        }

        public CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas setCurrentQuotaValue(String currentQuotaValue) {
            this.currentQuotaValue = currentQuotaValue;
            return this;
        }
        public String getCurrentQuotaValue() {
            return this.currentQuotaValue;
        }

        public CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas setDestQuotaValue(String destQuotaValue) {
            this.destQuotaValue = destQuotaValue;
            return this;
        }
        public String getDestQuotaValue() {
            return this.destQuotaValue;
        }

        public CheckSiteFeaturesMatchPlanResponseBodyUnPassedSiteQuotas setQuotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }
        public String getQuotaName() {
            return this.quotaName;
        }

    }

}
