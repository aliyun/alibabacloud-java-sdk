// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAppSecuritiesResponseBody extends TeaModel {
    @NameInMap("AppSecuritys")
    public DescribeAppSecuritiesResponseBodyAppSecuritys appSecuritys;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppSecuritiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppSecuritiesResponseBody self = new DescribeAppSecuritiesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppSecuritiesResponseBody setAppSecuritys(DescribeAppSecuritiesResponseBodyAppSecuritys appSecuritys) {
        this.appSecuritys = appSecuritys;
        return this;
    }
    public DescribeAppSecuritiesResponseBodyAppSecuritys getAppSecuritys() {
        return this.appSecuritys;
    }

    public DescribeAppSecuritiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        public static DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity self = new DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity();
            return TeaModel.build(map, self);
        }

        public DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

    }

    public static class DescribeAppSecuritiesResponseBodyAppSecuritys extends TeaModel {
        @NameInMap("AppSecurity")
        public java.util.List<DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity> appSecurity;

        public static DescribeAppSecuritiesResponseBodyAppSecuritys build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppSecuritiesResponseBodyAppSecuritys self = new DescribeAppSecuritiesResponseBodyAppSecuritys();
            return TeaModel.build(map, self);
        }

        public DescribeAppSecuritiesResponseBodyAppSecuritys setAppSecurity(java.util.List<DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity> appSecurity) {
            this.appSecurity = appSecurity;
            return this;
        }
        public java.util.List<DescribeAppSecuritiesResponseBodyAppSecuritysAppSecurity> getAppSecurity() {
            return this.appSecurity;
        }

    }

}
