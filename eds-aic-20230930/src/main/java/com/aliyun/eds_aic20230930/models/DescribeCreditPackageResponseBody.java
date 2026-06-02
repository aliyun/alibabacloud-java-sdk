// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeCreditPackageResponseBody extends TeaModel {
    @NameInMap("CreditsPackageInfos")
    public java.util.List<DescribeCreditPackageResponseBodyCreditsPackageInfos> creditsPackageInfos;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsFirstPurchase")
    public Boolean isFirstPurchase;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalAvailableCredits")
    public String totalAvailableCredits;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalExhaustedCredit")
    public String totalExhaustedCredit;

    public static DescribeCreditPackageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCreditPackageResponseBody self = new DescribeCreditPackageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCreditPackageResponseBody setCreditsPackageInfos(java.util.List<DescribeCreditPackageResponseBodyCreditsPackageInfos> creditsPackageInfos) {
        this.creditsPackageInfos = creditsPackageInfos;
        return this;
    }
    public java.util.List<DescribeCreditPackageResponseBodyCreditsPackageInfos> getCreditsPackageInfos() {
        return this.creditsPackageInfos;
    }

    public DescribeCreditPackageResponseBody setIsFirstPurchase(Boolean isFirstPurchase) {
        this.isFirstPurchase = isFirstPurchase;
        return this;
    }
    public Boolean getIsFirstPurchase() {
        return this.isFirstPurchase;
    }

    public DescribeCreditPackageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCreditPackageResponseBody setTotalAvailableCredits(String totalAvailableCredits) {
        this.totalAvailableCredits = totalAvailableCredits;
        return this;
    }
    public String getTotalAvailableCredits() {
        return this.totalAvailableCredits;
    }

    public DescribeCreditPackageResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCreditPackageResponseBody setTotalExhaustedCredit(String totalExhaustedCredit) {
        this.totalExhaustedCredit = totalExhaustedCredit;
        return this;
    }
    public String getTotalExhaustedCredit() {
        return this.totalExhaustedCredit;
    }

    public static class DescribeCreditPackageResponseBodyCreditsPackageInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>70</p>
         */
        @NameInMap("AvailableCredits")
        public String availableCredits;

        /**
         * <strong>example:</strong>
         * <p>crp-xagydbhfkah****</p>
         */
        @NameInMap("CreditPackageId")
        public String creditPackageId;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("CreditPackageStatus")
        public String creditPackageStatus;

        /**
         * <strong>example:</strong>
         * <p>2026-04-30 00:00:00</p>
         */
        @NameInMap("EffectiveTime")
        public String effectiveTime;

        /**
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("ExhaustedCredits")
        public String exhaustedCredits;

        /**
         * <strong>example:</strong>
         * <p>2026-10-30 00:00:00</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCredits")
        public String totalCredits;

        public static DescribeCreditPackageResponseBodyCreditsPackageInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCreditPackageResponseBodyCreditsPackageInfos self = new DescribeCreditPackageResponseBodyCreditsPackageInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCreditPackageResponseBodyCreditsPackageInfos setAvailableCredits(String availableCredits) {
            this.availableCredits = availableCredits;
            return this;
        }
        public String getAvailableCredits() {
            return this.availableCredits;
        }

        public DescribeCreditPackageResponseBodyCreditsPackageInfos setCreditPackageId(String creditPackageId) {
            this.creditPackageId = creditPackageId;
            return this;
        }
        public String getCreditPackageId() {
            return this.creditPackageId;
        }

        public DescribeCreditPackageResponseBodyCreditsPackageInfos setCreditPackageStatus(String creditPackageStatus) {
            this.creditPackageStatus = creditPackageStatus;
            return this;
        }
        public String getCreditPackageStatus() {
            return this.creditPackageStatus;
        }

        public DescribeCreditPackageResponseBodyCreditsPackageInfos setEffectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        public DescribeCreditPackageResponseBodyCreditsPackageInfos setExhaustedCredits(String exhaustedCredits) {
            this.exhaustedCredits = exhaustedCredits;
            return this;
        }
        public String getExhaustedCredits() {
            return this.exhaustedCredits;
        }

        public DescribeCreditPackageResponseBodyCreditsPackageInfos setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeCreditPackageResponseBodyCreditsPackageInfos setTotalCredits(String totalCredits) {
            this.totalCredits = totalCredits;
            return this;
        }
        public String getTotalCredits() {
            return this.totalCredits;
        }

    }

}
