// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GenerateAgentStatisticReportResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DataList")
    public GenerateAgentStatisticReportResponseBodyDataList dataList;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GenerateAgentStatisticReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateAgentStatisticReportResponseBody self = new GenerateAgentStatisticReportResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateAgentStatisticReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateAgentStatisticReportResponseBody setDataList(GenerateAgentStatisticReportResponseBodyDataList dataList) {
        this.dataList = dataList;
        return this;
    }
    public GenerateAgentStatisticReportResponseBodyDataList getDataList() {
        return this.dataList;
    }

    public GenerateAgentStatisticReportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateAgentStatisticReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
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

    public static class GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound extends TeaModel {
        @NameInMap("AverageHoldTime")
        public Long averageHoldTime;

        @NameInMap("AverageRingTime")
        public Long averageRingTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("CallsHandled")
        public Long callsHandled;

        @NameInMap("CallsOffered")
        public Long callsOffered;

        @NameInMap("HandleRate")
        public Float handleRate;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("MaxRingTime")
        public Long maxRingTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("TotalRingTime")
        public Long totalRingTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound self = new GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setAverageRingTime(Long averageRingTime) {
            this.averageRingTime = averageRingTime;
            return this;
        }
        public Long getAverageRingTime() {
            return this.averageRingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setCallsHandled(Long callsHandled) {
            this.callsHandled = callsHandled;
            return this;
        }
        public Long getCallsHandled() {
            return this.callsHandled;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setCallsOffered(Long callsOffered) {
            this.callsOffered = callsOffered;
            return this;
        }
        public Long getCallsOffered() {
            return this.callsOffered;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setHandleRate(Float handleRate) {
            this.handleRate = handleRate;
            return this;
        }
        public Float getHandleRate() {
            return this.handleRate;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setMaxRingTime(Long maxRingTime) {
            this.maxRingTime = maxRingTime;
            return this;
        }
        public Long getMaxRingTime() {
            return this.maxRingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
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

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setTotalRingTime(Long totalRingTime) {
            this.totalRingTime = totalRingTime;
            return this;
        }
        public Long getTotalRingTime() {
            return this.totalRingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound extends TeaModel {
        @NameInMap("AnswerRate")
        public Float answerRate;

        @NameInMap("AverageDialingTime")
        public Long averageDialingTime;

        @NameInMap("AverageHoldTime")
        public Long averageHoldTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("CallsAnswered")
        public Long callsAnswered;

        @NameInMap("CallsDialed")
        public Long callsDialed;

        @NameInMap("MaxDialingTime")
        public Long maxDialingTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("TotalDialingTime")
        public Long totalDialingTime;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound self = new GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAnswerRate(Float answerRate) {
            this.answerRate = answerRate;
            return this;
        }
        public Float getAnswerRate() {
            return this.answerRate;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAverageDialingTime(Long averageDialingTime) {
            this.averageDialingTime = averageDialingTime;
            return this;
        }
        public Long getAverageDialingTime() {
            return this.averageDialingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setCallsAnswered(Long callsAnswered) {
            this.callsAnswered = callsAnswered;
            return this;
        }
        public Long getCallsAnswered() {
            return this.callsAnswered;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setCallsDialed(Long callsDialed) {
            this.callsDialed = callsDialed;
            return this;
        }
        public Long getCallsDialed() {
            return this.callsDialed;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setMaxDialingTime(Long maxDialingTime) {
            this.maxDialingTime = maxDialingTime;
            return this;
        }
        public Long getMaxDialingTime() {
            return this.maxDialingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
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

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setTotalDialingTime(Long totalDialingTime) {
            this.totalDialingTime = totalDialingTime;
            return this;
        }
        public Long getTotalDialingTime() {
            return this.totalDialingTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall extends TeaModel {
        @NameInMap("AverageHoldTime")
        public Long averageHoldTime;

        @NameInMap("AverageTalkTime")
        public Long averageTalkTime;

        @NameInMap("AverageWorkTime")
        public Long averageWorkTime;

        @NameInMap("MaxHoldTime")
        public Long maxHoldTime;

        @NameInMap("MaxTalkTime")
        public Long maxTalkTime;

        @NameInMap("MaxWorkTime")
        public Long maxWorkTime;

        @NameInMap("SatisfactionIndex")
        public Float satisfactionIndex;

        @NameInMap("SatisfactionSurveysOffered")
        public Long satisfactionSurveysOffered;

        @NameInMap("SatisfactionSurveysResponded")
        public Long satisfactionSurveysResponded;

        @NameInMap("TotalCalls")
        public Long totalCalls;

        @NameInMap("TotalHoldTime")
        public Long totalHoldTime;

        @NameInMap("TotalTalkTime")
        public Long totalTalkTime;

        @NameInMap("TotalWorkTime")
        public Long totalWorkTime;

        public static GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall self = new GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setAverageHoldTime(Long averageHoldTime) {
            this.averageHoldTime = averageHoldTime;
            return this;
        }
        public Long getAverageHoldTime() {
            return this.averageHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setAverageTalkTime(Long averageTalkTime) {
            this.averageTalkTime = averageTalkTime;
            return this;
        }
        public Long getAverageTalkTime() {
            return this.averageTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setAverageWorkTime(Long averageWorkTime) {
            this.averageWorkTime = averageWorkTime;
            return this;
        }
        public Long getAverageWorkTime() {
            return this.averageWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setMaxHoldTime(Long maxHoldTime) {
            this.maxHoldTime = maxHoldTime;
            return this;
        }
        public Long getMaxHoldTime() {
            return this.maxHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setMaxTalkTime(Long maxTalkTime) {
            this.maxTalkTime = maxTalkTime;
            return this;
        }
        public Long getMaxTalkTime() {
            return this.maxTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setMaxWorkTime(Long maxWorkTime) {
            this.maxWorkTime = maxWorkTime;
            return this;
        }
        public Long getMaxWorkTime() {
            return this.maxWorkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setSatisfactionIndex(Float satisfactionIndex) {
            this.satisfactionIndex = satisfactionIndex;
            return this;
        }
        public Float getSatisfactionIndex() {
            return this.satisfactionIndex;
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

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setTotalCalls(Long totalCalls) {
            this.totalCalls = totalCalls;
            return this;
        }
        public Long getTotalCalls() {
            return this.totalCalls;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setTotalHoldTime(Long totalHoldTime) {
            this.totalHoldTime = totalHoldTime;
            return this;
        }
        public Long getTotalHoldTime() {
            return this.totalHoldTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setTotalTalkTime(Long totalTalkTime) {
            this.totalTalkTime = totalTalkTime;
            return this;
        }
        public Long getTotalTalkTime() {
            return this.totalTalkTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall setTotalWorkTime(Long totalWorkTime) {
            this.totalWorkTime = totalWorkTime;
            return this;
        }
        public Long getTotalWorkTime() {
            return this.totalWorkTime;
        }

    }

    public static class GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic extends TeaModel {
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("AverageReadyTime")
        public Long averageReadyTime;

        @NameInMap("Inbound")
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticInbound inbound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoginName")
        public String loginName;

        @NameInMap("MaxReadyTime")
        public Long maxReadyTime;

        @NameInMap("OccupancyRate")
        public Float occupancyRate;

        @NameInMap("Outbound")
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOutbound outbound;

        @NameInMap("Overall")
        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatisticOverall overall;

        @NameInMap("RecordDate")
        public String recordDate;

        @NameInMap("SkillGroupIds")
        public String skillGroupIds;

        @NameInMap("SkillGroupNames")
        public String skillGroupNames;

        @NameInMap("TotalBreakTime")
        public Long totalBreakTime;

        @NameInMap("TotalLoggedInTime")
        public Long totalLoggedInTime;

        @NameInMap("TotalReadyTime")
        public Long totalReadyTime;

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

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
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

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setLoginName(String loginName) {
            this.loginName = loginName;
            return this;
        }
        public String getLoginName() {
            return this.loginName;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setMaxReadyTime(Long maxReadyTime) {
            this.maxReadyTime = maxReadyTime;
            return this;
        }
        public Long getMaxReadyTime() {
            return this.maxReadyTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setOccupancyRate(Float occupancyRate) {
            this.occupancyRate = occupancyRate;
            return this;
        }
        public Float getOccupancyRate() {
            return this.occupancyRate;
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

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setRecordDate(String recordDate) {
            this.recordDate = recordDate;
            return this;
        }
        public String getRecordDate() {
            return this.recordDate;
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

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setTotalBreakTime(Long totalBreakTime) {
            this.totalBreakTime = totalBreakTime;
            return this;
        }
        public Long getTotalBreakTime() {
            return this.totalBreakTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setTotalLoggedInTime(Long totalLoggedInTime) {
            this.totalLoggedInTime = totalLoggedInTime;
            return this;
        }
        public Long getTotalLoggedInTime() {
            return this.totalLoggedInTime;
        }

        public GenerateAgentStatisticReportResponseBodyDataListListGenerateAgentStatistic setTotalReadyTime(Long totalReadyTime) {
            this.totalReadyTime = totalReadyTime;
            return this;
        }
        public Long getTotalReadyTime() {
            return this.totalReadyTime;
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
        @NameInMap("List")
        public GenerateAgentStatisticReportResponseBodyDataListList list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static GenerateAgentStatisticReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            GenerateAgentStatisticReportResponseBodyDataList self = new GenerateAgentStatisticReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public GenerateAgentStatisticReportResponseBodyDataList setList(GenerateAgentStatisticReportResponseBodyDataListList list) {
            this.list = list;
            return this;
        }
        public GenerateAgentStatisticReportResponseBodyDataListList getList() {
            return this.list;
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

        public GenerateAgentStatisticReportResponseBodyDataList setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
