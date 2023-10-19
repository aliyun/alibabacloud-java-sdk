// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetChatappPhoneNumberMetricResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <br>
     * <p>*   A value of OK indicates that the call is successful.</p>
     * <p>*   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetChatappPhoneNumberMetricResponseBodyData> data;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
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
         * <p>Delivered count</p>
         */
        @NameInMap("DeliveredCount")
        public Integer deliveredCount;

        /**
         * <p>The end of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>The granularity at which bills are queried.</p>
         */
        @NameInMap("Granularity")
        public String granularity;

        /**
         * <p>The business phone number.</p>
         */
        @NameInMap("PhoneNumber")
        public String phoneNumber;

        /**
         * <p>Sent count</p>
         */
        @NameInMap("SentCount")
        public Integer sentCount;

        /**
         * <p>The beginning of the time range to query. Set this parameter to a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
