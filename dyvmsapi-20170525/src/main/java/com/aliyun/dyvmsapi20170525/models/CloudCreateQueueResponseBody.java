// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateQueueResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudCreateQueueResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudCreateQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateQueueResponseBody self = new CloudCreateQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudCreateQueueResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudCreateQueueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudCreateQueueResponseBody setData(CloudCreateQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudCreateQueueResponseBodyData getData() {
        return this.data;
    }

    public CloudCreateQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudCreateQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudCreateQueueResponseBodyDataQueue extends TeaModel {
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
         * <p>10</p>
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
         * <p>sound_file3</p>
         */
        @NameInMap("AnnounceSoundFile")
        public String announceSoundFile;

        /**
         * <p>播放固定语音周期，秒数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * 
         * <strong>example:</strong>
         * <p>queueName</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>队列id</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>队列中为空时是否可以join，取值：1：置忙 2：通话中 4：振铃 8：无效 16：整理</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("JoinEmpty")
        public Long joinEmpty;

        /**
         * <p>最大等待数，设置范围0-999，0表示不做任何限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MaxLen")
        public Long maxLen;

        /**
         * <p>座席超时时间，取值范围20-60秒，默认25秒</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("MemberTimeout")
        public Long memberTimeout;

        /**
         * <p>等待语音class</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("MusicClass")
        public String musicClass;

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>12331</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>队列超时时间，取值范围5-600秒，默认600秒</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("QueueTimeout")
        public Long queueTimeout;

        /**
         * <p>座席超时无应答,呼叫下一座席的延迟秒数</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Retry")
        public Long retry;

        /**
         * <p>语音报号，true:播报，false:不播报</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SayAgentno")
        public Boolean sayAgentno;

        /**
         * <p>服务水平秒数，低于此时间内接听的认为是高服务水平</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ServiceLevel")
        public Long serviceLevel;

        /**
         * <p>呼叫策略：rrordered:技能优先 rrmemory:轮选 fewestcalls:平均 random:随机 linear:顺序 leastrecent:最长空闲时间</p>
         * 
         * <strong>example:</strong>
         * <p>rrordered</p>
         */
        @NameInMap("Strategy")
        public String strategy;

        /**
         * <p>是否支持vip，1:支持，0:不支持</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VipSupport")
        public Long vipSupport;

        /**
         * <p>队列优先级，取值范围1-10，数值越高，优先级越高</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Weight")
        public Long weight;

        /**
         * <p>整理时间，取值范围3-3600秒</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("WrapupTime")
        public Long wrapupTime;

        public static CloudCreateQueueResponseBodyDataQueue build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateQueueResponseBodyDataQueue self = new CloudCreateQueueResponseBodyDataQueue();
            return TeaModel.build(map, self);
        }

        public CloudCreateQueueResponseBodyDataQueue setAnnouncePosition(Long announcePosition) {
            this.announcePosition = announcePosition;
            return this;
        }
        public Long getAnnouncePosition() {
            return this.announcePosition;
        }

        public CloudCreateQueueResponseBodyDataQueue setAnnouncePositionFrequency(Long announcePositionFrequency) {
            this.announcePositionFrequency = announcePositionFrequency;
            return this;
        }
        public Long getAnnouncePositionFrequency() {
            return this.announcePositionFrequency;
        }

        public CloudCreateQueueResponseBodyDataQueue setAnnouncePositionParam(Long announcePositionParam) {
            this.announcePositionParam = announcePositionParam;
            return this;
        }
        public Long getAnnouncePositionParam() {
            return this.announcePositionParam;
        }

        public CloudCreateQueueResponseBodyDataQueue setAnnouncePositionYouarenext(Long announcePositionYouarenext) {
            this.announcePositionYouarenext = announcePositionYouarenext;
            return this;
        }
        public Long getAnnouncePositionYouarenext() {
            return this.announcePositionYouarenext;
        }

        public CloudCreateQueueResponseBodyDataQueue setAnnounceSound(Long announceSound) {
            this.announceSound = announceSound;
            return this;
        }
        public Long getAnnounceSound() {
            return this.announceSound;
        }

        public CloudCreateQueueResponseBodyDataQueue setAnnounceSoundFile(String announceSoundFile) {
            this.announceSoundFile = announceSoundFile;
            return this;
        }
        public String getAnnounceSoundFile() {
            return this.announceSoundFile;
        }

        public CloudCreateQueueResponseBodyDataQueue setAnnounceSoundFrequency(Long announceSoundFrequency) {
            this.announceSoundFrequency = announceSoundFrequency;
            return this;
        }
        public Long getAnnounceSoundFrequency() {
            return this.announceSoundFrequency;
        }

        public CloudCreateQueueResponseBodyDataQueue setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateQueueResponseBodyDataQueue setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloudCreateQueueResponseBodyDataQueue setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateQueueResponseBodyDataQueue setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudCreateQueueResponseBodyDataQueue setJoinEmpty(Long joinEmpty) {
            this.joinEmpty = joinEmpty;
            return this;
        }
        public Long getJoinEmpty() {
            return this.joinEmpty;
        }

        public CloudCreateQueueResponseBodyDataQueue setMaxLen(Long maxLen) {
            this.maxLen = maxLen;
            return this;
        }
        public Long getMaxLen() {
            return this.maxLen;
        }

        public CloudCreateQueueResponseBodyDataQueue setMemberTimeout(Long memberTimeout) {
            this.memberTimeout = memberTimeout;
            return this;
        }
        public Long getMemberTimeout() {
            return this.memberTimeout;
        }

        public CloudCreateQueueResponseBodyDataQueue setMusicClass(String musicClass) {
            this.musicClass = musicClass;
            return this;
        }
        public String getMusicClass() {
            return this.musicClass;
        }

        public CloudCreateQueueResponseBodyDataQueue setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public CloudCreateQueueResponseBodyDataQueue setQueueTimeout(Long queueTimeout) {
            this.queueTimeout = queueTimeout;
            return this;
        }
        public Long getQueueTimeout() {
            return this.queueTimeout;
        }

        public CloudCreateQueueResponseBodyDataQueue setRetry(Long retry) {
            this.retry = retry;
            return this;
        }
        public Long getRetry() {
            return this.retry;
        }

        public CloudCreateQueueResponseBodyDataQueue setSayAgentno(Boolean sayAgentno) {
            this.sayAgentno = sayAgentno;
            return this;
        }
        public Boolean getSayAgentno() {
            return this.sayAgentno;
        }

        public CloudCreateQueueResponseBodyDataQueue setServiceLevel(Long serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }
        public Long getServiceLevel() {
            return this.serviceLevel;
        }

        public CloudCreateQueueResponseBodyDataQueue setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public CloudCreateQueueResponseBodyDataQueue setVipSupport(Long vipSupport) {
            this.vipSupport = vipSupport;
            return this;
        }
        public Long getVipSupport() {
            return this.vipSupport;
        }

        public CloudCreateQueueResponseBodyDataQueue setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public CloudCreateQueueResponseBodyDataQueue setWrapupTime(Long wrapupTime) {
            this.wrapupTime = wrapupTime;
            return this;
        }
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

    }

    public static class CloudCreateQueueResponseBodyDataQueueSkills extends TeaModel {
        /**
         * <p>创建时间，格式: yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>企业编号</p>
         * 
         * <strong>example:</strong>
         * <p>7000002</p>
         */
        @NameInMap("EnterpriseId")
        public Long enterpriseId;

        /**
         * <p>queueSkill关系表中id</p>
         * 
         * <strong>example:</strong>
         * <p>54474</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>队列id</p>
         * 
         * <strong>example:</strong>
         * <p>51937</p>
         */
        @NameInMap("QueueId")
        public Long queueId;

        /**
         * <p>skill的id</p>
         * 
         * <strong>example:</strong>
         * <p>48734</p>
         */
        @NameInMap("SkillId")
        public Long skillId;

        /**
         * <p>技能值</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SkillLevel")
        public Long skillLevel;

        public static CloudCreateQueueResponseBodyDataQueueSkills build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateQueueResponseBodyDataQueueSkills self = new CloudCreateQueueResponseBodyDataQueueSkills();
            return TeaModel.build(map, self);
        }

        public CloudCreateQueueResponseBodyDataQueueSkills setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateQueueResponseBodyDataQueueSkills setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateQueueResponseBodyDataQueueSkills setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudCreateQueueResponseBodyDataQueueSkills setQueueId(Long queueId) {
            this.queueId = queueId;
            return this;
        }
        public Long getQueueId() {
            return this.queueId;
        }

        public CloudCreateQueueResponseBodyDataQueueSkills setSkillId(Long skillId) {
            this.skillId = skillId;
            return this;
        }
        public Long getSkillId() {
            return this.skillId;
        }

        public CloudCreateQueueResponseBodyDataQueueSkills setSkillLevel(Long skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public Long getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class CloudCreateQueueResponseBodyData extends TeaModel {
        /**
         * <p>队列配置信息</p>
         */
        @NameInMap("Queue")
        public CloudCreateQueueResponseBodyDataQueue queue;

        /**
         * <p>队列所需技能数组</p>
         */
        @NameInMap("QueueSkills")
        public java.util.List<CloudCreateQueueResponseBodyDataQueueSkills> queueSkills;

        public static CloudCreateQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateQueueResponseBodyData self = new CloudCreateQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudCreateQueueResponseBodyData setQueue(CloudCreateQueueResponseBodyDataQueue queue) {
            this.queue = queue;
            return this;
        }
        public CloudCreateQueueResponseBodyDataQueue getQueue() {
            return this.queue;
        }

        public CloudCreateQueueResponseBodyData setQueueSkills(java.util.List<CloudCreateQueueResponseBodyDataQueueSkills> queueSkills) {
            this.queueSkills = queueSkills;
            return this;
        }
        public java.util.List<CloudCreateQueueResponseBodyDataQueueSkills> getQueueSkills() {
            return this.queueSkills;
        }

    }

}
