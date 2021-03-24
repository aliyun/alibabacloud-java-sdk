// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class SendMessageRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 消息发送请求体
    @NameInMap("RequestParams")
    public SendMessageRequestRequestParams requestParams;

    public static SendMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendMessageRequest self = new SendMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendMessageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SendMessageRequest setRequestParams(SendMessageRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public SendMessageRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class SendMessageRequestRequestParamsOptionsReceiveScopeOption extends TeaModel {
        // 接受者列表
        @NameInMap("ReceiverIds")
        public java.util.List<String> receiverIds;

        // 不接收者列表
        @NameInMap("ExcludeReceiverIds")
        public java.util.List<String> excludeReceiverIds;

        // 消息获取控制。0: 会话内除指定ExcludeReceivers均可获取；1: 会话内仅指定ReceiverIds可获取
        @NameInMap("ReceiveScope")
        public Integer receiveScope;

        public static SendMessageRequestRequestParamsOptionsReceiveScopeOption build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestRequestParamsOptionsReceiveScopeOption self = new SendMessageRequestRequestParamsOptionsReceiveScopeOption();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestRequestParamsOptionsReceiveScopeOption setReceiverIds(java.util.List<String> receiverIds) {
            this.receiverIds = receiverIds;
            return this;
        }
        public java.util.List<String> getReceiverIds() {
            return this.receiverIds;
        }

        public SendMessageRequestRequestParamsOptionsReceiveScopeOption setExcludeReceiverIds(java.util.List<String> excludeReceiverIds) {
            this.excludeReceiverIds = excludeReceiverIds;
            return this;
        }
        public java.util.List<String> getExcludeReceiverIds() {
            return this.excludeReceiverIds;
        }

        public SendMessageRequestRequestParamsOptionsReceiveScopeOption setReceiveScope(Integer receiveScope) {
            this.receiveScope = receiveScope;
            return this;
        }
        public Integer getReceiveScope() {
            return this.receiveScope;
        }

    }

    public static class SendMessageRequestRequestParamsOptionsSingleChatCreateRequest extends TeaModel {
        // 单聊会话ID
        @NameInMap("AppCid")
        public String appCid;

        // 用户ID列表
        @NameInMap("AppUids")
        public java.util.List<String> appUids;

        // 扩展信息
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        // 用户会话视图信息
        @NameInMap("UserConversation")
        public java.util.Map<String, RequestParamsOptionsSingleChatCreateRequestUserConversationValue> userConversation;

        public static SendMessageRequestRequestParamsOptionsSingleChatCreateRequest build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestRequestParamsOptionsSingleChatCreateRequest self = new SendMessageRequestRequestParamsOptionsSingleChatCreateRequest();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestRequestParamsOptionsSingleChatCreateRequest setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SendMessageRequestRequestParamsOptionsSingleChatCreateRequest setAppUids(java.util.List<String> appUids) {
            this.appUids = appUids;
            return this;
        }
        public java.util.List<String> getAppUids() {
            return this.appUids;
        }

        public SendMessageRequestRequestParamsOptionsSingleChatCreateRequest setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public SendMessageRequestRequestParamsOptionsSingleChatCreateRequest setUserConversation(java.util.Map<String, RequestParamsOptionsSingleChatCreateRequestUserConversationValue> userConversation) {
            this.userConversation = userConversation;
            return this;
        }
        public java.util.Map<String, RequestParamsOptionsSingleChatCreateRequestUserConversationValue> getUserConversation() {
            return this.userConversation;
        }

    }

    public static class SendMessageRequestRequestParamsOptions extends TeaModel {
        // 未读消息小红点控制。0:增加小红点; 1:不增加小红点
        @NameInMap("RedPointPolicy")
        public Integer redPointPolicy;

        // 接受相关设置
        @NameInMap("ReceiveScopeOption")
        public SendMessageRequestRequestParamsOptionsReceiveScopeOption receiveScopeOption;

        // 单聊会话不存在时新建自定义单聊请求体
        @NameInMap("SingleChatCreateRequest")
        public SendMessageRequestRequestParamsOptionsSingleChatCreateRequest singleChatCreateRequest;

        public static SendMessageRequestRequestParamsOptions build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestRequestParamsOptions self = new SendMessageRequestRequestParamsOptions();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestRequestParamsOptions setRedPointPolicy(Integer redPointPolicy) {
            this.redPointPolicy = redPointPolicy;
            return this;
        }
        public Integer getRedPointPolicy() {
            return this.redPointPolicy;
        }

        public SendMessageRequestRequestParamsOptions setReceiveScopeOption(SendMessageRequestRequestParamsOptionsReceiveScopeOption receiveScopeOption) {
            this.receiveScopeOption = receiveScopeOption;
            return this;
        }
        public SendMessageRequestRequestParamsOptionsReceiveScopeOption getReceiveScopeOption() {
            return this.receiveScopeOption;
        }

        public SendMessageRequestRequestParamsOptions setSingleChatCreateRequest(SendMessageRequestRequestParamsOptionsSingleChatCreateRequest singleChatCreateRequest) {
            this.singleChatCreateRequest = singleChatCreateRequest;
            return this;
        }
        public SendMessageRequestRequestParamsOptionsSingleChatCreateRequest getSingleChatCreateRequest() {
            return this.singleChatCreateRequest;
        }

    }

    public static class SendMessageRequestRequestParams extends TeaModel {
        // 消息UUID
        @NameInMap("Uuid")
        public String uuid;

        // 会话ID
        @NameInMap("AppCid")
        public String appCid;

        // 会话类型
        @NameInMap("ConversationType")
        public Integer conversationType;

        // 发送者UID
        @NameInMap("SenderId")
        public String senderId;

        // 消息内容类型
        @NameInMap("ContentType")
        public Integer contentType;

        // 消息内容Json
        @NameInMap("Content")
        public String content;

        // 消息扩展字段
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        // 消息设置
        @NameInMap("Options")
        public SendMessageRequestRequestParamsOptions options;

        public static SendMessageRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            SendMessageRequestRequestParams self = new SendMessageRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public SendMessageRequestRequestParams setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public SendMessageRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public SendMessageRequestRequestParams setConversationType(Integer conversationType) {
            this.conversationType = conversationType;
            return this;
        }
        public Integer getConversationType() {
            return this.conversationType;
        }

        public SendMessageRequestRequestParams setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public SendMessageRequestRequestParams setContentType(Integer contentType) {
            this.contentType = contentType;
            return this;
        }
        public Integer getContentType() {
            return this.contentType;
        }

        public SendMessageRequestRequestParams setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SendMessageRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public SendMessageRequestRequestParams setOptions(SendMessageRequestRequestParamsOptions options) {
            this.options = options;
            return this;
        }
        public SendMessageRequestRequestParamsOptions getOptions() {
            return this.options;
        }

    }

}
