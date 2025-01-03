// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemRecordResponseBody extends TeaModel {
    @NameInMap("WorkitemTime")
    public CreateWorkitemRecordResponseBodyWorkitemTime workitemTime;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>error</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <p>Id of the request</p>
     * 
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
        /**
         * <strong>example:</strong>
         * <p>1316458xxxxx41068</p>
         */
        @NameInMap("account")
        public String account;

        /**
         * <strong>example:</strong>
         * <p><a href="https://tcs-devops.aliyuncs.com/thumbnail/112m7150e256dbba0d6456bafbb65c81f90d/w/200/h/200">https://tcs-devops.aliyuncs.com/thumbnail/112m7150e256dbba0d6456bafbb65c81f90d/w/200/h/200</a></p>
         */
        @NameInMap("avatar")
        public String avatar;

        /**
         * <strong>example:</strong>
         * <p>xx12322</p>
         */
        @NameInMap("dingTalkId")
        public String dingTalkId;

        @NameInMap("displayName")
        public String displayName;

        @NameInMap("displayNickName")
        public String displayNickName;

        @NameInMap("displayRealName")
        public String displayRealName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:xxx@xxx.com">xxx@xxx.com</a></p>
         */
        @NameInMap("email")
        public String email;

        @NameInMap("gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>deafe5f33xxxxx6a259d8dafd</p>
         */
        @NameInMap("identifier")
        public String identifier;

        /**
         * <strong>example:</strong>
         * <p>true/false</p>
         */
        @NameInMap("isDisabled")
        public Boolean isDisabled;

        @NameInMap("mobile")
        public String mobile;

        /**
         * <strong>example:</strong>
         * <p>wangwu</p>
         */
        @NameInMap("nameEn")
        public String nameEn;

        @NameInMap("nickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>wangwu</p>
         */
        @NameInMap("nickNamePinyin")
        public String nickNamePinyin;

        @NameInMap("realName")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p>wangwu</p>
         */
        @NameInMap("realNamePinyin")
        public String realNamePinyin;

        @NameInMap("stamp")
        public String stamp;

        /**
         * <strong>example:</strong>
         * <p>1e9903d8b3f1xxxxxf9286ef5</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("actualTime")
        public Long actualTime;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1667205617089</p>
         */
        @NameInMap("gmtEnd")
        public Long gmtEnd;

        /**
         * <strong>example:</strong>
         * <p>1667205617061</p>
         */
        @NameInMap("gmtStart")
        public Long gmtStart;

        /**
         * <strong>example:</strong>
         * <p>deafe5f33xxxxx6a259d8dafd</p>
         */
        @NameInMap("identifier")
        public String identifier;

        @NameInMap("recordUser")
        public CreateWorkitemRecordResponseBodyWorkitemTimeRecordUser recordUser;

        /**
         * <strong>example:</strong>
         * <p>deafe5f33xxxxx6a259d8dafd</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>9144ef6b72d8exxxxx9e61a4d0</p>
         */
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
