// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportGroupChatConversationRequest extends TeaModel {
    // AppId
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
        // 唯一标识，用于重入
        @NameInMap("Uuid")
        public String uuid;

        // 群主uid
        @NameInMap("OwnerAppUid")
        public String ownerAppUid;

        // 群标题
        @NameInMap("Title")
        public String title;

        // 群头像
        @NameInMap("IconMediaId")
        public String iconMediaId;

        // 群上限
        @NameInMap("MemberLimit")
        public Long memberLimit;

        // 扩展字段
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        // 创建时间
        @NameInMap("CreateTime")
        public Long createTime;

        // 是否全员禁言
        @NameInMap("SilenceAll")
        public Boolean silenceAll;

        public static ImportGroupChatConversationRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ImportGroupChatConversationRequestRequestParams self = new ImportGroupChatConversationRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ImportGroupChatConversationRequestRequestParams setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public ImportGroupChatConversationRequestRequestParams setOwnerAppUid(String ownerAppUid) {
            this.ownerAppUid = ownerAppUid;
            return this;
        }
        public String getOwnerAppUid() {
            return this.ownerAppUid;
        }

        public ImportGroupChatConversationRequestRequestParams setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
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

        public ImportGroupChatConversationRequestRequestParams setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

        public ImportGroupChatConversationRequestRequestParams setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ImportGroupChatConversationRequestRequestParams setSilenceAll(Boolean silenceAll) {
            this.silenceAll = silenceAll;
            return this;
        }
        public Boolean getSilenceAll() {
            return this.silenceAll;
        }

    }

}
