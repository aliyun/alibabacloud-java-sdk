// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotAssociateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public BeeBotAssociateResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static BeeBotAssociateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeeBotAssociateResponseBody self = new BeeBotAssociateResponseBody();
        return TeaModel.build(map, self);
    }

    public BeeBotAssociateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BeeBotAssociateResponseBody setData(BeeBotAssociateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BeeBotAssociateResponseBodyData getData() {
        return this.data;
    }

    public BeeBotAssociateResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BeeBotAssociateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BeeBotAssociateResponseBodyDataAssociate extends TeaModel {
        @NameInMap("Meta")
        public String meta;

        @NameInMap("Title")
        public String title;

        public static BeeBotAssociateResponseBodyDataAssociate build(java.util.Map<String, ?> map) throws Exception {
            BeeBotAssociateResponseBodyDataAssociate self = new BeeBotAssociateResponseBodyDataAssociate();
            return TeaModel.build(map, self);
        }

        public BeeBotAssociateResponseBodyDataAssociate setMeta(String meta) {
            this.meta = meta;
            return this;
        }
        public String getMeta() {
            return this.meta;
        }

        public BeeBotAssociateResponseBodyDataAssociate setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class BeeBotAssociateResponseBodyData extends TeaModel {
        @NameInMap("Associate")
        public java.util.List<BeeBotAssociateResponseBodyDataAssociate> associate;

        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("SessionId")
        public String sessionId;

        public static BeeBotAssociateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BeeBotAssociateResponseBodyData self = new BeeBotAssociateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BeeBotAssociateResponseBodyData setAssociate(java.util.List<BeeBotAssociateResponseBodyDataAssociate> associate) {
            this.associate = associate;
            return this;
        }
        public java.util.List<BeeBotAssociateResponseBodyDataAssociate> getAssociate() {
            return this.associate;
        }

        public BeeBotAssociateResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public BeeBotAssociateResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
