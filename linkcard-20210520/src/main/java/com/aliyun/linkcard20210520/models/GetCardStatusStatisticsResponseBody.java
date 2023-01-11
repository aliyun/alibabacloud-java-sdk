// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class GetCardStatusStatisticsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetCardStatusStatisticsResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LocalizedMessage")
    public String localizedMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCardStatusStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCardStatusStatisticsResponseBody self = new GetCardStatusStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCardStatusStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCardStatusStatisticsResponseBody setData(GetCardStatusStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCardStatusStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetCardStatusStatisticsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetCardStatusStatisticsResponseBody setLocalizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    public String getLocalizedMessage() {
        return this.localizedMessage;
    }

    public GetCardStatusStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCardStatusStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO extends TeaModel {
        @NameInMap("LeftFlowPercentageWarnCount")
        public Long leftFlowPercentageWarnCount;

        @NameInMap("StopCount")
        public Long stopCount;

        @NameInMap("WaringTotalCount")
        public Long waringTotalCount;

        @NameInMap("WarningCount")
        public Long warningCount;

        public static GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO setLeftFlowPercentageWarnCount(Long leftFlowPercentageWarnCount) {
            this.leftFlowPercentageWarnCount = leftFlowPercentageWarnCount;
            return this;
        }
        public Long getLeftFlowPercentageWarnCount() {
            return this.leftFlowPercentageWarnCount;
        }

        public GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO setStopCount(Long stopCount) {
            this.stopCount = stopCount;
            return this;
        }
        public Long getStopCount() {
            return this.stopCount;
        }

        public GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO setWaringTotalCount(Long waringTotalCount) {
            this.waringTotalCount = waringTotalCount;
            return this;
        }
        public Long getWaringTotalCount() {
            return this.waringTotalCount;
        }

        public GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO setWarningCount(Long warningCount) {
            this.warningCount = warningCount;
            return this;
        }
        public Long getWarningCount() {
            return this.warningCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO extends TeaModel {
        @NameInMap("LessFlowPercentage10Count")
        public Long lessFlowPercentage10Count;

        @NameInMap("LessFlowPercentage30Count")
        public Long lessFlowPercentage30Count;

        public static GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO self = new GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO setLessFlowPercentage10Count(Long lessFlowPercentage10Count) {
            this.lessFlowPercentage10Count = lessFlowPercentage10Count;
            return this;
        }
        public Long getLessFlowPercentage10Count() {
            return this.lessFlowPercentage10Count;
        }

        public GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO setLessFlowPercentage30Count(Long lessFlowPercentage30Count) {
            this.lessFlowPercentage30Count = lessFlowPercentage30Count;
            return this;
        }
        public Long getLessFlowPercentage30Count() {
            return this.lessFlowPercentage30Count;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO extends TeaModel {
        @NameInMap("PoolCount")
        public Long poolCount;

        @NameInMap("SameFlowCardCount")
        public Long sameFlowCardCount;

        @NameInMap("SingleCardCount")
        public Long singleCardCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO self = new GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO setPoolCount(Long poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Long getPoolCount() {
            return this.poolCount;
        }

        public GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO setSameFlowCardCount(Long sameFlowCardCount) {
            this.sameFlowCardCount = sameFlowCardCount;
            return this;
        }
        public Long getSameFlowCardCount() {
            return this.sameFlowCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO setSingleCardCount(Long singleCardCount) {
            this.singleCardCount = singleCardCount;
            return this;
        }
        public Long getSingleCardCount() {
            return this.singleCardCount;
        }

        public GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class GetCardStatusStatisticsResponseBodyData extends TeaModel {
        @NameInMap("ErrorStopStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO errorStopStatisticsDTO;

        @NameInMap("ExhaustStopStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO exhaustStopStatisticsDTO;

        @NameInMap("ExpireStopStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO expireStopStatisticsDTO;

        @NameInMap("FlowOutStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO flowOutStatisticsDTO;

        @NameInMap("ManageStopStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO manageStopStatisticsDTO;

        @NameInMap("RiskWaringStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO riskWaringStatisticsDTO;

        @NameInMap("SingCardPeriodLeftFlowWarnDTO")
        public GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO singCardPeriodLeftFlowWarnDTO;

        @NameInMap("UnCertifiedStopStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO unCertifiedStopStatisticsDTO;

        @NameInMap("UnbindResumeStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO unbindResumeStatisticsDTO;

        @NameInMap("WeekWarnStatisticsDTO")
        public GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO weekWarnStatisticsDTO;

        public static GetCardStatusStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCardStatusStatisticsResponseBodyData self = new GetCardStatusStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCardStatusStatisticsResponseBodyData setErrorStopStatisticsDTO(GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO errorStopStatisticsDTO) {
            this.errorStopStatisticsDTO = errorStopStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataErrorStopStatisticsDTO getErrorStopStatisticsDTO() {
            return this.errorStopStatisticsDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setExhaustStopStatisticsDTO(GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO exhaustStopStatisticsDTO) {
            this.exhaustStopStatisticsDTO = exhaustStopStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataExhaustStopStatisticsDTO getExhaustStopStatisticsDTO() {
            return this.exhaustStopStatisticsDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setExpireStopStatisticsDTO(GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO expireStopStatisticsDTO) {
            this.expireStopStatisticsDTO = expireStopStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataExpireStopStatisticsDTO getExpireStopStatisticsDTO() {
            return this.expireStopStatisticsDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setFlowOutStatisticsDTO(GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO flowOutStatisticsDTO) {
            this.flowOutStatisticsDTO = flowOutStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataFlowOutStatisticsDTO getFlowOutStatisticsDTO() {
            return this.flowOutStatisticsDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setManageStopStatisticsDTO(GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO manageStopStatisticsDTO) {
            this.manageStopStatisticsDTO = manageStopStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataManageStopStatisticsDTO getManageStopStatisticsDTO() {
            return this.manageStopStatisticsDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setRiskWaringStatisticsDTO(GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO riskWaringStatisticsDTO) {
            this.riskWaringStatisticsDTO = riskWaringStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataRiskWaringStatisticsDTO getRiskWaringStatisticsDTO() {
            return this.riskWaringStatisticsDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setSingCardPeriodLeftFlowWarnDTO(GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO singCardPeriodLeftFlowWarnDTO) {
            this.singCardPeriodLeftFlowWarnDTO = singCardPeriodLeftFlowWarnDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataSingCardPeriodLeftFlowWarnDTO getSingCardPeriodLeftFlowWarnDTO() {
            return this.singCardPeriodLeftFlowWarnDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setUnCertifiedStopStatisticsDTO(GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO unCertifiedStopStatisticsDTO) {
            this.unCertifiedStopStatisticsDTO = unCertifiedStopStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataUnCertifiedStopStatisticsDTO getUnCertifiedStopStatisticsDTO() {
            return this.unCertifiedStopStatisticsDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setUnbindResumeStatisticsDTO(GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO unbindResumeStatisticsDTO) {
            this.unbindResumeStatisticsDTO = unbindResumeStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataUnbindResumeStatisticsDTO getUnbindResumeStatisticsDTO() {
            return this.unbindResumeStatisticsDTO;
        }

        public GetCardStatusStatisticsResponseBodyData setWeekWarnStatisticsDTO(GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO weekWarnStatisticsDTO) {
            this.weekWarnStatisticsDTO = weekWarnStatisticsDTO;
            return this;
        }
        public GetCardStatusStatisticsResponseBodyDataWeekWarnStatisticsDTO getWeekWarnStatisticsDTO() {
            return this.weekWarnStatisticsDTO;
        }

    }

}
