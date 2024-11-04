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
     * <p>开/关呼叫能力状态： ‘0’：禁用； ‘1’：开启；</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CallAbility")
    public String callAbility;

    /**
     * <p>返回状态码 0000表示成功 其他表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>0000</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>是否透传来显为真实主叫： 00-非透传：互相拨打时都显示工作号; 10-透传：A客户为主叫时,B员工的来显为客户A号码;B员工为主叫时,A客户的来显为工作号; 默认为 00</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GNFlag")
    public String GNFlag;

    /**
     * <p>返回信息</p>
     * 
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>顺振控制参数</p>
     */
    @NameInMap("SequenceCalls")
    public java.util.List<GetXConfigResponseBodySequenceCalls> sequenceCalls;

    /**
     * <p>顺振模式： 0-不顺振（默认） 1-有条件顺振，先接续calledNo指定被叫，如果该被叫未能接通，再顺振sequenceCalls号码列表 2-无条件顺振，不接续calledNo指定被叫，直接顺振sequenceCalls号码列表</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SequenceMode")
    public String sequenceMode;

    /**
     * <p>开/关短信功能状态： ‘0’：禁用；‘1’：开启；</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsAbility")
    public String smsAbility;

    /**
     * <p>是否透传来显为真实用户 0：不透传; 1：透传 默认：0不透传</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("SmsSignMode")
    public String smsSignMode;

    /**
     * <p>返回是否成功 true  表示成功 false表示失败</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>X号码</p>
     * 
     * <strong>example:</strong>
     * <p>17*******22</p>
     */
    @NameInMap("TelX")
    public String telX;

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

    public GetXConfigResponseBody setCallAbility(String callAbility) {
        this.callAbility = callAbility;
        return this;
    }
    public String getCallAbility() {
        return this.callAbility;
    }

    public GetXConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetXConfigResponseBody setGNFlag(String GNFlag) {
        this.GNFlag = GNFlag;
        return this;
    }
    public String getGNFlag() {
        return this.GNFlag;
    }

    public GetXConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetXConfigResponseBody setSequenceCalls(java.util.List<GetXConfigResponseBodySequenceCalls> sequenceCalls) {
        this.sequenceCalls = sequenceCalls;
        return this;
    }
    public java.util.List<GetXConfigResponseBodySequenceCalls> getSequenceCalls() {
        return this.sequenceCalls;
    }

    public GetXConfigResponseBody setSequenceMode(String sequenceMode) {
        this.sequenceMode = sequenceMode;
        return this;
    }
    public String getSequenceMode() {
        return this.sequenceMode;
    }

    public GetXConfigResponseBody setSmsAbility(String smsAbility) {
        this.smsAbility = smsAbility;
        return this;
    }
    public String getSmsAbility() {
        return this.smsAbility;
    }

    public GetXConfigResponseBody setSmsSignMode(String smsSignMode) {
        this.smsSignMode = smsSignMode;
        return this;
    }
    public String getSmsSignMode() {
        return this.smsSignMode;
    }

    public GetXConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetXConfigResponseBody setTelX(String telX) {
        this.telX = telX;
        return this;
    }
    public String getTelX() {
        return this.telX;
    }

    public static class GetXConfigResponseBodySequenceCalls extends TeaModel {
        /**
         * <p>顺振提示音放音编号，格式如callNoPlayCode</p>
         * 
         * <strong>example:</strong>
         * <p>01</p>
         */
        @NameInMap("SequenceCallNoPlayCode")
        public String sequenceCallNoPlayCode;

        /**
         * <p>顺振被叫号码</p>
         * 
         * <strong>example:</strong>
         * <p>18*******33</p>
         */
        @NameInMap("SequenceCalledNo")
        public String sequenceCalledNo;

        /**
         * <p>接通后主被叫放音编号，格式如calledPlayCode</p>
         * 
         * <strong>example:</strong>
         * <p>02</p>
         */
        @NameInMap("SequenceCalledPlayCode")
        public String sequenceCalledPlayCode;

        public static GetXConfigResponseBodySequenceCalls build(java.util.Map<String, ?> map) throws Exception {
            GetXConfigResponseBodySequenceCalls self = new GetXConfigResponseBodySequenceCalls();
            return TeaModel.build(map, self);
        }

        public GetXConfigResponseBodySequenceCalls setSequenceCallNoPlayCode(String sequenceCallNoPlayCode) {
            this.sequenceCallNoPlayCode = sequenceCallNoPlayCode;
            return this;
        }
        public String getSequenceCallNoPlayCode() {
            return this.sequenceCallNoPlayCode;
        }

        public GetXConfigResponseBodySequenceCalls setSequenceCalledNo(String sequenceCalledNo) {
            this.sequenceCalledNo = sequenceCalledNo;
            return this;
        }
        public String getSequenceCalledNo() {
            return this.sequenceCalledNo;
        }

        public GetXConfigResponseBodySequenceCalls setSequenceCalledPlayCode(String sequenceCalledPlayCode) {
            this.sequenceCalledPlayCode = sequenceCalledPlayCode;
            return this;
        }
        public String getSequenceCalledPlayCode() {
            return this.sequenceCalledPlayCode;
        }

    }

}
