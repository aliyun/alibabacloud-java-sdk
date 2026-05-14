// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkAgentStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkAgentStatusResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkAgentStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkAgentStatusResponseBody self = new ClinkAgentStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkAgentStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkAgentStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkAgentStatusResponseBody setData(ClinkAgentStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkAgentStatusResponseBodyData getData() {
        return this.data;
    }

    public ClinkAgentStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkAgentStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkAgentStatusResponseBodyDataAgentStatus extends TeaModel {
        /**
         * <p>座席状态</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("AgentStatus")
        public String agentStatus;

        /**
         * <p>座席状态详情</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("AgentStatusDetail")
        public String agentStatusDetail;

        /**
         * <p>绑定号码</p>
         * 
         * <strong>example:</strong>
         * <p>1327770</p>
         */
        @NameInMap("BindTel")
        public String bindTel;

        /**
         * <p>电话类型，1:电话；2:IP话机；3:软电话</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("BindType")
        public Long bindType;

        /**
         * <p>座席来电接听次数</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("BridgeCallCount")
        public Long bridgeCallCount;

        /**
         * <p>座席名称</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("ClientName")
        public String clientName;

        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>座席code</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>客户号码</p>
         * 
         * <strong>example:</strong>
         * <p>177xxxx7750</p>
         */
        @NameInMap("CustomerNumber")
        public String customerNumber;

        /**
         * <p>客户来电号码加密串</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("CustomerNumberEncrypt")
        public String customerNumberEncrypt;

        /**
         * <p>客户状态，空闲，呼叫中，响铃，通话</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CustomerStatus")
        public String customerStatus;

        /**
         * <p>呼入接听总响铃时长</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("IbAnsweredRingingDuration")
        public Long ibAnsweredRingingDuration;

        /**
         * <p>客户呼入接听数</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("IbClientAnsweredCount")
        public Long ibClientAnsweredCount;

        /**
         * <p>客户呼入接听率</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("IbClientAnsweredRate")
        public Double ibClientAnsweredRate;

        /**
         * <p>客户呼入数</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("IbClientTotalCount")
        public Long ibClientTotalCount;

        /**
         * <p>客户呼入未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>71</p>
         */
        @NameInMap("IbClientUnansweredCount")
        public Long ibClientUnansweredCount;

        /**
         * <p>空闲超时时间（单位分钟）</p>
         * 
         * <strong>example:</strong>
         * <p>83</p>
         */
        @NameInMap("IdleTimeOut")
        public Long idleTimeOut;

        /**
         * <p>座席来电次数</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("IncomingCallCount")
        public Long incomingCallCount;

        /**
         * <p>登录时长</p>
         * 
         * <strong>example:</strong>
         * <p>97</p>
         */
        @NameInMap("LoginDuration")
        public Long loginDuration;

        /**
         * <p>外呼平均通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("ObAvgBridgeDuration")
        public Long obAvgBridgeDuration;

        /**
         * <p>外呼通话时长</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("ObBridgeDuration")
        public Long obBridgeDuration;

        /**
         * <p>外呼接听率</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        @NameInMap("ObBridgeRate")
        public Double obBridgeRate;

        /**
         * <p>座席外呼数</p>
         * 
         * <strong>example:</strong>
         * <p>96</p>
         */
        @NameInMap("ObCallCount")
        public Long obCallCount;

        /**
         * <p>外呼座席未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>75</p>
         */
        @NameInMap("ObClientUnbridgeCount")
        public Long obClientUnbridgeCount;

        /**
         * <p>外呼客户接听数</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("ObCustomerBridgeCount")
        public Long obCustomerBridgeCount;

        /**
         * <p>外呼客户未接听数</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("ObCustomerUnbridgeCount")
        public Long obCustomerUnbridgeCount;

        /**
         * <p>置忙状态描述</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("PauseDescription")
        public String pauseDescription;

        /**
         * <p>置忙类型</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("PauseType")
        public Long pauseType;

        /**
         * <p>座席是否处于预测外呼状态 1：是 0：否</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PredictToCall")
        public Long predictToCall;

        /**
         * <p>队列来电接听数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("QueueIncomingCallCount")
        public Long queueIncomingCallCount;

        /**
         * <p>队列信息</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("QueueInfo")
        public String queueInfo;

        /**
         * <p>队列编号</p>
         * 
         * <strong>example:</strong>
         * <p>0035</p>
         */
        @NameInMap("Queues")
        public String queues;

        /**
         * <p>客户速挂数</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("QuickUnlinkCount")
        public Long quickUnlinkCount;

        /**
         * <p>状态时长</p>
         * 
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("StateDuration")
        public Long stateDuration;

        /**
         * <p>座席标签</p>
         */
        @NameInMap("TagNames")
        public java.util.List<String> tagNames;

        public static ClinkAgentStatusResponseBodyDataAgentStatus build(java.util.Map<String, ?> map) throws Exception {
            ClinkAgentStatusResponseBodyDataAgentStatus self = new ClinkAgentStatusResponseBodyDataAgentStatus();
            return TeaModel.build(map, self);
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setAgentStatusDetail(String agentStatusDetail) {
            this.agentStatusDetail = agentStatusDetail;
            return this;
        }
        public String getAgentStatusDetail() {
            return this.agentStatusDetail;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setBindType(Long bindType) {
            this.bindType = bindType;
            return this;
        }
        public Long getBindType() {
            return this.bindType;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setBridgeCallCount(Long bridgeCallCount) {
            this.bridgeCallCount = bridgeCallCount;
            return this;
        }
        public Long getBridgeCallCount() {
            return this.bridgeCallCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setCustomerNumber(String customerNumber) {
            this.customerNumber = customerNumber;
            return this;
        }
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setCustomerNumberEncrypt(String customerNumberEncrypt) {
            this.customerNumberEncrypt = customerNumberEncrypt;
            return this;
        }
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setCustomerStatus(String customerStatus) {
            this.customerStatus = customerStatus;
            return this;
        }
        public String getCustomerStatus() {
            return this.customerStatus;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setIbAnsweredRingingDuration(Long ibAnsweredRingingDuration) {
            this.ibAnsweredRingingDuration = ibAnsweredRingingDuration;
            return this;
        }
        public Long getIbAnsweredRingingDuration() {
            return this.ibAnsweredRingingDuration;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setIbClientAnsweredCount(Long ibClientAnsweredCount) {
            this.ibClientAnsweredCount = ibClientAnsweredCount;
            return this;
        }
        public Long getIbClientAnsweredCount() {
            return this.ibClientAnsweredCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setIbClientAnsweredRate(Double ibClientAnsweredRate) {
            this.ibClientAnsweredRate = ibClientAnsweredRate;
            return this;
        }
        public Double getIbClientAnsweredRate() {
            return this.ibClientAnsweredRate;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setIbClientTotalCount(Long ibClientTotalCount) {
            this.ibClientTotalCount = ibClientTotalCount;
            return this;
        }
        public Long getIbClientTotalCount() {
            return this.ibClientTotalCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setIbClientUnansweredCount(Long ibClientUnansweredCount) {
            this.ibClientUnansweredCount = ibClientUnansweredCount;
            return this;
        }
        public Long getIbClientUnansweredCount() {
            return this.ibClientUnansweredCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setIdleTimeOut(Long idleTimeOut) {
            this.idleTimeOut = idleTimeOut;
            return this;
        }
        public Long getIdleTimeOut() {
            return this.idleTimeOut;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setIncomingCallCount(Long incomingCallCount) {
            this.incomingCallCount = incomingCallCount;
            return this;
        }
        public Long getIncomingCallCount() {
            return this.incomingCallCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setLoginDuration(Long loginDuration) {
            this.loginDuration = loginDuration;
            return this;
        }
        public Long getLoginDuration() {
            return this.loginDuration;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setObAvgBridgeDuration(Long obAvgBridgeDuration) {
            this.obAvgBridgeDuration = obAvgBridgeDuration;
            return this;
        }
        public Long getObAvgBridgeDuration() {
            return this.obAvgBridgeDuration;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setObBridgeDuration(Long obBridgeDuration) {
            this.obBridgeDuration = obBridgeDuration;
            return this;
        }
        public Long getObBridgeDuration() {
            return this.obBridgeDuration;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setObBridgeRate(Double obBridgeRate) {
            this.obBridgeRate = obBridgeRate;
            return this;
        }
        public Double getObBridgeRate() {
            return this.obBridgeRate;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setObCallCount(Long obCallCount) {
            this.obCallCount = obCallCount;
            return this;
        }
        public Long getObCallCount() {
            return this.obCallCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setObClientUnbridgeCount(Long obClientUnbridgeCount) {
            this.obClientUnbridgeCount = obClientUnbridgeCount;
            return this;
        }
        public Long getObClientUnbridgeCount() {
            return this.obClientUnbridgeCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setObCustomerBridgeCount(Long obCustomerBridgeCount) {
            this.obCustomerBridgeCount = obCustomerBridgeCount;
            return this;
        }
        public Long getObCustomerBridgeCount() {
            return this.obCustomerBridgeCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setObCustomerUnbridgeCount(Long obCustomerUnbridgeCount) {
            this.obCustomerUnbridgeCount = obCustomerUnbridgeCount;
            return this;
        }
        public Long getObCustomerUnbridgeCount() {
            return this.obCustomerUnbridgeCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setPauseDescription(String pauseDescription) {
            this.pauseDescription = pauseDescription;
            return this;
        }
        public String getPauseDescription() {
            return this.pauseDescription;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setPauseType(Long pauseType) {
            this.pauseType = pauseType;
            return this;
        }
        public Long getPauseType() {
            return this.pauseType;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setPredictToCall(Long predictToCall) {
            this.predictToCall = predictToCall;
            return this;
        }
        public Long getPredictToCall() {
            return this.predictToCall;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setQueueIncomingCallCount(Long queueIncomingCallCount) {
            this.queueIncomingCallCount = queueIncomingCallCount;
            return this;
        }
        public Long getQueueIncomingCallCount() {
            return this.queueIncomingCallCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setQueueInfo(String queueInfo) {
            this.queueInfo = queueInfo;
            return this;
        }
        public String getQueueInfo() {
            return this.queueInfo;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setQueues(String queues) {
            this.queues = queues;
            return this;
        }
        public String getQueues() {
            return this.queues;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setQuickUnlinkCount(Long quickUnlinkCount) {
            this.quickUnlinkCount = quickUnlinkCount;
            return this;
        }
        public Long getQuickUnlinkCount() {
            return this.quickUnlinkCount;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setStateDuration(Long stateDuration) {
            this.stateDuration = stateDuration;
            return this;
        }
        public Long getStateDuration() {
            return this.stateDuration;
        }

        public ClinkAgentStatusResponseBodyDataAgentStatus setTagNames(java.util.List<String> tagNames) {
            this.tagNames = tagNames;
            return this;
        }
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

    }

    public static class ClinkAgentStatusResponseBodyData extends TeaModel {
        /**
         * <p>[座席状态详情] #座席状态详情</p>
         */
        @NameInMap("AgentStatus")
        public java.util.List<ClinkAgentStatusResponseBodyDataAgentStatus> agentStatus;

        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        /**
         * <p>当前页码</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>一页展示条数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>总条数</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ClinkAgentStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkAgentStatusResponseBodyData self = new ClinkAgentStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkAgentStatusResponseBodyData setAgentStatus(java.util.List<ClinkAgentStatusResponseBodyDataAgentStatus> agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public java.util.List<ClinkAgentStatusResponseBodyDataAgentStatus> getAgentStatus() {
            return this.agentStatus;
        }

        public ClinkAgentStatusResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkAgentStatusResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ClinkAgentStatusResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ClinkAgentStatusResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
