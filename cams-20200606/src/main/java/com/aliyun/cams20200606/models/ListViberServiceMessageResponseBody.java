// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListViberServiceMessageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
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
    public java.util.List<ListViberServiceMessageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ddhjdn-dnjdnkdjknd**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListViberServiceMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListViberServiceMessageResponseBody self = new ListViberServiceMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListViberServiceMessageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListViberServiceMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListViberServiceMessageResponseBody setData(java.util.List<ListViberServiceMessageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListViberServiceMessageResponseBodyData> getData() {
        return this.data;
    }

    public ListViberServiceMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListViberServiceMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListViberServiceMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListViberServiceMessageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("BusinessAccountName")
        public String businessAccountName;

        @NameInMap("DestinationCountryId")
        public java.util.List<String> destinationCountryId;

        @NameInMap("DestinationInternationalCountryId")
        public java.util.List<String> destinationInternationalCountryId;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("IndustryInvolved")
        public String industryInvolved;

        @NameInMap("MessageDestinationCountry")
        public java.util.List<String> messageDestinationCountry;

        @NameInMap("MessageDestinationInternationalCountry")
        public java.util.List<String> messageDestinationInternationalCountry;

        /**
         * <strong>example:</strong>
         * <p>25644</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <strong>example:</strong>
         * <p>stop</p>
         */
        @NameInMap("State")
        public String state;

        public static ListViberServiceMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListViberServiceMessageResponseBodyData self = new ListViberServiceMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListViberServiceMessageResponseBodyData setBusinessAccountName(String businessAccountName) {
            this.businessAccountName = businessAccountName;
            return this;
        }
        public String getBusinessAccountName() {
            return this.businessAccountName;
        }

        public ListViberServiceMessageResponseBodyData setDestinationCountryId(java.util.List<String> destinationCountryId) {
            this.destinationCountryId = destinationCountryId;
            return this;
        }
        public java.util.List<String> getDestinationCountryId() {
            return this.destinationCountryId;
        }

        public ListViberServiceMessageResponseBodyData setDestinationInternationalCountryId(java.util.List<String> destinationInternationalCountryId) {
            this.destinationInternationalCountryId = destinationInternationalCountryId;
            return this;
        }
        public java.util.List<String> getDestinationInternationalCountryId() {
            return this.destinationInternationalCountryId;
        }

        public ListViberServiceMessageResponseBodyData setIndustryInvolved(String industryInvolved) {
            this.industryInvolved = industryInvolved;
            return this;
        }
        public String getIndustryInvolved() {
            return this.industryInvolved;
        }

        public ListViberServiceMessageResponseBodyData setMessageDestinationCountry(java.util.List<String> messageDestinationCountry) {
            this.messageDestinationCountry = messageDestinationCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        public ListViberServiceMessageResponseBodyData setMessageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
            this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
            return this;
        }
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        public ListViberServiceMessageResponseBodyData setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public ListViberServiceMessageResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
