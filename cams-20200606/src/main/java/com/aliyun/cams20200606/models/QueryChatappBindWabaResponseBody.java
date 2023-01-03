// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappBindWabaResponseBody extends TeaModel {
    // The HTTP status code returned.
    // 
    // *   A value of OK indicates that the call is successful.
    // *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
    @NameInMap("Code")
    public String code;

    // The returned data.
    @NameInMap("Data")
    public QueryChatappBindWabaResponseBodyData data;

    // The error message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static QueryChatappBindWabaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryChatappBindWabaResponseBody self = new QueryChatappBindWabaResponseBody();
        return TeaModel.build(map, self);
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

    public static class QueryChatappBindWabaResponseBodyData extends TeaModel {
        // The audit status of the WhatApp Business account.
        @NameInMap("AccountReviewStatus")
        public String accountReviewStatus;

        // Currency
        @NameInMap("Currency")
        public String currency;

        // WabaID
        @NameInMap("Id")
        public String id;

        // The namespace of the message template.
        @NameInMap("MessageTemplateNamespace")
        public String messageTemplateNamespace;

        // The name of the WhatApp Business account.
        @NameInMap("Name")
        public String name;

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

    }

}
