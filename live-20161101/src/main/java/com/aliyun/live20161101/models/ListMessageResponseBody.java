// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ListMessageResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-****-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Result")
    public ListMessageResponseBodyResult result;

    public static ListMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessageResponseBody self = new ListMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessageResponseBody setResult(ListMessageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListMessageResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListMessageResponseBodyResultMessageList extends TeaModel {
        /**
         * <p>The message body, in JSONString format.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The message group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE35-****-T95F</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qt***</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The message sender ID.</p>
         * 
         * <strong>example:</strong>
         * <p>yi***</p>
         */
        @NameInMap("SenderId")
        public String senderId;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>10002</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ListMessageResponseBodyResultMessageList build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyResultMessageList self = new ListMessageResponseBodyResultMessageList();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyResultMessageList setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListMessageResponseBodyResultMessageList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListMessageResponseBodyResultMessageList setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListMessageResponseBodyResultMessageList setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ListMessageResponseBodyResultMessageList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ListMessageResponseBodyResult extends TeaModel {
        /**
         * <p>Indicates whether there is a next page. Valid values:</p>
         * <ul>
         * <li><p>true: There is a next page.</p>
         * </li>
         * <li><p>false: There is no next page.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("HasMore")
        public Boolean hasMore;

        /**
         * <p>The message list.</p>
         */
        @NameInMap("MessageList")
        public java.util.List<ListMessageResponseBodyResultMessageList> messageList;

        public static ListMessageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMessageResponseBodyResult self = new ListMessageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMessageResponseBodyResult setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }
        public Boolean getHasMore() {
            return this.hasMore;
        }

        public ListMessageResponseBodyResult setMessageList(java.util.List<ListMessageResponseBodyResultMessageList> messageList) {
            this.messageList = messageList;
            return this;
        }
        public java.util.List<ListMessageResponseBodyResultMessageList> getMessageList() {
            return this.messageList;
        }

    }

}
