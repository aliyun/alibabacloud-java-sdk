// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappPhoneNumberMetricResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The value OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetChatappPhoneNumberMetricResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1612C226-E271-4CFE-9F18-4066D******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetChatappPhoneNumberMetricResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatappPhoneNumberMetricResponseBody self = new GetChatappPhoneNumberMetricResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatappPhoneNumberMetricResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetChatappPhoneNumberMetricResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatappPhoneNumberMetricResponseBody setData(java.util.List<GetChatappPhoneNumberMetricResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetChatappPhoneNumberMetricResponseBodyData> getData() {
        return this.data;
    }

    public GetChatappPhoneNumberMetricResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatappPhoneNumberMetricResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetChatappPhoneNumberMetricResponseBodyData extends TeaModel {
        /**
         * <p>The number of delivered messages.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("DeliveredCount")
        public Integer deliveredCount;

        /**
         * <p>The end of the time range that you queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1667196043904</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>The metric granularity.</p>
         * <blockquote>
         * <p> Valid values:</p>
         * </blockquote>
         * <ul>
         * <li><p>DAILY</p>
         * </li>
         * <li><p>HALF_HOUR</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DAILY</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The business phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>861380000</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>The number of sent messages.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SentCount")
        public Integer sentCount;

        /**
         * <p>The beginning of the time range that you queried.</p>
         * 
         * <strong>example:</strong>
         * <p>1669619491000</p>
         */
        @NameInMap("Start")
        public Long start;

        public static GetChatappPhoneNumberMetricResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetChatappPhoneNumberMetricResponseBodyData self = new GetChatappPhoneNumberMetricResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetChatappPhoneNumberMetricResponseBodyData setDeliveredCount(Integer deliveredCount) {
            this.deliveredCount = deliveredCount;
            return this;
        }
        public Integer getDeliveredCount() {
            return this.deliveredCount;
        }

        public GetChatappPhoneNumberMetricResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public GetChatappPhoneNumberMetricResponseBodyData setGranularity(String granularity) {
            this.granularity = granularity;
            return this;
        }
        public String getGranularity() {
            return this.granularity;
        }

        public GetChatappPhoneNumberMetricResponseBodyData setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public GetChatappPhoneNumberMetricResponseBodyData setSentCount(Integer sentCount) {
            this.sentCount = sentCount;
            return this;
        }
        public Integer getSentCount() {
            return this.sentCount;
        }

        public GetChatappPhoneNumberMetricResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

    }

}
