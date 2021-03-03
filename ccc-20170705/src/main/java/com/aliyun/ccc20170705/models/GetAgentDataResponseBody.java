// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetAgentDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("DataList")
    public GetAgentDataResponseBodyDataList dataList;

    public static GetAgentDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentDataResponseBody self = new GetAgentDataResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAgentDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentDataResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetAgentDataResponseBody setDataList(GetAgentDataResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GetAgentDataResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public static class GetAgentDataResponseBodyDataListListInbound extends TeaModel {
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("AverageHoldTime")
        public Long averageHoldTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("AverageRingTime")
        public Long averageRingTime;

        public static GetAgentDataResponseBodyDataListListInbound build(java.util.Map<String, ?> map) throws Exception {
            GetAgentDataResponseBodyDataListListInbound self = new GetAgentDataResponseBodyDataListListInbound();
            return TeaModel.build(map, self);
        }

        public GetAgentDataResponseBodyDataListListInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetAgentDataResponseBodyDataListListInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetAgentDataResponseBodyDataListListInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetAgentDataResponseBodyDataListListInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GetAgentDataResponseBodyDataListListInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GetAgentDataResponseBodyDataListListInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GetAgentDataResponseBodyDataListListInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GetAgentDataResponseBodyDataListListInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

    }

    public static class GetAgentDataResponseBodyDataListListOutbound extends TeaModel {
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("AverageHoldTime")
        public Long averageHoldTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("AnswerRate")
        public Float answerRate;

        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        @NameInMap("AverageDialingTime")
        public Long averageDialingTime;

        public static GetAgentDataResponseBodyDataListListOutbound build(java.util.Map<String, ?> map) throws Exception {
            GetAgentDataResponseBodyDataListListOutbound self = new GetAgentDataResponseBodyDataListListOutbound();
            return TeaModel.build(map, self);
        }

        public GetAgentDataResponseBodyDataListListOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetAgentDataResponseBodyDataListListOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetAgentDataResponseBodyDataListListOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetAgentDataResponseBodyDataListListOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GetAgentDataResponseBodyDataListListOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GetAgentDataResponseBodyDataListListOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GetAgentDataResponseBodyDataListListOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GetAgentDataResponseBodyDataListListOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

    }

    public static class GetAgentDataResponseBodyDataListListOverall extends TeaModel {
        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("AverageHoldTime")
        public Long averageHoldTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        public static GetAgentDataResponseBodyDataListListOverall build(java.util.Map<String, ?> map) throws Exception {
            GetAgentDataResponseBodyDataListListOverall self = new GetAgentDataResponseBodyDataListListOverall();
            return TeaModel.build(map, self);
        }

        public GetAgentDataResponseBodyDataListListOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GetAgentDataResponseBodyDataListListOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GetAgentDataResponseBodyDataListListOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GetAgentDataResponseBodyDataListListOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GetAgentDataResponseBodyDataListListOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class GetAgentDataResponseBodyDataListList extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RecordDate")
        public String recordDate;

        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        @NameInMap("AverageReadyTime")
        public Long averageReadyTime;

        @NameInMap("Inbound")
        public GetAgentDataResponseBodyDataListListInbound inbound;

        @NameInMap("Outbound")
        public GetAgentDataResponseBodyDataListListOutbound outbound;

        @NameInMap("Overall")
        public GetAgentDataResponseBodyDataListListOverall overall;

        public static GetAgentDataResponseBodyDataListList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentDataResponseBodyDataListList self = new GetAgentDataResponseBodyDataListList();
            return TeaModel.build(map, self);
        }

        public GetAgentDataResponseBodyDataListList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GetAgentDataResponseBodyDataListList setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GetAgentDataResponseBodyDataListList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public GetAgentDataResponseBodyDataListList setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public GetAgentDataResponseBodyDataListList setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public GetAgentDataResponseBodyDataListList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetAgentDataResponseBodyDataListList setRecordDate(String recordDate) {
            this.recordDate = recordDate;
            return this;
        }
        public String getRecordDate() {
            return this.recordDate;
        }

        public GetAgentDataResponseBodyDataListList setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GetAgentDataResponseBodyDataListList setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GetAgentDataResponseBodyDataListList setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public GetAgentDataResponseBodyDataListList setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public GetAgentDataResponseBodyDataListList setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GetAgentDataResponseBodyDataListList setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public GetAgentDataResponseBodyDataListList setInbound(GetAgentDataResponseBodyDataListListInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public GetAgentDataResponseBodyDataListListInbound getInbound() {
            return this.inbound;
        }

        public GetAgentDataResponseBodyDataListList setOutbound(GetAgentDataResponseBodyDataListListOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public GetAgentDataResponseBodyDataListListOutbound getOutbound() {
            return this.outbound;
        }

        public GetAgentDataResponseBodyDataListList setOverall(GetAgentDataResponseBodyDataListListOverall overall) {
            this.overall = overall;
            return this;
        }
        public GetAgentDataResponseBodyDataListListOverall getOverall() {
            return this.overall;
        }

    }

    public static class GetAgentDataResponseBodyDataList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("List")
        public java.util.List<GetAgentDataResponseBodyDataListList> list;

        public static GetAgentDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GetAgentDataResponseBodyDataList self = new GetAgentDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GetAgentDataResponseBodyDataList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GetAgentDataResponseBodyDataList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetAgentDataResponseBodyDataList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetAgentDataResponseBodyDataList setList(java.util.List<GetAgentDataResponseBodyDataListList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAgentDataResponseBodyDataListList> getList() {
            return this.list;
        }

    }

}
