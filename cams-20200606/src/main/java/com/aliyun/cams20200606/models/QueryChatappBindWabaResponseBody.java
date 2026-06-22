// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappBindWabaResponseBody extends TeaModel {
    /**
     * <p>The access denial details.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>A value of <code>OK</code> indicates the request was successful.</p>
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
     * <p>The response data.</p>
     */
    @NameInMap("Data")
    public QueryChatappBindWabaResponseBodyData data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful:</p>
     * <ul>
     * <li><p><code>true</code>: The request was successful.</p>
     * </li>
     * <li><p><code>false</code>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryChatappBindWabaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryChatappBindWabaResponseBody self = new QueryChatappBindWabaResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryChatappBindWabaResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryChatappBindWabaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryChatappBindWabaResponseBody setData(QueryChatappBindWabaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryChatappBindWabaResponseBodyData getData() {
        return this.data;
    }

    public QueryChatappBindWabaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryChatappBindWabaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryChatappBindWabaResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryChatappBindWabaResponseBodyData extends TeaModel {
        /**
         * <p>The account review status. Valid values:</p>
         * <ul>
         * <li><p><code>PENDING</code>: The account is under review.</p>
         * </li>
         * <li><p><code>APPROVED</code>: The account is approved.</p>
         * </li>
         * <li><p><code>REJECTED</code>: The account is rejected.</p>
         * </li>
         * <li><p><code>DISABLED</code>: The account is disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("AccountReviewStatus")
        public String accountReviewStatus;

        /**
         * <p>Details about the WABA account.</p>
         */
        @NameInMap("AuthInternationalRateEligibility")
        public java.util.Map<String, ?> authInternationalRateEligibility;

        /**
         * <p>The Business platform ID.</p>
         * 
         * <strong>example:</strong>
         * <p>19293988***</p>
         */
        @NameInMap("BusinessId")
        public String businessId;

        /**
         * <p>The Business platform name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("BusinessName")
        public String businessName;

        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The WABA account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20393988393993***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("IsOnBizApp")
        public String isOnBizApp;

        /**
         * <p>The MML status.</p>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("MarketingMessageLiteStatus")
        public String marketingMessageLiteStatus;

        /**
         * <p>The template namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>93e6b26e_8a67_4163_a093_ebfe645a66b0</p>
         */
        @NameInMap("MessageTemplateNamespace")
        public String messageTemplateNamespace;

        /**
         * <p>The WABA account name.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The international rate capability qualification.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;start_time&quot;:1721952000</p>
         */
        @NameInMap("PrimaryBusinessLocation")
        public String primaryBusinessLocation;

        public static QueryChatappBindWabaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryChatappBindWabaResponseBodyData self = new QueryChatappBindWabaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryChatappBindWabaResponseBodyData setAccountReviewStatus(String accountReviewStatus) {
            this.accountReviewStatus = accountReviewStatus;
            return this;
        }
        public String getAccountReviewStatus() {
            return this.accountReviewStatus;
        }

        public QueryChatappBindWabaResponseBodyData setAuthInternationalRateEligibility(java.util.Map<String, ?> authInternationalRateEligibility) {
            this.authInternationalRateEligibility = authInternationalRateEligibility;
            return this;
        }
        public java.util.Map<String, ?> getAuthInternationalRateEligibility() {
            return this.authInternationalRateEligibility;
        }

        public QueryChatappBindWabaResponseBodyData setBusinessId(String businessId) {
            this.businessId = businessId;
            return this;
        }
        public String getBusinessId() {
            return this.businessId;
        }

        public QueryChatappBindWabaResponseBodyData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public QueryChatappBindWabaResponseBodyData setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public QueryChatappBindWabaResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryChatappBindWabaResponseBodyData setIsOnBizApp(String isOnBizApp) {
            this.isOnBizApp = isOnBizApp;
            return this;
        }
        public String getIsOnBizApp() {
            return this.isOnBizApp;
        }

        public QueryChatappBindWabaResponseBodyData setMarketingMessageLiteStatus(String marketingMessageLiteStatus) {
            this.marketingMessageLiteStatus = marketingMessageLiteStatus;
            return this;
        }
        public String getMarketingMessageLiteStatus() {
            return this.marketingMessageLiteStatus;
        }

        public QueryChatappBindWabaResponseBodyData setMessageTemplateNamespace(String messageTemplateNamespace) {
            this.messageTemplateNamespace = messageTemplateNamespace;
            return this;
        }
        public String getMessageTemplateNamespace() {
            return this.messageTemplateNamespace;
        }

        public QueryChatappBindWabaResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryChatappBindWabaResponseBodyData setPrimaryBusinessLocation(String primaryBusinessLocation) {
            this.primaryBusinessLocation = primaryBusinessLocation;
            return this;
        }
        public String getPrimaryBusinessLocation() {
            return this.primaryBusinessLocation;
        }

    }

}
