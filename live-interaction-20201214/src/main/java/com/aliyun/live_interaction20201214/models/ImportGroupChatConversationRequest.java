// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportGroupChatConversationRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public ImportGroupChatConversationRequestRequestParams requestParams;

    public static ImportGroupChatConversationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportGroupChatConversationRequest self = new ImportGroupChatConversationRequest();
        return TeaModel.build(map, self);
    }

    public ImportGroupChatConversationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ImportGroupChatConversationRequest setRequestParams(ImportGroupChatConversationRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ImportGroupChatConversationRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ImportGroupChatConversationRequestRequestParams extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        @NameInMap("IconMediaId")
        public String iconMediaId;

        @NameInMap("MemberLimit")
        public Long memberLimit;

        @NameInMap("OwnerAppUid")
        public String ownerAppUid;

        @NameInMap("SilenceAll")
        public Boolean silenceAll;

        @NameInMap("Title")
        public String title;

        @NameInMap("Uuid")
        public String uuid;

        public static ImportGroupChatConversationRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ImportGroupChatConversationRequestRequestParams self = new ImportGroupChatConversationRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ImportGroupChatConversationRequestRequestParams setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ImportGroupChatConversationRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public ImportGroupChatConversationRequestRequestParams setIconMediaId(String iconMediaId) {
            this.iconMediaId = iconMediaId;
            return this;
        }
        public String getIconMediaId() {
            return this.iconMediaId;
        }

        public ImportGroupChatConversationRequestRequestParams setMemberLimit(Long memberLimit) {
            this.memberLimit = memberLimit;
            return this;
        }
        public Long getMemberLimit() {
            return this.memberLimit;
        }

        public ImportGroupChatConversationRequestRequestParams setOwnerAppUid(String ownerAppUid) {
            this.ownerAppUid = ownerAppUid;
            return this;
        }
        public String getOwnerAppUid() {
            return this.ownerAppUid;
        }

        public ImportGroupChatConversationRequestRequestParams setSilenceAll(Boolean silenceAll) {
            this.silenceAll = silenceAll;
            return this;
        }
        public Boolean getSilenceAll() {
            return this.silenceAll;
        }

        public ImportGroupChatConversationRequestRequestParams setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ImportGroupChatConversationRequestRequestParams setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
