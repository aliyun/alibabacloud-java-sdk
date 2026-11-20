// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetXDefaultConfigResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code. Valid values:</p>
     * <ul>
     * <li><p>0000: Success.</p>
     * </li>
     * <li><p>Other values: Failure.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The default configurations of the work number.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CallAbility&quot;:&quot;0&quot;,&quot;GNFlag&quot;:&quot;00&quot;,&quot;SmsAbility&quot;:&quot;0&quot;,&quot;SmsSignMode&quot;:&quot;0&quot;}</p>
     */
    @NameInMap("Data")
    public GetXDefaultConfigResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li><p>true: The request is successful.</p>
     * </li>
     * <li><p>false: The request fails.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetXDefaultConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetXDefaultConfigResponseBody self = new GetXDefaultConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetXDefaultConfigResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetXDefaultConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetXDefaultConfigResponseBody setData(GetXDefaultConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetXDefaultConfigResponseBodyData getData() {
        return this.data;
    }

    public GetXDefaultConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetXDefaultConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetXDefaultConfigResponseBodyDataReachJson extends TeaModel {
        /**
         * <p>The call direction. Valid values: 1: Employee B calls Customer A. 2: Customer A calls Employee B.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallDir")
        public String callDir;

        /**
         * <p>The call status. Valid values: 1: ringing. 2: before connection. 3: after connection. 4: call ended. 5: connected. 6: not connected.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallStatus")
        public String callStatus;

        /**
         * <p>The receive direction. Valid values: 1: caller. 2: callee.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReceiveDir")
        public String receiveDir;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>345</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise business card - SMS rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule type. Valid values: 1: enterprise business card - SMS. 2: enterprise business card - flash SMS. 3: enterprise business card - video. 4: enterprise business card - audio.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("TempId")
        public String tempId;

        public static GetXDefaultConfigResponseBodyDataReachJson build(java.util.Map<String, ?> map) throws Exception {
            GetXDefaultConfigResponseBodyDataReachJson self = new GetXDefaultConfigResponseBodyDataReachJson();
            return TeaModel.build(map, self);
        }

        public GetXDefaultConfigResponseBodyDataReachJson setCallDir(String callDir) {
            this.callDir = callDir;
            return this;
        }
        public String getCallDir() {
            return this.callDir;
        }

        public GetXDefaultConfigResponseBodyDataReachJson setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public GetXDefaultConfigResponseBodyDataReachJson setReceiveDir(String receiveDir) {
            this.receiveDir = receiveDir;
            return this;
        }
        public String getReceiveDir() {
            return this.receiveDir;
        }

        public GetXDefaultConfigResponseBodyDataReachJson setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public GetXDefaultConfigResponseBodyDataReachJson setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetXDefaultConfigResponseBodyDataReachJson setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetXDefaultConfigResponseBodyDataReachJson setTempId(String tempId) {
            this.tempId = tempId;
            return this;
        }
        public String getTempId() {
            return this.tempId;
        }

    }

    public static class GetXDefaultConfigResponseBodyDataSequenceCall extends TeaModel {
        /**
         * <p>The play code for the sequential ringing prompt tone. The format is the same as callNoPlayCode.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        @NameInMap("SequenceCallNoPlayCode")
        public String sequenceCallNoPlayCode;

        /**
         * <p>The callee number for sequential ringing.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value sample value sample value</p>
         */
        @NameInMap("SequenceCalledNo")
        public String sequenceCalledNo;

        /**
         * <p>The play code for the caller and callee after the call is connected. The format is the same as calledPlayCode.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value sample value sample value</p>
         */
        @NameInMap("SequenceCalledPlayCode")
        public String sequenceCalledPlayCode;

        public static GetXDefaultConfigResponseBodyDataSequenceCall build(java.util.Map<String, ?> map) throws Exception {
            GetXDefaultConfigResponseBodyDataSequenceCall self = new GetXDefaultConfigResponseBodyDataSequenceCall();
            return TeaModel.build(map, self);
        }

        public GetXDefaultConfigResponseBodyDataSequenceCall setSequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
            this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
            return this;
        }
        public String getSequenceCallNoPlayCode() {
            return this.sequenceCallNoPlayCode;
        }

        public GetXDefaultConfigResponseBodyDataSequenceCall setSequenceCalledNo(String sequenceCalledNo) {
            this.sequenceCalledNo = sequenceCalledNo;
            return this;
        }
        public String getSequenceCalledNo() {
            return this.sequenceCalledNo;
        }

        public GetXDefaultConfigResponseBodyDataSequenceCall setSequenceCalledPlayCode(String sequenceCalledPlayCode) {
            this.sequenceCalledPlayCode = sequenceCalledPlayCode;
            return this;
        }
        public String getSequenceCalledPlayCode() {
            return this.sequenceCalledPlayCode;
        }

    }

    public static class GetXDefaultConfigResponseBodyData extends TeaModel {
        /**
         * <p>The status of the call capability. Valid values: 0: disabled. 1: enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallAbility")
        public String callAbility;

        /**
         * <p>Specifies whether to pass through the caller ID to display the real caller. Valid values: 00: non-passthrough. The work number is displayed when calls are made to each other. 10: passthrough. When Customer A is the caller, the caller ID displayed to Employee B is the number of Customer A. When Employee B is the caller, the caller ID displayed to Customer A is the work number. Default value: 00.</p>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("GNFlag")
        public String GNFlag;

        /**
         * <p>The enterprise business card rule control parameters.</p>
         */
        @NameInMap("ReachJson")
        public java.util.List<GetXDefaultConfigResponseBodyDataReachJson> reachJson;

        /**
         * <p>The sequential ringing control parameters.</p>
         */
        @NameInMap("SequenceCall")
        public java.util.List<GetXDefaultConfigResponseBodyDataSequenceCall> sequenceCall;

        /**
         * <p>The end time of sequential ringing. Format: HH:mm:ss, such as 18:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("SequenceEndTime")
        public String sequenceEndTime;

        /**
         * <p>The start time of sequential ringing. Format: HH:mm:ss, such as 09:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("SequenceStartTime")
        public String sequenceStartTime;

        /**
         * <p>The status of the SMS feature. Valid values: 0: disabled. 1: enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsAbility")
        public String smsAbility;

        /**
         * <p>Specifies whether to pass through the caller ID to display the real caller. Valid values: 00: non-passthrough. The work number is displayed when calls are made to each other. 10: passthrough. When Customer A is the caller, the caller ID displayed to Employee B is the number of Customer A. When Employee B is the caller, the caller ID displayed to Customer A is the work number. Default value: 00.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsSignMode")
        public String smsSignMode;

        public static GetXDefaultConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetXDefaultConfigResponseBodyData self = new GetXDefaultConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetXDefaultConfigResponseBodyData setCallAbility(String callAbility) {
            this.callAbility = callAbility;
            return this;
        }
        public String getCallAbility() {
            return this.callAbility;
        }

        public GetXDefaultConfigResponseBodyData setGNFlag(String GNFlag) {
            this.GNFlag = GNFlag;
            return this;
        }
        public String getGNFlag() {
            return this.GNFlag;
        }

        public GetXDefaultConfigResponseBodyData setReachJson(java.util.List<GetXDefaultConfigResponseBodyDataReachJson> reachJson) {
            this.reachJson = reachJson;
            return this;
        }
        public java.util.List<GetXDefaultConfigResponseBodyDataReachJson> getReachJson() {
            return this.reachJson;
        }

        public GetXDefaultConfigResponseBodyData setSequenceCall(java.util.List<GetXDefaultConfigResponseBodyDataSequenceCall> sequenceCall) {
            this.sequenceCall = sequenceCall;
            return this;
        }
        public java.util.List<GetXDefaultConfigResponseBodyDataSequenceCall> getSequenceCall() {
            return this.sequenceCall;
        }

        public GetXDefaultConfigResponseBodyData setSequenceEndTime(String sequenceEndTime) {
            this.sequenceEndTime = sequenceEndTime;
            return this;
        }
        public String getSequenceEndTime() {
            return this.sequenceEndTime;
        }

        public GetXDefaultConfigResponseBodyData setSequenceStartTime(String sequenceStartTime) {
            this.sequenceStartTime = sequenceStartTime;
            return this;
        }
        public String getSequenceStartTime() {
            return this.sequenceStartTime;
        }

        public GetXDefaultConfigResponseBodyData setSmsAbility(String smsAbility) {
            this.smsAbility = smsAbility;
            return this;
        }
        public String getSmsAbility() {
            return this.smsAbility;
        }

        public GetXDefaultConfigResponseBodyData setSmsSignMode(String smsSignMode) {
            this.smsSignMode = smsSignMode;
            return this;
        }
        public String getSmsSignMode() {
            return this.smsSignMode;
        }

    }

}
