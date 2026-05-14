// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkCreateQueueRequest extends TeaModel {
    /**
     * <p>在线客服排队位置推送(小于该位置则推送)；默认值为 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ChatLocation")
    public Long chatLocation;

    /**
     * <p>在线客服最大排队数；默认值为 20</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ChatMaxWait")
    public Long chatMaxWait;

    /**
     * <p>在线客服分配策略，2：轮选；4：随机；5：技能优先；默认值为 2</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ChatStrategy")
    public Long chatStrategy;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8004970</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>是否允许呼入队列，0: 否；1: 是；默认值为 1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IbAllowed")
    public Long ibAllowed;

    /**
     * <p>队列中为空时是否可以join，1: 置忙；2: 通话中；4: 振铃；8: 无效；16: 整理 如选多种状态则传对应数值的和，如选置忙和通话中，值为 3。默认值为 0，即都未选中</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("JoinEmpty")
    public Long joinEmpty;

    /**
     * <p>最大并发置忙座席数，开关配置，0:关闭，1:开启；默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxPauseClientFlag")
    public Long maxPauseClientFlag;

    /**
     * <p>最大并发置忙座席数，配置类型，0:百分比，1:数值；默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxPauseClientType")
    public Long maxPauseClientType;

    /**
     * <p>最大并发置忙座席数，配置值，当配置类型为百分比时最大值为100，默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxPauseClientValue")
    public Long maxPauseClientValue;

    /**
     * <p>最大等待数，设置范围 0-999，0 表示不做任何限制。默认值为 5</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxWait")
    public Long maxWait;

    /**
     * <p>座席超时时间，取值范围 20-60 秒。默认值为 25</p>
     * 
     * <strong>example:</strong>
     * <p>26</p>
     */
    @NameInMap("MemberTimeout")
    public Long memberTimeout;

    /**
     * <p>队列名称，只允许输入中文，字母，数字，下划线，长度不超过 20 个字符</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>队列工号，4 位数字，要求唯一</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Qno")
    public String qno;

    /**
     * <p>队列内座席及技能值设置。技能值 1-10，技能值 1 的优先级为最高 cno 队列下座席号 penalty该座席在队列中的优先级</p>
     */
    @NameInMap("QueueMembers")
    public java.util.List<ClinkCreateQueueRequestQueueMembers> queueMembers;

    /**
     * <p>队列超时时间，取值范围 30-600 秒。默认值为 600</p>
     * 
     * <strong>example:</strong>
     * <p>33</p>
     */
    @NameInMap("QueueTimeout")
    public Long queueTimeout;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>是否报座席号，0: 否；1:是；默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SayCno")
    public Long sayCno;

    /**
     * <p>服务水平秒数，取值范围 10-30 秒，低于此时间内接听的认为是高服务水平。默认值为 15</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("ServiceLevel")
    public Long serviceLevel;

    /**
     * <p>呼叫策略， 1：顺序，2：轮选，3：平均，4：随机，5：技能优先，6：距上一通呼入空闲时间累计最长，7：技能优先+距上一通呼入空闲时间累计最长，8：距上一通呼入空闲时间累计最长(全队列)，9：技能优先+距上一通呼入空闲时间累计最长(全队列)，10：全队列平均，11：技能优先+轮选，12：最长空闲时长，13：技能优先+当前空闲状态时长最长，14：距上一通通话空闲时间累计最长，默认值为 2</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Strategy")
    public Long strategy;

    /**
     * <p>VIP客户优先，0:不支持；1:支持；默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("VipSupport")
    public Long vipSupport;

    /**
     * <p>队列优先级，取值范围 1-10。默认值为 1 座席属于多个队列时，优先级高的队列的来电将优先接听；数值越高，优先级越高</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Weight")
    public Long weight;

    /**
     * <p>整理时长，取值范围 3-300 秒，整理期间座席不接受新的呼叫。默认值为 15</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("WrapupTime")
    public Long wrapupTime;

    public static ClinkCreateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkCreateQueueRequest self = new ClinkCreateQueueRequest();
        return TeaModel.build(map, self);
    }

    public ClinkCreateQueueRequest setChatLocation(Long chatLocation) {
        this.chatLocation = chatLocation;
        return this;
    }
    public Long getChatLocation() {
        return this.chatLocation;
    }

    public ClinkCreateQueueRequest setChatMaxWait(Long chatMaxWait) {
        this.chatMaxWait = chatMaxWait;
        return this;
    }
    public Long getChatMaxWait() {
        return this.chatMaxWait;
    }

    public ClinkCreateQueueRequest setChatStrategy(Long chatStrategy) {
        this.chatStrategy = chatStrategy;
        return this;
    }
    public Long getChatStrategy() {
        return this.chatStrategy;
    }

    public ClinkCreateQueueRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkCreateQueueRequest setIbAllowed(Long ibAllowed) {
        this.ibAllowed = ibAllowed;
        return this;
    }
    public Long getIbAllowed() {
        return this.ibAllowed;
    }

    public ClinkCreateQueueRequest setJoinEmpty(Long joinEmpty) {
        this.joinEmpty = joinEmpty;
        return this;
    }
    public Long getJoinEmpty() {
        return this.joinEmpty;
    }

    public ClinkCreateQueueRequest setMaxPauseClientFlag(Long maxPauseClientFlag) {
        this.maxPauseClientFlag = maxPauseClientFlag;
        return this;
    }
    public Long getMaxPauseClientFlag() {
        return this.maxPauseClientFlag;
    }

    public ClinkCreateQueueRequest setMaxPauseClientType(Long maxPauseClientType) {
        this.maxPauseClientType = maxPauseClientType;
        return this;
    }
    public Long getMaxPauseClientType() {
        return this.maxPauseClientType;
    }

    public ClinkCreateQueueRequest setMaxPauseClientValue(Long maxPauseClientValue) {
        this.maxPauseClientValue = maxPauseClientValue;
        return this;
    }
    public Long getMaxPauseClientValue() {
        return this.maxPauseClientValue;
    }

    public ClinkCreateQueueRequest setMaxWait(Long maxWait) {
        this.maxWait = maxWait;
        return this;
    }
    public Long getMaxWait() {
        return this.maxWait;
    }

    public ClinkCreateQueueRequest setMemberTimeout(Long memberTimeout) {
        this.memberTimeout = memberTimeout;
        return this;
    }
    public Long getMemberTimeout() {
        return this.memberTimeout;
    }

    public ClinkCreateQueueRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ClinkCreateQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkCreateQueueRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public ClinkCreateQueueRequest setQueueMembers(java.util.List<ClinkCreateQueueRequestQueueMembers> queueMembers) {
        this.queueMembers = queueMembers;
        return this;
    }
    public java.util.List<ClinkCreateQueueRequestQueueMembers> getQueueMembers() {
        return this.queueMembers;
    }

    public ClinkCreateQueueRequest setQueueTimeout(Long queueTimeout) {
        this.queueTimeout = queueTimeout;
        return this;
    }
    public Long getQueueTimeout() {
        return this.queueTimeout;
    }

    public ClinkCreateQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkCreateQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkCreateQueueRequest setSayCno(Long sayCno) {
        this.sayCno = sayCno;
        return this;
    }
    public Long getSayCno() {
        return this.sayCno;
    }

    public ClinkCreateQueueRequest setServiceLevel(Long serviceLevel) {
        this.serviceLevel = serviceLevel;
        return this;
    }
    public Long getServiceLevel() {
        return this.serviceLevel;
    }

    public ClinkCreateQueueRequest setStrategy(Long strategy) {
        this.strategy = strategy;
        return this;
    }
    public Long getStrategy() {
        return this.strategy;
    }

    public ClinkCreateQueueRequest setVipSupport(Long vipSupport) {
        this.vipSupport = vipSupport;
        return this;
    }
    public Long getVipSupport() {
        return this.vipSupport;
    }

    public ClinkCreateQueueRequest setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

    public ClinkCreateQueueRequest setWrapupTime(Long wrapupTime) {
        this.wrapupTime = wrapupTime;
        return this;
    }
    public Long getWrapupTime() {
        return this.wrapupTime;
    }

    public static class ClinkCreateQueueRequestQueueMembers extends TeaModel {
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
         * <p>3</p>
         */
        @NameInMap("Penalty")
        public Long penalty;

        public static ClinkCreateQueueRequestQueueMembers build(java.util.Map<String, ?> map) throws Exception {
            ClinkCreateQueueRequestQueueMembers self = new ClinkCreateQueueRequestQueueMembers();
            return TeaModel.build(map, self);
        }

        public ClinkCreateQueueRequestQueueMembers setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public ClinkCreateQueueRequestQueueMembers setPenalty(Long penalty) {
            this.penalty = penalty;
            return this;
        }
        public Long getPenalty() {
            return this.penalty;
        }

    }

}
