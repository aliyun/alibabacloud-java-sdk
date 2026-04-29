// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentWorkloadReportResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudAgentWorkloadReportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>756BCB70-492E-5877-ABEB-03BB5CA28540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudAgentWorkloadReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentWorkloadReportResponseBody self = new CloudAgentWorkloadReportResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudAgentWorkloadReportResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudAgentWorkloadReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudAgentWorkloadReportResponseBody setData(CloudAgentWorkloadReportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudAgentWorkloadReportResponseBodyData getData() {
        return this.data;
    }

    public CloudAgentWorkloadReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudAgentWorkloadReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudAgentWorkloadReportResponseBodyDataList extends TeaModel {
        /**
         * <p>座席来电接听率</p>
         * 
         * <strong>example:</strong>
         * <p>80%</p>
         */
        @NameInMap("AgentAnswerRate")
        public String agentAnswerRate;

        /**
         * <p>座席创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2019-04-20</p>
         */
        @NameInMap("AgentCreateTime")
        public String agentCreateTime;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>test-3</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>座席呼叫接听率</p>
         * 
         * <strong>example:</strong>
         * <p>0%</p>
         */
        @NameInMap("AgentRate")
        public String agentRate;

        /**
         * <p>座席停用时间</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:01</p>
         */
        @NameInMap("AgentStopTime")
        public String agentStopTime;

        /**
         * <p>平均空闲时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:01</p>
         */
        @NameInMap("AvgIdleTime")
        public String avgIdleTime;

        /**
         * <p>平均置忙时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("AvgPauseTime")
        public String avgPauseTime;

        /**
         * <p>平均等待时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("AvgPreviewObWaitTime")
        public String avgPreviewObWaitTime;

        /**
         * <p>平均休息时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:03</p>
         */
        @NameInMap("AvgRestTime")
        public String avgRestTime;

        /**
         * <p>通话利用率</p>
         * 
         * <strong>example:</strong>
         * <p>66%</p>
         */
        @NameInMap("CallUtilization")
        public String callUtilization;

        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>时间范围</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("DateTimeRange")
        public String dateTimeRange;

        /**
         * <p>统计日期</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20</p>
         */
        @NameInMap("Day")
        public String day;

        /**
         * <p>主叫外呼客户接听数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("DirectObAnsweredCount")
        public String directObAnsweredCount;

        /**
         * <p>主叫外呼接听量分布</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObAnsweredDurationArray")
        public String directObAnsweredDurationArray;

        /**
         * <p>主叫外呼接听量分布描述</p>
         */
        @NameInMap("DirectObAnsweredDurationDscArray")
        public java.util.List<String> directObAnsweredDurationDscArray;

        /**
         * <p>主叫外呼总时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("DirectObBridgeDuration")
        public String directObBridgeDuration;

        /**
         * <p>主叫外呼双方接听分钟数</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("DirectObBridgeTime")
        public String directObBridgeTime;

        /**
         * <p>主叫外呼咨询总次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObConsultCount")
        public String directObConsultCount;

        /**
         * <p>主叫外呼强插总次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObMonitorBargeCount")
        public String directObMonitorBargeCount;

        /**
         * <p>主叫外呼总监控强拆次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObMonitorDisconnectCount")
        public String directObMonitorDisconnectCount;

        /**
         * <p>主叫外呼监听总次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObMonitorSpyCount")
        public String directObMonitorSpyCount;

        /**
         * <p>主叫外呼监控三方总次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObMonitorThreewayCount")
        public String directObMonitorThreewayCount;

        /**
         * <p>主叫外呼耳语总次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObMonitorWhisperCount")
        public String directObMonitorWhisperCount;

        /**
         * <p>主叫外呼总次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObTotalCount")
        public String directObTotalCount;

        /**
         * <p>主叫外呼总分钟数</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:22</p>
         */
        @NameInMap("DirectObTotalTime")
        public String directObTotalTime;

        /**
         * <p>主叫外呼转移总次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObTransferCount")
        public String directObTransferCount;

        /**
         * <p>主叫外呼有效接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DirectObValidCalls")
        public String directObValidCalls;

        /**
         * <p>主叫外呼有效接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("DirectObValidTotalBridgeTime")
        public String directObValidTotalBridgeTime;

        /**
         * <p>企业id</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public String enterpriseId;

        /**
         * <p>工时利用率</p>
         * 
         * <strong>example:</strong>
         * <p>80%</p>
         */
        @NameInMap("HoursUtilization")
        public String hoursUtilization;

        /**
         * <p>座席挂机数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbAgentHangupCount")
        public String ibAgentHangupCount;

        /**
         * <p>来电座席拒接数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbAgentRefuseCount")
        public String ibAgentRefuseCount;

        /**
         * <p>呼入座席接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbAnsweredCount")
        public String ibAnsweredCount;

        /**
         * <p>接听量分布</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("IbAnsweredDurationArray")
        public java.util.List<String> ibAnsweredDurationArray;

        /**
         * <p>呼入接听量分布描述</p>
         */
        @NameInMap("IbAnsweredDurationDscArray")
        public java.util.List<String> ibAnsweredDurationDscArray;

        /**
         * <p>呼入接听平均延迟时间</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbAvgAnswerDelayTime")
        public String ibAvgAnswerDelayTime;

        /**
         * <p>呼入平均通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbAvgBridgeTime")
        public String ibAvgBridgeTime;

        /**
         * <p>呼入平均呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbAvgCallingTime")
        public String ibAvgCallingTime;

        /**
         * <p>呼入平均保持时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbAvgHoldTime")
        public String ibAvgHoldTime;

        /**
         * <p>呼入平均整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:10</p>
         */
        @NameInMap("IbAvgWrapupTime")
        public String ibAvgWrapupTime;

        /**
         * <p>呼入通话次数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IbBridgeCount")
        public String ibBridgeCount;

        /**
         * <p>呼入通话分钟数</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbBridgeMinute")
        public String ibBridgeMinute;

        /**
         * <p>呼入双方接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbBridgeTime")
        public String ibBridgeTime;

        /**
         * <p>呼入呼叫次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbCallingCount")
        public String ibCallingCount;

        /**
         * <p>呼入总呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbCallingTime")
        public String ibCallingTime;

        /**
         * <p>呼入咨询数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbConsultCount")
        public String ibConsultCount;

        /**
         * <p>客户挂机数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IbCustomerHangupCount")
        public String ibCustomerHangupCount;

        /**
         * <p>呼叫保持次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbHoldCount")
        public String ibHoldCount;

        /**
         * <p>呼入总保持时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbHoldTime")
        public String ibHoldTime;

        /**
         * <p>呼入接听最大延迟时间</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMaxAnswerDelayTime")
        public String ibMaxAnswerDelayTime;

        /**
         * <p>呼入最大通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMaxBridgeTime")
        public String ibMaxBridgeTime;

        /**
         * <p>呼入最大呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:10</p>
         */
        @NameInMap("IbMaxCallingTime")
        public String ibMaxCallingTime;

        /**
         * <p>呼入最大保持时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMaxHoldTime")
        public String ibMaxHoldTime;

        /**
         * <p>呼入最大整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMaxWrapupTime")
        public String ibMaxWrapupTime;

        /**
         * <p>呼入接听最小延迟时间</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMinAnswerDelayTime")
        public String ibMinAnswerDelayTime;

        /**
         * <p>呼入最小通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:10</p>
         */
        @NameInMap("IbMinBridgeTime")
        public String ibMinBridgeTime;

        /**
         * <p>呼入最小呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMinCallingTime")
        public String ibMinCallingTime;

        /**
         * <p>呼入最小保持时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMinHoldTime")
        public String ibMinHoldTime;

        /**
         * <p>呼入最小整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMinWrapupTime")
        public String ibMinWrapupTime;

        /**
         * <p>呼入监控强插数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbMonitorBargeCount")
        public String ibMonitorBargeCount;

        /**
         * <p>呼入强插时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMonitorBargeDuration")
        public String ibMonitorBargeDuration;

        /**
         * <p>呼入监控强拆数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbMonitorDisconnectCount")
        public String ibMonitorDisconnectCount;

        /**
         * <p>呼入监控抢线数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbMonitorPickupCount")
        public String ibMonitorPickupCount;

        /**
         * <p>呼入抢线时长</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbMonitorPickupDuration")
        public String ibMonitorPickupDuration;

        /**
         * <p>呼入监控监听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IbMonitorSpyCount")
        public String ibMonitorSpyCount;

        /**
         * <p>呼入监听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMonitorSpyDuration")
        public String ibMonitorSpyDuration;

        /**
         * <p>呼入监控三方数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbMonitorThreewayCount")
        public String ibMonitorThreewayCount;

        /**
         * <p>呼入监控耳语数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbMonitorWhisperCount")
        public String ibMonitorWhisperCount;

        /**
         * <p>呼入耳语时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbMonitorWhisperDuration")
        public String ibMonitorWhisperDuration;

        /**
         * <p>呼入接听总延迟时间</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbTotalAnswerDelayTime")
        public String ibTotalAnswerDelayTime;

        /**
         * <p>总呼入座席数</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("IbTotalCount")
        public String ibTotalCount;

        /**
         * <p>呼入总分钟数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbTotalMinute")
        public String ibTotalMinute;

        /**
         * <p>呼入总通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IbTotalTime")
        public String ibTotalTime;

        /**
         * <p>呼入转移数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IbTransferCount")
        public String ibTransferCount;

        /**
         * <p>呼入座席未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("IbUnansweredCount")
        public String ibUnansweredCount;

        /**
         * <p>座席来电接听数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IbUniqueAnsweredCount")
        public String ibUniqueAnsweredCount;

        /**
         * <p>座席来电数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbUniqueTotalCount")
        public String ibUniqueTotalCount;

        /**
         * <p>座席来电未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbUniqueUnansweredCount")
        public String ibUniqueUnansweredCount;

        /**
         * <p>呼入有效通话次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbValidCalls")
        public String ibValidCalls;

        /**
         * <p>呼入有效通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:10</p>
         */
        @NameInMap("IbValidTotalBridgeTime")
        public String ibValidTotalBridgeTime;

        /**
         * <p>呼入整理次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IbWrapupCount")
        public String ibWrapupCount;

        /**
         * <p>呼入总整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IbWrapupTime")
        public String ibWrapupTime;

        /**
         * <p>id</p>
         * 
         * <strong>example:</strong>
         * <p>123124</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>空闲次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IdleCount")
        public String idleCount;

        /**
         * <p>总空闲时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("IdleTime")
        public String idleTime;

        /**
         * <p>预览外呼IVR转移座席接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IvrTransferBridgeCount")
        public String ivrTransferBridgeCount;

        /**
         * <p>预览外呼IVR转移双方接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:01</p>
         */
        @NameInMap("IvrTransferBridgeDuration")
        public String ivrTransferBridgeDuration;

        /**
         * <p>预览外呼IVR转移座席数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IvrTransferCount")
        public String ivrTransferCount;

        /**
         * <p>总登录时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:01</p>
         */
        @NameInMap("LoginTime")
        public String loginTime;

        /**
         * <p>最大空闲时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("MaxIdleTime")
        public String maxIdleTime;

        /**
         * <p>最大置忙时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("MaxPauseTime")
        public String maxPauseTime;

        /**
         * <p>最大休息时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("MaxRestTime")
        public String maxRestTime;

        /**
         * <p>最小空闲时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:01</p>
         */
        @NameInMap("MinIdleTime")
        public String minIdleTime;

        /**
         * <p>最小置忙时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("MinPauseTime")
        public String minPauseTime;

        /**
         * <p>最小休息时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("MinRestTime")
        public String minRestTime;

        /**
         * <p>外呼平均通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("ObAvgBridgeTime")
        public String obAvgBridgeTime;

        /**
         * <p>外呼平均呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:11</p>
         */
        @NameInMap("ObAvgCallingTime")
        public String obAvgCallingTime;

        /**
         * <p>外呼平均保持时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:50</p>
         */
        @NameInMap("ObAvgHoldTime")
        public String obAvgHoldTime;

        /**
         * <p>外呼平均整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:05</p>
         */
        @NameInMap("ObAvgWrapupTime")
        public String obAvgWrapupTime;

        /**
         * <p>外呼通话次数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ObBridgeCount")
        public String obBridgeCount;

        /**
         * <p>外呼总通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>ObBridgeTime</p>
         */
        @NameInMap("ObBridgeTime")
        public String obBridgeTime;

        /**
         * <p>外呼呼叫次数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObCallingCount")
        public String obCallingCount;

        /**
         * <p>外呼总呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("ObCallingTime")
        public String obCallingTime;

        /**
         * <p>外呼保持次数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObHoldCount")
        public String obHoldCount;

        /**
         * <p>外呼总保持时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:10</p>
         */
        @NameInMap("ObHoldTime")
        public String obHoldTime;

        /**
         * <p>外呼最大通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("ObMaxBridgeTime")
        public String obMaxBridgeTime;

        /**
         * <p>外呼最大呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:03</p>
         */
        @NameInMap("ObMaxCallingTime")
        public String obMaxCallingTime;

        /**
         * <p>外呼最大保持时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:01</p>
         */
        @NameInMap("ObMaxHoldTime")
        public String obMaxHoldTime;

        /**
         * <p>外呼最大整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:22</p>
         */
        @NameInMap("ObMaxWrapupTime")
        public String obMaxWrapupTime;

        /**
         * <p>外呼最小通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:02</p>
         */
        @NameInMap("ObMinBridgeTime")
        public String obMinBridgeTime;

        /**
         * <p>外呼最小呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ObMinCallingTime")
        public String obMinCallingTime;

        /**
         * <p>外呼最小保持时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("ObMinHoldTime")
        public String obMinHoldTime;

        /**
         * <p>外呼最小整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("ObMinWrapupTime")
        public String obMinWrapupTime;

        /**
         * <p>外呼双方接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:10</p>
         */
        @NameInMap("ObRealBridgeTime")
        public String obRealBridgeTime;

        /**
         * <p>外呼整理次数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ObWrapupCount")
        public String obWrapupCount;

        /**
         * <p>外呼总整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("ObWrapupTime")
        public String obWrapupTime;

        /**
         * <p>置忙次数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PauseCount")
        public String pauseCount;

        /**
         * <p>总置忙时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:10</p>
         */
        @NameInMap("PauseTime")
        public String pauseTime;

        /**
         * <p>预测外呼座席接听通话总小时</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PredictObAgentAnsweredHour")
        public String predictObAgentAnsweredHour;

        /**
         * <p>预测外呼座席接听通话总时长</p>
         * 
         * <strong>example:</strong>
         * <p>72</p>
         */
        @NameInMap("PredictObAgentAnsweredTime")
        public Long predictObAgentAnsweredTime;

        /**
         * <p>预测外呼座席接听数</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("PredictObAnsweredCount")
        public Long predictObAnsweredCount;

        /**
         * <p>预测外呼接听量分布</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("PredictObAnsweredDurationArray")
        public String predictObAnsweredDurationArray;

        /**
         * <p>预测外呼咨询数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictObConsultCount")
        public String predictObConsultCount;

        /**
         * <p>预测外呼监控强插数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictObMonitorBargeCount")
        public String predictObMonitorBargeCount;

        /**
         * <p>预测外呼强插时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("PredictObMonitorBargeDuration")
        public String predictObMonitorBargeDuration;

        /**
         * <p>预测外呼监控强拆数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictObMonitorDisconnectCount")
        public String predictObMonitorDisconnectCount;

        /**
         * <p>预测外呼监控监听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictObMonitorSpyCount")
        public String predictObMonitorSpyCount;

        /**
         * <p>预测外呼监听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("PredictObMonitorSpyDuration")
        public String predictObMonitorSpyDuration;

        /**
         * <p>预测外呼监控三方数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PredictObMonitorThreewayCount")
        public String predictObMonitorThreewayCount;

        /**
         * <p>预测外呼监控耳语数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictObMonitorWhisperCount")
        public String predictObMonitorWhisperCount;

        /**
         * <p>预测外呼耳语时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("PredictObMonitorWhisperDuration")
        public String predictObMonitorWhisperDuration;

        /**
         * <p>预测外呼总数</p>
         * 
         * <strong>example:</strong>
         * <p>39</p>
         */
        @NameInMap("PredictObTotalCount")
        public Long predictObTotalCount;

        /**
         * <p>预测外呼转移数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictObTransferCount")
        public String predictObTransferCount;

        /**
         * <p>预测外呼有效通话数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictObValidCalls")
        public Long predictObValidCalls;

        /**
         * <p>预测外呼有效通话总小时</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictObValidTotalBridgeHour")
        public String predictObValidTotalBridgeHour;

        /**
         * <p>预测外呼有效通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("PredictObValidTotalBridgeTime")
        public Long predictObValidTotalBridgeTime;

        /**
         * <p>预览外呼座席接听率</p>
         * 
         * <strong>example:</strong>
         * <p>33%</p>
         */
        @NameInMap("PreviewAgentAnswerdRate")
        public String previewAgentAnswerdRate;

        /**
         * <p>预览外呼客户接听率</p>
         * 
         * <strong>example:</strong>
         * <p>0%</p>
         */
        @NameInMap("PreviewCustomerAnswerdRate")
        public String previewCustomerAnswerdRate;

        /**
         * <p>预览外呼座席接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObAgentAnsweredCount")
        public String previewObAgentAnsweredCount;

        /**
         * <p>预览外呼座席接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:01</p>
         */
        @NameInMap("PreviewObAgentAnsweredTime")
        public String previewObAgentAnsweredTime;

        /**
         * <p>预览外呼双方接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObAnsweredCount")
        public String previewObAnsweredCount;

        /**
         * <p>预览外呼接听量分布</p>
         */
        @NameInMap("PreviewObAnsweredDurationArray")
        public java.util.List<String> previewObAnsweredDurationArray;

        /**
         * <p>预览外呼接听量分布描述</p>
         */
        @NameInMap("PreviewObAnsweredDurationDscArray")
        public java.util.List<String> previewObAnsweredDurationDscArray;

        /**
         * <p>预览外呼咨询数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObConsultCount")
        public String previewObConsultCount;

        /**
         * <p>预览外呼客户接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("PreviewObCustomerAnsweredTime")
        public String previewObCustomerAnsweredTime;

        /**
         * <p>响铃数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PreviewObCustomerRingingCount")
        public String previewObCustomerRingingCount;

        /**
         * <p>响铃率</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("PreviewObCustomerRingingRate")
        public String previewObCustomerRingingRate;

        /**
         * <p>预览外呼监控强插数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObMonitorBargeCount")
        public String previewObMonitorBargeCount;

        /**
         * <p>预览外呼强插时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("PreviewObMonitorBargeDuration")
        public String previewObMonitorBargeDuration;

        /**
         * <p>预览外呼监控强拆数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObMonitorDisconnectCount")
        public String previewObMonitorDisconnectCount;

        /**
         * <p>预览外呼监控监听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObMonitorSpyCount")
        public String previewObMonitorSpyCount;

        /**
         * <p>预览外呼监听时长</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObMonitorSpyDuration")
        public String previewObMonitorSpyDuration;

        /**
         * <p>预览外呼监控三方数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObMonitorThreewayCount")
        public String previewObMonitorThreewayCount;

        /**
         * <p>预览外呼监控耳语数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObMonitorWhisperCount")
        public String previewObMonitorWhisperCount;

        /**
         * <p>预览外呼耳语时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("PreviewObMonitorWhisperDuration")
        public String previewObMonitorWhisperDuration;

        /**
         * <p>预览外呼双方接听通话小时</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObTotalBridgeHour")
        public String previewObTotalBridgeHour;

        /**
         * <p>预览外呼双方接听通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("PreviewObTotalBridgeTime")
        public String previewObTotalBridgeTime;

        /**
         * <p>总预览外呼数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObTotalCount")
        public String previewObTotalCount;

        /**
         * <p>预览外呼被转接听数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PreviewObTransferBridgeCount")
        public String previewObTransferBridgeCount;

        /**
         * <p>预览外呼被转接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("PreviewObTransferBridgeDuration")
        public String previewObTransferBridgeDuration;

        /**
         * <p>预览外呼被转数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PreviewObTransferCount")
        public String previewObTransferCount;

        /**
         * <p>预览外呼有效通话次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PreviewObValidCalls")
        public String previewObValidCalls;

        /**
         * <p>预览外呼有效通话总小时</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PreviewObValidTotalBridgeHour")
        public String previewObValidTotalBridgeHour;

        /**
         * <p>预览外呼有效总通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:22</p>
         */
        @NameInMap("PreviewObValidTotalBridgeTime")
        public String previewObValidTotalBridgeTime;

        /**
         * <p>队列名</p>
         * 
         * <strong>example:</strong>
         * <p>name3</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        /**
         * <p>休息次数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RestCount")
        public String restCount;

        /**
         * <p>总休息时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("RestTime")
        public String restTime;

        /**
         * <p>行名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("RowName")
        public String rowName;

        /**
         * <p>总双方接听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("TotalBridgeTime")
        public String totalBridgeTime;

        /**
         * <p>webcall座席接听分钟数</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("WebcallObAgentAnsweredTime")
        public String webcallObAgentAnsweredTime;

        /**
         * <p>webcall双方接听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObAnsweredCount")
        public String webcallObAnsweredCount;

        /**
         * <p>webcall接听量分布</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("WebcallObAnsweredDurationArray")
        public String webcallObAnsweredDurationArray;

        /**
         * <p>webcall咨询数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObConsultCount")
        public String webcallObConsultCount;

        /**
         * <p>webcall监控强插数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObMonitorBargeCount")
        public String webcallObMonitorBargeCount;

        /**
         * <p>webcall强插时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("WebcallObMonitorBargeDuration")
        public String webcallObMonitorBargeDuration;

        /**
         * <p>webcall监控强拆数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObMonitorDisconnectCount")
        public String webcallObMonitorDisconnectCount;

        /**
         * <p>webcall监控监听数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObMonitorSpyCount")
        public String webcallObMonitorSpyCount;

        /**
         * <p>webcall监听时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("WebcallObMonitorSpyDuration")
        public String webcallObMonitorSpyDuration;

        /**
         * <p>webcall监控三方数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObMonitorThreewayCount")
        public String webcallObMonitorThreewayCount;

        /**
         * <p>webcall监控耳语数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObMonitorWhisperCount")
        public String webcallObMonitorWhisperCount;

        /**
         * <p>webcall耳语时长</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        @NameInMap("WebcallObMonitorWhisperDuration")
        public String webcallObMonitorWhisperDuration;

        /**
         * <p>总webcall数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObTotalCount")
        public String webcallObTotalCount;

        /**
         * <p>webcall转移数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebcallObTransferCount")
        public String webcallObTransferCount;

        public static CloudAgentWorkloadReportResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudAgentWorkloadReportResponseBodyDataList self = new CloudAgentWorkloadReportResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAgentAnswerRate(String agentAnswerRate) {
            this.agentAnswerRate = agentAnswerRate;
            return this;
        }
        public String getAgentAnswerRate() {
            return this.agentAnswerRate;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAgentCreateTime(String agentCreateTime) {
            this.agentCreateTime = agentCreateTime;
            return this;
        }
        public String getAgentCreateTime() {
            return this.agentCreateTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAgentRate(String agentRate) {
            this.agentRate = agentRate;
            return this;
        }
        public String getAgentRate() {
            return this.agentRate;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAgentStopTime(String agentStopTime) {
            this.agentStopTime = agentStopTime;
            return this;
        }
        public String getAgentStopTime() {
            return this.agentStopTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAvgIdleTime(String avgIdleTime) {
            this.avgIdleTime = avgIdleTime;
            return this;
        }
        public String getAvgIdleTime() {
            return this.avgIdleTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAvgPauseTime(String avgPauseTime) {
            this.avgPauseTime = avgPauseTime;
            return this;
        }
        public String getAvgPauseTime() {
            return this.avgPauseTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAvgPreviewObWaitTime(String avgPreviewObWaitTime) {
            this.avgPreviewObWaitTime = avgPreviewObWaitTime;
            return this;
        }
        public String getAvgPreviewObWaitTime() {
            return this.avgPreviewObWaitTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setAvgRestTime(String avgRestTime) {
            this.avgRestTime = avgRestTime;
            return this;
        }
        public String getAvgRestTime() {
            return this.avgRestTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setCallUtilization(String callUtilization) {
            this.callUtilization = callUtilization;
            return this;
        }
        public String getCallUtilization() {
            return this.callUtilization;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDateTimeRange(String dateTimeRange) {
            this.dateTimeRange = dateTimeRange;
            return this;
        }
        public String getDateTimeRange() {
            return this.dateTimeRange;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDay(String day) {
            this.day = day;
            return this;
        }
        public String getDay() {
            return this.day;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObAnsweredCount(String directObAnsweredCount) {
            this.directObAnsweredCount = directObAnsweredCount;
            return this;
        }
        public String getDirectObAnsweredCount() {
            return this.directObAnsweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObAnsweredDurationArray(String directObAnsweredDurationArray) {
            this.directObAnsweredDurationArray = directObAnsweredDurationArray;
            return this;
        }
        public String getDirectObAnsweredDurationArray() {
            return this.directObAnsweredDurationArray;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObAnsweredDurationDscArray(java.util.List<String> directObAnsweredDurationDscArray) {
            this.directObAnsweredDurationDscArray = directObAnsweredDurationDscArray;
            return this;
        }
        public java.util.List<String> getDirectObAnsweredDurationDscArray() {
            return this.directObAnsweredDurationDscArray;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObBridgeDuration(String directObBridgeDuration) {
            this.directObBridgeDuration = directObBridgeDuration;
            return this;
        }
        public String getDirectObBridgeDuration() {
            return this.directObBridgeDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObBridgeTime(String directObBridgeTime) {
            this.directObBridgeTime = directObBridgeTime;
            return this;
        }
        public String getDirectObBridgeTime() {
            return this.directObBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObConsultCount(String directObConsultCount) {
            this.directObConsultCount = directObConsultCount;
            return this;
        }
        public String getDirectObConsultCount() {
            return this.directObConsultCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObMonitorBargeCount(String directObMonitorBargeCount) {
            this.directObMonitorBargeCount = directObMonitorBargeCount;
            return this;
        }
        public String getDirectObMonitorBargeCount() {
            return this.directObMonitorBargeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObMonitorDisconnectCount(String directObMonitorDisconnectCount) {
            this.directObMonitorDisconnectCount = directObMonitorDisconnectCount;
            return this;
        }
        public String getDirectObMonitorDisconnectCount() {
            return this.directObMonitorDisconnectCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObMonitorSpyCount(String directObMonitorSpyCount) {
            this.directObMonitorSpyCount = directObMonitorSpyCount;
            return this;
        }
        public String getDirectObMonitorSpyCount() {
            return this.directObMonitorSpyCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObMonitorThreewayCount(String directObMonitorThreewayCount) {
            this.directObMonitorThreewayCount = directObMonitorThreewayCount;
            return this;
        }
        public String getDirectObMonitorThreewayCount() {
            return this.directObMonitorThreewayCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObMonitorWhisperCount(String directObMonitorWhisperCount) {
            this.directObMonitorWhisperCount = directObMonitorWhisperCount;
            return this;
        }
        public String getDirectObMonitorWhisperCount() {
            return this.directObMonitorWhisperCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObTotalCount(String directObTotalCount) {
            this.directObTotalCount = directObTotalCount;
            return this;
        }
        public String getDirectObTotalCount() {
            return this.directObTotalCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObTotalTime(String directObTotalTime) {
            this.directObTotalTime = directObTotalTime;
            return this;
        }
        public String getDirectObTotalTime() {
            return this.directObTotalTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObTransferCount(String directObTransferCount) {
            this.directObTransferCount = directObTransferCount;
            return this;
        }
        public String getDirectObTransferCount() {
            return this.directObTransferCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObValidCalls(String directObValidCalls) {
            this.directObValidCalls = directObValidCalls;
            return this;
        }
        public String getDirectObValidCalls() {
            return this.directObValidCalls;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setDirectObValidTotalBridgeTime(String directObValidTotalBridgeTime) {
            this.directObValidTotalBridgeTime = directObValidTotalBridgeTime;
            return this;
        }
        public String getDirectObValidTotalBridgeTime() {
            return this.directObValidTotalBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setHoursUtilization(String hoursUtilization) {
            this.hoursUtilization = hoursUtilization;
            return this;
        }
        public String getHoursUtilization() {
            return this.hoursUtilization;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAgentHangupCount(String ibAgentHangupCount) {
            this.ibAgentHangupCount = ibAgentHangupCount;
            return this;
        }
        public String getIbAgentHangupCount() {
            return this.ibAgentHangupCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAgentRefuseCount(String ibAgentRefuseCount) {
            this.ibAgentRefuseCount = ibAgentRefuseCount;
            return this;
        }
        public String getIbAgentRefuseCount() {
            return this.ibAgentRefuseCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAnsweredCount(String ibAnsweredCount) {
            this.ibAnsweredCount = ibAnsweredCount;
            return this;
        }
        public String getIbAnsweredCount() {
            return this.ibAnsweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAnsweredDurationArray(java.util.List<String> ibAnsweredDurationArray) {
            this.ibAnsweredDurationArray = ibAnsweredDurationArray;
            return this;
        }
        public java.util.List<String> getIbAnsweredDurationArray() {
            return this.ibAnsweredDurationArray;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAnsweredDurationDscArray(java.util.List<String> ibAnsweredDurationDscArray) {
            this.ibAnsweredDurationDscArray = ibAnsweredDurationDscArray;
            return this;
        }
        public java.util.List<String> getIbAnsweredDurationDscArray() {
            return this.ibAnsweredDurationDscArray;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAvgAnswerDelayTime(String ibAvgAnswerDelayTime) {
            this.ibAvgAnswerDelayTime = ibAvgAnswerDelayTime;
            return this;
        }
        public String getIbAvgAnswerDelayTime() {
            return this.ibAvgAnswerDelayTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAvgBridgeTime(String ibAvgBridgeTime) {
            this.ibAvgBridgeTime = ibAvgBridgeTime;
            return this;
        }
        public String getIbAvgBridgeTime() {
            return this.ibAvgBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAvgCallingTime(String ibAvgCallingTime) {
            this.ibAvgCallingTime = ibAvgCallingTime;
            return this;
        }
        public String getIbAvgCallingTime() {
            return this.ibAvgCallingTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAvgHoldTime(String ibAvgHoldTime) {
            this.ibAvgHoldTime = ibAvgHoldTime;
            return this;
        }
        public String getIbAvgHoldTime() {
            return this.ibAvgHoldTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbAvgWrapupTime(String ibAvgWrapupTime) {
            this.ibAvgWrapupTime = ibAvgWrapupTime;
            return this;
        }
        public String getIbAvgWrapupTime() {
            return this.ibAvgWrapupTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbBridgeCount(String ibBridgeCount) {
            this.ibBridgeCount = ibBridgeCount;
            return this;
        }
        public String getIbBridgeCount() {
            return this.ibBridgeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbBridgeMinute(String ibBridgeMinute) {
            this.ibBridgeMinute = ibBridgeMinute;
            return this;
        }
        public String getIbBridgeMinute() {
            return this.ibBridgeMinute;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbBridgeTime(String ibBridgeTime) {
            this.ibBridgeTime = ibBridgeTime;
            return this;
        }
        public String getIbBridgeTime() {
            return this.ibBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbCallingCount(String ibCallingCount) {
            this.ibCallingCount = ibCallingCount;
            return this;
        }
        public String getIbCallingCount() {
            return this.ibCallingCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbCallingTime(String ibCallingTime) {
            this.ibCallingTime = ibCallingTime;
            return this;
        }
        public String getIbCallingTime() {
            return this.ibCallingTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbConsultCount(String ibConsultCount) {
            this.ibConsultCount = ibConsultCount;
            return this;
        }
        public String getIbConsultCount() {
            return this.ibConsultCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbCustomerHangupCount(String ibCustomerHangupCount) {
            this.ibCustomerHangupCount = ibCustomerHangupCount;
            return this;
        }
        public String getIbCustomerHangupCount() {
            return this.ibCustomerHangupCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbHoldCount(String ibHoldCount) {
            this.ibHoldCount = ibHoldCount;
            return this;
        }
        public String getIbHoldCount() {
            return this.ibHoldCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbHoldTime(String ibHoldTime) {
            this.ibHoldTime = ibHoldTime;
            return this;
        }
        public String getIbHoldTime() {
            return this.ibHoldTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMaxAnswerDelayTime(String ibMaxAnswerDelayTime) {
            this.ibMaxAnswerDelayTime = ibMaxAnswerDelayTime;
            return this;
        }
        public String getIbMaxAnswerDelayTime() {
            return this.ibMaxAnswerDelayTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMaxBridgeTime(String ibMaxBridgeTime) {
            this.ibMaxBridgeTime = ibMaxBridgeTime;
            return this;
        }
        public String getIbMaxBridgeTime() {
            return this.ibMaxBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMaxCallingTime(String ibMaxCallingTime) {
            this.ibMaxCallingTime = ibMaxCallingTime;
            return this;
        }
        public String getIbMaxCallingTime() {
            return this.ibMaxCallingTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMaxHoldTime(String ibMaxHoldTime) {
            this.ibMaxHoldTime = ibMaxHoldTime;
            return this;
        }
        public String getIbMaxHoldTime() {
            return this.ibMaxHoldTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMaxWrapupTime(String ibMaxWrapupTime) {
            this.ibMaxWrapupTime = ibMaxWrapupTime;
            return this;
        }
        public String getIbMaxWrapupTime() {
            return this.ibMaxWrapupTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMinAnswerDelayTime(String ibMinAnswerDelayTime) {
            this.ibMinAnswerDelayTime = ibMinAnswerDelayTime;
            return this;
        }
        public String getIbMinAnswerDelayTime() {
            return this.ibMinAnswerDelayTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMinBridgeTime(String ibMinBridgeTime) {
            this.ibMinBridgeTime = ibMinBridgeTime;
            return this;
        }
        public String getIbMinBridgeTime() {
            return this.ibMinBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMinCallingTime(String ibMinCallingTime) {
            this.ibMinCallingTime = ibMinCallingTime;
            return this;
        }
        public String getIbMinCallingTime() {
            return this.ibMinCallingTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMinHoldTime(String ibMinHoldTime) {
            this.ibMinHoldTime = ibMinHoldTime;
            return this;
        }
        public String getIbMinHoldTime() {
            return this.ibMinHoldTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMinWrapupTime(String ibMinWrapupTime) {
            this.ibMinWrapupTime = ibMinWrapupTime;
            return this;
        }
        public String getIbMinWrapupTime() {
            return this.ibMinWrapupTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorBargeCount(String ibMonitorBargeCount) {
            this.ibMonitorBargeCount = ibMonitorBargeCount;
            return this;
        }
        public String getIbMonitorBargeCount() {
            return this.ibMonitorBargeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorBargeDuration(String ibMonitorBargeDuration) {
            this.ibMonitorBargeDuration = ibMonitorBargeDuration;
            return this;
        }
        public String getIbMonitorBargeDuration() {
            return this.ibMonitorBargeDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorDisconnectCount(String ibMonitorDisconnectCount) {
            this.ibMonitorDisconnectCount = ibMonitorDisconnectCount;
            return this;
        }
        public String getIbMonitorDisconnectCount() {
            return this.ibMonitorDisconnectCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorPickupCount(String ibMonitorPickupCount) {
            this.ibMonitorPickupCount = ibMonitorPickupCount;
            return this;
        }
        public String getIbMonitorPickupCount() {
            return this.ibMonitorPickupCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorPickupDuration(String ibMonitorPickupDuration) {
            this.ibMonitorPickupDuration = ibMonitorPickupDuration;
            return this;
        }
        public String getIbMonitorPickupDuration() {
            return this.ibMonitorPickupDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorSpyCount(String ibMonitorSpyCount) {
            this.ibMonitorSpyCount = ibMonitorSpyCount;
            return this;
        }
        public String getIbMonitorSpyCount() {
            return this.ibMonitorSpyCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorSpyDuration(String ibMonitorSpyDuration) {
            this.ibMonitorSpyDuration = ibMonitorSpyDuration;
            return this;
        }
        public String getIbMonitorSpyDuration() {
            return this.ibMonitorSpyDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorThreewayCount(String ibMonitorThreewayCount) {
            this.ibMonitorThreewayCount = ibMonitorThreewayCount;
            return this;
        }
        public String getIbMonitorThreewayCount() {
            return this.ibMonitorThreewayCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorWhisperCount(String ibMonitorWhisperCount) {
            this.ibMonitorWhisperCount = ibMonitorWhisperCount;
            return this;
        }
        public String getIbMonitorWhisperCount() {
            return this.ibMonitorWhisperCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbMonitorWhisperDuration(String ibMonitorWhisperDuration) {
            this.ibMonitorWhisperDuration = ibMonitorWhisperDuration;
            return this;
        }
        public String getIbMonitorWhisperDuration() {
            return this.ibMonitorWhisperDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbTotalAnswerDelayTime(String ibTotalAnswerDelayTime) {
            this.ibTotalAnswerDelayTime = ibTotalAnswerDelayTime;
            return this;
        }
        public String getIbTotalAnswerDelayTime() {
            return this.ibTotalAnswerDelayTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbTotalCount(String ibTotalCount) {
            this.ibTotalCount = ibTotalCount;
            return this;
        }
        public String getIbTotalCount() {
            return this.ibTotalCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbTotalMinute(String ibTotalMinute) {
            this.ibTotalMinute = ibTotalMinute;
            return this;
        }
        public String getIbTotalMinute() {
            return this.ibTotalMinute;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbTotalTime(String ibTotalTime) {
            this.ibTotalTime = ibTotalTime;
            return this;
        }
        public String getIbTotalTime() {
            return this.ibTotalTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbTransferCount(String ibTransferCount) {
            this.ibTransferCount = ibTransferCount;
            return this;
        }
        public String getIbTransferCount() {
            return this.ibTransferCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbUnansweredCount(String ibUnansweredCount) {
            this.ibUnansweredCount = ibUnansweredCount;
            return this;
        }
        public String getIbUnansweredCount() {
            return this.ibUnansweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbUniqueAnsweredCount(String ibUniqueAnsweredCount) {
            this.ibUniqueAnsweredCount = ibUniqueAnsweredCount;
            return this;
        }
        public String getIbUniqueAnsweredCount() {
            return this.ibUniqueAnsweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbUniqueTotalCount(String ibUniqueTotalCount) {
            this.ibUniqueTotalCount = ibUniqueTotalCount;
            return this;
        }
        public String getIbUniqueTotalCount() {
            return this.ibUniqueTotalCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbUniqueUnansweredCount(String ibUniqueUnansweredCount) {
            this.ibUniqueUnansweredCount = ibUniqueUnansweredCount;
            return this;
        }
        public String getIbUniqueUnansweredCount() {
            return this.ibUniqueUnansweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbValidCalls(String ibValidCalls) {
            this.ibValidCalls = ibValidCalls;
            return this;
        }
        public String getIbValidCalls() {
            return this.ibValidCalls;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbValidTotalBridgeTime(String ibValidTotalBridgeTime) {
            this.ibValidTotalBridgeTime = ibValidTotalBridgeTime;
            return this;
        }
        public String getIbValidTotalBridgeTime() {
            return this.ibValidTotalBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbWrapupCount(String ibWrapupCount) {
            this.ibWrapupCount = ibWrapupCount;
            return this;
        }
        public String getIbWrapupCount() {
            return this.ibWrapupCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIbWrapupTime(String ibWrapupTime) {
            this.ibWrapupTime = ibWrapupTime;
            return this;
        }
        public String getIbWrapupTime() {
            return this.ibWrapupTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIdleCount(String idleCount) {
            this.idleCount = idleCount;
            return this;
        }
        public String getIdleCount() {
            return this.idleCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIdleTime(String idleTime) {
            this.idleTime = idleTime;
            return this;
        }
        public String getIdleTime() {
            return this.idleTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIvrTransferBridgeCount(String ivrTransferBridgeCount) {
            this.ivrTransferBridgeCount = ivrTransferBridgeCount;
            return this;
        }
        public String getIvrTransferBridgeCount() {
            return this.ivrTransferBridgeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIvrTransferBridgeDuration(String ivrTransferBridgeDuration) {
            this.ivrTransferBridgeDuration = ivrTransferBridgeDuration;
            return this;
        }
        public String getIvrTransferBridgeDuration() {
            return this.ivrTransferBridgeDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setIvrTransferCount(String ivrTransferCount) {
            this.ivrTransferCount = ivrTransferCount;
            return this;
        }
        public String getIvrTransferCount() {
            return this.ivrTransferCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setLoginTime(String loginTime) {
            this.loginTime = loginTime;
            return this;
        }
        public String getLoginTime() {
            return this.loginTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setMaxIdleTime(String maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
            return this;
        }
        public String getMaxIdleTime() {
            return this.maxIdleTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setMaxPauseTime(String maxPauseTime) {
            this.maxPauseTime = maxPauseTime;
            return this;
        }
        public String getMaxPauseTime() {
            return this.maxPauseTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setMaxRestTime(String maxRestTime) {
            this.maxRestTime = maxRestTime;
            return this;
        }
        public String getMaxRestTime() {
            return this.maxRestTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setMinIdleTime(String minIdleTime) {
            this.minIdleTime = minIdleTime;
            return this;
        }
        public String getMinIdleTime() {
            return this.minIdleTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setMinPauseTime(String minPauseTime) {
            this.minPauseTime = minPauseTime;
            return this;
        }
        public String getMinPauseTime() {
            return this.minPauseTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setMinRestTime(String minRestTime) {
            this.minRestTime = minRestTime;
            return this;
        }
        public String getMinRestTime() {
            return this.minRestTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObAvgBridgeTime(String obAvgBridgeTime) {
            this.obAvgBridgeTime = obAvgBridgeTime;
            return this;
        }
        public String getObAvgBridgeTime() {
            return this.obAvgBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObAvgCallingTime(String obAvgCallingTime) {
            this.obAvgCallingTime = obAvgCallingTime;
            return this;
        }
        public String getObAvgCallingTime() {
            return this.obAvgCallingTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObAvgHoldTime(String obAvgHoldTime) {
            this.obAvgHoldTime = obAvgHoldTime;
            return this;
        }
        public String getObAvgHoldTime() {
            return this.obAvgHoldTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObAvgWrapupTime(String obAvgWrapupTime) {
            this.obAvgWrapupTime = obAvgWrapupTime;
            return this;
        }
        public String getObAvgWrapupTime() {
            return this.obAvgWrapupTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObBridgeCount(String obBridgeCount) {
            this.obBridgeCount = obBridgeCount;
            return this;
        }
        public String getObBridgeCount() {
            return this.obBridgeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObBridgeTime(String obBridgeTime) {
            this.obBridgeTime = obBridgeTime;
            return this;
        }
        public String getObBridgeTime() {
            return this.obBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObCallingCount(String obCallingCount) {
            this.obCallingCount = obCallingCount;
            return this;
        }
        public String getObCallingCount() {
            return this.obCallingCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObCallingTime(String obCallingTime) {
            this.obCallingTime = obCallingTime;
            return this;
        }
        public String getObCallingTime() {
            return this.obCallingTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObHoldCount(String obHoldCount) {
            this.obHoldCount = obHoldCount;
            return this;
        }
        public String getObHoldCount() {
            return this.obHoldCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObHoldTime(String obHoldTime) {
            this.obHoldTime = obHoldTime;
            return this;
        }
        public String getObHoldTime() {
            return this.obHoldTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObMaxBridgeTime(String obMaxBridgeTime) {
            this.obMaxBridgeTime = obMaxBridgeTime;
            return this;
        }
        public String getObMaxBridgeTime() {
            return this.obMaxBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObMaxCallingTime(String obMaxCallingTime) {
            this.obMaxCallingTime = obMaxCallingTime;
            return this;
        }
        public String getObMaxCallingTime() {
            return this.obMaxCallingTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObMaxHoldTime(String obMaxHoldTime) {
            this.obMaxHoldTime = obMaxHoldTime;
            return this;
        }
        public String getObMaxHoldTime() {
            return this.obMaxHoldTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObMaxWrapupTime(String obMaxWrapupTime) {
            this.obMaxWrapupTime = obMaxWrapupTime;
            return this;
        }
        public String getObMaxWrapupTime() {
            return this.obMaxWrapupTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObMinBridgeTime(String obMinBridgeTime) {
            this.obMinBridgeTime = obMinBridgeTime;
            return this;
        }
        public String getObMinBridgeTime() {
            return this.obMinBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObMinCallingTime(String obMinCallingTime) {
            this.obMinCallingTime = obMinCallingTime;
            return this;
        }
        public String getObMinCallingTime() {
            return this.obMinCallingTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObMinHoldTime(String obMinHoldTime) {
            this.obMinHoldTime = obMinHoldTime;
            return this;
        }
        public String getObMinHoldTime() {
            return this.obMinHoldTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObMinWrapupTime(String obMinWrapupTime) {
            this.obMinWrapupTime = obMinWrapupTime;
            return this;
        }
        public String getObMinWrapupTime() {
            return this.obMinWrapupTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObRealBridgeTime(String obRealBridgeTime) {
            this.obRealBridgeTime = obRealBridgeTime;
            return this;
        }
        public String getObRealBridgeTime() {
            return this.obRealBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObWrapupCount(String obWrapupCount) {
            this.obWrapupCount = obWrapupCount;
            return this;
        }
        public String getObWrapupCount() {
            return this.obWrapupCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setObWrapupTime(String obWrapupTime) {
            this.obWrapupTime = obWrapupTime;
            return this;
        }
        public String getObWrapupTime() {
            return this.obWrapupTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPauseCount(String pauseCount) {
            this.pauseCount = pauseCount;
            return this;
        }
        public String getPauseCount() {
            return this.pauseCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPauseTime(String pauseTime) {
            this.pauseTime = pauseTime;
            return this;
        }
        public String getPauseTime() {
            return this.pauseTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObAgentAnsweredHour(String predictObAgentAnsweredHour) {
            this.predictObAgentAnsweredHour = predictObAgentAnsweredHour;
            return this;
        }
        public String getPredictObAgentAnsweredHour() {
            return this.predictObAgentAnsweredHour;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObAgentAnsweredTime(Long predictObAgentAnsweredTime) {
            this.predictObAgentAnsweredTime = predictObAgentAnsweredTime;
            return this;
        }
        public Long getPredictObAgentAnsweredTime() {
            return this.predictObAgentAnsweredTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObAnsweredCount(Long predictObAnsweredCount) {
            this.predictObAnsweredCount = predictObAnsweredCount;
            return this;
        }
        public Long getPredictObAnsweredCount() {
            return this.predictObAnsweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObAnsweredDurationArray(String predictObAnsweredDurationArray) {
            this.predictObAnsweredDurationArray = predictObAnsweredDurationArray;
            return this;
        }
        public String getPredictObAnsweredDurationArray() {
            return this.predictObAnsweredDurationArray;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObConsultCount(String predictObConsultCount) {
            this.predictObConsultCount = predictObConsultCount;
            return this;
        }
        public String getPredictObConsultCount() {
            return this.predictObConsultCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObMonitorBargeCount(String predictObMonitorBargeCount) {
            this.predictObMonitorBargeCount = predictObMonitorBargeCount;
            return this;
        }
        public String getPredictObMonitorBargeCount() {
            return this.predictObMonitorBargeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObMonitorBargeDuration(String predictObMonitorBargeDuration) {
            this.predictObMonitorBargeDuration = predictObMonitorBargeDuration;
            return this;
        }
        public String getPredictObMonitorBargeDuration() {
            return this.predictObMonitorBargeDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObMonitorDisconnectCount(String predictObMonitorDisconnectCount) {
            this.predictObMonitorDisconnectCount = predictObMonitorDisconnectCount;
            return this;
        }
        public String getPredictObMonitorDisconnectCount() {
            return this.predictObMonitorDisconnectCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObMonitorSpyCount(String predictObMonitorSpyCount) {
            this.predictObMonitorSpyCount = predictObMonitorSpyCount;
            return this;
        }
        public String getPredictObMonitorSpyCount() {
            return this.predictObMonitorSpyCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObMonitorSpyDuration(String predictObMonitorSpyDuration) {
            this.predictObMonitorSpyDuration = predictObMonitorSpyDuration;
            return this;
        }
        public String getPredictObMonitorSpyDuration() {
            return this.predictObMonitorSpyDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObMonitorThreewayCount(String predictObMonitorThreewayCount) {
            this.predictObMonitorThreewayCount = predictObMonitorThreewayCount;
            return this;
        }
        public String getPredictObMonitorThreewayCount() {
            return this.predictObMonitorThreewayCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObMonitorWhisperCount(String predictObMonitorWhisperCount) {
            this.predictObMonitorWhisperCount = predictObMonitorWhisperCount;
            return this;
        }
        public String getPredictObMonitorWhisperCount() {
            return this.predictObMonitorWhisperCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObMonitorWhisperDuration(String predictObMonitorWhisperDuration) {
            this.predictObMonitorWhisperDuration = predictObMonitorWhisperDuration;
            return this;
        }
        public String getPredictObMonitorWhisperDuration() {
            return this.predictObMonitorWhisperDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObTotalCount(Long predictObTotalCount) {
            this.predictObTotalCount = predictObTotalCount;
            return this;
        }
        public Long getPredictObTotalCount() {
            return this.predictObTotalCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObTransferCount(String predictObTransferCount) {
            this.predictObTransferCount = predictObTransferCount;
            return this;
        }
        public String getPredictObTransferCount() {
            return this.predictObTransferCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObValidCalls(Long predictObValidCalls) {
            this.predictObValidCalls = predictObValidCalls;
            return this;
        }
        public Long getPredictObValidCalls() {
            return this.predictObValidCalls;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObValidTotalBridgeHour(String predictObValidTotalBridgeHour) {
            this.predictObValidTotalBridgeHour = predictObValidTotalBridgeHour;
            return this;
        }
        public String getPredictObValidTotalBridgeHour() {
            return this.predictObValidTotalBridgeHour;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPredictObValidTotalBridgeTime(Long predictObValidTotalBridgeTime) {
            this.predictObValidTotalBridgeTime = predictObValidTotalBridgeTime;
            return this;
        }
        public Long getPredictObValidTotalBridgeTime() {
            return this.predictObValidTotalBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewAgentAnswerdRate(String previewAgentAnswerdRate) {
            this.previewAgentAnswerdRate = previewAgentAnswerdRate;
            return this;
        }
        public String getPreviewAgentAnswerdRate() {
            return this.previewAgentAnswerdRate;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewCustomerAnswerdRate(String previewCustomerAnswerdRate) {
            this.previewCustomerAnswerdRate = previewCustomerAnswerdRate;
            return this;
        }
        public String getPreviewCustomerAnswerdRate() {
            return this.previewCustomerAnswerdRate;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObAgentAnsweredCount(String previewObAgentAnsweredCount) {
            this.previewObAgentAnsweredCount = previewObAgentAnsweredCount;
            return this;
        }
        public String getPreviewObAgentAnsweredCount() {
            return this.previewObAgentAnsweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObAgentAnsweredTime(String previewObAgentAnsweredTime) {
            this.previewObAgentAnsweredTime = previewObAgentAnsweredTime;
            return this;
        }
        public String getPreviewObAgentAnsweredTime() {
            return this.previewObAgentAnsweredTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObAnsweredCount(String previewObAnsweredCount) {
            this.previewObAnsweredCount = previewObAnsweredCount;
            return this;
        }
        public String getPreviewObAnsweredCount() {
            return this.previewObAnsweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObAnsweredDurationArray(java.util.List<String> previewObAnsweredDurationArray) {
            this.previewObAnsweredDurationArray = previewObAnsweredDurationArray;
            return this;
        }
        public java.util.List<String> getPreviewObAnsweredDurationArray() {
            return this.previewObAnsweredDurationArray;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObAnsweredDurationDscArray(java.util.List<String> previewObAnsweredDurationDscArray) {
            this.previewObAnsweredDurationDscArray = previewObAnsweredDurationDscArray;
            return this;
        }
        public java.util.List<String> getPreviewObAnsweredDurationDscArray() {
            return this.previewObAnsweredDurationDscArray;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObConsultCount(String previewObConsultCount) {
            this.previewObConsultCount = previewObConsultCount;
            return this;
        }
        public String getPreviewObConsultCount() {
            return this.previewObConsultCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObCustomerAnsweredTime(String previewObCustomerAnsweredTime) {
            this.previewObCustomerAnsweredTime = previewObCustomerAnsweredTime;
            return this;
        }
        public String getPreviewObCustomerAnsweredTime() {
            return this.previewObCustomerAnsweredTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObCustomerRingingCount(String previewObCustomerRingingCount) {
            this.previewObCustomerRingingCount = previewObCustomerRingingCount;
            return this;
        }
        public String getPreviewObCustomerRingingCount() {
            return this.previewObCustomerRingingCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObCustomerRingingRate(String previewObCustomerRingingRate) {
            this.previewObCustomerRingingRate = previewObCustomerRingingRate;
            return this;
        }
        public String getPreviewObCustomerRingingRate() {
            return this.previewObCustomerRingingRate;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObMonitorBargeCount(String previewObMonitorBargeCount) {
            this.previewObMonitorBargeCount = previewObMonitorBargeCount;
            return this;
        }
        public String getPreviewObMonitorBargeCount() {
            return this.previewObMonitorBargeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObMonitorBargeDuration(String previewObMonitorBargeDuration) {
            this.previewObMonitorBargeDuration = previewObMonitorBargeDuration;
            return this;
        }
        public String getPreviewObMonitorBargeDuration() {
            return this.previewObMonitorBargeDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObMonitorDisconnectCount(String previewObMonitorDisconnectCount) {
            this.previewObMonitorDisconnectCount = previewObMonitorDisconnectCount;
            return this;
        }
        public String getPreviewObMonitorDisconnectCount() {
            return this.previewObMonitorDisconnectCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObMonitorSpyCount(String previewObMonitorSpyCount) {
            this.previewObMonitorSpyCount = previewObMonitorSpyCount;
            return this;
        }
        public String getPreviewObMonitorSpyCount() {
            return this.previewObMonitorSpyCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObMonitorSpyDuration(String previewObMonitorSpyDuration) {
            this.previewObMonitorSpyDuration = previewObMonitorSpyDuration;
            return this;
        }
        public String getPreviewObMonitorSpyDuration() {
            return this.previewObMonitorSpyDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObMonitorThreewayCount(String previewObMonitorThreewayCount) {
            this.previewObMonitorThreewayCount = previewObMonitorThreewayCount;
            return this;
        }
        public String getPreviewObMonitorThreewayCount() {
            return this.previewObMonitorThreewayCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObMonitorWhisperCount(String previewObMonitorWhisperCount) {
            this.previewObMonitorWhisperCount = previewObMonitorWhisperCount;
            return this;
        }
        public String getPreviewObMonitorWhisperCount() {
            return this.previewObMonitorWhisperCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObMonitorWhisperDuration(String previewObMonitorWhisperDuration) {
            this.previewObMonitorWhisperDuration = previewObMonitorWhisperDuration;
            return this;
        }
        public String getPreviewObMonitorWhisperDuration() {
            return this.previewObMonitorWhisperDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObTotalBridgeHour(String previewObTotalBridgeHour) {
            this.previewObTotalBridgeHour = previewObTotalBridgeHour;
            return this;
        }
        public String getPreviewObTotalBridgeHour() {
            return this.previewObTotalBridgeHour;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObTotalBridgeTime(String previewObTotalBridgeTime) {
            this.previewObTotalBridgeTime = previewObTotalBridgeTime;
            return this;
        }
        public String getPreviewObTotalBridgeTime() {
            return this.previewObTotalBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObTotalCount(String previewObTotalCount) {
            this.previewObTotalCount = previewObTotalCount;
            return this;
        }
        public String getPreviewObTotalCount() {
            return this.previewObTotalCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObTransferBridgeCount(String previewObTransferBridgeCount) {
            this.previewObTransferBridgeCount = previewObTransferBridgeCount;
            return this;
        }
        public String getPreviewObTransferBridgeCount() {
            return this.previewObTransferBridgeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObTransferBridgeDuration(String previewObTransferBridgeDuration) {
            this.previewObTransferBridgeDuration = previewObTransferBridgeDuration;
            return this;
        }
        public String getPreviewObTransferBridgeDuration() {
            return this.previewObTransferBridgeDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObTransferCount(String previewObTransferCount) {
            this.previewObTransferCount = previewObTransferCount;
            return this;
        }
        public String getPreviewObTransferCount() {
            return this.previewObTransferCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObValidCalls(String previewObValidCalls) {
            this.previewObValidCalls = previewObValidCalls;
            return this;
        }
        public String getPreviewObValidCalls() {
            return this.previewObValidCalls;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObValidTotalBridgeHour(String previewObValidTotalBridgeHour) {
            this.previewObValidTotalBridgeHour = previewObValidTotalBridgeHour;
            return this;
        }
        public String getPreviewObValidTotalBridgeHour() {
            return this.previewObValidTotalBridgeHour;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setPreviewObValidTotalBridgeTime(String previewObValidTotalBridgeTime) {
            this.previewObValidTotalBridgeTime = previewObValidTotalBridgeTime;
            return this;
        }
        public String getPreviewObValidTotalBridgeTime() {
            return this.previewObValidTotalBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setRestCount(String restCount) {
            this.restCount = restCount;
            return this;
        }
        public String getRestCount() {
            return this.restCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setRestTime(String restTime) {
            this.restTime = restTime;
            return this;
        }
        public String getRestTime() {
            return this.restTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setRowName(String rowName) {
            this.rowName = rowName;
            return this;
        }
        public String getRowName() {
            return this.rowName;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setTotalBridgeTime(String totalBridgeTime) {
            this.totalBridgeTime = totalBridgeTime;
            return this;
        }
        public String getTotalBridgeTime() {
            return this.totalBridgeTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObAgentAnsweredTime(String webcallObAgentAnsweredTime) {
            this.webcallObAgentAnsweredTime = webcallObAgentAnsweredTime;
            return this;
        }
        public String getWebcallObAgentAnsweredTime() {
            return this.webcallObAgentAnsweredTime;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObAnsweredCount(String webcallObAnsweredCount) {
            this.webcallObAnsweredCount = webcallObAnsweredCount;
            return this;
        }
        public String getWebcallObAnsweredCount() {
            return this.webcallObAnsweredCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObAnsweredDurationArray(String webcallObAnsweredDurationArray) {
            this.webcallObAnsweredDurationArray = webcallObAnsweredDurationArray;
            return this;
        }
        public String getWebcallObAnsweredDurationArray() {
            return this.webcallObAnsweredDurationArray;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObConsultCount(String webcallObConsultCount) {
            this.webcallObConsultCount = webcallObConsultCount;
            return this;
        }
        public String getWebcallObConsultCount() {
            return this.webcallObConsultCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObMonitorBargeCount(String webcallObMonitorBargeCount) {
            this.webcallObMonitorBargeCount = webcallObMonitorBargeCount;
            return this;
        }
        public String getWebcallObMonitorBargeCount() {
            return this.webcallObMonitorBargeCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObMonitorBargeDuration(String webcallObMonitorBargeDuration) {
            this.webcallObMonitorBargeDuration = webcallObMonitorBargeDuration;
            return this;
        }
        public String getWebcallObMonitorBargeDuration() {
            return this.webcallObMonitorBargeDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObMonitorDisconnectCount(String webcallObMonitorDisconnectCount) {
            this.webcallObMonitorDisconnectCount = webcallObMonitorDisconnectCount;
            return this;
        }
        public String getWebcallObMonitorDisconnectCount() {
            return this.webcallObMonitorDisconnectCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObMonitorSpyCount(String webcallObMonitorSpyCount) {
            this.webcallObMonitorSpyCount = webcallObMonitorSpyCount;
            return this;
        }
        public String getWebcallObMonitorSpyCount() {
            return this.webcallObMonitorSpyCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObMonitorSpyDuration(String webcallObMonitorSpyDuration) {
            this.webcallObMonitorSpyDuration = webcallObMonitorSpyDuration;
            return this;
        }
        public String getWebcallObMonitorSpyDuration() {
            return this.webcallObMonitorSpyDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObMonitorThreewayCount(String webcallObMonitorThreewayCount) {
            this.webcallObMonitorThreewayCount = webcallObMonitorThreewayCount;
            return this;
        }
        public String getWebcallObMonitorThreewayCount() {
            return this.webcallObMonitorThreewayCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObMonitorWhisperCount(String webcallObMonitorWhisperCount) {
            this.webcallObMonitorWhisperCount = webcallObMonitorWhisperCount;
            return this;
        }
        public String getWebcallObMonitorWhisperCount() {
            return this.webcallObMonitorWhisperCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObMonitorWhisperDuration(String webcallObMonitorWhisperDuration) {
            this.webcallObMonitorWhisperDuration = webcallObMonitorWhisperDuration;
            return this;
        }
        public String getWebcallObMonitorWhisperDuration() {
            return this.webcallObMonitorWhisperDuration;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObTotalCount(String webcallObTotalCount) {
            this.webcallObTotalCount = webcallObTotalCount;
            return this;
        }
        public String getWebcallObTotalCount() {
            return this.webcallObTotalCount;
        }

        public CloudAgentWorkloadReportResponseBodyDataList setWebcallObTransferCount(String webcallObTransferCount) {
            this.webcallObTransferCount = webcallObTransferCount;
            return this;
        }
        public String getWebcallObTransferCount() {
            return this.webcallObTransferCount;
        }

    }

    public static class CloudAgentWorkloadReportResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<CloudAgentWorkloadReportResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public String pageSize;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public String totalCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalPageCount")
        public String totalPageCount;

        public static CloudAgentWorkloadReportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudAgentWorkloadReportResponseBodyData self = new CloudAgentWorkloadReportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudAgentWorkloadReportResponseBodyData setList(java.util.List<CloudAgentWorkloadReportResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudAgentWorkloadReportResponseBodyDataList> getList() {
            return this.list;
        }

        public CloudAgentWorkloadReportResponseBodyData setPageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public String getPageSize() {
            return this.pageSize;
        }

        public CloudAgentWorkloadReportResponseBodyData setTotalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public String getTotalCount() {
            return this.totalCount;
        }

        public CloudAgentWorkloadReportResponseBodyData setTotalPageCount(String totalPageCount) {
            this.totalPageCount = totalPageCount;
            return this;
        }
        public String getTotalPageCount() {
            return this.totalPageCount;
        }

    }

}
