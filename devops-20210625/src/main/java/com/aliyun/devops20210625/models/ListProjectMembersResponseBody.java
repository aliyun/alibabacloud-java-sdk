// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProjectMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Openapi.RequestError</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("members")
    public java.util.List<ListProjectMembersResponseBodyMembers> members;

    /**
     * <strong>example:</strong>
     * <p>ASSDS-ASSASX-XSAXSA-XSAXSAXS</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>1345xxxxxxx947xxxx</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>5e7xxxxb3cd3711dd6xxx2c</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxxxxx.png">https://xxxxxx.png</a></p>
         */
        @NameInMap("avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("dingTalkId")
        public String dingTalkId;

        /**
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>mingcheng</p>
         */
        @NameInMap("displayNickName")
        public String displayNickName;

        /**
         * <strong>example:</strong>
         * <p>名称</p>
         */
        @NameInMap("displayRealName")
        public String displayRealName;

        @NameInMap("division")
        public ListProjectMembersResponseBodyMembersDivision division;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:accountsxxxx@mail.com">accountsxxxx@mail.com</a></p>
         */
        @NameInMap("email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>19xxxx31947xxxx</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>135xxxxxxxxx</p>
         */
        @NameInMap("mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("nameEn")
        public String nameEn;

        /**
         * <strong>example:</strong>
         * <p>昵称</p>
         */
        @NameInMap("nickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>nicheng</p>
         */
        @NameInMap("nickNamePinyin")
        public String nickNamePinyin;

        @NameInMap("organizationUserInfo")
        public ListProjectMembersResponseBodyMembersOrganizationUserInfo organizationUserInfo;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("realName")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("realNamePinyin")
        public String realNamePinyin;

        /**
         * <p>角色名称</p>
         */
        @NameInMap("roleName")
        public String roleName;

        /**
         * <strong>example:</strong>
         * <p>User</p>
         */
        @NameInMap("stamp")
        public String stamp;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
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

        public ListProjectMembersResponseBodyMembers setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
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
