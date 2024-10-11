// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetUsersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("UserList")
    public java.util.List<GetUsersResponseBodyUserList> userList;

    public static GetUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUsersResponseBody self = new GetUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetUsersResponseBody setUserList(java.util.List<GetUsersResponseBodyUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<GetUsersResponseBodyUserList> getUserList() {
        return this.userList;
    }

    public static class GetUsersResponseBodyUserList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>123@dingding</p>
         */
        @NameInMap("DingNumber")
        public String dingNumber;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("DisplayNameWithoutStatus")
        public String displayNameWithoutStatus;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWhiteIp")
        public String enableWhiteIp;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("FeiShuRobot")
        public String feiShuRobot;

        /**
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1717343597000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1233121</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
         */
        @NameInMap("Mail")
        public String mail;

        /**
         * <strong>example:</strong>
         * <p>1388888888</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        @NameInMap("Name")
        public String name;

        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>231231</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("RealName")
        public String realName;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@xx.com">123@xx.com</a></p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <strong>example:</strong>
         * <p>ALIYUN</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("WeChatRobot")
        public String weChatRobot;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("WhiteIp")
        public String whiteIp;

        public static GetUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            GetUsersResponseBodyUserList self = new GetUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public GetUsersResponseBodyUserList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetUsersResponseBodyUserList setDingNumber(String dingNumber) {
            this.dingNumber = dingNumber;
            return this;
        }
        public String getDingNumber() {
            return this.dingNumber;
        }

        public GetUsersResponseBodyUserList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public GetUsersResponseBodyUserList setDisplayNameWithoutStatus(String displayNameWithoutStatus) {
            this.displayNameWithoutStatus = displayNameWithoutStatus;
            return this;
        }
        public String getDisplayNameWithoutStatus() {
            return this.displayNameWithoutStatus;
        }

        public GetUsersResponseBodyUserList setEnableWhiteIp(String enableWhiteIp) {
            this.enableWhiteIp = enableWhiteIp;
            return this;
        }
        public String getEnableWhiteIp() {
            return this.enableWhiteIp;
        }

        public GetUsersResponseBodyUserList setFeiShuRobot(String feiShuRobot) {
            this.feiShuRobot = feiShuRobot;
            return this;
        }
        public String getFeiShuRobot() {
            return this.feiShuRobot;
        }

        public GetUsersResponseBodyUserList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetUsersResponseBodyUserList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetUsersResponseBodyUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUsersResponseBodyUserList setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public GetUsersResponseBodyUserList setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public GetUsersResponseBodyUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetUsersResponseBodyUserList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public GetUsersResponseBodyUserList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public GetUsersResponseBodyUserList setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public GetUsersResponseBodyUserList setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetUsersResponseBodyUserList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public GetUsersResponseBodyUserList setWeChatRobot(String weChatRobot) {
            this.weChatRobot = weChatRobot;
            return this;
        }
        public String getWeChatRobot() {
            return this.weChatRobot;
        }

        public GetUsersResponseBodyUserList setWhiteIp(String whiteIp) {
            this.whiteIp = whiteIp;
            return this;
        }
        public String getWhiteIp() {
            return this.whiteIp;
        }

    }

}
