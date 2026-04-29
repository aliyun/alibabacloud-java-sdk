// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentMonitorStatisticsResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudAgentMonitorStatisticsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9FF70B74-1B3C-44C1-ACDF-8DF962988F0E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudAgentMonitorStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentMonitorStatisticsResponseBody self = new CloudAgentMonitorStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudAgentMonitorStatisticsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudAgentMonitorStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudAgentMonitorStatisticsResponseBody setData(CloudAgentMonitorStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudAgentMonitorStatisticsResponseBodyData getData() {
        return this.data;
    }

    public CloudAgentMonitorStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudAgentMonitorStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics extends TeaModel {
        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>status: 代表座席状态，状态每个值对应的含义: stateIdle: 置闲; statePause: 置忙; stateCalling: 呼叫中; stateInuse: 通话中; stateWrapup: 整理, loginTime: 代表座席登录时间, startTime: 代表开始通话的时间</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;state\&quot;:\&quot;stateIdle\&quot;,\&quot;startTime\&quot;:\&quot;1491462675\&quot;}</p>
         */
        @NameInMap("CurrentState")
        public String currentState;

        /**
         * <p>外呼组编号</p>
         * 
         * <strong>example:</strong>
         * <p>WH123</p>
         */
        @NameInMap("Gno")
        public String gno;

        /**
         * <p>外呼组名称</p>
         * 
         * <strong>example:</strong>
         * <p>gpname</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>总空闲次数</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Idle_count")
        public String idleCount;

        /**
         * <p>总空闲时长</p>
         * 
         * <strong>example:</strong>
         * <p>54344</p>
         */
        @NameInMap("Idle_time")
        public String idleTime;

        /**
         * <p>最大空闲时长</p>
         * 
         * <strong>example:</strong>
         * <p>52375</p>
         */
        @NameInMap("Max_idle_time")
        public String maxIdleTime;

        /**
         * <p>外呼通话最大时长</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("Max_ob_bridge_time")
        public String maxObBridgeTime;

        /**
         * <p>外呼呼叫最大时长</p>
         * 
         * <strong>example:</strong>
         * <p>31</p>
         */
        @NameInMap("Max_ob_calling_time")
        public String maxObCallingTime;

        /**
         * <p>外呼整理最大时长</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Max_ob_wrapup_time")
        public String maxObWrapupTime;

        /**
         * <p>最小空闲时长</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        @NameInMap("Min_idle_time")
        public String minIdleTime;

        /**
         * <p>外呼通话最小时长</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("Min_ob_bridge_time")
        public String minObBridgeTime;

        /**
         * <p>外呼呼叫最小时长</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Min_ob_calling_time")
        public String minObCallingTime;

        /**
         * <p>外呼整理最小时长</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Min_ob_wrapup_time")
        public String minObWrapupTime;

        /**
         * <p>总外呼通话次数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Ob_bridge_count")
        public String obBridgeCount;

        /**
         * <p>外呼通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>144</p>
         */
        @NameInMap("Ob_bridge_time")
        public String obBridgeTime;

        /**
         * <p>总外呼呼叫次数</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Ob_calling_count")
        public String obCallingCount;

        /**
         * <p>外呼呼叫时长</p>
         * 
         * <strong>example:</strong>
         * <p>67</p>
         */
        @NameInMap("Ob_calling_time")
        public String obCallingTime;

        /**
         * <p>总外呼整理次数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Ob_wrapup_count")
        public String obWrapupCount;

        /**
         * <p>外呼整理时长</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("Ob_wrapup_time")
        public String obWrapupTime;

        /**
         * <p>预览外呼座席接听数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Preview_ob_agent_answered_count")
        public String previewObAgentAnsweredCount;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Preview_ob_both_answered_count")
        public String previewObBothAnsweredCount;

        /**
         * <p>双方接听最大通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("Preview_ob_max_bridge_time")
        public String previewObMaxBridgeTime;

        /**
         * <p>双方接听最小通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("Preview_ob_min_bridge_time")
        public String previewObMinBridgeTime;

        /**
         * <p>双方接听总通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>144</p>
         */
        @NameInMap("Preview_ob_total_bridge_time")
        public String previewObTotalBridgeTime;

        /**
         * <p>预览外呼数</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Preview_ob_total_count")
        public String previewObTotalCount;

        /**
         * <p>预览外呼有效通话次数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Preview_ob_valid_calls")
        public String previewObValidCalls;

        /**
         * <p>预览外呼有效通话总时长</p>
         * 
         * <strong>example:</strong>
         * <p>144</p>
         */
        @NameInMap("Preview_ob_valid_total_bridge_time")
        public String previewObValidTotalBridgeTime;

        /**
         * <p>队列名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("QueueName")
        public String queueName;

        public static CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics build(java.util.Map<String, ?> map) throws Exception {
            CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics self = new CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics();
            return TeaModel.build(map, self);
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setCurrentState(String currentState) {
            this.currentState = currentState;
            return this;
        }
        public String getCurrentState() {
            return this.currentState;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setGno(String gno) {
            this.gno = gno;
            return this;
        }
        public String getGno() {
            return this.gno;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setIdleCount(String idleCount) {
            this.idleCount = idleCount;
            return this;
        }
        public String getIdleCount() {
            return this.idleCount;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setIdleTime(String idleTime) {
            this.idleTime = idleTime;
            return this;
        }
        public String getIdleTime() {
            return this.idleTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setMaxIdleTime(String maxIdleTime) {
            this.maxIdleTime = maxIdleTime;
            return this;
        }
        public String getMaxIdleTime() {
            return this.maxIdleTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setMaxObBridgeTime(String maxObBridgeTime) {
            this.maxObBridgeTime = maxObBridgeTime;
            return this;
        }
        public String getMaxObBridgeTime() {
            return this.maxObBridgeTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setMaxObCallingTime(String maxObCallingTime) {
            this.maxObCallingTime = maxObCallingTime;
            return this;
        }
        public String getMaxObCallingTime() {
            return this.maxObCallingTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setMaxObWrapupTime(String maxObWrapupTime) {
            this.maxObWrapupTime = maxObWrapupTime;
            return this;
        }
        public String getMaxObWrapupTime() {
            return this.maxObWrapupTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setMinIdleTime(String minIdleTime) {
            this.minIdleTime = minIdleTime;
            return this;
        }
        public String getMinIdleTime() {
            return this.minIdleTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setMinObBridgeTime(String minObBridgeTime) {
            this.minObBridgeTime = minObBridgeTime;
            return this;
        }
        public String getMinObBridgeTime() {
            return this.minObBridgeTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setMinObCallingTime(String minObCallingTime) {
            this.minObCallingTime = minObCallingTime;
            return this;
        }
        public String getMinObCallingTime() {
            return this.minObCallingTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setMinObWrapupTime(String minObWrapupTime) {
            this.minObWrapupTime = minObWrapupTime;
            return this;
        }
        public String getMinObWrapupTime() {
            return this.minObWrapupTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setObBridgeCount(String obBridgeCount) {
            this.obBridgeCount = obBridgeCount;
            return this;
        }
        public String getObBridgeCount() {
            return this.obBridgeCount;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setObBridgeTime(String obBridgeTime) {
            this.obBridgeTime = obBridgeTime;
            return this;
        }
        public String getObBridgeTime() {
            return this.obBridgeTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setObCallingCount(String obCallingCount) {
            this.obCallingCount = obCallingCount;
            return this;
        }
        public String getObCallingCount() {
            return this.obCallingCount;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setObCallingTime(String obCallingTime) {
            this.obCallingTime = obCallingTime;
            return this;
        }
        public String getObCallingTime() {
            return this.obCallingTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setObWrapupCount(String obWrapupCount) {
            this.obWrapupCount = obWrapupCount;
            return this;
        }
        public String getObWrapupCount() {
            return this.obWrapupCount;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setObWrapupTime(String obWrapupTime) {
            this.obWrapupTime = obWrapupTime;
            return this;
        }
        public String getObWrapupTime() {
            return this.obWrapupTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setPreviewObAgentAnsweredCount(String previewObAgentAnsweredCount) {
            this.previewObAgentAnsweredCount = previewObAgentAnsweredCount;
            return this;
        }
        public String getPreviewObAgentAnsweredCount() {
            return this.previewObAgentAnsweredCount;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setPreviewObBothAnsweredCount(String previewObBothAnsweredCount) {
            this.previewObBothAnsweredCount = previewObBothAnsweredCount;
            return this;
        }
        public String getPreviewObBothAnsweredCount() {
            return this.previewObBothAnsweredCount;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setPreviewObMaxBridgeTime(String previewObMaxBridgeTime) {
            this.previewObMaxBridgeTime = previewObMaxBridgeTime;
            return this;
        }
        public String getPreviewObMaxBridgeTime() {
            return this.previewObMaxBridgeTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setPreviewObMinBridgeTime(String previewObMinBridgeTime) {
            this.previewObMinBridgeTime = previewObMinBridgeTime;
            return this;
        }
        public String getPreviewObMinBridgeTime() {
            return this.previewObMinBridgeTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setPreviewObTotalBridgeTime(String previewObTotalBridgeTime) {
            this.previewObTotalBridgeTime = previewObTotalBridgeTime;
            return this;
        }
        public String getPreviewObTotalBridgeTime() {
            return this.previewObTotalBridgeTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setPreviewObTotalCount(String previewObTotalCount) {
            this.previewObTotalCount = previewObTotalCount;
            return this;
        }
        public String getPreviewObTotalCount() {
            return this.previewObTotalCount;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setPreviewObValidCalls(String previewObValidCalls) {
            this.previewObValidCalls = previewObValidCalls;
            return this;
        }
        public String getPreviewObValidCalls() {
            return this.previewObValidCalls;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setPreviewObValidTotalBridgeTime(String previewObValidTotalBridgeTime) {
            this.previewObValidTotalBridgeTime = previewObValidTotalBridgeTime;
            return this;
        }
        public String getPreviewObValidTotalBridgeTime() {
            return this.previewObValidTotalBridgeTime;
        }

        public CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics setQueueName(String queueName) {
            this.queueName = queueName;
            return this;
        }
        public String getQueueName() {
            return this.queueName;
        }

    }

    public static class CloudAgentMonitorStatisticsResponseBodyData extends TeaModel {
        /**
         * <p>座席统计项数组</p>
         */
        @NameInMap("AgentStatistics")
        public java.util.List<CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics> agentStatistics;

        /**
         * <p>日期，格式为：yyyy-MM-dd</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-06</p>
         */
        @NameInMap("Date")
        public String date;

        /**
         * <p>总计</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("Total")
        public String total;

        public static CloudAgentMonitorStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudAgentMonitorStatisticsResponseBodyData self = new CloudAgentMonitorStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudAgentMonitorStatisticsResponseBodyData setAgentStatistics(java.util.List<CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics> agentStatistics) {
            this.agentStatistics = agentStatistics;
            return this;
        }
        public java.util.List<CloudAgentMonitorStatisticsResponseBodyDataAgentStatistics> getAgentStatistics() {
            return this.agentStatistics;
        }

        public CloudAgentMonitorStatisticsResponseBodyData setDate(String date) {
            this.date = date;
            return this;
        }
        public String getDate() {
            return this.date;
        }

        public CloudAgentMonitorStatisticsResponseBodyData setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
