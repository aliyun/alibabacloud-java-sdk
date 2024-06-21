// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotAssociateResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>If OK is returned, the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public BeeBotAssociateResponseBodyData data;

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

    public static BeeBotAssociateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BeeBotAssociateResponseBody self = new BeeBotAssociateResponseBody();
        return TeaModel.build(map, self);
    }

    public BeeBotAssociateResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Meta")
        public String meta;

        /**
         * <p>The title of the associated question.</p>
         */
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
        /**
         * <p>The list of associated recommendations.</p>
         */
        @NameInMap("Associate")
        public java.util.List<BeeBotAssociateResponseBodyDataAssociate> associate;

        /**
         * <p>The ID of the response message.</p>
         * 
         * <strong>example:</strong>
         * <p>1eb47d7a1706429081e90c83c62c2f00</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>93f11165a2a24289a6f869760e8cb3f3</p>
         */
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
