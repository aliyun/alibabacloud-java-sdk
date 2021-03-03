// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GenerateAgentStatisticReportResponseBody extends TeaModel {
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
    public GenerateAgentStatisticReportResponseBodyDataList dataList;

    public static GenerateAgentStatisticReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAgentStatisticReportResponseBody self = new GenerateAgentStatisticReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAgentStatisticReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateAgentStatisticReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GenerateAgentStatisticReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateAgentStatisticReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateAgentStatisticReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateAgentStatisticReportResponseBody setDataList(GenerateAgentStatisticReportResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GenerateAgentStatisticReportResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public static class GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound extends TeaModel {
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

        public static GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound self = new GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

    }

    public static class GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound extends TeaModel {
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

        public static GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound self = new GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

    }

    public static class GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall extends TeaModel {
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

        public static GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall self = new GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setSatisfactionSurveysOffered(Long satisfactionSurveysOffered) {
            this.satisfactionSurveysOffered = satisfactionSurveysOffered;
            return this;
        }
        public Long getSatisfactionSurveysOffered() {
            return this.satisfactionSurveysOffered;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setSatisfactionSurveysResponded(Long satisfactionSurveysResponded) {
            this.satisfactionSurveysResponded = satisfactionSurveysResponded;
            return this;
        }
        public Long getSatisfactionSurveysResponded() {
            return this.satisfactionSurveysResponded;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

    }

    public static class GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic extends TeaModel {
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
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound inbound;

        @NameInMap("Outbound")
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound outbound;

        @NameInMap("Overall")
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall overall;

        public static GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic self = new GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setSkillGroupIds(String skillGroupIds) {
            this.skillGroupIds = skillGroupIds;
            return this;
        }
        public String getSkillGroupIds() {
            return this.skillGroupIds;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setSkillGroupNames(String skillGroupNames) {
            this.skillGroupNames = skillGroupNames;
            return this;
        }
        public String getSkillGroupNames() {
            return this.skillGroupNames;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setRecordDate(String recordDate) {
            this.recordDate = recordDate;
            return this;
        }
        public String getRecordDate() {
            return this.recordDate;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setAverageReadyTime(Long averageReadyTime) {
            this.averageReadyTime = averageReadyTime;
            return this;
        }
        public Long getAverageReadyTime() {
            return this.averageReadyTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setInbound(GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound inbound) {
            this.inbound = inbound;
            return this;
        }
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound getInbound() {
            return this.inbound;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setOutbound(GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound outbound) {
            this.outbound = outbound;
            return this;
        }
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound getOutbound() {
            return this.outbound;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setOverall(GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall overall) {
            this.overall = overall;
            return this;
        }
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall getOverall() {
            return this.overall;
        }

    }

    public static class GenerateAgentStatisticReportResponseBodyDataListList extends TeaModel {
        @NameInMap("GenerateAgentStatistic")
        public java.util.List<GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic> generateAgentStatistic;

        public static GenerateAgentStatisticReportResponseBodyDataListList build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataListList self = new GenerateAgentStatisticReportResponseBodyDataListList();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataListList setGenerateAgentStatistic(java.util.List<GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic> generateAgentStatistic) {
            this.generateAgentStatistic = generateAgentStatistic;
            return this;
        }
        public java.util.List<GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic> getGenerateAgentStatistic() {
            return this.generateAgentStatistic;
        }

    }

    public static class GenerateAgentStatisticReportResponseBodyDataList extends TeaModel {
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("List")
        public GenerateAgentStatisticReportResponseBodyDataListList list;

        public static GenerateAgentStatisticReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataList self = new GenerateAgentStatisticReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public GenerateAgentStatisticReportResponseBodyDataList setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GenerateAgentStatisticReportResponseBodyDataList setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GenerateAgentStatisticReportResponseBodyDataList setList(GenerateAgentStatisticReportResponseBodyDataListList list) {
            this.list = list;
            return this;
        }
        public GenerateAgentStatisticReportResponseBodyDataListList getList() {
            return this.list;
        }

    }

}
