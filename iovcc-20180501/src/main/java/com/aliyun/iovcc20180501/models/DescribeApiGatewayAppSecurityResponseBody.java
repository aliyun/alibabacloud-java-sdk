// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeApiGatewayAppSecurityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApiGatewayAppSecurity")
    public DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity apiGatewayAppSecurity;

    public static DescribeApiGatewayAppSecurityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGatewayAppSecurityResponseBody self = new DescribeApiGatewayAppSecurityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeApiGatewayAppSecurityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeApiGatewayAppSecurityResponseBody setApiGatewayAppSecurity(DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity apiGatewayAppSecurity) {
        this.apiGatewayAppSecurity = apiGatewayAppSecurity;
        return this;
    }
    public DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity getApiGatewayAppSecurity() {
        return this.apiGatewayAppSecurity;
    }

    public static class DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity extends TeaModel {
        @NameInMap("GatewayAppKey")
        public String gatewayAppKey;

        @NameInMap("GatewayAppSecret")
        public String gatewayAppSecret;

        @NameInMap("GatewayAppId")
        public String gatewayAppId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        public static DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity build(java.util.Map<String, ?> map) throws Exception {
            DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity self = new DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity();
            return TeaModel.build(map, self);
        }

        public DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity setGatewayAppKey(String gatewayAppKey) {
            this.gatewayAppKey = gatewayAppKey;
            return this;
        }
        public String getGatewayAppKey() {
            return this.gatewayAppKey;
        }

        public DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity setGatewayAppSecret(String gatewayAppSecret) {
            this.gatewayAppSecret = gatewayAppSecret;
            return this;
        }
        public String getGatewayAppSecret() {
            return this.gatewayAppSecret;
        }

        public DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity setGatewayAppId(String gatewayAppId) {
            this.gatewayAppId = gatewayAppId;
            return this;
        }
        public String getGatewayAppId() {
            return this.gatewayAppId;
        }

        public DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeApiGatewayAppSecurityResponseBodyApiGatewayAppSecurity setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

}
