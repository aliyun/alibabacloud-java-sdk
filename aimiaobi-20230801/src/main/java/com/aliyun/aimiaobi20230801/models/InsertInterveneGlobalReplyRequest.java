// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneGlobalReplyRequest extends TeaModel {
    /**
     * <p>Unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>List of reply content</p>
     */
    @NameInMap("ReplyMessagList")
    public java.util.List<InsertInterveneGlobalReplyRequestReplyMessagList> replyMessagList;

    public static InsertInterveneGlobalReplyRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertInterveneGlobalReplyRequest self = new InsertInterveneGlobalReplyRequest();
        return TeaModel.build(map, self);
    }

    public InsertInterveneGlobalReplyRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public InsertInterveneGlobalReplyRequest setReplyMessagList(java.util.List<InsertInterveneGlobalReplyRequestReplyMessagList> replyMessagList) {
        this.replyMessagList = replyMessagList;
        return this;
    }
    public java.util.List<InsertInterveneGlobalReplyRequestReplyMessagList> getReplyMessagList() {
        return this.replyMessagList;
    }

    public static class InsertInterveneGlobalReplyRequestReplyMessagList extends TeaModel {
        /**
         * <p>Reply content</p>
         * 
         * <strong>example:</strong>
         * <p>抱歉，问题我无法回答</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Reply type</p>
         * 
         * <strong>example:</strong>
         * <p>全局回复的类型</p>
         */
        @NameInMap("ReplyType")
        public String replyType;

        public static InsertInterveneGlobalReplyRequestReplyMessagList build(java.util.Map<String, ?> map) throws Exception {
            InsertInterveneGlobalReplyRequestReplyMessagList self = new InsertInterveneGlobalReplyRequestReplyMessagList();
            return TeaModel.build(map, self);
        }

        public InsertInterveneGlobalReplyRequestReplyMessagList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InsertInterveneGlobalReplyRequestReplyMessagList setReplyType(String replyType) {
            this.replyType = replyType;
            return this;
        }
        public String getReplyType() {
            return this.replyType;
        }

    }

}
