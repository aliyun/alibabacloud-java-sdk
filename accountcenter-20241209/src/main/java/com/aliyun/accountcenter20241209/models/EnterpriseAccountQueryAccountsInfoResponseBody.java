// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.accountcenter20241209.models;

import com.aliyun.tea.*;

public class EnterpriseAccountQueryAccountsInfoResponseBody extends TeaModel {
    @NameInMap("AccountInfoDtoList")
    public java.util.List<EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList> accountInfoDtoList;

    @NameInMap("Code")
    public String code;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static EnterpriseAccountQueryAccountsInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnterpriseAccountQueryAccountsInfoResponseBody self = new EnterpriseAccountQueryAccountsInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public EnterpriseAccountQueryAccountsInfoResponseBody setAccountInfoDtoList(java.util.List<EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList> accountInfoDtoList) {
        this.accountInfoDtoList = accountInfoDtoList;
        return this;
    }
    public java.util.List<EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList> getAccountInfoDtoList() {
        return this.accountInfoDtoList;
    }

    public EnterpriseAccountQueryAccountsInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EnterpriseAccountQueryAccountsInfoResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public EnterpriseAccountQueryAccountsInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EnterpriseAccountQueryAccountsInfoResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public EnterpriseAccountQueryAccountsInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnterpriseAccountQueryAccountsInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList extends TeaModel {
        @NameInMap("Alias")
        public String alias;

        @NameInMap("BelongToMasterAccount")
        public Boolean belongToMasterAccount;

        @NameInMap("Email")
        public String email;

        @NameInMap("EnterpriseEcId")
        public String enterpriseEcId;

        @NameInMap("EnterpriseEntityId")
        public String enterpriseEntityId;

        @NameInMap("EnterpriseLicenseNo")
        public String enterpriseLicenseNo;

        @NameInMap("EnterpriseName")
        public String enterpriseName;

        @NameInMap("EnterpriseNbId")
        public String enterpriseNbId;

        @NameInMap("FreezeLogin")
        public Boolean freezeLogin;

        @NameInMap("LoginId")
        public String loginId;

        @NameInMap("ManageInviteTimeStamp")
        public String manageInviteTimeStamp;

        @NameInMap("Pk")
        public String pk;

        @NameInMap("SecurityMobile")
        public String securityMobile;

        public static EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList build(java.util.Map<String, ?> map) throws Exception {
            EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList self = new EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList();
            return TeaModel.build(map, self);
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setBelongToMasterAccount(Boolean belongToMasterAccount) {
            this.belongToMasterAccount = belongToMasterAccount;
            return this;
        }
        public Boolean getBelongToMasterAccount() {
            return this.belongToMasterAccount;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setEnterpriseEcId(String enterpriseEcId) {
            this.enterpriseEcId = enterpriseEcId;
            return this;
        }
        public String getEnterpriseEcId() {
            return this.enterpriseEcId;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setEnterpriseEntityId(String enterpriseEntityId) {
            this.enterpriseEntityId = enterpriseEntityId;
            return this;
        }
        public String getEnterpriseEntityId() {
            return this.enterpriseEntityId;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setEnterpriseLicenseNo(String enterpriseLicenseNo) {
            this.enterpriseLicenseNo = enterpriseLicenseNo;
            return this;
        }
        public String getEnterpriseLicenseNo() {
            return this.enterpriseLicenseNo;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setEnterpriseName(String enterpriseName) {
            this.enterpriseName = enterpriseName;
            return this;
        }
        public String getEnterpriseName() {
            return this.enterpriseName;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setEnterpriseNbId(String enterpriseNbId) {
            this.enterpriseNbId = enterpriseNbId;
            return this;
        }
        public String getEnterpriseNbId() {
            return this.enterpriseNbId;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setFreezeLogin(Boolean freezeLogin) {
            this.freezeLogin = freezeLogin;
            return this;
        }
        public Boolean getFreezeLogin() {
            return this.freezeLogin;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setLoginId(String loginId) {
            this.loginId = loginId;
            return this;
        }
        public String getLoginId() {
            return this.loginId;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setManageInviteTimeStamp(String manageInviteTimeStamp) {
            this.manageInviteTimeStamp = manageInviteTimeStamp;
            return this;
        }
        public String getManageInviteTimeStamp() {
            return this.manageInviteTimeStamp;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setPk(String pk) {
            this.pk = pk;
            return this;
        }
        public String getPk() {
            return this.pk;
        }

        public EnterpriseAccountQueryAccountsInfoResponseBodyAccountInfoDtoList setSecurityMobile(String securityMobile) {
            this.securityMobile = securityMobile;
            return this;
        }
        public String getSecurityMobile() {
            return this.securityMobile;
        }

    }

}
