// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateQueueResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkCreateQueueResponseBodyData data;

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

    public static ClinkCreateQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateQueueResponseBody self = new ClinkCreateQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkCreateQueueResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkCreateQueueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkCreateQueueResponseBody setData(ClinkCreateQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkCreateQueueResponseBodyData getData() {
        return this.data;
    }

    public ClinkCreateQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkCreateQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkCreateQueueResponseBodyDataQueueQueueMembers extends TeaModel {
        /**
         * <p>队列下座席号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>该座席在队列中的优先级</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("Penalty")
        public Long penalty;

        public static ClinkCreateQueueResponseBodyDataQueueQueueMembers build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateQueueResponseBodyDataQueueQueueMembers self = new ClinkCreateQueueResponseBodyDataQueueQueueMembers();
            return TeaModel.build(map, self);
        }

        public ClinkCreateQueueResponseBodyDataQueueQueueMembers setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkCreateQueueResponseBodyDataQueueQueueMembers setPenalty(Long penalty) {
            this.penalty = penalty;
            return this;
        }
        public Long getPenalty() {
            return this.penalty;
        }

    }

    public static class ClinkCreateQueueResponseBodyDataQueue extends TeaModel {
        /**
         * <p>在线客服排队位置推送(小于该位置则推送)</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ChatLocation")
        public Long chatLocation;

        /**
         * <p>在线客服最大排队数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ChatMaxWait")
        public Long chatMaxWait;

        /**
         * <p>在线客服分配策略，2：轮选；4：随机；5：技能优先</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ChatStrategy")
        public Long chatStrategy;

        /**
         * <p>是否允许呼入队列，0: 否；1: 是</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IbAllowed")
        public Long ibAllowed;

        /**
         * <p>队列中为空时是否可以join，1: 置忙，2: 通话中，4: 振铃，8: 无效，16: 整理 如选多种状态则传对应数值的和，如选置忙和通话中，值为 3。默认值为 0 即都未选中</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("JoinEmpty")
        public Long joinEmpty;

        /**
         * <p>最大并发置忙座席数，开关配置</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        @NameInMap("MaxPauseClientFlag")
        public Long maxPauseClientFlag;

        /**
         * <p>最大并发置忙座席数，配置类型</p>
         * 
         * <strong>example:</strong>
         * <p>73</p>
         */
        @NameInMap("MaxPauseClientType")
        public Long maxPauseClientType;

        /**
         * <p>最大并发置忙座席数，配置值</p>
         * 
         * <strong>example:</strong>
         * <p>38</p>
         */
        @NameInMap("MaxPauseClientValue")
        public Long maxPauseClientValue;

        /**
         * <p>最大等待数，设置范围 0-999，0 表示不做任何限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxWait")
        public Long maxWait;

        /**
         * <p>座席超时时间，取值范围 20-60 秒</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MemberTimeout")
        public Long memberTimeout;

        /**
         * <p>座席名称，只允许输入中文，字母，数字，下划线，长度不超过 20 个字符</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>队列工号，4位数字，要求唯一</p>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>队列内座席及技能值设置。技能值 1-10，技能值 1 的优先级为最高 cno 队列下座席号 penalty该座席在队列中的优先级</p>
         */
        @NameInMap("QueueMembers")
        public java.util.List<ClinkCreateQueueResponseBodyDataQueueQueueMembers> queueMembers;

        /**
         * <p>队列超时时间，取值范围 30-600 秒</p>
         * 
         * <strong>example:</strong>
         * <p>33</p>
         */
        @NameInMap("QueueTimeout")
        public Long queueTimeout;

        /**
         * <p>语音报号(是否报座席号)(1:是 0: 否)</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SayCno")
        public Long sayCno;

        /**
         * <p>服务水平秒数，取值范围 10-30 秒，低于此时间内接听的认为是高服务水平</p>
         * 
         * <strong>example:</strong>
         * <p>27</p>
         */
        @NameInMap("ServiceLevel")
        public Long serviceLevel;

        /**
         * <p>呼叫策略，1：顺序，2：轮选，3：平均，4：随机，5：技能优先，6：距上一通呼入空闲时间累计最长，7：技能优先+距上一通呼入空闲时间累计最长，8：距上一通呼入空闲时间累计最长(全队列)，9：技能优先+距上一通呼入空闲时间累计最长(全队列)，10：全队列平均，11：技能优先+轮选，12：最长空闲时长，13：技能优先+当前空闲状态时长最长，14：距上一通通话空闲时间累计最长</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Strategy")
        public Long strategy;

        /**
         * <p>支持VIP级别(VIP客户优先)(0:不支持 1:支持)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VipSupport")
        public Long vipSupport;

        /**
         * <p>队列优先级，取值范围 1-10 座席属于多个队列时，优先级高的队列的来电将优先接听；数值越高，优先级越高</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Weight")
        public Long weight;

        /**
         * <p>整理时长，取值范围 3-300 秒，整理期间座席不接受新的呼叫</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("WrapupTime")
        public Long wrapupTime;

        public static ClinkCreateQueueResponseBodyDataQueue build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateQueueResponseBodyDataQueue self = new ClinkCreateQueueResponseBodyDataQueue();
            return TeaModel.build(map, self);
        }

        public ClinkCreateQueueResponseBodyDataQueue setChatLocation(Long chatLocation) {
            this.chatLocation = chatLocation;
            return this;
        }
        public Long getChatLocation() {
            return this.chatLocation;
        }

        public ClinkCreateQueueResponseBodyDataQueue setChatMaxWait(Long chatMaxWait) {
            this.chatMaxWait = chatMaxWait;
            return this;
        }
        public Long getChatMaxWait() {
            return this.chatMaxWait;
        }

        public ClinkCreateQueueResponseBodyDataQueue setChatStrategy(Long chatStrategy) {
            this.chatStrategy = chatStrategy;
            return this;
        }
        public Long getChatStrategy() {
            return this.chatStrategy;
        }

        public ClinkCreateQueueResponseBodyDataQueue setIbAllowed(Long ibAllowed) {
            this.ibAllowed = ibAllowed;
            return this;
        }
        public Long getIbAllowed() {
            return this.ibAllowed;
        }

        public ClinkCreateQueueResponseBodyDataQueue setJoinEmpty(Long joinEmpty) {
            this.joinEmpty = joinEmpty;
            return this;
        }
        public Long getJoinEmpty() {
            return this.joinEmpty;
        }

        public ClinkCreateQueueResponseBodyDataQueue setMaxPauseClientFlag(Long maxPauseClientFlag) {
            this.maxPauseClientFlag = maxPauseClientFlag;
            return this;
        }
        public Long getMaxPauseClientFlag() {
            return this.maxPauseClientFlag;
        }

        public ClinkCreateQueueResponseBodyDataQueue setMaxPauseClientType(Long maxPauseClientType) {
            this.maxPauseClientType = maxPauseClientType;
            return this;
        }
        public Long getMaxPauseClientType() {
            return this.maxPauseClientType;
        }

        public ClinkCreateQueueResponseBodyDataQueue setMaxPauseClientValue(Long maxPauseClientValue) {
            this.maxPauseClientValue = maxPauseClientValue;
            return this;
        }
        public Long getMaxPauseClientValue() {
            return this.maxPauseClientValue;
        }

        public ClinkCreateQueueResponseBodyDataQueue setMaxWait(Long maxWait) {
            this.maxWait = maxWait;
            return this;
        }
        public Long getMaxWait() {
            return this.maxWait;
        }

        public ClinkCreateQueueResponseBodyDataQueue setMemberTimeout(Long memberTimeout) {
            this.memberTimeout = memberTimeout;
            return this;
        }
        public Long getMemberTimeout() {
            return this.memberTimeout;
        }

        public ClinkCreateQueueResponseBodyDataQueue setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ClinkCreateQueueResponseBodyDataQueue setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public ClinkCreateQueueResponseBodyDataQueue setQueueMembers(java.util.List<ClinkCreateQueueResponseBodyDataQueueQueueMembers> queueMembers) {
            this.queueMembers = queueMembers;
            return this;
        }
        public java.util.List<ClinkCreateQueueResponseBodyDataQueueQueueMembers> getQueueMembers() {
            return this.queueMembers;
        }

        public ClinkCreateQueueResponseBodyDataQueue setQueueTimeout(Long queueTimeout) {
            this.queueTimeout = queueTimeout;
            return this;
        }
        public Long getQueueTimeout() {
            return this.queueTimeout;
        }

        public ClinkCreateQueueResponseBodyDataQueue setSayCno(Long sayCno) {
            this.sayCno = sayCno;
            return this;
        }
        public Long getSayCno() {
            return this.sayCno;
        }

        public ClinkCreateQueueResponseBodyDataQueue setServiceLevel(Long serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }
        public Long getServiceLevel() {
            return this.serviceLevel;
        }

        public ClinkCreateQueueResponseBodyDataQueue setStrategy(Long strategy) {
            this.strategy = strategy;
            return this;
        }
        public Long getStrategy() {
            return this.strategy;
        }

        public ClinkCreateQueueResponseBodyDataQueue setVipSupport(Long vipSupport) {
            this.vipSupport = vipSupport;
            return this;
        }
        public Long getVipSupport() {
            return this.vipSupport;
        }

        public ClinkCreateQueueResponseBodyDataQueue setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ClinkCreateQueueResponseBodyDataQueue setWrapupTime(Long wrapupTime) {
            this.wrapupTime = wrapupTime;
            return this;
        }
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

    }

    public static class ClinkCreateQueueResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        @NameInMap("Queue")
        public ClinkCreateQueueResponseBodyDataQueue queue;

        public static ClinkCreateQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateQueueResponseBodyData self = new ClinkCreateQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkCreateQueueResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkCreateQueueResponseBodyData setQueue(ClinkCreateQueueResponseBodyDataQueue queue) {
            this.queue = queue;
            return this;
        }
        public ClinkCreateQueueResponseBodyDataQueue getQueue() {
            return this.queue;
        }

    }

}
