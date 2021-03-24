// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportGroupChatMemberRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public ImportGroupChatMemberRequestRequestParams requestParams;

    public static ImportGroupChatMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportGroupChatMemberRequest self = new ImportGroupChatMemberRequest();
        return TeaModel.build(map, self);
    }

    public ImportGroupChatMemberRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ImportGroupChatMemberRequest setRequestParams(ImportGroupChatMemberRequestRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }
    public ImportGroupChatMemberRequestRequestParams getRequestParams() {
        return this.requestParams;
    }

    public static class ImportGroupChatMemberRequestRequestParamsGroupChatMembers extends TeaModel {
        // 用户ID
        @NameInMap("AppUid")
        public String appUid;

        // 成员权限
        @NameInMap("Role")
        public Long role;

        // 昵称
        @NameInMap("Nick")
        public String nick;

        // 是否置顶
        @NameInMap("Top")
        public Boolean top;

        // 未读数
        @NameInMap("RedPoint")
        public Long redPoint;

        // 是否免打扰
        @NameInMap("Mute")
        public Boolean mute;

        // 是否可见
        @NameInMap("Visible")
        public Boolean visible;

        // 入群时间戳
        @NameInMap("JoinTime")
        public Long joinTime;

        // 最后修改时间
        @NameInMap("ModifyTime")
        public Long modifyTime;

        // 自定义信息
        @NameInMap("Extensions")
        public java.util.Map<String, String> extensions;

        public static ImportGroupChatMemberRequestRequestParamsGroupChatMembers build(java.util.Map<String, ?> map) throws Exception {
            ImportGroupChatMemberRequestRequestParamsGroupChatMembers self = new ImportGroupChatMemberRequestRequestParamsGroupChatMembers();
            return TeaModel.build(map, self);
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setAppUid(String appUid) {
            this.appUid = appUid;
            return this;
        }
        public String getAppUid() {
            return this.appUid;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setRole(Long role) {
            this.role = role;
            return this;
        }
        public Long getRole() {
            return this.role;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setNick(String nick) {
            this.nick = nick;
            return this;
        }
        public String getNick() {
            return this.nick;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setTop(Boolean top) {
            this.top = top;
            return this;
        }
        public Boolean getTop() {
            return this.top;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setRedPoint(Long redPoint) {
            this.redPoint = redPoint;
            return this;
        }
        public Long getRedPoint() {
            return this.redPoint;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setMute(Boolean mute) {
            this.mute = mute;
            return this;
        }
        public Boolean getMute() {
            return this.mute;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setVisible(Boolean visible) {
            this.visible = visible;
            return this;
        }
        public Boolean getVisible() {
            return this.visible;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setModifyTime(Long modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public Long getModifyTime() {
            return this.modifyTime;
        }

        public ImportGroupChatMemberRequestRequestParamsGroupChatMembers setExtensions(java.util.Map<String, String> extensions) {
            this.extensions = extensions;
            return this;
        }
        public java.util.Map<String, String> getExtensions() {
            return this.extensions;
        }

    }

    public static class ImportGroupChatMemberRequestRequestParams extends TeaModel {
        // 群ID
        @NameInMap("AppCid")
        public String appCid;

        @NameInMap("GroupChatMembers")
        public java.util.List<ImportGroupChatMemberRequestRequestParamsGroupChatMembers> groupChatMembers;

        public static ImportGroupChatMemberRequestRequestParams build(java.util.Map<String, ?> map) throws Exception {
            ImportGroupChatMemberRequestRequestParams self = new ImportGroupChatMemberRequestRequestParams();
            return TeaModel.build(map, self);
        }

        public ImportGroupChatMemberRequestRequestParams setAppCid(String appCid) {
            this.appCid = appCid;
            return this;
        }
        public String getAppCid() {
            return this.appCid;
        }

        public ImportGroupChatMemberRequestRequestParams setGroupChatMembers(java.util.List<ImportGroupChatMemberRequestRequestParamsGroupChatMembers> groupChatMembers) {
            this.groupChatMembers = groupChatMembers;
            return this;
        }
        public java.util.List<ImportGroupChatMemberRequestRequestParamsGroupChatMembers> getGroupChatMembers() {
            return this.groupChatMembers;
        }

    }

}
