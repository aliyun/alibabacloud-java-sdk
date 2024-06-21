// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappBindWabaResponseBody extends TeaModel {
    /**
     * <p>The details about the access denial.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The HTTP status code returned.</p>
     * <ul>
     * <li>A value of OK indicates that the call is successful.</li>
     * <li>Other values indicate that the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
     * </ul>
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
    public QueryChatappBindWabaResponseBodyData data;

    /**
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <p>The review state of the WhatsApp Business account (WABA).</p>
         * <blockquote>
         * <p> Valid values:</p>
         * </blockquote>
         * <ul>
         * <li><p>PENDING: The WABA is to be reviewed.</p>
         * </li>
         * <li><p>APPROVED: The WABA was approved.</p>
         * </li>
         * <li><p>REJECTED: The WABA was rejected.</p>
         * </li>
         * <li><p>DISABLED: The WABA was forbidden.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("AccountReviewStatus")
        public String accountReviewStatus;

        @NameInMap("AuthInternationalRateEligibility")
        public java.util.Map<String, ?> authInternationalRateEligibility;

        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The ID of the WhatsApp Business account.</p>
         * 
         * <strong>example:</strong>
         * <p>20393988393993***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The namespace of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>90E63D28-E31D-1EB2-8939-A9486641****</p>
         */
        @NameInMap("MessageTemplateNamespace")
        public String messageTemplateNamespace;

        /**
         * <p>The name of the WhatsApp Business account.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
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
