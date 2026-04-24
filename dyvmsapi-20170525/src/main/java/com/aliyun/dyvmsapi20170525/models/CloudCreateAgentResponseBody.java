// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudCreateAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudCreateAgentResponseBodyData data;

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

    public static CloudCreateAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudCreateAgentResponseBody self = new CloudCreateAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudCreateAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudCreateAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudCreateAgentResponseBody setData(CloudCreateAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudCreateAgentResponseBodyData getData() {
        return this.data;
    }

    public CloudCreateAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudCreateAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudCreateAgentResponseBodyDataAgent extends TeaModel {
        /**
         * <p>是否启用，0：停用，1：启用，默认启用</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public String active;

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
         * <p>2222333</p>
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
         * <p>2026-01-30 08:00:00</p>
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
         * <p>355</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>是否开启ASR转写：0：不开启，1：开启，默认不开启</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>示例值</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>外显号码</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        @NameInMap("ObClid")
        public String obClid;

        /**
         * <p>外显规则属性，JSON格式</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;isMatchCapital&quot;:0,&quot;areaCodeRule&quot;:1,&quot;isRandom&quot;:1}</p>
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
         * <p>0</p>
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

        public static CloudCreateAgentResponseBodyDataAgent build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateAgentResponseBodyDataAgent self = new CloudCreateAgentResponseBodyDataAgent();
            return TeaModel.build(map, self);
        }

        public CloudCreateAgentResponseBodyDataAgent setActive(String active) {
            this.active = active;
            return this;
        }
        public String getActive() {
            return this.active;
        }

        public CloudCreateAgentResponseBodyDataAgent setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public CloudCreateAgentResponseBodyDataAgent setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public CloudCreateAgentResponseBodyDataAgent setBindTelType(String bindTelType) {
            this.bindTelType = bindTelType;
            return this;
        }
        public String getBindTelType() {
            return this.bindTelType;
        }

        public CloudCreateAgentResponseBodyDataAgent setCallPower(String callPower) {
            this.callPower = callPower;
            return this;
        }
        public String getCallPower() {
            return this.callPower;
        }

        public CloudCreateAgentResponseBodyDataAgent setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudCreateAgentResponseBodyDataAgent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateAgentResponseBodyDataAgent setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateAgentResponseBodyDataAgent setIbRecord(String ibRecord) {
            this.ibRecord = ibRecord;
            return this;
        }
        public String getIbRecord() {
            return this.ibRecord;
        }

        public CloudCreateAgentResponseBodyDataAgent setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudCreateAgentResponseBodyDataAgent setIsAsr(String isAsr) {
            this.isAsr = isAsr;
            return this;
        }
        public String getIsAsr() {
            return this.isAsr;
        }

        public CloudCreateAgentResponseBodyDataAgent setIsOb(String isOb) {
            this.isOb = isOb;
            return this;
        }
        public String getIsOb() {
            return this.isOb;
        }

        public CloudCreateAgentResponseBodyDataAgent setIsQualityCheck(String isQualityCheck) {
            this.isQualityCheck = isQualityCheck;
            return this;
        }
        public String getIsQualityCheck() {
            return this.isQualityCheck;
        }

        public CloudCreateAgentResponseBodyDataAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudCreateAgentResponseBodyDataAgent setObClid(String obClid) {
            this.obClid = obClid;
            return this;
        }
        public String getObClid() {
            return this.obClid;
        }

        public CloudCreateAgentResponseBodyDataAgent setObClidProperty(String obClidProperty) {
            this.obClidProperty = obClidProperty;
            return this;
        }
        public String getObClidProperty() {
            return this.obClidProperty;
        }

        public CloudCreateAgentResponseBodyDataAgent setObClidType(String obClidType) {
            this.obClidType = obClidType;
            return this;
        }
        public String getObClidType() {
            return this.obClidType;
        }

        public CloudCreateAgentResponseBodyDataAgent setObRecord(String obRecord) {
            this.obRecord = obRecord;
            return this;
        }
        public String getObRecord() {
            return this.obRecord;
        }

        public CloudCreateAgentResponseBodyDataAgent setPower(String power) {
            this.power = power;
            return this;
        }
        public String getPower() {
            return this.power;
        }

        public CloudCreateAgentResponseBodyDataAgent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CloudCreateAgentResponseBodyDataAgent setWebrtcUrlType(String webrtcUrlType) {
            this.webrtcUrlType = webrtcUrlType;
            return this;
        }
        public String getWebrtcUrlType() {
            return this.webrtcUrlType;
        }

        public CloudCreateAgentResponseBodyDataAgent setWrapup(String wrapup) {
            this.wrapup = wrapup;
            return this;
        }
        public String getWrapup() {
            return this.wrapup;
        }

    }

    public static class CloudCreateAgentResponseBodyDataAgentSkills extends TeaModel {
        /**
         * <p>座席id</p>
         * 
         * <strong>example:</strong>
         * <p>2333</p>
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
         * <p>2026-01-30 08:00:00</p>
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
         * <p>355</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>skill的id</p>
         * 
         * <strong>example:</strong>
         * <p>233</p>
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

        public static CloudCreateAgentResponseBodyDataAgentSkills build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateAgentResponseBodyDataAgentSkills self = new CloudCreateAgentResponseBodyDataAgentSkills();
            return TeaModel.build(map, self);
        }

        public CloudCreateAgentResponseBodyDataAgentSkills setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public CloudCreateAgentResponseBodyDataAgentSkills setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudCreateAgentResponseBodyDataAgentSkills setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudCreateAgentResponseBodyDataAgentSkills setEnterpriseId(String enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudCreateAgentResponseBodyDataAgentSkills setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CloudCreateAgentResponseBodyDataAgentSkills setSkillId(String skillId) {
            this.skillId = skillId;
            return this;
        }
        public String getSkillId() {
            return this.skillId;
        }

        public CloudCreateAgentResponseBodyDataAgentSkills setSkillLevel(String skillLevel) {
            this.skillLevel = skillLevel;
            return this;
        }
        public String getSkillLevel() {
            return this.skillLevel;
        }

    }

    public static class CloudCreateAgentResponseBodyData extends TeaModel {
        /**
         * <p>座席配置信息</p>
         */
        @NameInMap("Agent")
        public CloudCreateAgentResponseBodyDataAgent agent;

        /**
         * <p>座席所需技能数组</p>
         */
        @NameInMap("AgentSkills")
        public java.util.List<CloudCreateAgentResponseBodyDataAgentSkills> agentSkills;

        public static CloudCreateAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudCreateAgentResponseBodyData self = new CloudCreateAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudCreateAgentResponseBodyData setAgent(CloudCreateAgentResponseBodyDataAgent agent) {
            this.agent = agent;
            return this;
        }
        public CloudCreateAgentResponseBodyDataAgent getAgent() {
            return this.agent;
        }

        public CloudCreateAgentResponseBodyData setAgentSkills(java.util.List<CloudCreateAgentResponseBodyDataAgentSkills> agentSkills) {
            this.agentSkills = agentSkills;
            return this;
        }
        public java.util.List<CloudCreateAgentResponseBodyDataAgentSkills> getAgentSkills() {
            return this.agentSkills;
        }

    }

}
