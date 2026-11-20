// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class GetXConfigResponseBody extends TeaModel {
    /**
     * <p>The details of the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response status code. Valid values:</p>
     * <ul>
     * <li>0000: Success.</li>
     * </ul>
     * <p>Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The configuration of the work number.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;CallAbility&quot;:&quot;0&quot;,&quot;GNFlag&quot;:&quot;00&quot;,&quot;SmsAbility&quot;:&quot;0&quot;,&quot;SmsSignMode&quot;:&quot;0&quot;}</p>
     */
    @NameInMap("Data")
    public GetXConfigResponseBodyData data;

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
     * <li><p>true: Success.</p>
     * </li>
     * <li><p>false: Failure.</p>
     * </li>
     * </ul>
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
         * <p>The call direction. Valid values:</p>
         * <ul>
         * <li>1: Employee B calls Customer A.</li>
         * <li>2: Customer A calls Employee B.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallDir")
        public String callDir;

        /**
         * <p>The call status. Valid values:</p>
         * <ul>
         * <li>1: Call ringing.</li>
         * <li>2: Before connection.</li>
         * <li>3: After connection.</li>
         * <li>4: Call ended.</li>
         * <li>5: Connected.</li>
         * <li>6: Not connected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CallStatus")
        public String callStatus;

        /**
         * <p>The receiving direction. Valid values:</p>
         * <ul>
         * <li>1: Caller.</li>
         * <li>2: Called party.</li>
         * </ul>
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
         * <p>Enterprise profile - SMS rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li>1: Enterprise profile - SMS.</li>
         * <li>2: Enterprise profile - Flash message.</li>
         * <li>3: Enterprise profile - Video.</li>
         * <li>4: Enterprise profile - Audio.</li>
         * </ul>
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
         * <p>The play ID of the prompt tone for sequence ringing. The format is the same as callNoPlayCode.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value sample value sample value</p>
         */
        @NameInMap("SequenceCallNoPlayCode")
        public String sequenceCallNoPlayCode;

        /**
         * <p>The called number for sequence ringing.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value sample value sample value</p>
         */
        @NameInMap("SequenceCalledNo")
        public String sequenceCalledNo;

        /**
         * <p>The play ID for the caller and called party after the call is connected. The format is the same as calledPlayCode.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value sample value sample value</p>
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
         * <p>Specifies whether the call capability is enabled. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CallAbility")
        public String callAbility;

        /**
         * <p>Specifies whether to pass through the caller ID to display the real caller. Valid values:</p>
         * <ul>
         * <li>00: Non-passthrough. The work number is displayed when calls are made to each other.</li>
         * <li>10: Passthrough. When Customer A is the caller, the caller ID displayed to Employee B is the number of Customer A. When Employee B is the caller, the caller ID displayed to Customer A is the work number.
         * Default value: 00.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>00</p>
         */
        @NameInMap("GNFlag")
        public String GNFlag;

        /**
         * <p>The control parameters for enterprise profile rules.</p>
         */
        @NameInMap("ReachJsons")
        public java.util.List<GetXConfigResponseBodyDataReachJsons> reachJsons;

        /**
         * <p>The control parameters for sequence ringing.</p>
         */
        @NameInMap("SequenceCalls")
        public java.util.List<GetXConfigResponseBodyDataSequenceCalls> sequenceCalls;

        /**
         * <p>The end time of sequence ringing. Format: HH:mm:ss, such as 18:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("SequenceEndTime")
        public String sequenceEndTime;

        /**
         * <p>The start time of sequence ringing. Format: HH:mm:ss, such as 09:00:00.</p>
         * 
         * <strong>example:</strong>
         * <p>09:00:00</p>
         */
        @NameInMap("SequenceStartTime")
        public String sequenceStartTime;

        /**
         * <p>Specifies whether the SMS feature is enabled. Valid values:</p>
         * <ul>
         * <li>0: Disabled.</li>
         * <li>1: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SmsAbility")
        public String smsAbility;

        /**
         * <p>Specifies whether to pass through the caller ID to display the real caller. Valid values:</p>
         * <ul>
         * <li>00: Non-passthrough. The work number is displayed when calls are made to each other.</li>
         * <li>10: Passthrough. When Customer A is the caller, the caller ID displayed to Employee B is the number of Customer A. When Employee B is the caller, the caller ID displayed to Customer A is the work number.
         * Default value: 00.</li>
         * </ul>
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
