// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class AssociateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Associate")
    public java.util.List<AssociateResponseBodyAssociate> associate;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("MessageId")
    public String messageId;

    public static AssociateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AssociateResponseBody self = new AssociateResponseBody();
        return TeaModel.build(map, self);
    }

    public AssociateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AssociateResponseBody setAssociate(java.util.List<AssociateResponseBodyAssociate> associate) {
        this.associate = associate;
        return this;
    }
    public java.util.List<AssociateResponseBodyAssociate> getAssociate() {
        return this.associate;
    }

    public AssociateResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public AssociateResponseBody setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public static class AssociateResponseBodyAssociate extends TeaModel {
        @NameInMap("Title")
        public String title;

        public static AssociateResponseBodyAssociate build(java.util.Map<String, ?> map) throws Exception {
            AssociateResponseBodyAssociate self = new AssociateResponseBodyAssociate();
            return TeaModel.build(map, self);
        }

        public AssociateResponseBodyAssociate setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
