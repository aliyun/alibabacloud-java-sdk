// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bdrc20230808.models;

import com.aliyun.tea.*;

public class GetMessageResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetMessageResponseBodyData data;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8724BC18-904D-5A0D-BFF4-F0554F0037E7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMessageResponseBody self = new GetMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMessageResponseBody setData(GetMessageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMessageResponseBodyData getData() {
        return this.data;
    }

    public GetMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMessageResponseBodyData extends TeaModel {
        /**
         * <p>Message content.</p>
         * 
         * <strong>example:</strong>
         * <p>{********}</p>
         */
        @NameInMap("MessageContent")
        public String messageContent;

        /**
         * <p>Message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-123***7890</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>Message level.</p>
         * 
         * <strong>example:</strong>
         * <p>WARNING</p>
         */
        @NameInMap("MessageLevel")
        public String messageLevel;

        /**
         * <p>Message name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyMessage</p>
         */
        @NameInMap("MessageName")
        public String messageName;

        /**
         * <p>Message source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-123***7890</p>
         */
        @NameInMap("MessageSourceId")
        public String messageSourceId;

        /**
         * <p>Message source region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("MessageSourceRegionId")
        public String messageSourceRegionId;

        /**
         * <p>Message source type.</p>
         * 
         * <strong>example:</strong>
         * <p>PROTECTION_POLICY</p>
         */
        @NameInMap("MessageSourceType")
        public String messageSourceType;

        /**
         * <p>Message time.</p>
         * 
         * <strong>example:</strong>
         * <p>1740019609</p>
         */
        @NameInMap("MessageTime")
        public Long messageTime;

        /**
         * <p>Message type.</p>
         * 
         * <strong>example:</strong>
         * <p>SUB_PROTECTION_POLICY_MODIFIED</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        public static GetMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMessageResponseBodyData self = new GetMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMessageResponseBodyData setMessageContent(String messageContent) {
            this.messageContent = messageContent;
            return this;
        }
        public String getMessageContent() {
            return this.messageContent;
        }

        public GetMessageResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public GetMessageResponseBodyData setMessageLevel(String messageLevel) {
            this.messageLevel = messageLevel;
            return this;
        }
        public String getMessageLevel() {
            return this.messageLevel;
        }

        public GetMessageResponseBodyData setMessageName(String messageName) {
            this.messageName = messageName;
            return this;
        }
        public String getMessageName() {
            return this.messageName;
        }

        public GetMessageResponseBodyData setMessageSourceId(String messageSourceId) {
            this.messageSourceId = messageSourceId;
            return this;
        }
        public String getMessageSourceId() {
            return this.messageSourceId;
        }

        public GetMessageResponseBodyData setMessageSourceRegionId(String messageSourceRegionId) {
            this.messageSourceRegionId = messageSourceRegionId;
            return this;
        }
        public String getMessageSourceRegionId() {
            return this.messageSourceRegionId;
        }

        public GetMessageResponseBodyData setMessageSourceType(String messageSourceType) {
            this.messageSourceType = messageSourceType;
            return this;
        }
        public String getMessageSourceType() {
            return this.messageSourceType;
        }

        public GetMessageResponseBodyData setMessageTime(Long messageTime) {
            this.messageTime = messageTime;
            return this;
        }
        public Long getMessageTime() {
            return this.messageTime;
        }

        public GetMessageResponseBodyData setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

    }

}
