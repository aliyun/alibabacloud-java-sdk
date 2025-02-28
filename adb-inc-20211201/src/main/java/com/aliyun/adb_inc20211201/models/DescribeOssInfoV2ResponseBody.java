// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class DescribeOssInfoV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("ossInfo")
    public DescribeOssInfoV2ResponseBodyOssInfo ossInfo;

    @NameInMap("resultCode")
    public String resultCode;

    @NameInMap("success")
    public Boolean success;

    public static DescribeOssInfoV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssInfoV2ResponseBody self = new DescribeOssInfoV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssInfoV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssInfoV2ResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeOssInfoV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOssInfoV2ResponseBody setOssInfo(DescribeOssInfoV2ResponseBodyOssInfo ossInfo) {
        this.ossInfo = ossInfo;
        return this;
    }
    public DescribeOssInfoV2ResponseBodyOssInfo getOssInfo() {
        return this.ossInfo;
    }

    public DescribeOssInfoV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeOssInfoV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOssInfoV2ResponseBodyOssInfo extends TeaModel {
        @NameInMap("accessId")
        public String accessId;

        @NameInMap("accessSecret")
        public String accessSecret;

        @NameInMap("bucket")
        public String bucket;

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

        @NameInMap("userName")
        public String userName;

        public static DescribeOssInfoV2ResponseBodyOssInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssInfoV2ResponseBodyOssInfo self = new DescribeOssInfoV2ResponseBodyOssInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setAccessId(String accessId) {
            this.accessId = accessId;
            return this;
        }
        public String getAccessId() {
            return this.accessId;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setKeepDays(String keepDays) {
            this.keepDays = keepDays;
            return this;
        }
        public String getKeepDays() {
            return this.keepDays;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }
        public String getPolicyName() {
            return this.policyName;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public DescribeOssInfoV2ResponseBodyOssInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
