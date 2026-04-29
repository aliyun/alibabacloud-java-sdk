// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListQueueResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudListQueueResponseBodyData data;

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

    public static CloudListQueueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudListQueueResponseBody self = new CloudListQueueResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudListQueueResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudListQueueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudListQueueResponseBody setData(CloudListQueueResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudListQueueResponseBodyData getData() {
        return this.data;
    }

    public CloudListQueueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudListQueueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudListQueueResponseBodyDataList extends TeaModel {
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
         * <p>0</p>
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
         * <p>&quot;&quot;</p>
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
         * <p>2025-09-06 15:50:18</p>
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
         * <p>48175</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>队列中为空时是否可以join，取值：1：置忙 2：通话中 4：振铃 8：无效 16：整理</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>33</p>
         */
        @NameInMap("Qno")
        public String qno;

        /**
         * <p>队列超时时间，取值范围5-600秒，默认600秒</p>
         * 
         * <strong>example:</strong>
         * <p>600</p>
         */
        @NameInMap("QueueTimeout")
        public Long queueTimeout;

        /**
         * <p>座席超时无应答,呼叫下一座席的延迟秒数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>rrmemory</p>
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
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Long weight;

        /**
         * <p>整理时间，取值范围3-3600秒</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("WrapupTime")
        public Long wrapupTime;

        public static CloudListQueueResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            CloudListQueueResponseBodyDataList self = new CloudListQueueResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public CloudListQueueResponseBodyDataList setAnnouncePosition(Long announcePosition) {
            this.announcePosition = announcePosition;
            return this;
        }
        public Long getAnnouncePosition() {
            return this.announcePosition;
        }

        public CloudListQueueResponseBodyDataList setAnnouncePositionFrequency(Long announcePositionFrequency) {
            this.announcePositionFrequency = announcePositionFrequency;
            return this;
        }
        public Long getAnnouncePositionFrequency() {
            return this.announcePositionFrequency;
        }

        public CloudListQueueResponseBodyDataList setAnnouncePositionParam(Long announcePositionParam) {
            this.announcePositionParam = announcePositionParam;
            return this;
        }
        public Long getAnnouncePositionParam() {
            return this.announcePositionParam;
        }

        public CloudListQueueResponseBodyDataList setAnnouncePositionYouarenext(Long announcePositionYouarenext) {
            this.announcePositionYouarenext = announcePositionYouarenext;
            return this;
        }
        public Long getAnnouncePositionYouarenext() {
            return this.announcePositionYouarenext;
        }

        public CloudListQueueResponseBodyDataList setAnnounceSound(Long announceSound) {
            this.announceSound = announceSound;
            return this;
        }
        public Long getAnnounceSound() {
            return this.announceSound;
        }

        public CloudListQueueResponseBodyDataList setAnnounceSoundFile(String announceSoundFile) {
            this.announceSoundFile = announceSoundFile;
            return this;
        }
        public String getAnnounceSoundFile() {
            return this.announceSoundFile;
        }

        public CloudListQueueResponseBodyDataList setAnnounceSoundFrequency(Long announceSoundFrequency) {
            this.announceSoundFrequency = announceSoundFrequency;
            return this;
        }
        public Long getAnnounceSoundFrequency() {
            return this.announceSoundFrequency;
        }

        public CloudListQueueResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudListQueueResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloudListQueueResponseBodyDataList setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudListQueueResponseBodyDataList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudListQueueResponseBodyDataList setJoinEmpty(Long joinEmpty) {
            this.joinEmpty = joinEmpty;
            return this;
        }
        public Long getJoinEmpty() {
            return this.joinEmpty;
        }

        public CloudListQueueResponseBodyDataList setMaxLen(Long maxLen) {
            this.maxLen = maxLen;
            return this;
        }
        public Long getMaxLen() {
            return this.maxLen;
        }

        public CloudListQueueResponseBodyDataList setMemberTimeout(Long memberTimeout) {
            this.memberTimeout = memberTimeout;
            return this;
        }
        public Long getMemberTimeout() {
            return this.memberTimeout;
        }

        public CloudListQueueResponseBodyDataList setMusicClass(String musicClass) {
            this.musicClass = musicClass;
            return this;
        }
        public String getMusicClass() {
            return this.musicClass;
        }

        public CloudListQueueResponseBodyDataList setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public CloudListQueueResponseBodyDataList setQueueTimeout(Long queueTimeout) {
            this.queueTimeout = queueTimeout;
            return this;
        }
        public Long getQueueTimeout() {
            return this.queueTimeout;
        }

        public CloudListQueueResponseBodyDataList setRetry(Long retry) {
            this.retry = retry;
            return this;
        }
        public Long getRetry() {
            return this.retry;
        }

        public CloudListQueueResponseBodyDataList setSayAgentno(Boolean sayAgentno) {
            this.sayAgentno = sayAgentno;
            return this;
        }
        public Boolean getSayAgentno() {
            return this.sayAgentno;
        }

        public CloudListQueueResponseBodyDataList setServiceLevel(Long serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }
        public Long getServiceLevel() {
            return this.serviceLevel;
        }

        public CloudListQueueResponseBodyDataList setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public CloudListQueueResponseBodyDataList setVipSupport(Long vipSupport) {
            this.vipSupport = vipSupport;
            return this;
        }
        public Long getVipSupport() {
            return this.vipSupport;
        }

        public CloudListQueueResponseBodyDataList setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public CloudListQueueResponseBodyDataList setWrapupTime(Long wrapupTime) {
            this.wrapupTime = wrapupTime;
            return this;
        }
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

    }

    public static class CloudListQueueResponseBodyData extends TeaModel {
        /**
         * <p>队列列表</p>
         */
        @NameInMap("List")
        public java.util.List<CloudListQueueResponseBodyDataList> list;

        /**
         * <p>总条数</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("Total")
        public Long total;

        public static CloudListQueueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudListQueueResponseBodyData self = new CloudListQueueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudListQueueResponseBodyData setList(java.util.List<CloudListQueueResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<CloudListQueueResponseBodyDataList> getList() {
            return this.list;
        }

        public CloudListQueueResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
