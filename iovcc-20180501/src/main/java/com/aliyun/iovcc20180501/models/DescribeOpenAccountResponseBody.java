// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeOpenAccountResponseBody extends TeaModel {
    @NameInMap("OpenAccount")
    public DescribeOpenAccountResponseBodyOpenAccount openAccount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeOpenAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenAccountResponseBody self = new DescribeOpenAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOpenAccountResponseBody setOpenAccount(DescribeOpenAccountResponseBodyOpenAccount openAccount) {
        this.openAccount = openAccount;
        return this;
    }
    public DescribeOpenAccountResponseBodyOpenAccount getOpenAccount() {
        return this.openAccount;
    }

    public DescribeOpenAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeOpenAccountResponseBodyOpenAccount extends TeaModel {
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

        public static DescribeOpenAccountResponseBodyOpenAccount build(java.util.Map<String, ?> map) throws Exception {
            DescribeOpenAccountResponseBodyOpenAccount self = new DescribeOpenAccountResponseBodyOpenAccount();
            return TeaModel.build(map, self);
        }

        public DescribeOpenAccountResponseBodyOpenAccount setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setCreateAccessKey(String createAccessKey) {
            this.createAccessKey = createAccessKey;
            return this;
        }
        public String getCreateAccessKey() {
            return this.createAccessKey;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setOpenId(String openId) {
            this.openId = openId;
            return this;
        }
        public String getOpenId() {
            return this.openId;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setIdentityId(String identityId) {
            this.identityId = identityId;
            return this;
        }
        public String getIdentityId() {
            return this.identityId;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setLoginId(String loginId) {
            this.loginId = loginId;
            return this;
        }
        public String getLoginId() {
            return this.loginId;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setIdp(String idp) {
            this.idp = idp;
            return this;
        }
        public String getIdp() {
            return this.idp;
        }

        public DescribeOpenAccountResponseBodyOpenAccount setAliyunId(String aliyunId) {
            this.aliyunId = aliyunId;
            return this;
        }
        public String getAliyunId() {
            return this.aliyunId;
        }

    }

}
