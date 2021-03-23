// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeProjectAppSecurityResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ProjectAppSecurity")
    public DescribeProjectAppSecurityResponseBodyProjectAppSecurity projectAppSecurity;

    public static DescribeProjectAppSecurityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectAppSecurityResponseBody self = new DescribeProjectAppSecurityResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectAppSecurityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectAppSecurityResponseBody setProjectAppSecurity(DescribeProjectAppSecurityResponseBodyProjectAppSecurity projectAppSecurity) {
        this.projectAppSecurity = projectAppSecurity;
        return this;
    }
    public DescribeProjectAppSecurityResponseBodyProjectAppSecurity getProjectAppSecurity() {
        return this.projectAppSecurity;
    }

    public static class DescribeProjectAppSecurityResponseBodyProjectAppSecurity extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppKey")
        public String appKey;

        @NameInMap("AppSecret")
        public String appSecret;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        public static DescribeProjectAppSecurityResponseBodyProjectAppSecurity build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectAppSecurityResponseBodyProjectAppSecurity self = new DescribeProjectAppSecurityResponseBodyProjectAppSecurity();
            return TeaModel.build(map, self);
        }

        public DescribeProjectAppSecurityResponseBodyProjectAppSecurity setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeProjectAppSecurityResponseBodyProjectAppSecurity setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeProjectAppSecurityResponseBodyProjectAppSecurity setAppKey(String appKey) {
            this.appKey = appKey;
            return this;
        }
        public String getAppKey() {
            return this.appKey;
        }

        public DescribeProjectAppSecurityResponseBodyProjectAppSecurity setAppSecret(String appSecret) {
            this.appSecret = appSecret;
            return this;
        }
        public String getAppSecret() {
            return this.appSecret;
        }

        public DescribeProjectAppSecurityResponseBodyProjectAppSecurity setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeProjectAppSecurityResponseBodyProjectAppSecurity setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

    }

}
