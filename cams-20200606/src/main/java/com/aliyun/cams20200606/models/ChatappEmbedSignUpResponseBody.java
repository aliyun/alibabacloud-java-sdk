// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappEmbedSignUpResponseBody extends TeaModel {
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
     * <p>The error message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
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
     * <p>The list of the WhatsApp Business accounts.</p>
     */
    @NameInMap("Wabas")
    public java.util.List<ChatappEmbedSignUpResponseBodyWabas> wabas;

    public static ChatappEmbedSignUpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatappEmbedSignUpResponseBody self = new ChatappEmbedSignUpResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatappEmbedSignUpResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ChatappEmbedSignUpResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ChatappEmbedSignUpResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatappEmbedSignUpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChatappEmbedSignUpResponseBody setWabas(java.util.List<ChatappEmbedSignUpResponseBodyWabas> wabas) {
        this.wabas = wabas;
        return this;
    }
    public java.util.List<ChatappEmbedSignUpResponseBodyWabas> getWabas() {
        return this.wabas;
    }

    public static class ChatappEmbedSignUpResponseBodyWabas extends TeaModel {
        /**
         * <p>The review state of the WABA.</p>
         * 
         * <strong>example:</strong>
         * <p>VERIFIED</p>
         */
        @NameInMap("AccountReviewStatus")
        public String accountReviewStatus;

        /**
         * <p>The currency.</p>
         * 
         * <strong>example:</strong>
         * <p>USD</p>
         */
        @NameInMap("Currency")
        public String currency;

        /**
         * <p>The ID of the WABA.</p>
         * 
         * <strong>example:</strong>
         * <p>2939933992*****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The namespace of the message template.</p>
         * 
         * <strong>example:</strong>
         * <p>alals-lsslls-slslsos-slsl</p>
         */
        @NameInMap("MessageTemplateNamespace")
        public String messageTemplateNamespace;

        /**
         * <p>The name of the WABA.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Name")
        public String name;

        public static ChatappEmbedSignUpResponseBodyWabas build(java.util.Map<String, ?> map) throws Exception {
            ChatappEmbedSignUpResponseBodyWabas self = new ChatappEmbedSignUpResponseBodyWabas();
            return TeaModel.build(map, self);
        }

        public ChatappEmbedSignUpResponseBodyWabas setAccountReviewStatus(String accountReviewStatus) {
            this.accountReviewStatus = accountReviewStatus;
            return this;
        }
        public String getAccountReviewStatus() {
            return this.accountReviewStatus;
        }

        public ChatappEmbedSignUpResponseBodyWabas setCurrency(String currency) {
            this.currency = currency;
            return this;
        }
        public String getCurrency() {
            return this.currency;
        }

        public ChatappEmbedSignUpResponseBodyWabas setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ChatappEmbedSignUpResponseBodyWabas setMessageTemplateNamespace(String messageTemplateNamespace) {
            this.messageTemplateNamespace = messageTemplateNamespace;
            return this;
        }
        public String getMessageTemplateNamespace() {
            return this.messageTemplateNamespace;
        }

        public ChatappEmbedSignUpResponseBodyWabas setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
