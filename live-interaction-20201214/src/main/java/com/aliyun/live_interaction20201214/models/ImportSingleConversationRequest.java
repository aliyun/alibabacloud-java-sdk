// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportSingleConversationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public ImportSingleConversationRequestRequestParams requestParams;

    public static ImportSingleConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportSingleConversationRequest self = new ImportSingleConversationRequest();
        return TeaModel.build(map, self);
    }

    public ImportSingleConversationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ImportSingleConversationRequest setRequestParams(ImportSingleConversationRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ImportSingleConversationRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ImportSingleConversationRequestRequestParamsConversation extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("AppUids")
        public java.util.List<String> appUids;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static ImportSingleConversationRequestRequestParamsConversation build(java.util.Map<String, ?> map) throws Exception {
            ImportSingleConversationRequestRequestParamsConversation self = new ImportSingleConversationRequestRequestParamsConversation();
            return TeaModel.build(map, self);
        }

        public ImportSingleConversationRequestRequestParamsConversation setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public ImportSingleConversationRequestRequestParamsConversation setAppUids(java.util.List<String> appUids) {
            this.appUids = appUids;
            return this;
        }
        public java.util.List<String> getAppUids() {
            return this.appUids;
        }

        public ImportSingleConversationRequestRequestParamsConversation setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ImportSingleConversationRequestRequestParamsConversation setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

    public static class ImportSingleConversationRequestRequestParams extends TeaModel {
        @NameInMap("Conversation")
        public ImportSingleConversationRequestRequestParamsConversation conversation;

        @NameInMap("UserConversations")
        public java.util.Map<String, RequestParamsUserConversationsValue> userConversations;

        public static ImportSingleConversationRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ImportSingleConversationRequestRequestParams self = new ImportSingleConversationRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ImportSingleConversationRequestRequestParams setConversation(ImportSingleConversationRequestRequestParamsConversation conversation) {
            this.conversation = conversation;
            return this;
        }
        public ImportSingleConversationRequestRequestParamsConversation getConversation() {
            return this.conversation;
        }

        public ImportSingleConversationRequestRequestParams setUserConversations(java.util.Map<String, RequestParamsUserConversationsValue> userConversations) {
            this.userConversations = userConversations;
            return this;
        }
        public java.util.Map<String, RequestParamsUserConversationsValue> getUserConversations() {
            return this.userConversations;
        }

    }

}
