// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ChatappEmbedSignUpResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Wabas")
    public java.util.List<ChatappEmbedSignUpResponseBodyWabas> wabas;

    public static ChatappEmbedSignUpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatappEmbedSignUpResponseBody self = new ChatappEmbedSignUpResponseBody();
        return TeaModel.build(map, self);
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
        @NameInMap("AccountReviewStatus")
        public String accountReviewStatus;

        @NameInMap("Currency")
        public String currency;

        /**
         * <p>WabaId</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("MessageTemplateNamespace")
        public String messageTemplateNamespace;

        /**
         * <p>Waba Name</p>
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
