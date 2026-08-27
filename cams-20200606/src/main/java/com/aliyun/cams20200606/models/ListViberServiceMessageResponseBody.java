// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListViberServiceMessageResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>OK indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data object.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListViberServiceMessageResponseBodyData> data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID. This is used for troubleshooting when an error occurs.</p>
     * 
     * <strong>example:</strong>
     * <p>ddhjdn-dnjdnkdjknd**</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation was successful. Valid values:</p>
     * <ul>
     * <li><p>true: Successful.</p>
     * </li>
     * <li><p>false: Failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The business account name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test.</p>
         */
        @NameInMap("BusinessAccountName")
        public String businessAccountName;

        /**
         * <p>The destination country or region ID.</p>
         */
        @NameInMap("DestinationCountryId")
        public java.util.List<String> destinationCountryId;

        /**
         * <p>The destination country or region ID.</p>
         */
        @NameInMap("DestinationInternationalCountryId")
        public java.util.List<String> destinationInternationalCountryId;

        /**
         * <p>The industry involved.</p>
         * 
         * <strong>example:</strong>
         * <p>Healthcare.</p>
         */
        @NameInMap("IndustryInvolved")
        public String industryInvolved;

        /**
         * <p>The collection of destination countries or regions.</p>
         */
        @NameInMap("MessageDestinationCountry")
        public java.util.List<String> messageDestinationCountry;

        /**
         * <p>The list of international destination countries or regions.</p>
         */
        @NameInMap("MessageDestinationInternationalCountry")
        public java.util.List<String> messageDestinationInternationalCountry;

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25644</p>
         */
        @NameInMap("ServiceId")
        public String serviceId;

        /**
         * <p>The resource status.</p>
         * 
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
