// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateQueueRequest extends TeaModel {
    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>队列信息</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Queue")
    public CloudCreateQueueRequestQueue queue;

    /**
     * <p>队列技能</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueueSkills")
    public java.util.List<CloudCreateQueueRequestQueueSkills> queueSkills;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CloudCreateQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateQueueRequest self = new CloudCreateQueueRequest();
        return TeaModel.build(map, self);
    }

    public CloudCreateQueueRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudCreateQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudCreateQueueRequest setQueue(CloudCreateQueueRequestQueue queue) {
        this.queue = queue;
        return this;
    }
    public CloudCreateQueueRequestQueue getQueue() {
        return this.queue;
    }

    public CloudCreateQueueRequest setQueueSkills(java.util.List<CloudCreateQueueRequestQueueSkills> queueSkills) {
        this.queueSkills = queueSkills;
        return this;
    }
    public java.util.List<CloudCreateQueueRequestQueueSkills> getQueueSkills() {
        return this.queueSkills;
    }

    public CloudCreateQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudCreateQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class CloudCreateQueueRequestQueue extends TeaModel {
        /**
         * <p>位置播报 0关闭 1大于announce_position_param时播放 2小于等于announce_position_param时播放</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnnouncePosition")
        public Long announcePosition;

        /**
         * <p>位置播报周期，秒数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnnouncePositionFrequency")
        public Long announcePositionFrequency;

        /**
         * <p>多余少余n个时播报，必须大于等于2</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AnnouncePositionParam")
        public Long announcePositionParam;

        /**
         * <p>是否播报\&quot;您是下一位\&quot;,0关闭，1开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnnouncePositionYouarenext")
        public Long announcePositionYouarenext;

        /**
         * <p>播报固定语音 0关闭 1打开</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AnnounceSound")
        public Long announceSound;

        /**
         * <p>固定语音文件</p>
         * 
         * <strong>example:</strong>
         * <p>announceSoundFile3</p>
         */
        @NameInMap("AnnounceSoundFile")
        public String announceSoundFile;

        /**
         * <p>播放固定语音周期，秒数</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AnnounceSoundFrequency")
        public Long announceSoundFrequency;

        /**
         * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>队列名</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>queueName</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>队列中为空时是否可以join，取值：1：置忙 2：通话中 4：振铃 8：无效 16：整理</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("JoinEmpty")
        public Long joinEmpty;

        /**
         * <p>最大等待数，设置范围0-999，0表示不做任何限制</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxLen")
        public Long maxLen;

        /**
         * <p>座席超时时间，取值范围20-60秒，默认25秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("MemberTimeout")
        public Long memberTimeout;

        /**
         * <p>等待语音class</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("MusicClass")
        public String musicClass;

        /**
         * <p>队列号</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3003</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>队列超时时间，取值范围20-600秒，默认600秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("QueueTimeout")
        public Long queueTimeout;

        /**
         * <p>座席超时无应答,呼叫下一座席的延迟秒数</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Retry")
        public Long retry;

        /**
         * <p>语音报号，true:播报，false:不播报</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SayAgentno")
        public Boolean sayAgentno;

        /**
         * <p>服务水平秒数，低于此时间内接听的认为是高服务水平</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ServiceLevel")
        public Long serviceLevel;

        /**
         * <p>呼叫策略：rrordered:技能优先 rrmemory:轮选 fewestcalls:平均 random:随机 linear:顺序 leastrecent:最长空闲时间</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rrordered</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        /**
         * <p>是否支持vip，1:支持，0:不支持</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VipSupport")
        public Long vipSupport;

        /**
         * <p>队列优先级，取值范围1-10，数值越高，优先级越高</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("Weight")
        public Long weight;

        /**
         * <p>整理时间，取值范围3-3600秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("WrapupTime")
        public Long wrapupTime;

        public static CloudCreateQueueRequestQueue build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateQueueRequestQueue self = new CloudCreateQueueRequestQueue();
            return TeaModel.build(map, self);
        }

        public CloudCreateQueueRequestQueue setAnnouncePosition(Long announcePosition) {
            this.announcePosition = announcePosition;
            return this;
        }
        public Long getAnnouncePosition() {
            return this.announcePosition;
        }

        public CloudCreateQueueRequestQueue setAnnouncePositionFrequency(Long announcePositionFrequency) {
            this.announcePositionFrequency = announcePositionFrequency;
            return this;
        }
        public Long getAnnouncePositionFrequency() {
            return this.announcePositionFrequency;
        }

        public CloudCreateQueueRequestQueue setAnnouncePositionParam(Long announcePositionParam) {
            this.announcePositionParam = announcePositionParam;
            return this;
        }
        public Long getAnnouncePositionParam() {
            return this.announcePositionParam;
        }

        public CloudCreateQueueRequestQueue setAnnouncePositionYouarenext(Long announcePositionYouarenext) {
            this.announcePositionYouarenext = announcePositionYouarenext;
            return this;
        }
        public Long getAnnouncePositionYouarenext() {
            return this.announcePositionYouarenext;
        }

        public CloudCreateQueueRequestQueue setAnnounceSound(Long announceSound) {
            this.announceSound = announceSound;
            return this;
        }
        public Long getAnnounceSound() {
            return this.announceSound;
        }

        public CloudCreateQueueRequestQueue setAnnounceSoundFile(String announceSoundFile) {
            this.announceSoundFile = announceSoundFile;
            return this;
        }
        public String getAnnounceSoundFile() {
            return this.announceSoundFile;
        }

        public CloudCreateQueueRequestQueue setAnnounceSoundFrequency(Long announceSoundFrequency) {
            this.announceSoundFrequency = announceSoundFrequency;
            return this;
        }
        public Long getAnnounceSoundFrequency() {
            return this.announceSoundFrequency;
        }

        public CloudCreateQueueRequestQueue setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateQueueRequestQueue setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloudCreateQueueRequestQueue setJoinEmpty(Long joinEmpty) {
            this.joinEmpty = joinEmpty;
            return this;
        }
        public Long getJoinEmpty() {
            return this.joinEmpty;
        }

        public CloudCreateQueueRequestQueue setMaxLen(Long maxLen) {
            this.maxLen = maxLen;
            return this;
        }
        public Long getMaxLen() {
            return this.maxLen;
        }

        public CloudCreateQueueRequestQueue setMemberTimeout(Long memberTimeout) {
            this.memberTimeout = memberTimeout;
            return this;
        }
        public Long getMemberTimeout() {
            return this.memberTimeout;
        }

        public CloudCreateQueueRequestQueue setMusicClass(String musicClass) {
            this.musicClass = musicClass;
            return this;
        }
        public String getMusicClass() {
            return this.musicClass;
        }

        public CloudCreateQueueRequestQueue setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public CloudCreateQueueRequestQueue setQueueTimeout(Long queueTimeout) {
            this.queueTimeout = queueTimeout;
            return this;
        }
        public Long getQueueTimeout() {
            return this.queueTimeout;
        }

        public CloudCreateQueueRequestQueue setRetry(Long retry) {
            this.retry = retry;
            return this;
        }
        public Long getRetry() {
            return this.retry;
        }

        public CloudCreateQueueRequestQueue setSayAgentno(Boolean sayAgentno) {
            this.sayAgentno = sayAgentno;
            return this;
        }
        public Boolean getSayAgentno() {
            return this.sayAgentno;
        }

        public CloudCreateQueueRequestQueue setServiceLevel(Long serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }
        public Long getServiceLevel() {
            return this.serviceLevel;
        }

        public CloudCreateQueueRequestQueue setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public CloudCreateQueueRequestQueue setVipSupport(Long vipSupport) {
            this.vipSupport = vipSupport;
            return this;
        }
        public Long getVipSupport() {
            return this.vipSupport;
        }

        public CloudCreateQueueRequestQueue setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public CloudCreateQueueRequestQueue setWrapupTime(Long wrapupTime) {
            this.wrapupTime = wrapupTime;
            return this;
        }
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

    }

    public static class CloudCreateQueueRequestQueueSkills extends TeaModel {
        /**
         * <p>skill的id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("SkillId")
        public Long skillId;

        /**
         * <p>技能值</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SkillLevel")
        public Long skillLevel;

        public static CloudCreateQueueRequestQueueSkills build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateQueueRequestQueueSkills self = new CloudCreateQueueRequestQueueSkills();
            return TeaModel.build(map, self);
        }

        public CloudCreateQueueRequestQueueSkills setSkillId(Long skillId) {
            this.skillId = skillId;
            return this;
        }
        public Long getSkillId() {
            return this.skillId;
        }

        public CloudCreateQueueRequestQueueSkills setSkillLevel(Long skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public Long getSkillLevel() {
            return this.skillLevel;
        }

    }

}
