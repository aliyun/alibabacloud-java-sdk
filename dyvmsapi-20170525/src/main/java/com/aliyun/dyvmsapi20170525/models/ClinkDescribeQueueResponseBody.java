// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkDescribeQueueResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClinkDescribeQueueResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ClinkDescribeQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClinkDescribeQueueResponseBody self = new ClinkDescribeQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public ClinkDescribeQueueResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ClinkDescribeQueueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClinkDescribeQueueResponseBody setData(ClinkDescribeQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClinkDescribeQueueResponseBodyData getData() {
        return this.data;
    }

    public ClinkDescribeQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClinkDescribeQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ClinkDescribeQueueResponseBodyDataResultQueueMembers extends TeaModel {
        /**
         * <p>座席号</p>
         * 
         * <strong>example:</strong>
         * <p>2233</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>优先级</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Penalty")
        public Long penalty;

        /**
         * <p>座席类型</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Long type;

        public static ClinkDescribeQueueResponseBodyDataResultQueueMembers build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeQueueResponseBodyDataResultQueueMembers self = new ClinkDescribeQueueResponseBodyDataResultQueueMembers();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeQueueResponseBodyDataResultQueueMembers setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkDescribeQueueResponseBodyDataResultQueueMembers setPenalty(Long penalty) {
            this.penalty = penalty;
            return this;
        }
        public Long getPenalty() {
            return this.penalty;
        }

        public ClinkDescribeQueueResponseBodyDataResultQueueMembers setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

    public static class ClinkDescribeQueueResponseBodyDataResult extends TeaModel {
        /**
         * <p>在线客服排队位置推送(小于该位置则推送)</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("ChatLocation")
        public Long chatLocation;

        /**
         * <p>在线客服最大排队数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>企业id</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>允许呼入队列 0：不允许 1：允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IbAllowed")
        public Long ibAllowed;

        /**
         * <p>队列中为空时是否可以join（设置了队列等待数，来电进入队列后处于等待状态，等待超时才溢出；如果勾选了这几个选项，认为座席不可用，直接溢出，减少客户等待时间）， 1: 置忙；2: 通话中；4: 振铃；8: 无效；16: 整理。 如选多种状态则传对应数值的和，如选置忙和通话中，值为 3</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("JoinEmpty")
        public Long joinEmpty;

        /**
         * <p>最大并发置忙座席数，开关配置</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxPauseClientFlag")
        public Long maxPauseClientFlag;

        /**
         * <p>最大并发置忙座席数，配置类型</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MaxPauseClientType")
        public Long maxPauseClientType;

        /**
         * <p>最大并发置忙座席数，配置值</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxPauseClientValue")
        public Long maxPauseClientValue;

        /**
         * <p>呼叫中心最大排队数</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("MaxWait")
        public Long maxWait;

        /**
         * <p>座席超时时长</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("MemberTimeout")
        public Long memberTimeout;

        /**
         * <p>队列名称</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("Name")
        public Long name;

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>2201</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>cno 座席号 penalty 优先级 type 座席类型 1：全渠道、2：呼叫中心、3：在线客服</p>
         */
        @NameInMap("QueueMembers")
        public java.util.List<ClinkDescribeQueueResponseBodyDataResultQueueMembers> queueMembers;

        /**
         * <p>队列超时时长</p>
         * 
         * <strong>example:</strong>
         * <p>51</p>
         */
        @NameInMap("QueueTimeout")
        public Long queueTimeout;

        /**
         * <p>座席超时无应答,呼叫下一座席的延迟秒数,⇐0时采用默认值5。</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Retry")
        public Long retry;

        /**
         * <p>语音报号(是否报座席号)(1：是 0：否)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SayCno")
        public Long sayCno;

        /**
         * <p>服务水平秒数，取值范围 10-30秒，低于此时间内接听的认为是高服务水平</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ServiceLevel")
        public Long serviceLevel;

        /**
         * <p>呼叫策略，1：顺序，2：轮选，3：平均，4：随机，5：技能优先，6：距上一通呼入空闲时间累计最长，7：技能优先+距上一通呼入空闲时间累计最长，8：距上一通呼入空闲时间累计最长(全队列)，9：技能优先+距上一通呼入空闲时间累计最长(全队列)，10：全队列平均，11：技能优先+轮选，12：最长空闲时长，13：技能优先+当前空闲状态时长最长，14：距上一通通话空闲时间累计最长</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Strategy")
        public Long strategy;

        /**
         * <p>支持VIP级别(VIP客户优先)(0：不支持 1：支持)</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VipSupport")
        public Long vipSupport;

        /**
         * <p>队列优先级，取值范围 1-10。默认值为 1，座席属于多个队列时，优先级高的队列的来电将优先接听；数值越高，优先级越高</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Weight")
        public Long weight;

        /**
         * <p>整理时间</p>
         * 
         * <strong>example:</strong>
         * <p>45</p>
         */
        @NameInMap("WrapupTime")
        public Long wrapupTime;

        public static ClinkDescribeQueueResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeQueueResponseBodyDataResult self = new ClinkDescribeQueueResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeQueueResponseBodyDataResult setChatLocation(Long chatLocation) {
            this.chatLocation = chatLocation;
            return this;
        }
        public Long getChatLocation() {
            return this.chatLocation;
        }

        public ClinkDescribeQueueResponseBodyDataResult setChatMaxWait(Long chatMaxWait) {
            this.chatMaxWait = chatMaxWait;
            return this;
        }
        public Long getChatMaxWait() {
            return this.chatMaxWait;
        }

        public ClinkDescribeQueueResponseBodyDataResult setChatStrategy(Long chatStrategy) {
            this.chatStrategy = chatStrategy;
            return this;
        }
        public Long getChatStrategy() {
            return this.chatStrategy;
        }

        public ClinkDescribeQueueResponseBodyDataResult setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public ClinkDescribeQueueResponseBodyDataResult setIbAllowed(Long ibAllowed) {
            this.ibAllowed = ibAllowed;
            return this;
        }
        public Long getIbAllowed() {
            return this.ibAllowed;
        }

        public ClinkDescribeQueueResponseBodyDataResult setJoinEmpty(Long joinEmpty) {
            this.joinEmpty = joinEmpty;
            return this;
        }
        public Long getJoinEmpty() {
            return this.joinEmpty;
        }

        public ClinkDescribeQueueResponseBodyDataResult setMaxPauseClientFlag(Long maxPauseClientFlag) {
            this.maxPauseClientFlag = maxPauseClientFlag;
            return this;
        }
        public Long getMaxPauseClientFlag() {
            return this.maxPauseClientFlag;
        }

        public ClinkDescribeQueueResponseBodyDataResult setMaxPauseClientType(Long maxPauseClientType) {
            this.maxPauseClientType = maxPauseClientType;
            return this;
        }
        public Long getMaxPauseClientType() {
            return this.maxPauseClientType;
        }

        public ClinkDescribeQueueResponseBodyDataResult setMaxPauseClientValue(Long maxPauseClientValue) {
            this.maxPauseClientValue = maxPauseClientValue;
            return this;
        }
        public Long getMaxPauseClientValue() {
            return this.maxPauseClientValue;
        }

        public ClinkDescribeQueueResponseBodyDataResult setMaxWait(Long maxWait) {
            this.maxWait = maxWait;
            return this;
        }
        public Long getMaxWait() {
            return this.maxWait;
        }

        public ClinkDescribeQueueResponseBodyDataResult setMemberTimeout(Long memberTimeout) {
            this.memberTimeout = memberTimeout;
            return this;
        }
        public Long getMemberTimeout() {
            return this.memberTimeout;
        }

        public ClinkDescribeQueueResponseBodyDataResult setName(Long name) {
            this.name = name;
            return this;
        }
        public Long getName() {
            return this.name;
        }

        public ClinkDescribeQueueResponseBodyDataResult setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public ClinkDescribeQueueResponseBodyDataResult setQueueMembers(java.util.List<ClinkDescribeQueueResponseBodyDataResultQueueMembers> queueMembers) {
            this.queueMembers = queueMembers;
            return this;
        }
        public java.util.List<ClinkDescribeQueueResponseBodyDataResultQueueMembers> getQueueMembers() {
            return this.queueMembers;
        }

        public ClinkDescribeQueueResponseBodyDataResult setQueueTimeout(Long queueTimeout) {
            this.queueTimeout = queueTimeout;
            return this;
        }
        public Long getQueueTimeout() {
            return this.queueTimeout;
        }

        public ClinkDescribeQueueResponseBodyDataResult setRetry(Long retry) {
            this.retry = retry;
            return this;
        }
        public Long getRetry() {
            return this.retry;
        }

        public ClinkDescribeQueueResponseBodyDataResult setSayCno(Long sayCno) {
            this.sayCno = sayCno;
            return this;
        }
        public Long getSayCno() {
            return this.sayCno;
        }

        public ClinkDescribeQueueResponseBodyDataResult setServiceLevel(Long serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }
        public Long getServiceLevel() {
            return this.serviceLevel;
        }

        public ClinkDescribeQueueResponseBodyDataResult setStrategy(Long strategy) {
            this.strategy = strategy;
            return this;
        }
        public Long getStrategy() {
            return this.strategy;
        }

        public ClinkDescribeQueueResponseBodyDataResult setVipSupport(Long vipSupport) {
            this.vipSupport = vipSupport;
            return this;
        }
        public Long getVipSupport() {
            return this.vipSupport;
        }

        public ClinkDescribeQueueResponseBodyDataResult setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public ClinkDescribeQueueResponseBodyDataResult setWrapupTime(Long wrapupTime) {
            this.wrapupTime = wrapupTime;
            return this;
        }
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

    }

    public static class ClinkDescribeQueueResponseBodyData extends TeaModel {
        /**
         * <p>请求 id</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ClinkRequestId")
        public String clinkRequestId;

        @NameInMap("Result")
        public ClinkDescribeQueueResponseBodyDataResult result;

        public static ClinkDescribeQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClinkDescribeQueueResponseBodyData self = new ClinkDescribeQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClinkDescribeQueueResponseBodyData setClinkRequestId(String clinkRequestId) {
            this.clinkRequestId = clinkRequestId;
            return this;
        }
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public ClinkDescribeQueueResponseBodyData setResult(ClinkDescribeQueueResponseBodyDataResult result) {
            this.result = result;
            return this;
        }
        public ClinkDescribeQueueResponseBodyDataResult getResult() {
            return this.result;
        }

    }

}
