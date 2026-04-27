// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudUpdateAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudUpdateAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudUpdateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudUpdateAgentResponseBody self = new CloudUpdateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudUpdateAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudUpdateAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudUpdateAgentResponseBody setData(CloudUpdateAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudUpdateAgentResponseBodyData getData() {
        return this.data;
    }

    public CloudUpdateAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudUpdateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudUpdateAgentResponseBodyDataAgent extends TeaModel {
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
         * <p>22223333</p>
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
         * <p>1</p>
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
         * <p>100012</p>
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
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>22223333</p>
         */
        @NameInMap("ObClid")
        public String obClid;

        /**
         * <p>外显规则属性，JSON格式</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;isMatchCapital&quot;:0,&quot;areaCodeRule&quot;:1}</p>
         */
        @NameInMap("ObClidProperty")
        public String obClidProperty;

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
         * <p>0</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>webrtc软电话返回地址，0：企业默认 1：公网域名 2：专线域名 3：公网IP 4：专线IP</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WebrtcUrlType")
        public String webrtcUrlType;

        /**
         * <p>整理时间，秒数，默认10秒</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Wrapup")
        public String wrapup;

        public static CloudUpdateAgentResponseBodyDataAgent build(java.util.Map<String, ?> map) throws Exception {
            CloudUpdateAgentResponseBodyDataAgent self = new CloudUpdateAgentResponseBodyDataAgent();
            return TeaModel.build(map, self);
        }

        public CloudUpdateAgentResponseBodyDataAgent setActive(String active) {
            this.active = active;
            return this;
        }
        public String getActive() {
            return this.active;
        }

        public CloudUpdateAgentResponseBodyDataAgent setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public CloudUpdateAgentResponseBodyDataAgent setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public CloudUpdateAgentResponseBodyDataAgent setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public CloudUpdateAgentResponseBodyDataAgent setBindTelType(String bindTelType) {
            this.bindTelType = bindTelType;
            return this;
        }
        public String getBindTelType() {
            return this.bindTelType;
        }

        public CloudUpdateAgentResponseBodyDataAgent setCallPower(String callPower) {
            this.callPower = callPower;
            return this;
        }
        public String getCallPower() {
            return this.callPower;
        }

        public CloudUpdateAgentResponseBodyDataAgent setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudUpdateAgentResponseBodyDataAgent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudUpdateAgentResponseBodyDataAgent setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudUpdateAgentResponseBodyDataAgent setIbRecord(String ibRecord) {
            this.ibRecord = ibRecord;
            return this;
        }
        public String getIbRecord() {
            return this.ibRecord;
        }

        public CloudUpdateAgentResponseBodyDataAgent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudUpdateAgentResponseBodyDataAgent setIsAsr(String isAsr) {
            this.isAsr = isAsr;
            return this;
        }
        public String getIsAsr() {
            return this.isAsr;
        }

        public CloudUpdateAgentResponseBodyDataAgent setIsOb(String isOb) {
            this.isOb = isOb;
            return this;
        }
        public String getIsOb() {
            return this.isOb;
        }

        public CloudUpdateAgentResponseBodyDataAgent setIsQualityCheck(String isQualityCheck) {
            this.isQualityCheck = isQualityCheck;
            return this;
        }
        public String getIsQualityCheck() {
            return this.isQualityCheck;
        }

        public CloudUpdateAgentResponseBodyDataAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudUpdateAgentResponseBodyDataAgent setObClid(String obClid) {
            this.obClid = obClid;
            return this;
        }
        public String getObClid() {
            return this.obClid;
        }

        public CloudUpdateAgentResponseBodyDataAgent setObClidProperty(String obClidProperty) {
            this.obClidProperty = obClidProperty;
            return this;
        }
        public String getObClidProperty() {
            return this.obClidProperty;
        }

        public CloudUpdateAgentResponseBodyDataAgent setObClidType(String obClidType) {
            this.obClidType = obClidType;
            return this;
        }
        public String getObClidType() {
            return this.obClidType;
        }

        public CloudUpdateAgentResponseBodyDataAgent setObRecord(String obRecord) {
            this.obRecord = obRecord;
            return this;
        }
        public String getObRecord() {
            return this.obRecord;
        }

        public CloudUpdateAgentResponseBodyDataAgent setPower(String power) {
            this.power = power;
            return this;
        }
        public String getPower() {
            return this.power;
        }

        public CloudUpdateAgentResponseBodyDataAgent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudUpdateAgentResponseBodyDataAgent setWebrtcUrlType(String webrtcUrlType) {
            this.webrtcUrlType = webrtcUrlType;
            return this;
        }
        public String getWebrtcUrlType() {
            return this.webrtcUrlType;
        }

        public CloudUpdateAgentResponseBodyDataAgent setWrapup(String wrapup) {
            this.wrapup = wrapup;
            return this;
        }
        public String getWrapup() {
            return this.wrapup;
        }

    }

    public static class CloudUpdateAgentResponseBodyDataAgentSkills extends TeaModel {
        /**
         * <p>座席id</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
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
         * <p>queueSkill关系表中id</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>skill的id</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("SkillId")
        public String skillId;

        /**
         * <p>技能值</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("SkillLevel")
        public String skillLevel;

        public static CloudUpdateAgentResponseBodyDataAgentSkills build(java.util.Map<String, ?> map) throws Exception {
            CloudUpdateAgentResponseBodyDataAgentSkills self = new CloudUpdateAgentResponseBodyDataAgentSkills();
            return TeaModel.build(map, self);
        }

        public CloudUpdateAgentResponseBodyDataAgentSkills setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CloudUpdateAgentResponseBodyDataAgentSkills setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudUpdateAgentResponseBodyDataAgentSkills setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudUpdateAgentResponseBodyDataAgentSkills setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudUpdateAgentResponseBodyDataAgentSkills setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudUpdateAgentResponseBodyDataAgentSkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public CloudUpdateAgentResponseBodyDataAgentSkills setSkillLevel(String skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public String getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class CloudUpdateAgentResponseBodyData extends TeaModel {
        /**
         * <p>座席配置信息</p>
         */
        @NameInMap("Agent")
        public CloudUpdateAgentResponseBodyDataAgent agent;

        /**
         * <p>座席所需技能数组</p>
         */
        @NameInMap("AgentSkills")
        public java.util.List<CloudUpdateAgentResponseBodyDataAgentSkills> agentSkills;

        public static CloudUpdateAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudUpdateAgentResponseBodyData self = new CloudUpdateAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudUpdateAgentResponseBodyData setAgent(CloudUpdateAgentResponseBodyDataAgent agent) {
            this.agent = agent;
            return this;
        }
        public CloudUpdateAgentResponseBodyDataAgent getAgent() {
            return this.agent;
        }

        public CloudUpdateAgentResponseBodyData setAgentSkills(java.util.List<CloudUpdateAgentResponseBodyDataAgentSkills> agentSkills) {
            this.agentSkills = agentSkills;
            return this;
        }
        public java.util.List<CloudUpdateAgentResponseBodyDataAgentSkills> getAgentSkills() {
            return this.agentSkills;
        }

    }

}
