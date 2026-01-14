// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class CallChatListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public java.util.List<CallChatListResponseBodyModel> model;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>81</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static CallChatListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CallChatListResponseBody self = new CallChatListResponseBody();
        return TeaModel.build(map, self);
    }

    public CallChatListResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public CallChatListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CallChatListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CallChatListResponseBody setModel(java.util.List<CallChatListResponseBodyModel> model) {
        this.model = model;
        return this;
    }
    public java.util.List<CallChatListResponseBodyModel> getModel() {
        return this.model;
    }

    public CallChatListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CallChatListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CallChatListResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class CallChatListResponseBodyModel extends TeaModel {
        /**
         * <p>聊天内容id</p>
         * 
         * <strong>example:</strong>
         * <p>79</p>
         */
        @NameInMap("ChatId")
        public Long chatId;

        /**
         * <p>说话内容</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>说话时间</p>
         * 
         * <strong>example:</strong>
         * <p>2019-01-09 14:14:19</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>说话号码，其中0为AI,1-用户,2-坐席</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("FromType")
        public Long fromType;

        public static CallChatListResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            CallChatListResponseBodyModel self = new CallChatListResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public CallChatListResponseBodyModel setChatId(Long chatId) {
            this.chatId = chatId;
            return this;
        }
        public Long getChatId() {
            return this.chatId;
        }

        public CallChatListResponseBodyModel setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CallChatListResponseBodyModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CallChatListResponseBodyModel setFromType(Long fromType) {
            this.fromType = fromType;
            return this;
        }
        public Long getFromType() {
            return this.fromType;
        }

    }

}
