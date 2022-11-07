// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemEstimateResponseBody extends TeaModel {
    @NameInMap("WorkitemTimeEstimate")
    public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate workitemTimeEstimate;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMsg")
    public String errorMsg;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static CreateWorkitemEstimateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemEstimateResponseBody self = new CreateWorkitemEstimateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemEstimateResponseBody setWorkitemTimeEstimate(CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate workitemTimeEstimate) {
        this.workitemTimeEstimate = workitemTimeEstimate;
        return this;
    }
    public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate getWorkitemTimeEstimate() {
        return this.workitemTimeEstimate;
    }

    public CreateWorkitemEstimateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateWorkitemEstimateResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CreateWorkitemEstimateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkitemEstimateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser extends TeaModel {
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

        public static CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser self = new CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setDingTalkId(String dingTalkId) {
            this.dingTalkId = dingTalkId;
            return this;
        }
        public String getDingTalkId() {
            return this.dingTalkId;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setDisplayNickName(String displayNickName) {
            this.displayNickName = displayNickName;
            return this;
        }
        public String getDisplayNickName() {
            return this.displayNickName;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setDisplayRealName(String displayRealName) {
            this.displayRealName = displayRealName;
            return this;
        }
        public String getDisplayRealName() {
            return this.displayRealName;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setIsDisabled(Boolean isDisabled) {
            this.isDisabled = isDisabled;
            return this;
        }
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setNameEn(String nameEn) {
            this.nameEn = nameEn;
            return this;
        }
        public String getNameEn() {
            return this.nameEn;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setNickNamePinyin(String nickNamePinyin) {
            this.nickNamePinyin = nickNamePinyin;
            return this;
        }
        public String getNickNamePinyin() {
            return this.nickNamePinyin;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setRealNamePinyin(String realNamePinyin) {
            this.realNamePinyin = realNamePinyin;
            return this;
        }
        public String getRealNamePinyin() {
            return this.realNamePinyin;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setStamp(String stamp) {
            this.stamp = stamp;
            return this;
        }
        public String getStamp() {
            return this.stamp;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser setTbRoleId(String tbRoleId) {
            this.tbRoleId = tbRoleId;
            return this;
        }
        public String getTbRoleId() {
            return this.tbRoleId;
        }

    }

    public static class CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("identifier")
        public String identifier;

        @NameInMap("recordUser")
        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser recordUser;

        @NameInMap("spentTime")
        public Long spentTime;

        @NameInMap("type")
        public String type;

        @NameInMap("workitemIdentifier")
        public String workitemIdentifier;

        public static CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate self = new CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate();
            return TeaModel.build(map, self);
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }
        public String getIdentifier() {
            return this.identifier;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate setRecordUser(CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser recordUser) {
            this.recordUser = recordUser;
            return this;
        }
        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimateRecordUser getRecordUser() {
            return this.recordUser;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate setSpentTime(Long spentTime) {
            this.spentTime = spentTime;
            return this;
        }
        public Long getSpentTime() {
            return this.spentTime;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateWorkitemEstimateResponseBodyWorkitemTimeEstimate setWorkitemIdentifier(String workitemIdentifier) {
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

    }

}
