// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetXConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>返回状态码 0000表示成功 其他表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetXConfigResponseBodyData data;

    /**
     * <p>返回信息</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>返回是否成功 true  表示成功 false表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetXConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetXConfigResponseBody self = new GetXConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetXConfigResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetXConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetXConfigResponseBody setData(GetXConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetXConfigResponseBodyData getData() {
        return this.data;
    }

    public GetXConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetXConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetXConfigResponseBodyDataReachJsons extends TeaModel {
        /**
         * <p>呼叫方向 1:员工B呼叫客户A 2:客户A呼叫员工B</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallDir")
        public String callDir;

        /**
         * <p>通话状态 1:通话振铃 2:接通前 3:接通后 4:通话结束 5:已接通6:未接通</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallStatus")
        public String callStatus;

        /**
         * <p>接收方向 1:主叫 2:被叫</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReceiveDir")
        public String receiveDir;

        /**
         * <p>规则ID</p>
         * 
         * <strong>example:</strong>
         * <p>345</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>规则名称</p>
         * 
         * <strong>example:</strong>
         * <p>企业名片-短信规则</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>规则类型： 1：企业名片-短信 2：企业名片-闪信 3：企业名片-视频 4：企业名片-音频</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>模板ID</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("TempId")
        public String tempId;

        public static GetXConfigResponseBodyDataReachJsons build(java.util.Map<String, ?> map) throws Exception {
            GetXConfigResponseBodyDataReachJsons self = new GetXConfigResponseBodyDataReachJsons();
            return TeaModel.build(map, self);
        }

        public GetXConfigResponseBodyDataReachJsons setCallDir(String callDir) {
            this.callDir = callDir;
            return this;
        }
        public String getCallDir() {
            return this.callDir;
        }

        public GetXConfigResponseBodyDataReachJsons setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public GetXConfigResponseBodyDataReachJsons setReceiveDir(String receiveDir) {
            this.receiveDir = receiveDir;
            return this;
        }
        public String getReceiveDir() {
            return this.receiveDir;
        }

        public GetXConfigResponseBodyDataReachJsons setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetXConfigResponseBodyDataReachJsons setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetXConfigResponseBodyDataReachJsons setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetXConfigResponseBodyDataReachJsons setTempId(String tempId) {
            this.tempId = tempId;
            return this;
        }
        public String getTempId() {
            return this.tempId;
        }

    }

    public static class GetXConfigResponseBodyDataSequenceCalls extends TeaModel {
        /**
         * <p>顺振提示音放音编号，格式如callNoPlayCode</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("SequenceCallNoPlayCode")
        public String sequenceCallNoPlayCode;

        /**
         * <p>顺振被叫号码</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("SequenceCalledNo")
        public String sequenceCalledNo;

        /**
         * <p>接通后主被叫放音编号，格式如calledPlayCode</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("SequenceCalledPlayCode")
        public String sequenceCalledPlayCode;

        public static GetXConfigResponseBodyDataSequenceCalls build(java.util.Map<String, ?> map) throws Exception {
            GetXConfigResponseBodyDataSequenceCalls self = new GetXConfigResponseBodyDataSequenceCalls();
            return TeaModel.build(map, self);
        }

        public GetXConfigResponseBodyDataSequenceCalls setSequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
            this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
            return this;
        }
        public String getSequenceCallNoPlayCode() {
            return this.sequenceCallNoPlayCode;
        }

        public GetXConfigResponseBodyDataSequenceCalls setSequenceCalledNo(String sequenceCalledNo) {
            this.sequenceCalledNo = sequenceCalledNo;
            return this;
        }
        public String getSequenceCalledNo() {
            return this.sequenceCalledNo;
        }

        public GetXConfigResponseBodyDataSequenceCalls setSequenceCalledPlayCode(String sequenceCalledPlayCode) {
            this.sequenceCalledPlayCode = sequenceCalledPlayCode;
            return this;
        }
        public String getSequenceCalledPlayCode() {
            return this.sequenceCalledPlayCode;
        }

    }

    public static class GetXConfigResponseBodyData extends TeaModel {
        /**
         * <p>开/关呼叫能力状态： ‘0’：禁用； ‘1’：开启；</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallAbility")
        public String callAbility;

        /**
         * <p>是否透传来显为真实主叫： 00-非透传：互相拨打时都显示工作号; 10-透传：A客户为主叫时,B员工的来显为客户A号码;B员工为主叫时,A客户的来显为工作号; 默认为 00</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("GNFlag")
        public String GNFlag;

        /**
         * <p>企业名片规则控制参数</p>
         */
        @NameInMap("ReachJsons")
        public java.util.List<GetXConfigResponseBodyDataReachJsons> reachJsons;

        /**
         * <p>顺振控制参数</p>
         */
        @NameInMap("SequenceCalls")
        public java.util.List<GetXConfigResponseBodyDataSequenceCalls> sequenceCalls;

        /**
         * <p>顺振结束时间 格式：HH:mm:ss 18:00:00</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("SequenceEndTime")
        public String sequenceEndTime;

        /**
         * <p>顺振开启时间 格式：HH:mm:ss 09:00:00</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("SequenceStartTime")
        public String sequenceStartTime;

        /**
         * <p>开/关短信功能状态： ‘0’：禁用； ‘1’：开启；</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsAbility")
        public String smsAbility;

        /**
         * <p>是否透传来显为真实主叫： 00-非透传：互相拨打时都显示工作号; 10-透传：A客户为主叫时,B员工的来显为客户A号码;B员工为主叫时,A客户的来显为工作号; 默认为 00</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsSignMode")
        public String smsSignMode;

        public static GetXConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetXConfigResponseBodyData self = new GetXConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetXConfigResponseBodyData setCallAbility(String callAbility) {
            this.callAbility = callAbility;
            return this;
        }
        public String getCallAbility() {
            return this.callAbility;
        }

        public GetXConfigResponseBodyData setGNFlag(String GNFlag) {
            this.GNFlag = GNFlag;
            return this;
        }
        public String getGNFlag() {
            return this.GNFlag;
        }

        public GetXConfigResponseBodyData setReachJsons(java.util.List<GetXConfigResponseBodyDataReachJsons> reachJsons) {
            this.reachJsons = reachJsons;
            return this;
        }
        public java.util.List<GetXConfigResponseBodyDataReachJsons> getReachJsons() {
            return this.reachJsons;
        }

        public GetXConfigResponseBodyData setSequenceCalls(java.util.List<GetXConfigResponseBodyDataSequenceCalls> sequenceCalls) {
            this.sequenceCalls = sequenceCalls;
            return this;
        }
        public java.util.List<GetXConfigResponseBodyDataSequenceCalls> getSequenceCalls() {
            return this.sequenceCalls;
        }

        public GetXConfigResponseBodyData setSequenceEndTime(String sequenceEndTime) {
            this.sequenceEndTime = sequenceEndTime;
            return this;
        }
        public String getSequenceEndTime() {
            return this.sequenceEndTime;
        }

        public GetXConfigResponseBodyData setSequenceStartTime(String sequenceStartTime) {
            this.sequenceStartTime = sequenceStartTime;
            return this;
        }
        public String getSequenceStartTime() {
            return this.sequenceStartTime;
        }

        public GetXConfigResponseBodyData setSmsAbility(String smsAbility) {
            this.smsAbility = smsAbility;
            return this;
        }
        public String getSmsAbility() {
            return this.smsAbility;
        }

        public GetXConfigResponseBodyData setSmsSignMode(String smsSignMode) {
            this.smsSignMode = smsSignMode;
            return this;
        }
        public String getSmsSignMode() {
            return this.smsSignMode;
        }

    }

}
