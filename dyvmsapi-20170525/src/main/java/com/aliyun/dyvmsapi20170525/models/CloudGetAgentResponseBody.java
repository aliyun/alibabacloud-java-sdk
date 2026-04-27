// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAgentResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CloudGetAgentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>53D0F0Fe-cbbB-De28-6FCd-DdbBcefA46dD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CloudGetAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAgentResponseBody self = new CloudGetAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public CloudGetAgentResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CloudGetAgentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CloudGetAgentResponseBody setData(CloudGetAgentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CloudGetAgentResponseBodyData getData() {
        return this.data;
    }

    public CloudGetAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CloudGetAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CloudGetAgentResponseBodyDataAgent extends TeaModel {
        /**
         * <p>是否启用，0：停用，1：启用，默认启用</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Active")
        public Long active;

        /**
         * <p>座席类型，1：电话座席，2：电脑座席，默认电话座席</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AgentType")
        public Long agentType;

        /**
         * <p>区号格式</p>
         * 
         * <strong>example:</strong>
         * <p>010</p>
         */
        @NameInMap("AreaCode")
        public String areaCode;

        /**
         * <p>允许语音识别的通话类型，1:呼入 4：预览外呼 9：主叫外呼 5：预测外呼 2：webcall</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AsrCallType")
        public String asrCallType;

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
        public Long bindTelType;

        /**
         * <p>呼叫权限，0：无限制，1：国内长途，2：国内本市，3：内部呼叫，默认无限制</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallPower")
        public Long callPower;

        /**
         * <p>座席工号</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("Cno")
        public String cno;

        /**
         * <p>备注</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Comment")
        public String comment;

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
         * <p>呼入是否录音，0：不录用，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IbRecord")
        public Long ibRecord;

        /**
         * <p>座席id</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>是否开启ASR转写：0：不开启，1：开启，默认不开启</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAsr")
        public Long isAsr;

        /**
         * <p>是否允许axb外呼，默认1开启 0关闭</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsAxbCall")
        public String isAxbCall;

        /**
         * <p>是否允许外呼，0：不允许，1：可以，默认允许</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsOb")
        public Long isOb;

        /**
         * <p>外呼主叫记忆 1：开启 0：关闭</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsObRemember")
        public String isObRemember;

        /**
         * <p>坐席最后一次登陆的时间</p>
         * 
         * <strong>example:</strong>
         * <p>1774821736</p>
         */
        @NameInMap("LoginTime")
        public String loginTime;

        /**
         * <p>座席axb外呼是否使用mrcp方式推送语音流配置JSON Str格式数据</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("MrcpProperty")
        public String mrcpProperty;

        /**
         * <p>座席姓名</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
        public Long obClidType;

        /**
         * <p>外呼是否录音，0：不录音，1：录音，默认录音</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ObRecord")
        public Long obRecord;

        /**
         * <p>可外呼时间段用,号分割</p>
         * 
         * <strong>example:</strong>
         * <p>08:00,20:00</p>
         */
        @NameInMap("PermitObPreviewTime")
        public String permitObPreviewTime;

        /**
         * <p>1：班长席，0：普通座席，默认普通座席</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Power")
        public Long power;

        /**
         * <p>座席主动挂机配置Json Str 格式数据 unLink 是否允许主动挂断, 0:关, 1:开，prohibitDuration禁止时长</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Property")
        public String property;

        /**
         * <p>坐席所属队列</p>
         */
        @NameInMap("QueueList")
        public java.util.List<String> queueList;

        /**
         * <p>座席状态，0:离线，1：在线</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <p>更新时间，格式: yyyy-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2026-04-20 10:00:00</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

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
         * <p>20</p>
         */
        @NameInMap("Wrapup")
        public Long wrapup;

        public static CloudGetAgentResponseBodyDataAgent build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAgentResponseBodyDataAgent self = new CloudGetAgentResponseBodyDataAgent();
            return TeaModel.build(map, self);
        }

        public CloudGetAgentResponseBodyDataAgent setActive(Long active) {
            this.active = active;
            return this;
        }
        public Long getActive() {
            return this.active;
        }

        public CloudGetAgentResponseBodyDataAgent setAgentType(Long agentType) {
            this.agentType = agentType;
            return this;
        }
        public Long getAgentType() {
            return this.agentType;
        }

        public CloudGetAgentResponseBodyDataAgent setAreaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }
        public String getAreaCode() {
            return this.areaCode;
        }

        public CloudGetAgentResponseBodyDataAgent setAsrCallType(String asrCallType) {
            this.asrCallType = asrCallType;
            return this;
        }
        public String getAsrCallType() {
            return this.asrCallType;
        }

        public CloudGetAgentResponseBodyDataAgent setBindTel(String bindTel) {
            this.bindTel = bindTel;
            return this;
        }
        public String getBindTel() {
            return this.bindTel;
        }

        public CloudGetAgentResponseBodyDataAgent setBindTelType(Long bindTelType) {
            this.bindTelType = bindTelType;
            return this;
        }
        public Long getBindTelType() {
            return this.bindTelType;
        }

        public CloudGetAgentResponseBodyDataAgent setCallPower(Long callPower) {
            this.callPower = callPower;
            return this;
        }
        public Long getCallPower() {
            return this.callPower;
        }

        public CloudGetAgentResponseBodyDataAgent setCno(String cno) {
            this.cno = cno;
            return this;
        }
        public String getCno() {
            return this.cno;
        }

        public CloudGetAgentResponseBodyDataAgent setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public CloudGetAgentResponseBodyDataAgent setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CloudGetAgentResponseBodyDataAgent setEnterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }
        public Long getEnterpriseId() {
            return this.enterpriseId;
        }

        public CloudGetAgentResponseBodyDataAgent setIbRecord(Long ibRecord) {
            this.ibRecord = ibRecord;
            return this;
        }
        public Long getIbRecord() {
            return this.ibRecord;
        }

        public CloudGetAgentResponseBodyDataAgent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CloudGetAgentResponseBodyDataAgent setIsAsr(Long isAsr) {
            this.isAsr = isAsr;
            return this;
        }
        public Long getIsAsr() {
            return this.isAsr;
        }

        public CloudGetAgentResponseBodyDataAgent setIsAxbCall(String isAxbCall) {
            this.isAxbCall = isAxbCall;
            return this;
        }
        public String getIsAxbCall() {
            return this.isAxbCall;
        }

        public CloudGetAgentResponseBodyDataAgent setIsOb(Long isOb) {
            this.isOb = isOb;
            return this;
        }
        public Long getIsOb() {
            return this.isOb;
        }

        public CloudGetAgentResponseBodyDataAgent setIsObRemember(String isObRemember) {
            this.isObRemember = isObRemember;
            return this;
        }
        public String getIsObRemember() {
            return this.isObRemember;
        }

        public CloudGetAgentResponseBodyDataAgent setLoginTime(String loginTime) {
            this.loginTime = loginTime;
            return this;
        }
        public String getLoginTime() {
            return this.loginTime;
        }

        public CloudGetAgentResponseBodyDataAgent setMrcpProperty(String mrcpProperty) {
            this.mrcpProperty = mrcpProperty;
            return this;
        }
        public String getMrcpProperty() {
            return this.mrcpProperty;
        }

        public CloudGetAgentResponseBodyDataAgent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CloudGetAgentResponseBodyDataAgent setObClid(String obClid) {
            this.obClid = obClid;
            return this;
        }
        public String getObClid() {
            return this.obClid;
        }

        public CloudGetAgentResponseBodyDataAgent setObClidProperty(String obClidProperty) {
            this.obClidProperty = obClidProperty;
            return this;
        }
        public String getObClidProperty() {
            return this.obClidProperty;
        }

        public CloudGetAgentResponseBodyDataAgent setObClidType(Long obClidType) {
            this.obClidType = obClidType;
            return this;
        }
        public Long getObClidType() {
            return this.obClidType;
        }

        public CloudGetAgentResponseBodyDataAgent setObRecord(Long obRecord) {
            this.obRecord = obRecord;
            return this;
        }
        public Long getObRecord() {
            return this.obRecord;
        }

        public CloudGetAgentResponseBodyDataAgent setPermitObPreviewTime(String permitObPreviewTime) {
            this.permitObPreviewTime = permitObPreviewTime;
            return this;
        }
        public String getPermitObPreviewTime() {
            return this.permitObPreviewTime;
        }

        public CloudGetAgentResponseBodyDataAgent setPower(Long power) {
            this.power = power;
            return this;
        }
        public Long getPower() {
            return this.power;
        }

        public CloudGetAgentResponseBodyDataAgent setProperty(String property) {
            this.property = property;
            return this;
        }
        public String getProperty() {
            return this.property;
        }

        public CloudGetAgentResponseBodyDataAgent setQueueList(java.util.List<String> queueList) {
            this.queueList = queueList;
            return this;
        }
        public java.util.List<String> getQueueList() {
            return this.queueList;
        }

        public CloudGetAgentResponseBodyDataAgent setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public CloudGetAgentResponseBodyDataAgent setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public CloudGetAgentResponseBodyDataAgent setWebrtcUrlType(String webrtcUrlType) {
            this.webrtcUrlType = webrtcUrlType;
            return this;
        }
        public String getWebrtcUrlType() {
            return this.webrtcUrlType;
        }

        public CloudGetAgentResponseBodyDataAgent setWrapup(Long wrapup) {
            this.wrapup = wrapup;
            return this;
        }
        public Long getWrapup() {
            return this.wrapup;
        }

    }

    public static class CloudGetAgentResponseBodyData extends TeaModel {
        /**
         * <p>座席列表数组</p>
         */
        @NameInMap("Agent")
        public java.util.List<CloudGetAgentResponseBodyDataAgent> agent;

        public static CloudGetAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CloudGetAgentResponseBodyData self = new CloudGetAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CloudGetAgentResponseBodyData setAgent(java.util.List<CloudGetAgentResponseBodyDataAgent> agent) {
            this.agent = agent;
            return this;
        }
        public java.util.List<CloudGetAgentResponseBodyDataAgent> getAgent() {
            return this.agent;
        }

    }

}
