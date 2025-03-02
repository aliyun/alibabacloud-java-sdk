// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class DescribeNumberHLRResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeNumberHLRResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1C3B8084-3A7D-570B-BC84-BF945A9CF65E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNumberHLRResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNumberHLRResponseBody self = new DescribeNumberHLRResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNumberHLRResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeNumberHLRResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeNumberHLRResponseBody setData(DescribeNumberHLRResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeNumberHLRResponseBodyData getData() {
        return this.data;
    }

    public DescribeNumberHLRResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeNumberHLRResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNumberHLRResponseBodyDataCall extends TeaModel {
        /**
         * <p>call</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("CleansedCode")
        public String cleansedCode;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("MaxLength")
        public Long maxLength;

        /**
         * <strong>example:</strong>
         * <p>21</p>
         */
        @NameInMap("MinLength")
        public Long minLength;

        public static DescribeNumberHLRResponseBodyDataCall build(java.util.Map<String, ?> map) throws Exception {
            DescribeNumberHLRResponseBodyDataCall self = new DescribeNumberHLRResponseBodyDataCall();
            return TeaModel.build(map, self);
        }

        public DescribeNumberHLRResponseBodyDataCall setCleansedCode(String cleansedCode) {
            this.cleansedCode = cleansedCode;
            return this;
        }
        public String getCleansedCode() {
            return this.cleansedCode;
        }

        public DescribeNumberHLRResponseBodyDataCall setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeNumberHLRResponseBodyDataCall setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

    }

    public static class DescribeNumberHLRResponseBodyDataLive extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("DeviceStatus")
        public String deviceStatus;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Roaming")
        public String roaming;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("RoamingCountry")
        public String roamingCountry;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("SubscriberStatus")
        public String subscriberStatus;

        public static DescribeNumberHLRResponseBodyDataLive build(java.util.Map<String, ?> map) throws Exception {
            DescribeNumberHLRResponseBodyDataLive self = new DescribeNumberHLRResponseBodyDataLive();
            return TeaModel.build(map, self);
        }

        public DescribeNumberHLRResponseBodyDataLive setDeviceStatus(String deviceStatus) {
            this.deviceStatus = deviceStatus;
            return this;
        }
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        public DescribeNumberHLRResponseBodyDataLive setRoaming(String roaming) {
            this.roaming = roaming;
            return this;
        }
        public String getRoaming() {
            return this.roaming;
        }

        public DescribeNumberHLRResponseBodyDataLive setRoamingCountry(String roamingCountry) {
            this.roamingCountry = roamingCountry;
            return this;
        }
        public String getRoamingCountry() {
            return this.roamingCountry;
        }

        public DescribeNumberHLRResponseBodyDataLive setSubscriberStatus(String subscriberStatus) {
            this.subscriberStatus = subscriberStatus;
            return this;
        }
        public String getSubscriberStatus() {
            return this.subscriberStatus;
        }

    }

    public static class DescribeNumberHLRResponseBodyDataSms extends TeaModel {
        /**
         * <p>sms</p>
         * 
         * <strong>example:</strong>
         * <p>58</p>
         */
        @NameInMap("CleansedCode")
        public Long cleansedCode;

        /**
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("MaxLength")
        public Long maxLength;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MinLength")
        public Long minLength;

        public static DescribeNumberHLRResponseBodyDataSms build(java.util.Map<String, ?> map) throws Exception {
            DescribeNumberHLRResponseBodyDataSms self = new DescribeNumberHLRResponseBodyDataSms();
            return TeaModel.build(map, self);
        }

        public DescribeNumberHLRResponseBodyDataSms setCleansedCode(Long cleansedCode) {
            this.cleansedCode = cleansedCode;
            return this;
        }
        public Long getCleansedCode() {
            return this.cleansedCode;
        }

        public DescribeNumberHLRResponseBodyDataSms setMaxLength(Long maxLength) {
            this.maxLength = maxLength;
            return this;
        }
        public Long getMaxLength() {
            return this.maxLength;
        }

        public DescribeNumberHLRResponseBodyDataSms setMinLength(Long minLength) {
            this.minLength = minLength;
            return this;
        }
        public Long getMinLength() {
            return this.minLength;
        }

    }

    public static class DescribeNumberHLRResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Blocked")
        public String blocked;

        @NameInMap("Call")
        public DescribeNumberHLRResponseBodyDataCall call;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("Carrier")
        public String carrier;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("CountryIso3")
        public String countryIso3;

        @NameInMap("Live")
        public DescribeNumberHLRResponseBodyDataLive live;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("PhoneType")
        public String phoneType;

        @NameInMap("Sms")
        public DescribeNumberHLRResponseBodyDataSms sms;

        public static DescribeNumberHLRResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeNumberHLRResponseBodyData self = new DescribeNumberHLRResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeNumberHLRResponseBodyData setBlocked(String blocked) {
            this.blocked = blocked;
            return this;
        }
        public String getBlocked() {
            return this.blocked;
        }

        public DescribeNumberHLRResponseBodyData setCall(DescribeNumberHLRResponseBodyDataCall call) {
            this.call = call;
            return this;
        }
        public DescribeNumberHLRResponseBodyDataCall getCall() {
            return this.call;
        }

        public DescribeNumberHLRResponseBodyData setCarrier(String carrier) {
            this.carrier = carrier;
            return this;
        }
        public String getCarrier() {
            return this.carrier;
        }

        public DescribeNumberHLRResponseBodyData setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public DescribeNumberHLRResponseBodyData setCountryIso3(String countryIso3) {
            this.countryIso3 = countryIso3;
            return this;
        }
        public String getCountryIso3() {
            return this.countryIso3;
        }

        public DescribeNumberHLRResponseBodyData setLive(DescribeNumberHLRResponseBodyDataLive live) {
            this.live = live;
            return this;
        }
        public DescribeNumberHLRResponseBodyDataLive getLive() {
            return this.live;
        }

        public DescribeNumberHLRResponseBodyData setPhoneType(String phoneType) {
            this.phoneType = phoneType;
            return this;
        }
        public String getPhoneType() {
            return this.phoneType;
        }

        public DescribeNumberHLRResponseBodyData setSms(DescribeNumberHLRResponseBodyDataSms sms) {
            this.sms = sms;
            return this;
        }
        public DescribeNumberHLRResponseBodyDataSms getSms() {
            return this.sms;
        }

    }

}
