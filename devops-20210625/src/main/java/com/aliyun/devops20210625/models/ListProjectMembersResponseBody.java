// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMsg")
    public String errorMsg;

    // member信息
    @NameInMap("members")
    public java.util.List<ListProjectMembersResponseBodyMembers> members;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true或者false
    @NameInMap("success")
    public Boolean success;

    public static ListProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectMembersResponseBody self = new ListProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectMembersResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListProjectMembersResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListProjectMembersResponseBody setMembers(java.util.List<ListProjectMembersResponseBodyMembers> members) {
        this.members = members;
        return this;
    }
    public java.util.List<ListProjectMembersResponseBodyMembers> getMembers() {
        return this.members;
    }

    public ListProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListProjectMembersResponseBodyMembersDivision extends TeaModel {
        // 部门唯一标识
        @NameInMap("identifier")
        public String identifier;

        public static ListProjectMembersResponseBodyMembersDivision build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyMembersDivision self = new ListProjectMembersResponseBodyMembersDivision();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyMembersDivision setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

    }

    public static class ListProjectMembersResponseBodyMembersOrganizationUserInfo extends TeaModel {
        // 企业唯一标识符
        @NameInMap("organizationIdentifier")
        public String organizationIdentifier;

        public static ListProjectMembersResponseBodyMembersOrganizationUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyMembersOrganizationUserInfo self = new ListProjectMembersResponseBodyMembersOrganizationUserInfo();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyMembersOrganizationUserInfo setOrganizationIdentifier(String organizationIdentifier) {
            this.organizationIdentifier = organizationIdentifier;
            return this;
        }
        public String getOrganizationIdentifier() {
            return this.organizationIdentifier;
        }

    }

    public static class ListProjectMembersResponseBodyMembers extends TeaModel {
        // 登陆账号
        @NameInMap("account")
        public String account;

        // 用户头像
        @NameInMap("avatar")
        public String avatar;

        // 钉钉id
        @NameInMap("dingTalkId")
        public String dingTalkId;

        // 展示名
        @NameInMap("displayName")
        public String displayName;

        // 展示昵称
        @NameInMap("displayNickName")
        public String displayNickName;

        // 展示真名
        @NameInMap("displayRealName")
        public String displayRealName;

        // 部门信息
        @NameInMap("division")
        public ListProjectMembersResponseBodyMembersDivision division;

        // 邮箱
        @NameInMap("email")
        public String email;

        // 性别
        @NameInMap("gender")
        public String gender;

        // 用户唯一 标识符
        @NameInMap("identifier")
        public String identifier;

        // 手机号
        @NameInMap("mobile")
        public String mobile;

        // 英文名
        @NameInMap("nameEn")
        public String nameEn;

        // 昵称
        @NameInMap("nickName")
        public String nickName;

        // 昵称拼音
        @NameInMap("nickNamePinyin")
        public String nickNamePinyin;

        // 企业信息
        @NameInMap("organizationUserInfo")
        public ListProjectMembersResponseBodyMembersOrganizationUserInfo organizationUserInfo;

        // 真名
        @NameInMap("realName")
        public String realName;

        // 真名拼音
        @NameInMap("realNamePinyin")
        public String realNamePinyin;

        // 用户类型
        @NameInMap("stamp")
        public String stamp;

        // 角色id
        @NameInMap("tbRoleId")
        public String tbRoleId;

        public static ListProjectMembersResponseBodyMembers build(java.util.Map<String, ?> map) throws Exception {
            ListProjectMembersResponseBodyMembers self = new ListProjectMembersResponseBodyMembers();
            return TeaModel.build(map, self);
        }

        public ListProjectMembersResponseBodyMembers setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListProjectMembersResponseBodyMembers setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public ListProjectMembersResponseBodyMembers setDingTalkId(String dingTalkId) {
            this.dingTalkId = dingTalkId;
            return this;
        }
        public String getDingTalkId() {
            return this.dingTalkId;
        }

        public ListProjectMembersResponseBodyMembers setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListProjectMembersResponseBodyMembers setDisplayNickName(String displayNickName) {
            this.displayNickName = displayNickName;
            return this;
        }
        public String getDisplayNickName() {
            return this.displayNickName;
        }

        public ListProjectMembersResponseBodyMembers setDisplayRealName(String displayRealName) {
            this.displayRealName = displayRealName;
            return this;
        }
        public String getDisplayRealName() {
            return this.displayRealName;
        }

        public ListProjectMembersResponseBodyMembers setDivision(ListProjectMembersResponseBodyMembersDivision division) {
            this.division = division;
            return this;
        }
        public ListProjectMembersResponseBodyMembersDivision getDivision() {
            return this.division;
        }

        public ListProjectMembersResponseBodyMembers setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public ListProjectMembersResponseBodyMembers setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListProjectMembersResponseBodyMembers setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public ListProjectMembersResponseBodyMembers setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListProjectMembersResponseBodyMembers setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public ListProjectMembersResponseBodyMembers setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListProjectMembersResponseBodyMembers setNickNamePinyin(String nickNamePinyin) {
            this.nickNamePinyin = nickNamePinyin;
            return this;
        }
        public String getNickNamePinyin() {
            return this.nickNamePinyin;
        }

        public ListProjectMembersResponseBodyMembers setOrganizationUserInfo(ListProjectMembersResponseBodyMembersOrganizationUserInfo organizationUserInfo) {
            this.organizationUserInfo = organizationUserInfo;
            return this;
        }
        public ListProjectMembersResponseBodyMembersOrganizationUserInfo getOrganizationUserInfo() {
            return this.organizationUserInfo;
        }

        public ListProjectMembersResponseBodyMembers setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ListProjectMembersResponseBodyMembers setRealNamePinyin(String realNamePinyin) {
            this.realNamePinyin = realNamePinyin;
            return this;
        }
        public String getRealNamePinyin() {
            return this.realNamePinyin;
        }

        public ListProjectMembersResponseBodyMembers setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public ListProjectMembersResponseBodyMembers setTbRoleId(String tbRoleId) {
            this.tbRoleId = tbRoleId;
            return this;
        }
        public String getTbRoleId() {
            return this.tbRoleId;
        }

    }

}
