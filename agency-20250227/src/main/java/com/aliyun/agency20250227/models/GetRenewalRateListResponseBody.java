// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20250227.models;

import com.aliyun.tea.*;

public class GetRenewalRateListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<GetRenewalRateListResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRenewalRateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRenewalRateListResponseBody self = new GetRenewalRateListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRenewalRateListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRenewalRateListResponseBody setData(java.util.List<GetRenewalRateListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetRenewalRateListResponseBodyData> getData() {
        return this.data;
    }

    public GetRenewalRateListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRenewalRateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRenewalRateListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRenewalRateListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CustomerAdjustedRenewalAmountDue")
        public Double customerAdjustedRenewalAmountDue;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CustomerOtherBillAmount")
        public Double customerOtherBillAmount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FinalCustomerRenewalAmountDue")
        public Double finalCustomerRenewalAmountDue;

        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("FinalCustomerRenewalRate")
        public Double finalCustomerRenewalRate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FinalCustomerRenewedAmount")
        public Double finalCustomerRenewedAmount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FinalOtherBillAmount")
        public Double finalOtherBillAmount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FinalRenewalAmountDue")
        public Double finalRenewalAmountDue;

        /**
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        @NameInMap("FinalRenewalRate")
        public Double finalRenewalRate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FinalRenewedAmount")
        public Double finalRenewedAmount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FinalSubPartnerRenewalAmountDue")
        public Double finalSubPartnerRenewalAmountDue;

        /**
         * <strong>example:</strong>
         * <p>0.85</p>
         */
        @NameInMap("FinalSubPartnerRenewalRate")
        public Double finalSubPartnerRenewalRate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FinalSubPartnerRenewedAmount")
        public Double finalSubPartnerRenewedAmount;

        /**
         * <strong>example:</strong>
         * <p>2025Q4</p>
         */
        @NameInMap("FiscalYearAndQuarter")
        public String fiscalYearAndQuarter;

        /**
         * <strong>example:</strong>
         * <p>P123423453</p>
         */
        @NameInMap("MasterPid")
        public String masterPid;

        @NameInMap("MasterPidName")
        public String masterPidName;

        /**
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("SpecialCustomerRenewRatio")
        public Double specialCustomerRenewRatio;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SpecialCustomerRenewalAmountDue")
        public Double specialCustomerRenewalAmountDue;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SpecialCustomerRenewedAmount")
        public Double specialCustomerRenewedAmount;

        /**
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        @NameInMap("SpecialFinalRenewRatio")
        public Double specialFinalRenewRatio;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SpecialFinalRenewalAmountDue")
        public Double specialFinalRenewalAmountDue;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SpecialFinalRenewedAmount")
        public Double specialFinalRenewedAmount;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("SpecialSubPartnerRenewRatio")
        public Double specialSubPartnerRenewRatio;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SpecialSubPartnerRenewalAmountDue")
        public Double specialSubPartnerRenewalAmountDue;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SpecialSubPartnerRenewedAmount")
        public Double specialSubPartnerRenewedAmount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SubPartnerAdjustedRenewalAmountDue")
        public Double subPartnerAdjustedRenewalAmountDue;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SubPartnerOtherBillAmount")
        public Double subPartnerOtherBillAmount;

        public static GetRenewalRateListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRenewalRateListResponseBodyData self = new GetRenewalRateListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRenewalRateListResponseBodyData setCustomerAdjustedRenewalAmountDue(Double customerAdjustedRenewalAmountDue) {
            this.customerAdjustedRenewalAmountDue = customerAdjustedRenewalAmountDue;
            return this;
        }
        public Double getCustomerAdjustedRenewalAmountDue() {
            return this.customerAdjustedRenewalAmountDue;
        }

        public GetRenewalRateListResponseBodyData setCustomerOtherBillAmount(Double customerOtherBillAmount) {
            this.customerOtherBillAmount = customerOtherBillAmount;
            return this;
        }
        public Double getCustomerOtherBillAmount() {
            return this.customerOtherBillAmount;
        }

        public GetRenewalRateListResponseBodyData setFinalCustomerRenewalAmountDue(Double finalCustomerRenewalAmountDue) {
            this.finalCustomerRenewalAmountDue = finalCustomerRenewalAmountDue;
            return this;
        }
        public Double getFinalCustomerRenewalAmountDue() {
            return this.finalCustomerRenewalAmountDue;
        }

        public GetRenewalRateListResponseBodyData setFinalCustomerRenewalRate(Double finalCustomerRenewalRate) {
            this.finalCustomerRenewalRate = finalCustomerRenewalRate;
            return this;
        }
        public Double getFinalCustomerRenewalRate() {
            return this.finalCustomerRenewalRate;
        }

        public GetRenewalRateListResponseBodyData setFinalCustomerRenewedAmount(Double finalCustomerRenewedAmount) {
            this.finalCustomerRenewedAmount = finalCustomerRenewedAmount;
            return this;
        }
        public Double getFinalCustomerRenewedAmount() {
            return this.finalCustomerRenewedAmount;
        }

        public GetRenewalRateListResponseBodyData setFinalOtherBillAmount(Double finalOtherBillAmount) {
            this.finalOtherBillAmount = finalOtherBillAmount;
            return this;
        }
        public Double getFinalOtherBillAmount() {
            return this.finalOtherBillAmount;
        }

        public GetRenewalRateListResponseBodyData setFinalRenewalAmountDue(Double finalRenewalAmountDue) {
            this.finalRenewalAmountDue = finalRenewalAmountDue;
            return this;
        }
        public Double getFinalRenewalAmountDue() {
            return this.finalRenewalAmountDue;
        }

        public GetRenewalRateListResponseBodyData setFinalRenewalRate(Double finalRenewalRate) {
            this.finalRenewalRate = finalRenewalRate;
            return this;
        }
        public Double getFinalRenewalRate() {
            return this.finalRenewalRate;
        }

        public GetRenewalRateListResponseBodyData setFinalRenewedAmount(Double finalRenewedAmount) {
            this.finalRenewedAmount = finalRenewedAmount;
            return this;
        }
        public Double getFinalRenewedAmount() {
            return this.finalRenewedAmount;
        }

        public GetRenewalRateListResponseBodyData setFinalSubPartnerRenewalAmountDue(Double finalSubPartnerRenewalAmountDue) {
            this.finalSubPartnerRenewalAmountDue = finalSubPartnerRenewalAmountDue;
            return this;
        }
        public Double getFinalSubPartnerRenewalAmountDue() {
            return this.finalSubPartnerRenewalAmountDue;
        }

        public GetRenewalRateListResponseBodyData setFinalSubPartnerRenewalRate(Double finalSubPartnerRenewalRate) {
            this.finalSubPartnerRenewalRate = finalSubPartnerRenewalRate;
            return this;
        }
        public Double getFinalSubPartnerRenewalRate() {
            return this.finalSubPartnerRenewalRate;
        }

        public GetRenewalRateListResponseBodyData setFinalSubPartnerRenewedAmount(Double finalSubPartnerRenewedAmount) {
            this.finalSubPartnerRenewedAmount = finalSubPartnerRenewedAmount;
            return this;
        }
        public Double getFinalSubPartnerRenewedAmount() {
            return this.finalSubPartnerRenewedAmount;
        }

        public GetRenewalRateListResponseBodyData setFiscalYearAndQuarter(String fiscalYearAndQuarter) {
            this.fiscalYearAndQuarter = fiscalYearAndQuarter;
            return this;
        }
        public String getFiscalYearAndQuarter() {
            return this.fiscalYearAndQuarter;
        }

        public GetRenewalRateListResponseBodyData setMasterPid(String masterPid) {
            this.masterPid = masterPid;
            return this;
        }
        public String getMasterPid() {
            return this.masterPid;
        }

        public GetRenewalRateListResponseBodyData setMasterPidName(String masterPidName) {
            this.masterPidName = masterPidName;
            return this;
        }
        public String getMasterPidName() {
            return this.masterPidName;
        }

        public GetRenewalRateListResponseBodyData setSpecialCustomerRenewRatio(Double specialCustomerRenewRatio) {
            this.specialCustomerRenewRatio = specialCustomerRenewRatio;
            return this;
        }
        public Double getSpecialCustomerRenewRatio() {
            return this.specialCustomerRenewRatio;
        }

        public GetRenewalRateListResponseBodyData setSpecialCustomerRenewalAmountDue(Double specialCustomerRenewalAmountDue) {
            this.specialCustomerRenewalAmountDue = specialCustomerRenewalAmountDue;
            return this;
        }
        public Double getSpecialCustomerRenewalAmountDue() {
            return this.specialCustomerRenewalAmountDue;
        }

        public GetRenewalRateListResponseBodyData setSpecialCustomerRenewedAmount(Double specialCustomerRenewedAmount) {
            this.specialCustomerRenewedAmount = specialCustomerRenewedAmount;
            return this;
        }
        public Double getSpecialCustomerRenewedAmount() {
            return this.specialCustomerRenewedAmount;
        }

        public GetRenewalRateListResponseBodyData setSpecialFinalRenewRatio(Double specialFinalRenewRatio) {
            this.specialFinalRenewRatio = specialFinalRenewRatio;
            return this;
        }
        public Double getSpecialFinalRenewRatio() {
            return this.specialFinalRenewRatio;
        }

        public GetRenewalRateListResponseBodyData setSpecialFinalRenewalAmountDue(Double specialFinalRenewalAmountDue) {
            this.specialFinalRenewalAmountDue = specialFinalRenewalAmountDue;
            return this;
        }
        public Double getSpecialFinalRenewalAmountDue() {
            return this.specialFinalRenewalAmountDue;
        }

        public GetRenewalRateListResponseBodyData setSpecialFinalRenewedAmount(Double specialFinalRenewedAmount) {
            this.specialFinalRenewedAmount = specialFinalRenewedAmount;
            return this;
        }
        public Double getSpecialFinalRenewedAmount() {
            return this.specialFinalRenewedAmount;
        }

        public GetRenewalRateListResponseBodyData setSpecialSubPartnerRenewRatio(Double specialSubPartnerRenewRatio) {
            this.specialSubPartnerRenewRatio = specialSubPartnerRenewRatio;
            return this;
        }
        public Double getSpecialSubPartnerRenewRatio() {
            return this.specialSubPartnerRenewRatio;
        }

        public GetRenewalRateListResponseBodyData setSpecialSubPartnerRenewalAmountDue(Double specialSubPartnerRenewalAmountDue) {
            this.specialSubPartnerRenewalAmountDue = specialSubPartnerRenewalAmountDue;
            return this;
        }
        public Double getSpecialSubPartnerRenewalAmountDue() {
            return this.specialSubPartnerRenewalAmountDue;
        }

        public GetRenewalRateListResponseBodyData setSpecialSubPartnerRenewedAmount(Double specialSubPartnerRenewedAmount) {
            this.specialSubPartnerRenewedAmount = specialSubPartnerRenewedAmount;
            return this;
        }
        public Double getSpecialSubPartnerRenewedAmount() {
            return this.specialSubPartnerRenewedAmount;
        }

        public GetRenewalRateListResponseBodyData setSubPartnerAdjustedRenewalAmountDue(Double subPartnerAdjustedRenewalAmountDue) {
            this.subPartnerAdjustedRenewalAmountDue = subPartnerAdjustedRenewalAmountDue;
            return this;
        }
        public Double getSubPartnerAdjustedRenewalAmountDue() {
            return this.subPartnerAdjustedRenewalAmountDue;
        }

        public GetRenewalRateListResponseBodyData setSubPartnerOtherBillAmount(Double subPartnerOtherBillAmount) {
            this.subPartnerOtherBillAmount = subPartnerOtherBillAmount;
            return this;
        }
        public Double getSubPartnerOtherBillAmount() {
            return this.subPartnerOtherBillAmount;
        }

    }

}
