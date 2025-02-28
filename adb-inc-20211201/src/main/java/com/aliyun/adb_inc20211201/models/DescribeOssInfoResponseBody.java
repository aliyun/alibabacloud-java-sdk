// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("ossInfo")
    public DescribeOssInfoResponseBodyOssInfo ossInfo;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeOssInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssInfoResponseBody self = new DescribeOssInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssInfoResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeOssInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOssInfoResponseBody setOssInfo(DescribeOssInfoResponseBodyOssInfo ossInfo) {
        this.ossInfo = ossInfo;
        return this;
    }
    public DescribeOssInfoResponseBodyOssInfo getOssInfo() {
        return this.ossInfo;
    }

    public DescribeOssInfoResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeOssInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOssInfoResponseBodyOssInfo extends TeaModel {
        @NameInMap("accessId")
        public String accessId;

        @NameInMap("accessSecret")
        public String accessSecret;

        @NameInMap("bucket")
        public String bucket;

        @NameInMap("dbClusterId")
        public String dbClusterId;

        @NameInMap("endpoint")
        public String endpoint;

        @NameInMap("keepDays")
        public String keepDays;

        @NameInMap("ownerId")
        public String ownerId;

        @NameInMap("policyName")
        public String policyName;

        @NameInMap("region")
        public String region;

        @NameInMap("roleName")
        public String roleName;

        @NameInMap("url")
        public String url;

        @NameInMap("userName")
        public String userName;

        public static DescribeOssInfoResponseBodyOssInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssInfoResponseBodyOssInfo self = new DescribeOssInfoResponseBodyOssInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOssInfoResponseBodyOssInfo setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public DescribeOssInfoResponseBodyOssInfo setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public DescribeOssInfoResponseBodyOssInfo setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeOssInfoResponseBodyOssInfo setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public DescribeOssInfoResponseBodyOssInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeOssInfoResponseBodyOssInfo setKeepDays(String keepDays) {
            this.keepDays = keepDays;
            return this;
        }
        public String getKeepDays() {
            return this.keepDays;
        }

        public DescribeOssInfoResponseBodyOssInfo setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeOssInfoResponseBodyOssInfo setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeOssInfoResponseBodyOssInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeOssInfoResponseBodyOssInfo setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeOssInfoResponseBodyOssInfo setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeOssInfoResponseBodyOssInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
