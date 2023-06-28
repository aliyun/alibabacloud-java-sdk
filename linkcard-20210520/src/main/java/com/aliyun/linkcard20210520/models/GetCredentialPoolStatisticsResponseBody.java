// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCredentialPoolStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCredentialPoolStatisticsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCredentialPoolStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialPoolStatisticsResponseBody self = new GetCredentialPoolStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCredentialPoolStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCredentialPoolStatisticsResponseBody setData(GetCredentialPoolStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCredentialPoolStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetCredentialPoolStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCredentialPoolStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCredentialPoolStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCredentialPoolStatisticsResponseBodyData extends TeaModel {
        @NameInMap("CardActiveNum")
        public Long cardActiveNum;

        @NameInMap("CardTotalNum")
        public Long cardTotalNum;

        @NameInMap("CredentialInstanceId")
        public String credentialInstanceId;

        @NameInMap("CredentialNO")
        public String credentialNO;

        @NameInMap("CredentialType")
        public String credentialType;

        @NameInMap("EffectiveAvailableFlow")
        public String effectiveAvailableFlow;

        @NameInMap("EffectiveTotalFlow")
        public String effectiveTotalFlow;

        @NameInMap("MonthExceedFee")
        public Long monthExceedFee;

        @NameInMap("MonthFeatureFee")
        public Long monthFeatureFee;

        @NameInMap("MonthUsedAmount")
        public Long monthUsedAmount;

        @NameInMap("PoolAvaiable")
        public String poolAvaiable;

        @NameInMap("PoolGrandTotal")
        public String poolGrandTotal;

        @NameInMap("PoolGrandTotalUsed")
        public String poolGrandTotalUsed;

        @NameInMap("PoolOutUsed")
        public String poolOutUsed;

        @NameInMap("PoolUsed")
        public String poolUsed;

        @NameInMap("SmsUsed")
        public Long smsUsed;

        public static GetCredentialPoolStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCredentialPoolStatisticsResponseBodyData self = new GetCredentialPoolStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCredentialPoolStatisticsResponseBodyData setCardActiveNum(Long cardActiveNum) {
            this.cardActiveNum = cardActiveNum;
            return this;
        }
        public Long getCardActiveNum() {
            return this.cardActiveNum;
        }

        public GetCredentialPoolStatisticsResponseBodyData setCardTotalNum(Long cardTotalNum) {
            this.cardTotalNum = cardTotalNum;
            return this;
        }
        public Long getCardTotalNum() {
            return this.cardTotalNum;
        }

        public GetCredentialPoolStatisticsResponseBodyData setCredentialInstanceId(String credentialInstanceId) {
            this.credentialInstanceId = credentialInstanceId;
            return this;
        }
        public String getCredentialInstanceId() {
            return this.credentialInstanceId;
        }

        public GetCredentialPoolStatisticsResponseBodyData setCredentialNO(String credentialNO) {
            this.credentialNO = credentialNO;
            return this;
        }
        public String getCredentialNO() {
            return this.credentialNO;
        }

        public GetCredentialPoolStatisticsResponseBodyData setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public GetCredentialPoolStatisticsResponseBodyData setEffectiveAvailableFlow(String effectiveAvailableFlow) {
            this.effectiveAvailableFlow = effectiveAvailableFlow;
            return this;
        }
        public String getEffectiveAvailableFlow() {
            return this.effectiveAvailableFlow;
        }

        public GetCredentialPoolStatisticsResponseBodyData setEffectiveTotalFlow(String effectiveTotalFlow) {
            this.effectiveTotalFlow = effectiveTotalFlow;
            return this;
        }
        public String getEffectiveTotalFlow() {
            return this.effectiveTotalFlow;
        }

        public GetCredentialPoolStatisticsResponseBodyData setMonthExceedFee(Long monthExceedFee) {
            this.monthExceedFee = monthExceedFee;
            return this;
        }
        public Long getMonthExceedFee() {
            return this.monthExceedFee;
        }

        public GetCredentialPoolStatisticsResponseBodyData setMonthFeatureFee(Long monthFeatureFee) {
            this.monthFeatureFee = monthFeatureFee;
            return this;
        }
        public Long getMonthFeatureFee() {
            return this.monthFeatureFee;
        }

        public GetCredentialPoolStatisticsResponseBodyData setMonthUsedAmount(Long monthUsedAmount) {
            this.monthUsedAmount = monthUsedAmount;
            return this;
        }
        public Long getMonthUsedAmount() {
            return this.monthUsedAmount;
        }

        public GetCredentialPoolStatisticsResponseBodyData setPoolAvaiable(String poolAvaiable) {
            this.poolAvaiable = poolAvaiable;
            return this;
        }
        public String getPoolAvaiable() {
            return this.poolAvaiable;
        }

        public GetCredentialPoolStatisticsResponseBodyData setPoolGrandTotal(String poolGrandTotal) {
            this.poolGrandTotal = poolGrandTotal;
            return this;
        }
        public String getPoolGrandTotal() {
            return this.poolGrandTotal;
        }

        public GetCredentialPoolStatisticsResponseBodyData setPoolGrandTotalUsed(String poolGrandTotalUsed) {
            this.poolGrandTotalUsed = poolGrandTotalUsed;
            return this;
        }
        public String getPoolGrandTotalUsed() {
            return this.poolGrandTotalUsed;
        }

        public GetCredentialPoolStatisticsResponseBodyData setPoolOutUsed(String poolOutUsed) {
            this.poolOutUsed = poolOutUsed;
            return this;
        }
        public String getPoolOutUsed() {
            return this.poolOutUsed;
        }

        public GetCredentialPoolStatisticsResponseBodyData setPoolUsed(String poolUsed) {
            this.poolUsed = poolUsed;
            return this;
        }
        public String getPoolUsed() {
            return this.poolUsed;
        }

        public GetCredentialPoolStatisticsResponseBodyData setSmsUsed(Long smsUsed) {
            this.smsUsed = smsUsed;
            return this;
        }
        public Long getSmsUsed() {
            return this.smsUsed;
        }

    }

}
