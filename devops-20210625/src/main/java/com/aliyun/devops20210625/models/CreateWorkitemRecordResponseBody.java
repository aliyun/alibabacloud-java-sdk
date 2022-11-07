// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemRecordResponseBody extends TeaModel {
    @NameInMap("WorkitemTime")
    public CreateWorkitemRecordResponseBodyWorkitemTime workitemTime;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static CreateWorkitemRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemRecordResponseBody self = new CreateWorkitemRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemRecordResponseBody setWorkitemTime(CreateWorkitemRecordResponseBodyWorkitemTime workitemTime) {
        this.workitemTime = workitemTime;
        return this;
    }
    public CreateWorkitemRecordResponseBodyWorkitemTime getWorkitemTime() {
        return this.workitemTime;
    }

    public CreateWorkitemRecordResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateWorkitemRecordResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateWorkitemRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkitemRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser extends TeaModel {
        @NameInMap("account")
        public String account;

        @NameInMap("avatar")
        public String avatar;

        @NameInMap("dingTalkId")
        public String dingTalkId;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("displayNickName")
        public String displayNickName;

        @NameInMap("displayRealName")
        public String displayRealName;

        @NameInMap("email")
        public String email;

        @NameInMap("gender")
        public String gender;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("isDisabled")
        public Boolean isDisabled;

        @NameInMap("mobile")
        public String mobile;

        @NameInMap("nameEn")
        public String nameEn;

        @NameInMap("nickName")
        public String nickName;

        @NameInMap("nickNamePinyin")
        public String nickNamePinyin;

        @NameInMap("realName")
        public String realName;

        @NameInMap("realNamePinyin")
        public String realNamePinyin;

        @NameInMap("stamp")
        public String stamp;

        @NameInMap("tbRoleId")
        public String tbRoleId;

        public static CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser self = new CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setDingTalkId(String dingTalkId) {
            this.dingTalkId = dingTalkId;
            return this;
        }
        public String getDingTalkId() {
            return this.dingTalkId;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setDisplayNickName(String displayNickName) {
            this.displayNickName = displayNickName;
            return this;
        }
        public String getDisplayNickName() {
            return this.displayNickName;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setDisplayRealName(String displayRealName) {
            this.displayRealName = displayRealName;
            return this;
        }
        public String getDisplayRealName() {
            return this.displayRealName;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setNickNamePinyin(String nickNamePinyin) {
            this.nickNamePinyin = nickNamePinyin;
            return this;
        }
        public String getNickNamePinyin() {
            return this.nickNamePinyin;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setRealNamePinyin(String realNamePinyin) {
            this.realNamePinyin = realNamePinyin;
            return this;
        }
        public String getRealNamePinyin() {
            return this.realNamePinyin;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser setTbRoleId(String tbRoleId) {
            this.tbRoleId = tbRoleId;
            return this;
        }
        public String getTbRoleId() {
            return this.tbRoleId;
        }

    }

    public static class CreateWorkitemRecordResponseBodyWorkitemTime extends TeaModel {
        @NameInMap("actualTime")
        public Long actualTime;

        @NameInMap("description")
        public String description;

        @NameInMap("gmtEnd")
        public Long gmtEnd;

        @NameInMap("gmtStart")
        public Long gmtStart;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("recordUser")
        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser recordUser;

        @NameInMap("type")
        public String type;

        @NameInMap("workitemIdentifier")
        public String workitemIdentifier;

        public static CreateWorkitemRecordResponseBodyWorkitemTime build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemRecordResponseBodyWorkitemTime self = new CreateWorkitemRecordResponseBodyWorkitemTime();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemRecordResponseBodyWorkitemTime setActualTime(Long actualTime) {
            this.actualTime = actualTime;
            return this;
        }
        public Long getActualTime() {
            return this.actualTime;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTime setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTime setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTime setGmtStart(Long gmtStart) {
            this.gmtStart = gmtStart;
            return this;
        }
        public Long getGmtStart() {
            return this.gmtStart;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTime setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTime setRecordUser(CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser recordUser) {
            this.recordUser = recordUser;
            return this;
        }
        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser getRecordUser() {
            return this.recordUser;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTime setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateWorkitemRecordResponseBodyWorkitemTime setWorkitemIdentifier(String workitemIdentifier) {
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

    }

}
