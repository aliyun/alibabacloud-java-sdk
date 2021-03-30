// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListOpenAccountsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("OpenAccounts")
    public java.util.List<ListOpenAccountsResponseBodyOpenAccounts> openAccounts;

    public static ListOpenAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOpenAccountsResponseBody self = new ListOpenAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOpenAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOpenAccountsResponseBody setOpenAccounts(java.util.List<ListOpenAccountsResponseBodyOpenAccounts> openAccounts) {
        this.openAccounts = openAccounts;
        return this;
    }
    public java.util.List<ListOpenAccountsResponseBodyOpenAccounts> getOpenAccounts() {
        return this.openAccounts;
    }

    public static class ListOpenAccountsResponseBodyOpenAccounts extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("CreateAccessKey")
        public String createAccessKey;

        @NameInMap("OpenId")
        public String openId;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("Region")
        public String region;

        @NameInMap("IdentityId")
        public String identityId;

        @NameInMap("LoginId")
        public String loginId;

        @NameInMap("Idp")
        public String idp;

        @NameInMap("AliyunId")
        public String aliyunId;

        public static ListOpenAccountsResponseBodyOpenAccounts build(java.util.Map<String, ?> map) throws Exception {
            ListOpenAccountsResponseBodyOpenAccounts self = new ListOpenAccountsResponseBodyOpenAccounts();
            return TeaModel.build(map, self);
        }

        public ListOpenAccountsResponseBodyOpenAccounts setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setCreateAccessKey(String createAccessKey) {
            this.createAccessKey = createAccessKey;
            return this;
        }
        public String getCreateAccessKey() {
            return this.createAccessKey;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setOpenId(String openId) {
            this.openId = openId;
            return this;
        }
        public String getOpenId() {
            return this.openId;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setLoginId(String loginId) {
            this.loginId = loginId;
            return this;
        }
        public String getLoginId() {
            return this.loginId;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setIdp(String idp) {
            this.idp = idp;
            return this;
        }
        public String getIdp() {
            return this.idp;
        }

        public ListOpenAccountsResponseBodyOpenAccounts setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

    }

}
