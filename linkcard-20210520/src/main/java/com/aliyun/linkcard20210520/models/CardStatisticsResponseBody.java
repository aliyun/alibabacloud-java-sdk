// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class CardStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CardStatisticsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CardStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CardStatisticsResponseBody self = new CardStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public CardStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CardStatisticsResponseBody setData(CardStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CardStatisticsResponseBodyData getData() {
        return this.data;
    }

    public CardStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CardStatisticsResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public CardStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CardStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CardStatisticsResponseBodyDataErrorStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CardStatisticsResponseBodyDataErrorStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataErrorStopStatisticsDTO self = new CardStatisticsResponseBodyDataErrorStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataErrorStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public CardStatisticsResponseBodyDataErrorStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public CardStatisticsResponseBodyDataErrorStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public CardStatisticsResponseBodyDataErrorStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class CardStatisticsResponseBodyDataExhaustStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CardStatisticsResponseBodyDataExhaustStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataExhaustStopStatisticsDTO self = new CardStatisticsResponseBodyDataExhaustStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataExhaustStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public CardStatisticsResponseBodyDataExhaustStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public CardStatisticsResponseBodyDataExhaustStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public CardStatisticsResponseBodyDataExhaustStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class CardStatisticsResponseBodyDataExpireStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CardStatisticsResponseBodyDataExpireStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataExpireStopStatisticsDTO self = new CardStatisticsResponseBodyDataExpireStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataExpireStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public CardStatisticsResponseBodyDataExpireStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public CardStatisticsResponseBodyDataExpireStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public CardStatisticsResponseBodyDataExpireStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class CardStatisticsResponseBodyDataFlowOutStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CardStatisticsResponseBodyDataFlowOutStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataFlowOutStatisticsDTO self = new CardStatisticsResponseBodyDataFlowOutStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataFlowOutStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public CardStatisticsResponseBodyDataFlowOutStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public CardStatisticsResponseBodyDataFlowOutStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public CardStatisticsResponseBodyDataFlowOutStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class CardStatisticsResponseBodyDataManageStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CardStatisticsResponseBodyDataManageStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataManageStopStatisticsDTO self = new CardStatisticsResponseBodyDataManageStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataManageStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public CardStatisticsResponseBodyDataManageStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public CardStatisticsResponseBodyDataManageStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public CardStatisticsResponseBodyDataManageStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class CardStatisticsResponseBodyDataRiskWaringStatisticsDTO extends TeaModel {
        @NameInMap("StopCount")
        public Long stopCount;

        @NameInMap("WaringTotalCount")
        public Long waringTotalCount;

        @NameInMap("WarningCount")
        public Long warningCount;

        public static CardStatisticsResponseBodyDataRiskWaringStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataRiskWaringStatisticsDTO self = new CardStatisticsResponseBodyDataRiskWaringStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataRiskWaringStatisticsDTO setStopCount(Long stopCount) {
            this.stopCount = stopCount;
            return this;
        }
        public Long getStopCount() {
            return this.stopCount;
        }

        public CardStatisticsResponseBodyDataRiskWaringStatisticsDTO setWaringTotalCount(Long waringTotalCount) {
            this.waringTotalCount = waringTotalCount;
            return this;
        }
        public Long getWaringTotalCount() {
            return this.waringTotalCount;
        }

        public CardStatisticsResponseBodyDataRiskWaringStatisticsDTO setWarningCount(Long warningCount) {
            this.warningCount = warningCount;
            return this;
        }
        public Long getWarningCount() {
            return this.warningCount;
        }

    }

    public static class CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO self = new CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO self = new CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class CardStatisticsResponseBodyDataWeekWarnStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static CardStatisticsResponseBodyDataWeekWarnStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyDataWeekWarnStatisticsDTO self = new CardStatisticsResponseBodyDataWeekWarnStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyDataWeekWarnStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public CardStatisticsResponseBodyDataWeekWarnStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public CardStatisticsResponseBodyDataWeekWarnStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public CardStatisticsResponseBodyDataWeekWarnStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class CardStatisticsResponseBodyData extends TeaModel {
        @NameInMap("ErrorStopStatisticsDTO")
        public CardStatisticsResponseBodyDataErrorStopStatisticsDTO errorStopStatisticsDTO;

        @NameInMap("ExhaustStopStatisticsDTO")
        public CardStatisticsResponseBodyDataExhaustStopStatisticsDTO exhaustStopStatisticsDTO;

        @NameInMap("ExpireStopStatisticsDTO")
        public CardStatisticsResponseBodyDataExpireStopStatisticsDTO expireStopStatisticsDTO;

        @NameInMap("FlowOutStatisticsDTO")
        public CardStatisticsResponseBodyDataFlowOutStatisticsDTO flowOutStatisticsDTO;

        @NameInMap("ManageStopStatisticsDTO")
        public CardStatisticsResponseBodyDataManageStopStatisticsDTO manageStopStatisticsDTO;

        @NameInMap("RiskWaringStatisticsDTO")
        public CardStatisticsResponseBodyDataRiskWaringStatisticsDTO riskWaringStatisticsDTO;

        @NameInMap("UnCertifiedStopStatisticsDTO")
        public CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO unCertifiedStopStatisticsDTO;

        @NameInMap("UnbindResumeStatisticsDTO")
        public CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO unbindResumeStatisticsDTO;

        @NameInMap("WeekWarnStatisticsDTO")
        public CardStatisticsResponseBodyDataWeekWarnStatisticsDTO weekWarnStatisticsDTO;

        public static CardStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CardStatisticsResponseBodyData self = new CardStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CardStatisticsResponseBodyData setErrorStopStatisticsDTO(CardStatisticsResponseBodyDataErrorStopStatisticsDTO errorStopStatisticsDTO) {
            this.errorStopStatisticsDTO = errorStopStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataErrorStopStatisticsDTO getErrorStopStatisticsDTO() {
            return this.errorStopStatisticsDTO;
        }

        public CardStatisticsResponseBodyData setExhaustStopStatisticsDTO(CardStatisticsResponseBodyDataExhaustStopStatisticsDTO exhaustStopStatisticsDTO) {
            this.exhaustStopStatisticsDTO = exhaustStopStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataExhaustStopStatisticsDTO getExhaustStopStatisticsDTO() {
            return this.exhaustStopStatisticsDTO;
        }

        public CardStatisticsResponseBodyData setExpireStopStatisticsDTO(CardStatisticsResponseBodyDataExpireStopStatisticsDTO expireStopStatisticsDTO) {
            this.expireStopStatisticsDTO = expireStopStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataExpireStopStatisticsDTO getExpireStopStatisticsDTO() {
            return this.expireStopStatisticsDTO;
        }

        public CardStatisticsResponseBodyData setFlowOutStatisticsDTO(CardStatisticsResponseBodyDataFlowOutStatisticsDTO flowOutStatisticsDTO) {
            this.flowOutStatisticsDTO = flowOutStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataFlowOutStatisticsDTO getFlowOutStatisticsDTO() {
            return this.flowOutStatisticsDTO;
        }

        public CardStatisticsResponseBodyData setManageStopStatisticsDTO(CardStatisticsResponseBodyDataManageStopStatisticsDTO manageStopStatisticsDTO) {
            this.manageStopStatisticsDTO = manageStopStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataManageStopStatisticsDTO getManageStopStatisticsDTO() {
            return this.manageStopStatisticsDTO;
        }

        public CardStatisticsResponseBodyData setRiskWaringStatisticsDTO(CardStatisticsResponseBodyDataRiskWaringStatisticsDTO riskWaringStatisticsDTO) {
            this.riskWaringStatisticsDTO = riskWaringStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataRiskWaringStatisticsDTO getRiskWaringStatisticsDTO() {
            return this.riskWaringStatisticsDTO;
        }

        public CardStatisticsResponseBodyData setUnCertifiedStopStatisticsDTO(CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO unCertifiedStopStatisticsDTO) {
            this.unCertifiedStopStatisticsDTO = unCertifiedStopStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO getUnCertifiedStopStatisticsDTO() {
            return this.unCertifiedStopStatisticsDTO;
        }

        public CardStatisticsResponseBodyData setUnbindResumeStatisticsDTO(CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO unbindResumeStatisticsDTO) {
            this.unbindResumeStatisticsDTO = unbindResumeStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataUnbindResumeStatisticsDTO getUnbindResumeStatisticsDTO() {
            return this.unbindResumeStatisticsDTO;
        }

        public CardStatisticsResponseBodyData setWeekWarnStatisticsDTO(CardStatisticsResponseBodyDataWeekWarnStatisticsDTO weekWarnStatisticsDTO) {
            this.weekWarnStatisticsDTO = weekWarnStatisticsDTO;
            return this;
        }
        public CardStatisticsResponseBodyDataWeekWarnStatisticsDTO getWeekWarnStatisticsDTO() {
            return this.weekWarnStatisticsDTO;
        }

    }

}
