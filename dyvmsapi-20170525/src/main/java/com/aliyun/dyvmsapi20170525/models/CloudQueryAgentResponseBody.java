// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudQueryAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudQueryAgentResponseBodyData data;

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

    public static CloudQueryAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudQueryAgentResponseBody self = new CloudQueryAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudQueryAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudQueryAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudQueryAgentResponseBody setData(CloudQueryAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudQueryAgentResponseBodyData getData() {
        return this.data;
    }

    public CloudQueryAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudQueryAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudQueryAgentResponseBodyDataAgentsAgent extends TeaModel {
        /**
         * <p>是否启用，0：停用，1：启用，默认启用</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public String active;

        /**
         * <p>座席类型，1：电话座席，2：电脑座席，默认电话座席</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>区号格式</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>座席绑定电话</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        @NameInMap("BindTel")
        public String bindTel;

        /**
         * <p>电话类型，1:固话 2:手机 3:分机 4:软电话</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindTelType")
        public String bindTelType;

        /**
         * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallPower")
        public String callPower;

        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

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
        public String enterpriseId;

        /**
         * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IbRecord")
        public String ibRecord;

        /**
         * <p>座席id</p>
         * 
         * <strong>example:</strong>
         * <p>133</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>是否开启ASR转写：0：不开启，1：开启，默认不开启</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAsr")
        public String isAsr;

        /**
         * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsOb")
        public String isOb;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsQualityCheck")
        public String isQualityCheck;

        /**
         * <p>座席姓名</p>
         * 
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>41008502</p>
         */
        @NameInMap("ObClid")
        public String obClid;

        /**
         * <p>外显规则 1：企业默认 2：随机 3：按区号 4：动态外显</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObClidType")
        public String obClidType;

        /**
         * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObRecord")
        public String obRecord;

        /**
         * <p>1：班长席，0：普通座席，默认普通座席</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Power")
        public String power;

        /**
         * <p>座席状态，0:离线，1：在线</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>webrtc软电话返回地址，0：企业默认 1：公网域名 2：专线域名 3：公网IP 4：专线IP</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WebrtcUrlType")
        public String webrtcUrlType;

        /**
         * <p>整理时间，秒数，默认10秒</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Wrapup")
        public String wrapup;

        public static CloudQueryAgentResponseBodyDataAgentsAgent build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentResponseBodyDataAgentsAgent self = new CloudQueryAgentResponseBodyDataAgentsAgent();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setActive(String active) {
            this.active = active;
            return this;
        }
        public String getActive() {
            return this.active;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setBindTelType(String bindTelType) {
            this.bindTelType = bindTelType;
            return this;
        }
        public String getBindTelType() {
            return this.bindTelType;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setCallPower(String callPower) {
            this.callPower = callPower;
            return this;
        }
        public String getCallPower() {
            return this.callPower;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setIbRecord(String ibRecord) {
            this.ibRecord = ibRecord;
            return this;
        }
        public String getIbRecord() {
            return this.ibRecord;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setIsAsr(String isAsr) {
            this.isAsr = isAsr;
            return this;
        }
        public String getIsAsr() {
            return this.isAsr;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setIsOb(String isOb) {
            this.isOb = isOb;
            return this;
        }
        public String getIsOb() {
            return this.isOb;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setIsQualityCheck(String isQualityCheck) {
            this.isQualityCheck = isQualityCheck;
            return this;
        }
        public String getIsQualityCheck() {
            return this.isQualityCheck;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setObClid(String obClid) {
            this.obClid = obClid;
            return this;
        }
        public String getObClid() {
            return this.obClid;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setObClidType(String obClidType) {
            this.obClidType = obClidType;
            return this;
        }
        public String getObClidType() {
            return this.obClidType;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setObRecord(String obRecord) {
            this.obRecord = obRecord;
            return this;
        }
        public String getObRecord() {
            return this.obRecord;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setPower(String power) {
            this.power = power;
            return this;
        }
        public String getPower() {
            return this.power;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setWebrtcUrlType(String webrtcUrlType) {
            this.webrtcUrlType = webrtcUrlType;
            return this;
        }
        public String getWebrtcUrlType() {
            return this.webrtcUrlType;
        }

        public CloudQueryAgentResponseBodyDataAgentsAgent setWrapup(String wrapup) {
            this.wrapup = wrapup;
            return this;
        }
        public String getWrapup() {
            return this.wrapup;
        }

    }

    public static class CloudQueryAgentResponseBodyDataAgentsQueueList extends TeaModel {
        /**
         * <p>位置播报 0关闭 1大于announce_position_param时播放 2小于等于announce_position_param时播放</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>4</p>
         */
        @NameInMap("AnnouncePositionParam")
        public Long announcePositionParam;

        /**
         * <p>是否播报\&quot;您是下一位\&quot;,0关闭，1开启</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnouncePositionYouarenext")
        public Long announcePositionYouarenext;

        /**
         * <p>播报固定语音 0关闭 1打开</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AnnounceSound")
        public Long announceSound;

        /**
         * <p>固定语音文件</p>
         * 
         * <strong>example:</strong>
         * <p>voice_filexxxxx</p>
         */
        @NameInMap("AnnounceSoundFile")
        public String announceSoundFile;

        /**
         * <p>播放固定语音周期，秒数</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
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
         * <p>queue_name</p>
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
         * <p>76</p>
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
         * <p>class1</p>
         */
        @NameInMap("MusicClass")
        public String musicClass;

        /**
         * <p>队列号</p>
         * 
         * <strong>example:</strong>
         * <p>322</p>
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
         * <p>20</p>
         */
        @NameInMap("Retry")
        public Long retry;

        /**
         * <p>语音报号，true:播报，false:不播报</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SayAgentno")
        public Boolean sayAgentno;

        /**
         * <p>服务水平秒数，低于此时间内接听的认为是高服务水平</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
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
         * <p>1</p>
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

        public static CloudQueryAgentResponseBodyDataAgentsQueueList build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentResponseBodyDataAgentsQueueList self = new CloudQueryAgentResponseBodyDataAgentsQueueList();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setAnnouncePosition(Long announcePosition) {
            this.announcePosition = announcePosition;
            return this;
        }
        public Long getAnnouncePosition() {
            return this.announcePosition;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setAnnouncePositionFrequency(Long announcePositionFrequency) {
            this.announcePositionFrequency = announcePositionFrequency;
            return this;
        }
        public Long getAnnouncePositionFrequency() {
            return this.announcePositionFrequency;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setAnnouncePositionParam(Long announcePositionParam) {
            this.announcePositionParam = announcePositionParam;
            return this;
        }
        public Long getAnnouncePositionParam() {
            return this.announcePositionParam;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setAnnouncePositionYouarenext(Long announcePositionYouarenext) {
            this.announcePositionYouarenext = announcePositionYouarenext;
            return this;
        }
        public Long getAnnouncePositionYouarenext() {
            return this.announcePositionYouarenext;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setAnnounceSound(Long announceSound) {
            this.announceSound = announceSound;
            return this;
        }
        public Long getAnnounceSound() {
            return this.announceSound;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setAnnounceSoundFile(String announceSoundFile) {
            this.announceSoundFile = announceSoundFile;
            return this;
        }
        public String getAnnounceSoundFile() {
            return this.announceSoundFile;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setAnnounceSoundFrequency(Long announceSoundFrequency) {
            this.announceSoundFrequency = announceSoundFrequency;
            return this;
        }
        public Long getAnnounceSoundFrequency() {
            return this.announceSoundFrequency;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setJoinEmpty(Long joinEmpty) {
            this.joinEmpty = joinEmpty;
            return this;
        }
        public Long getJoinEmpty() {
            return this.joinEmpty;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setMaxLen(Long maxLen) {
            this.maxLen = maxLen;
            return this;
        }
        public Long getMaxLen() {
            return this.maxLen;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setMemberTimeout(Long memberTimeout) {
            this.memberTimeout = memberTimeout;
            return this;
        }
        public Long getMemberTimeout() {
            return this.memberTimeout;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setMusicClass(String musicClass) {
            this.musicClass = musicClass;
            return this;
        }
        public String getMusicClass() {
            return this.musicClass;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setQno(String qno) {
            this.qno = qno;
            return this;
        }
        public String getQno() {
            return this.qno;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setQueueTimeout(Long queueTimeout) {
            this.queueTimeout = queueTimeout;
            return this;
        }
        public Long getQueueTimeout() {
            return this.queueTimeout;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setRetry(Long retry) {
            this.retry = retry;
            return this;
        }
        public Long getRetry() {
            return this.retry;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setSayAgentno(Boolean sayAgentno) {
            this.sayAgentno = sayAgentno;
            return this;
        }
        public Boolean getSayAgentno() {
            return this.sayAgentno;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setServiceLevel(Long serviceLevel) {
            this.serviceLevel = serviceLevel;
            return this;
        }
        public Long getServiceLevel() {
            return this.serviceLevel;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setStrategy(String strategy) {
            this.strategy = strategy;
            return this;
        }
        public String getStrategy() {
            return this.strategy;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setVipSupport(Long vipSupport) {
            this.vipSupport = vipSupport;
            return this;
        }
        public Long getVipSupport() {
            return this.vipSupport;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setWeight(Long weight) {
            this.weight = weight;
            return this;
        }
        public Long getWeight() {
            return this.weight;
        }

        public CloudQueryAgentResponseBodyDataAgentsQueueList setWrapupTime(Long wrapupTime) {
            this.wrapupTime = wrapupTime;
            return this;
        }
        public Long getWrapupTime() {
            return this.wrapupTime;
        }

    }

    public static class CloudQueryAgentResponseBodyDataAgents extends TeaModel {
        /**
         * <p>座席信息</p>
         */
        @NameInMap("Agent")
        public CloudQueryAgentResponseBodyDataAgentsAgent agent;

        /**
         * <p>座席所属队列信息</p>
         */
        @NameInMap("QueueList")
        public java.util.List<CloudQueryAgentResponseBodyDataAgentsQueueList> queueList;

        public static CloudQueryAgentResponseBodyDataAgents build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentResponseBodyDataAgents self = new CloudQueryAgentResponseBodyDataAgents();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentResponseBodyDataAgents setAgent(CloudQueryAgentResponseBodyDataAgentsAgent agent) {
            this.agent = agent;
            return this;
        }
        public CloudQueryAgentResponseBodyDataAgentsAgent getAgent() {
            return this.agent;
        }

        public CloudQueryAgentResponseBodyDataAgents setQueueList(java.util.List<CloudQueryAgentResponseBodyDataAgentsQueueList> queueList) {
            this.queueList = queueList;
            return this;
        }
        public java.util.List<CloudQueryAgentResponseBodyDataAgentsQueueList> getQueueList() {
            return this.queueList;
        }

    }

    public static class CloudQueryAgentResponseBodyData extends TeaModel {
        /**
         * <p>座席列表数组</p>
         */
        @NameInMap("Agents")
        public java.util.List<CloudQueryAgentResponseBodyDataAgents> agents;

        /**
         * <p>总数</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Total")
        public Long total;

        public static CloudQueryAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudQueryAgentResponseBodyData self = new CloudQueryAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudQueryAgentResponseBodyData setAgents(java.util.List<CloudQueryAgentResponseBodyDataAgents> agents) {
            this.agents = agents;
            return this;
        }
        public java.util.List<CloudQueryAgentResponseBodyDataAgents> getAgents() {
            return this.agents;
        }

        public CloudQueryAgentResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
