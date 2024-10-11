// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAddableUsersResponseBody extends TeaModel {
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

    @NameInMap("PageResult")
    public ListAddableUsersResponseBodyPageResult pageResult;

    /**
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAddableUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAddableUsersResponseBody self = new ListAddableUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAddableUsersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAddableUsersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAddableUsersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAddableUsersResponseBody setPageResult(ListAddableUsersResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListAddableUsersResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListAddableUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAddableUsersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAddableUsersResponseBodyPageResultUserList extends TeaModel {
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

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
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
         * <p>123231</p>
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
         * <p>13888888888</p>
         */
        @NameInMap("MobilePhone")
        public String mobilePhone;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("NickName")
        public String nickName;

        /**
         * <strong>example:</strong>
         * <p>231313</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
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
         * <p>aliyun</p>
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

        public static ListAddableUsersResponseBodyPageResultUserList build(java.util.Map<String, ?> map) throws Exception {
            ListAddableUsersResponseBodyPageResultUserList self = new ListAddableUsersResponseBodyPageResultUserList();
            return TeaModel.build(map, self);
        }

        public ListAddableUsersResponseBodyPageResultUserList setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public ListAddableUsersResponseBodyPageResultUserList setDingNumber(String dingNumber) {
            this.dingNumber = dingNumber;
            return this;
        }
        public String getDingNumber() {
            return this.dingNumber;
        }

        public ListAddableUsersResponseBodyPageResultUserList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListAddableUsersResponseBodyPageResultUserList setDisplayNameWithoutStatus(String displayNameWithoutStatus) {
            this.displayNameWithoutStatus = displayNameWithoutStatus;
            return this;
        }
        public String getDisplayNameWithoutStatus() {
            return this.displayNameWithoutStatus;
        }

        public ListAddableUsersResponseBodyPageResultUserList setEnableWhiteIp(String enableWhiteIp) {
            this.enableWhiteIp = enableWhiteIp;
            return this;
        }
        public String getEnableWhiteIp() {
            return this.enableWhiteIp;
        }

        public ListAddableUsersResponseBodyPageResultUserList setFeiShuRobot(String feiShuRobot) {
            this.feiShuRobot = feiShuRobot;
            return this;
        }
        public String getFeiShuRobot() {
            return this.feiShuRobot;
        }

        public ListAddableUsersResponseBodyPageResultUserList setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListAddableUsersResponseBodyPageResultUserList setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListAddableUsersResponseBodyPageResultUserList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAddableUsersResponseBodyPageResultUserList setMail(String mail) {
            this.mail = mail;
            return this;
        }
        public String getMail() {
            return this.mail;
        }

        public ListAddableUsersResponseBodyPageResultUserList setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }
        public String getMobilePhone() {
            return this.mobilePhone;
        }

        public ListAddableUsersResponseBodyPageResultUserList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAddableUsersResponseBodyPageResultUserList setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public ListAddableUsersResponseBodyPageResultUserList setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public ListAddableUsersResponseBodyPageResultUserList setRealName(String realName) {
            this.realName = realName;
            return this;
        }
        public String getRealName() {
            return this.realName;
        }

        public ListAddableUsersResponseBodyPageResultUserList setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public ListAddableUsersResponseBodyPageResultUserList setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListAddableUsersResponseBodyPageResultUserList setWeChatRobot(String weChatRobot) {
            this.weChatRobot = weChatRobot;
            return this;
        }
        public String getWeChatRobot() {
            return this.weChatRobot;
        }

        public ListAddableUsersResponseBodyPageResultUserList setWhiteIp(String whiteIp) {
            this.whiteIp = whiteIp;
            return this;
        }
        public String getWhiteIp() {
            return this.whiteIp;
        }

    }

    public static class ListAddableUsersResponseBodyPageResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>66</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("UserList")
        public java.util.List<ListAddableUsersResponseBodyPageResultUserList> userList;

        public static ListAddableUsersResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListAddableUsersResponseBodyPageResult self = new ListAddableUsersResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListAddableUsersResponseBodyPageResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListAddableUsersResponseBodyPageResult setUserList(java.util.List<ListAddableUsersResponseBodyPageResultUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<ListAddableUsersResponseBodyPageResultUserList> getUserList() {
            return this.userList;
        }

    }

}
