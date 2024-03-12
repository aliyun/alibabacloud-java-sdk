// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneGlobalReplyRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

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
        @NameInMap("Message")
        public String message;

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
