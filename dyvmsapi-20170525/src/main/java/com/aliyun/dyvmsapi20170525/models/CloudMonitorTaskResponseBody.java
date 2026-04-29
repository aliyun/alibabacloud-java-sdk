// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudMonitorTaskResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudMonitorTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BF47617-7851-48F7-A3A1-2021342A78E2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudMonitorTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudMonitorTaskResponseBody self = new CloudMonitorTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudMonitorTaskResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudMonitorTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudMonitorTaskResponseBody setData(CloudMonitorTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudMonitorTaskResponseBodyData getData() {
        return this.data;
    }

    public CloudMonitorTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudMonitorTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudMonitorTaskResponseBodyDataAgentInfo extends TeaModel {
        /**
         * <p>可用座席数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvailableCount")
        public Long availableCount;

        /**
         * <p>通话中的座席数</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("BridgeCount")
        public Long bridgeCount;

        /**
         * <p>当前在线座席数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("OnlineCount")
        public Long onlineCount;

        /**
         * <p>响铃中的座席数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("RingingCount")
        public Long ringingCount;

        /**
         * <p>座席总数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        /**
         * <p>整理中的座席数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("WrapupCount")
        public Long wrapupCount;

        public static CloudMonitorTaskResponseBodyDataAgentInfo build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyDataAgentInfo self = new CloudMonitorTaskResponseBodyDataAgentInfo();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyDataAgentInfo setAvailableCount(Long availableCount) {
            this.availableCount = availableCount;
            return this;
        }
        public Long getAvailableCount() {
            return this.availableCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentInfo setBridgeCount(Long bridgeCount) {
            this.bridgeCount = bridgeCount;
            return this;
        }
        public Long getBridgeCount() {
            return this.bridgeCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentInfo setOnlineCount(Long onlineCount) {
            this.onlineCount = onlineCount;
            return this;
        }
        public Long getOnlineCount() {
            return this.onlineCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentInfo setRingingCount(Long ringingCount) {
            this.ringingCount = ringingCount;
            return this;
        }
        public Long getRingingCount() {
            return this.ringingCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentInfo setWrapupCount(Long wrapupCount) {
            this.wrapupCount = wrapupCount;
            return this;
        }
        public Long getWrapupCount() {
            return this.wrapupCount;
        }

    }

    public static class CloudMonitorTaskResponseBodyDataAgentStatisticList extends TeaModel {
        /**
         * <p>座席平均进线时长,空闲时长/呼叫数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AgentAvgIdleTime")
        public Long agentAvgIdleTime;

        /**
         * <p>座席当前状态:  stateIdle(空闲)  statePause(置忙)  stateInuse(通话） stateCalling(呼叫中)  stateWrapup(整理)   为空代表该当前时间座席在该任务中没有相关状态，如：座席未被使用等</p>
         * 
         * <strong>example:</strong>
         * <p>stateIdle</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>座席平均通话时长，单位秒数</p>
         * 
         * <strong>example:</strong>
         * <p>116</p>
         */
        @NameInMap("AvgBridgeTime")
        public String avgBridgeTime;

        /**
         * <p>接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BridgeCount")
        public Long bridgeCount;

        /**
         * <p>座席自动应答率=(座席接通时间-开始呼叫座席时间)&lt;=2s的通话数/座席接通数</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("BridgeIn2sRate")
        public Double bridgeIn2sRate;

        /**
         * <p>任务级别，座席单日接听上限，-1代表未配置接听上限</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("CallLimit")
        public Long callLimit;

        /**
         * <p>呼叫数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CalledCount")
        public Long calledCount;

        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>企业级别 座席单日接听上限，-1代表未配置接听上限</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("EnterpriseCallLimit")
        public Long enterpriseCallLimit;

        /**
         * <p>企业级别 座席今日已接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EnterpriseTodayAnsweredCount")
        public Long enterpriseTodayAnsweredCount;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>name2</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>座席未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NoBridgeCount")
        public Long noBridgeCount;

        /**
         * <p>任务级别 座席今日已接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TodayAnsweredCount")
        public Long todayAnsweredCount;

        public static CloudMonitorTaskResponseBodyDataAgentStatisticList build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyDataAgentStatisticList self = new CloudMonitorTaskResponseBodyDataAgentStatisticList();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setAgentAvgIdleTime(Long agentAvgIdleTime) {
            this.agentAvgIdleTime = agentAvgIdleTime;
            return this;
        }
        public Long getAgentAvgIdleTime() {
            return this.agentAvgIdleTime;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setAvgBridgeTime(String avgBridgeTime) {
            this.avgBridgeTime = avgBridgeTime;
            return this;
        }
        public String getAvgBridgeTime() {
            return this.avgBridgeTime;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setBridgeCount(Long bridgeCount) {
            this.bridgeCount = bridgeCount;
            return this;
        }
        public Long getBridgeCount() {
            return this.bridgeCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setBridgeIn2sRate(Double bridgeIn2sRate) {
            this.bridgeIn2sRate = bridgeIn2sRate;
            return this;
        }
        public Double getBridgeIn2sRate() {
            return this.bridgeIn2sRate;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setCallLimit(Long callLimit) {
            this.callLimit = callLimit;
            return this;
        }
        public Long getCallLimit() {
            return this.callLimit;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setCalledCount(Long calledCount) {
            this.calledCount = calledCount;
            return this;
        }
        public Long getCalledCount() {
            return this.calledCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setEnterpriseCallLimit(Long enterpriseCallLimit) {
            this.enterpriseCallLimit = enterpriseCallLimit;
            return this;
        }
        public Long getEnterpriseCallLimit() {
            return this.enterpriseCallLimit;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setEnterpriseTodayAnsweredCount(Long enterpriseTodayAnsweredCount) {
            this.enterpriseTodayAnsweredCount = enterpriseTodayAnsweredCount;
            return this;
        }
        public Long getEnterpriseTodayAnsweredCount() {
            return this.enterpriseTodayAnsweredCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setNoBridgeCount(Long noBridgeCount) {
            this.noBridgeCount = noBridgeCount;
            return this;
        }
        public Long getNoBridgeCount() {
            return this.noBridgeCount;
        }

        public CloudMonitorTaskResponseBodyDataAgentStatisticList setTodayAnsweredCount(Long todayAnsweredCount) {
            this.todayAnsweredCount = todayAnsweredCount;
            return this;
        }
        public Long getTodayAnsweredCount() {
            return this.todayAnsweredCount;
        }

    }

    public static class CloudMonitorTaskResponseBodyDataChannelInfo extends TeaModel {
        /**
         * <p>客户接通个数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnswerCount")
        public Long answerCount;

        /**
         * <p>桥接个数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BridgedCount")
        public Long bridgedCount;

        /**
         * <p>任务当前通道数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ChannelCount")
        public Long channelCount;

        /**
         * <p>企业预测外呼通道数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("EnterpriseChannelCount")
        public Long enterpriseChannelCount;

        /**
         * <p>溢出到ivr数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IvrCount")
        public Long ivrCount;

        /**
         * <p>等待转座席的个数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WaitAgentCount")
        public Long waitAgentCount;

        /**
         * <p>等待客户接听的个数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WaitAnswerCount")
        public Long waitAnswerCount;

        public static CloudMonitorTaskResponseBodyDataChannelInfo build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyDataChannelInfo self = new CloudMonitorTaskResponseBodyDataChannelInfo();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyDataChannelInfo setAnswerCount(Long answerCount) {
            this.answerCount = answerCount;
            return this;
        }
        public Long getAnswerCount() {
            return this.answerCount;
        }

        public CloudMonitorTaskResponseBodyDataChannelInfo setBridgedCount(Long bridgedCount) {
            this.bridgedCount = bridgedCount;
            return this;
        }
        public Long getBridgedCount() {
            return this.bridgedCount;
        }

        public CloudMonitorTaskResponseBodyDataChannelInfo setChannelCount(Long channelCount) {
            this.channelCount = channelCount;
            return this;
        }
        public Long getChannelCount() {
            return this.channelCount;
        }

        public CloudMonitorTaskResponseBodyDataChannelInfo setEnterpriseChannelCount(Long enterpriseChannelCount) {
            this.enterpriseChannelCount = enterpriseChannelCount;
            return this;
        }
        public Long getEnterpriseChannelCount() {
            return this.enterpriseChannelCount;
        }

        public CloudMonitorTaskResponseBodyDataChannelInfo setIvrCount(Long ivrCount) {
            this.ivrCount = ivrCount;
            return this;
        }
        public Long getIvrCount() {
            return this.ivrCount;
        }

        public CloudMonitorTaskResponseBodyDataChannelInfo setWaitAgentCount(Long waitAgentCount) {
            this.waitAgentCount = waitAgentCount;
            return this;
        }
        public Long getWaitAgentCount() {
            return this.waitAgentCount;
        }

        public CloudMonitorTaskResponseBodyDataChannelInfo setWaitAnswerCount(Long waitAnswerCount) {
            this.waitAnswerCount = waitAnswerCount;
            return this;
        }
        public Long getWaitAnswerCount() {
            return this.waitAnswerCount;
        }

    }

    public static class CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList extends TeaModel {
        /**
         * <p>座席平均进线时长,空闲时长/呼叫数</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("AgentAvgIdleTime")
        public Long agentAvgIdleTime;

        /**
         * <p>座席当前状态:  stateIdle(空闲)  statePause(置忙)  stateInuse(通话） stateCalling(呼叫中)  stateWrapup(整理)   为空代表该当前时间座席在该任务中没有相关状态，如：座席未被使用等</p>
         * 
         * <strong>example:</strong>
         * <p>stateIdle</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>座席平均通话时长，单位秒数</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("AvgBridgeTime")
        public String avgBridgeTime;

        /**
         * <p>接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BridgeCount")
        public Long bridgeCount;

        /**
         * <p>座席自动应答率=(座席接通时间-开始呼叫座席时间)&lt;=2s的通话数/座席接通数</p>
         * 
         * <strong>example:</strong>
         * <p>3.55</p>
         */
        @NameInMap("BridgeIn2sRate")
        public Double bridgeIn2sRate;

        /**
         * <p>任务级别，座席单日接听上限，-1代表未配置接听上限</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("CallLimit")
        public Long callLimit;

        /**
         * <p>呼叫数</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("CalledCount")
        public Long calledCount;

        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>企业级别 座席单日接听上限，-1代表未配置接听上限</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("EnterpriseCallLimit")
        public Long enterpriseCallLimit;

        /**
         * <p>企业级别 座席今日已接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("EnterpriseTodayAnsweredCount")
        public Long enterpriseTodayAnsweredCount;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>座席未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("NoBridgeCount")
        public Long noBridgeCount;

        /**
         * <p>任务级别 座席今日已接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TodayAnsweredCount")
        public Long todayAnsweredCount;

        public static CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList self = new CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setAgentAvgIdleTime(Long agentAvgIdleTime) {
            this.agentAvgIdleTime = agentAvgIdleTime;
            return this;
        }
        public Long getAgentAvgIdleTime() {
            return this.agentAvgIdleTime;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setAvgBridgeTime(String avgBridgeTime) {
            this.avgBridgeTime = avgBridgeTime;
            return this;
        }
        public String getAvgBridgeTime() {
            return this.avgBridgeTime;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setBridgeCount(Long bridgeCount) {
            this.bridgeCount = bridgeCount;
            return this;
        }
        public Long getBridgeCount() {
            return this.bridgeCount;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setBridgeIn2sRate(Double bridgeIn2sRate) {
            this.bridgeIn2sRate = bridgeIn2sRate;
            return this;
        }
        public Double getBridgeIn2sRate() {
            return this.bridgeIn2sRate;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setCallLimit(Long callLimit) {
            this.callLimit = callLimit;
            return this;
        }
        public Long getCallLimit() {
            return this.callLimit;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setCalledCount(Long calledCount) {
            this.calledCount = calledCount;
            return this;
        }
        public Long getCalledCount() {
            return this.calledCount;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setEnterpriseCallLimit(Long enterpriseCallLimit) {
            this.enterpriseCallLimit = enterpriseCallLimit;
            return this;
        }
        public Long getEnterpriseCallLimit() {
            return this.enterpriseCallLimit;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setEnterpriseTodayAnsweredCount(Long enterpriseTodayAnsweredCount) {
            this.enterpriseTodayAnsweredCount = enterpriseTodayAnsweredCount;
            return this;
        }
        public Long getEnterpriseTodayAnsweredCount() {
            return this.enterpriseTodayAnsweredCount;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setNoBridgeCount(Long noBridgeCount) {
            this.noBridgeCount = noBridgeCount;
            return this;
        }
        public Long getNoBridgeCount() {
            return this.noBridgeCount;
        }

        public CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList setTodayAnsweredCount(Long todayAnsweredCount) {
            this.todayAnsweredCount = todayAnsweredCount;
            return this;
        }
        public Long getTodayAnsweredCount() {
            return this.todayAnsweredCount;
        }

    }

    public static class CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty extends TeaModel {
        /**
         * <p>外呼任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>12314</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>任务名称</p>
         * 
         * <strong>example:</strong>
         * <p>testTask</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>任务结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 11:00:00</p>
         */
        @NameInMap("OverTime")
        public String overTime;

        /**
         * <p>任务开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>任务状态，0.初始 1.运行中 2.暂停 3.结束</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>任务状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        public static CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty self = new CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty setOverTime(String overTime) {
            this.overTime = overTime;
            return this;
        }
        public String getOverTime() {
            return this.overTime;
        }

        public CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

    }

    public static class CloudMonitorTaskResponseBodyDataStatistic extends TeaModel {
        /**
         * <p>座席数量</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AgentCount")
        public Long agentCount;

        /**
         * <p>应答数量</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AnswerCount")
        public Long answerCount;

        /**
         * <p>呼叫坐席数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallAgentCount")
        public Long callAgentCount;

        /**
         * <p>已呼叫数量</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("CalledCount")
        public Long calledCount;

        /**
         * <p>任务属性</p>
         */
        @NameInMap("CtiLinkTaskProperty")
        public CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty ctiLinkTaskProperty;

        /**
         * <p>未呼叫数量</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UncalledCount")
        public Long uncalledCount;

        public static CloudMonitorTaskResponseBodyDataStatistic build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyDataStatistic self = new CloudMonitorTaskResponseBodyDataStatistic();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyDataStatistic setAgentCount(Long agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Long getAgentCount() {
            return this.agentCount;
        }

        public CloudMonitorTaskResponseBodyDataStatistic setAnswerCount(Long answerCount) {
            this.answerCount = answerCount;
            return this;
        }
        public Long getAnswerCount() {
            return this.answerCount;
        }

        public CloudMonitorTaskResponseBodyDataStatistic setCallAgentCount(Long callAgentCount) {
            this.callAgentCount = callAgentCount;
            return this;
        }
        public Long getCallAgentCount() {
            return this.callAgentCount;
        }

        public CloudMonitorTaskResponseBodyDataStatistic setCalledCount(Long calledCount) {
            this.calledCount = calledCount;
            return this;
        }
        public Long getCalledCount() {
            return this.calledCount;
        }

        public CloudMonitorTaskResponseBodyDataStatistic setCtiLinkTaskProperty(CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty ctiLinkTaskProperty) {
            this.ctiLinkTaskProperty = ctiLinkTaskProperty;
            return this;
        }
        public CloudMonitorTaskResponseBodyDataStatisticCtiLinkTaskProperty getCtiLinkTaskProperty() {
            return this.ctiLinkTaskProperty;
        }

        public CloudMonitorTaskResponseBodyDataStatistic setUncalledCount(Long uncalledCount) {
            this.uncalledCount = uncalledCount;
            return this;
        }
        public Long getUncalledCount() {
            return this.uncalledCount;
        }

    }

    public static class CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty extends TeaModel {
        /**
         * <p>外呼任务Id</p>
         * 
         * <strong>example:</strong>
         * <p>12314</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>任务名称</p>
         * 
         * <strong>example:</strong>
         * <p>testTask</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>任务结束时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 11:00:00</p>
         */
        @NameInMap("OverTime")
        public String overTime;

        /**
         * <p>任务开始时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>任务状态，0.初始 1.运行中 2.暂停 3.结束</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>任务状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("StatusDescription")
        public String statusDescription;

        public static CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty self = new CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty setOverTime(String overTime) {
            this.overTime = overTime;
            return this;
        }
        public String getOverTime() {
            return this.overTime;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty setStatusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            return this;
        }
        public String getStatusDescription() {
            return this.statusDescription;
        }

    }

    public static class CloudMonitorTaskResponseBodyDataTodayStatistic extends TeaModel {
        /**
         * <p>座席数量</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AgentCount")
        public Long agentCount;

        /**
         * <p>应答数量</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AnswerCount")
        public Long answerCount;

        /**
         * <p>呼叫坐席数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CallAgentCount")
        public Long callAgentCount;

        /**
         * <p>已呼叫数量</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CalledCount")
        public Long calledCount;

        @NameInMap("CtiLinkTaskProperty")
        public CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty ctiLinkTaskProperty;

        /**
         * <p>未呼叫数量</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("UncalledCount")
        public Long uncalledCount;

        public static CloudMonitorTaskResponseBodyDataTodayStatistic build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyDataTodayStatistic self = new CloudMonitorTaskResponseBodyDataTodayStatistic();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyDataTodayStatistic setAgentCount(Long agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Long getAgentCount() {
            return this.agentCount;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatistic setAnswerCount(Long answerCount) {
            this.answerCount = answerCount;
            return this;
        }
        public Long getAnswerCount() {
            return this.answerCount;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatistic setCallAgentCount(Long callAgentCount) {
            this.callAgentCount = callAgentCount;
            return this;
        }
        public Long getCallAgentCount() {
            return this.callAgentCount;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatistic setCalledCount(Long calledCount) {
            this.calledCount = calledCount;
            return this;
        }
        public Long getCalledCount() {
            return this.calledCount;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatistic setCtiLinkTaskProperty(CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty ctiLinkTaskProperty) {
            this.ctiLinkTaskProperty = ctiLinkTaskProperty;
            return this;
        }
        public CloudMonitorTaskResponseBodyDataTodayStatisticCtiLinkTaskProperty getCtiLinkTaskProperty() {
            return this.ctiLinkTaskProperty;
        }

        public CloudMonitorTaskResponseBodyDataTodayStatistic setUncalledCount(Long uncalledCount) {
            this.uncalledCount = uncalledCount;
            return this;
        }
        public Long getUncalledCount() {
            return this.uncalledCount;
        }

    }

    public static class CloudMonitorTaskResponseBodyData extends TeaModel {
        /**
         * <p>座席状态统计</p>
         */
        @NameInMap("AgentInfo")
        public CloudMonitorTaskResponseBodyDataAgentInfo agentInfo;

        /**
         * <p>座席统计详情</p>
         */
        @NameInMap("AgentStatisticList")
        public java.util.List<CloudMonitorTaskResponseBodyDataAgentStatisticList> agentStatisticList;

        /**
         * <p>通道监控信息</p>
         */
        @NameInMap("ChannelInfo")
        public CloudMonitorTaskResponseBodyDataChannelInfo channelInfo;

        /**
         * <p>已移除座席统计详情，仅当 <code>includeRemovedAgents=1</code> 时返回</p>
         */
        @NameInMap("RemovedAgentStatisticList")
        public java.util.List<CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList> removedAgentStatisticList;

        /**
         * <p>任务监控信息</p>
         */
        @NameInMap("Statistic")
        public CloudMonitorTaskResponseBodyDataStatistic statistic;

        /**
         * <p>当日任务监控信息</p>
         */
        @NameInMap("TodayStatistic")
        public CloudMonitorTaskResponseBodyDataTodayStatistic todayStatistic;

        public static CloudMonitorTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudMonitorTaskResponseBodyData self = new CloudMonitorTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudMonitorTaskResponseBodyData setAgentInfo(CloudMonitorTaskResponseBodyDataAgentInfo agentInfo) {
            this.agentInfo = agentInfo;
            return this;
        }
        public CloudMonitorTaskResponseBodyDataAgentInfo getAgentInfo() {
            return this.agentInfo;
        }

        public CloudMonitorTaskResponseBodyData setAgentStatisticList(java.util.List<CloudMonitorTaskResponseBodyDataAgentStatisticList> agentStatisticList) {
            this.agentStatisticList = agentStatisticList;
            return this;
        }
        public java.util.List<CloudMonitorTaskResponseBodyDataAgentStatisticList> getAgentStatisticList() {
            return this.agentStatisticList;
        }

        public CloudMonitorTaskResponseBodyData setChannelInfo(CloudMonitorTaskResponseBodyDataChannelInfo channelInfo) {
            this.channelInfo = channelInfo;
            return this;
        }
        public CloudMonitorTaskResponseBodyDataChannelInfo getChannelInfo() {
            return this.channelInfo;
        }

        public CloudMonitorTaskResponseBodyData setRemovedAgentStatisticList(java.util.List<CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList> removedAgentStatisticList) {
            this.removedAgentStatisticList = removedAgentStatisticList;
            return this;
        }
        public java.util.List<CloudMonitorTaskResponseBodyDataRemovedAgentStatisticList> getRemovedAgentStatisticList() {
            return this.removedAgentStatisticList;
        }

        public CloudMonitorTaskResponseBodyData setStatistic(CloudMonitorTaskResponseBodyDataStatistic statistic) {
            this.statistic = statistic;
            return this;
        }
        public CloudMonitorTaskResponseBodyDataStatistic getStatistic() {
            return this.statistic;
        }

        public CloudMonitorTaskResponseBodyData setTodayStatistic(CloudMonitorTaskResponseBodyDataTodayStatistic todayStatistic) {
            this.todayStatistic = todayStatistic;
            return this;
        }
        public CloudMonitorTaskResponseBodyDataTodayStatistic getTodayStatistic() {
            return this.todayStatistic;
        }

    }

}
