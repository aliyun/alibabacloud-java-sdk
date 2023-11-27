// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportMessageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public ImportMessageRequestRequestParams requestParams;

    public static ImportMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMessageRequest self = new ImportMessageRequest();
        return TeaModel.build(map, self);
    }

    public ImportMessageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ImportMessageRequest setRequestParams(ImportMessageRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ImportMessageRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ImportMessageRequestRequestParamsMessages extends TeaModel {
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("Content")
        public String content;

        @NameInMap("ContentType")
        public Long contentType;

        @NameInMap("ConversationType")
        public Long conversationType;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("ReceiverIds")
        public java.util.List<String> receiverIds;

        @NameInMap("SenderId")
        public String senderId;

        @NameInMap("Uuid")
        public String uuid;

        public static ImportMessageRequestRequestParamsMessages build(java.util.Map<String, ?> map) throws Exception {
            ImportMessageRequestRequestParamsMessages self = new ImportMessageRequestRequestParamsMessages();
            return TeaModel.build(map, self);
        }

        public ImportMessageRequestRequestParamsMessages setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public ImportMessageRequestRequestParamsMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ImportMessageRequestRequestParamsMessages setContentType(Long contentType) {
            this.contentType = contentType;
            return this;
        }
        public Long getContentType() {
            return this.contentType;
        }

        public ImportMessageRequestRequestParamsMessages setConversationType(Long conversationType) {
            this.conversationType = conversationType;
            return this;
        }
        public Long getConversationType() {
            return this.conversationType;
        }

        public ImportMessageRequestRequestParamsMessages setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ImportMessageRequestRequestParamsMessages setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public ImportMessageRequestRequestParamsMessages setReceiverIds(java.util.List<String> receiverIds) {
            this.receiverIds = receiverIds;
            return this;
        }
        public java.util.List<String> getReceiverIds() {
            return this.receiverIds;
        }

        public ImportMessageRequestRequestParamsMessages setSenderId(String senderId) {
            this.senderId = senderId;
            return this;
        }
        public String getSenderId() {
            return this.senderId;
        }

        public ImportMessageRequestRequestParamsMessages setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ImportMessageRequestRequestParams extends TeaModel {
        @NameInMap("Messages")
        public java.util.List<ImportMessageRequestRequestParamsMessages> messages;

        public static ImportMessageRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ImportMessageRequestRequestParams self = new ImportMessageRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ImportMessageRequestRequestParams setMessages(java.util.List<ImportMessageRequestRequestParamsMessages> messages) {
            this.messages = messages;
            return this;
        }
        public java.util.List<ImportMessageRequestRequestParamsMessages> getMessages() {
            return this.messages;
        }

    }

}
