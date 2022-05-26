// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AuthAndActiveWithHidResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public AuthAndActiveWithHidResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static AuthAndActiveWithHidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AuthAndActiveWithHidResponseBody self = new AuthAndActiveWithHidResponseBody();
        return TeaModel.build(map, self);
    }

    public AuthAndActiveWithHidResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AuthAndActiveWithHidResponseBody setData(AuthAndActiveWithHidResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AuthAndActiveWithHidResponseBodyData getData() {
        return this.data;
    }

    public AuthAndActiveWithHidResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public AuthAndActiveWithHidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AuthAndActiveWithHidResponseBodyDataAccountModel extends TeaModel {
        @NameInMap("AliyunId")
        public String aliyunId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Email")
        public String email;

        @NameInMap("HavanaId")
        public Long havanaId;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("PK")
        public String PK;

        public static AuthAndActiveWithHidResponseBodyDataAccountModel build(java.util.Map<String, ?> map) throws Exception {
            AuthAndActiveWithHidResponseBodyDataAccountModel self = new AuthAndActiveWithHidResponseBodyDataAccountModel();
            return TeaModel.build(map, self);
        }

        public AuthAndActiveWithHidResponseBodyDataAccountModel setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

        public AuthAndActiveWithHidResponseBodyDataAccountModel setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public AuthAndActiveWithHidResponseBodyDataAccountModel setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public AuthAndActiveWithHidResponseBodyDataAccountModel setHavanaId(Long havanaId) {
            this.havanaId = havanaId;
            return this;
        }
        public Long getHavanaId() {
            return this.havanaId;
        }

        public AuthAndActiveWithHidResponseBodyDataAccountModel setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public AuthAndActiveWithHidResponseBodyDataAccountModel setPK(String PK) {
            this.PK = PK;
            return this;
        }
        public String getPK() {
            return this.PK;
        }

    }

    public static class AuthAndActiveWithHidResponseBodyDataSessionModel extends TeaModel {
        @NameInMap("AliyunPK")
        public String aliyunPK;

        @NameInMap("LoginTicket")
        public String loginTicket;

        public static AuthAndActiveWithHidResponseBodyDataSessionModel build(java.util.Map<String, ?> map) throws Exception {
            AuthAndActiveWithHidResponseBodyDataSessionModel self = new AuthAndActiveWithHidResponseBodyDataSessionModel();
            return TeaModel.build(map, self);
        }

        public AuthAndActiveWithHidResponseBodyDataSessionModel setAliyunPK(String aliyunPK) {
            this.aliyunPK = aliyunPK;
            return this;
        }
        public String getAliyunPK() {
            return this.aliyunPK;
        }

        public AuthAndActiveWithHidResponseBodyDataSessionModel setLoginTicket(String loginTicket) {
            this.loginTicket = loginTicket;
            return this;
        }
        public String getLoginTicket() {
            return this.loginTicket;
        }

    }

    public static class AuthAndActiveWithHidResponseBodyData extends TeaModel {
        @NameInMap("AccountModel")
        public AuthAndActiveWithHidResponseBodyDataAccountModel accountModel;

        @NameInMap("SessionModel")
        public AuthAndActiveWithHidResponseBodyDataSessionModel sessionModel;

        public static AuthAndActiveWithHidResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AuthAndActiveWithHidResponseBodyData self = new AuthAndActiveWithHidResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AuthAndActiveWithHidResponseBodyData setAccountModel(AuthAndActiveWithHidResponseBodyDataAccountModel accountModel) {
            this.accountModel = accountModel;
            return this;
        }
        public AuthAndActiveWithHidResponseBodyDataAccountModel getAccountModel() {
            return this.accountModel;
        }

        public AuthAndActiveWithHidResponseBodyData setSessionModel(AuthAndActiveWithHidResponseBodyDataSessionModel sessionModel) {
            this.sessionModel = sessionModel;
            return this;
        }
        public AuthAndActiveWithHidResponseBodyDataSessionModel getSessionModel() {
            return this.sessionModel;
        }

    }

}
