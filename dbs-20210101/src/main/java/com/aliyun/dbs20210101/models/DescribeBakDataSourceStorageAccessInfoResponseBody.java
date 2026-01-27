// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeBakDataSourceStorageAccessInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeBakDataSourceStorageAccessInfoResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Request.Forbidden</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Have no Permissions</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D13761C3-9971-5C02-B789-3F3CD159****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeBakDataSourceStorageAccessInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBakDataSourceStorageAccessInfoResponseBody self = new DescribeBakDataSourceStorageAccessInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBakDataSourceStorageAccessInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeBakDataSourceStorageAccessInfoResponseBody setData(DescribeBakDataSourceStorageAccessInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBakDataSourceStorageAccessInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeBakDataSourceStorageAccessInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBakDataSourceStorageAccessInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBakDataSourceStorageAccessInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeBakDataSourceStorageAccessInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBakDataSourceStorageAccessInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TMP.3Kk6fNt7hhNmHrGYFkLe5WAo8qL18Hk2rKSZkDkZvrey1ksVAFgJ8Vty8isrBHaH5KUNYAwtcW8HUPzjjsNLo*******</p>
         */
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        /**
         * <strong>example:</strong>
         * <p>6XzFspxx5wKjuJ2QwATkxnV7fcFxR*****</p>
         */
        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        /**
         * <strong>example:</strong>
         * <p>dbs-bakdata-test-cn-beijing-backup-oss-0-*****</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <strong>example:</strong>
         * <p>2024-07-11T05:14:44Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <strong>example:</strong>
         * <p>VN/2023/11/13/activity/20080101/activity-*****.tar</p>
         */
        @NameInMap("ObjectKey")
        public String objectKey;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-beijing.****.com</p>
         */
        @NameInMap("OssEndpoint")
        public String ossEndpoint;

        /**
         * <strong>example:</strong>
         * <p>oss-cn-beijing-****.aliyuncs.com</p>
         */
        @NameInMap("OssInternalEndpoint")
        public String ossInternalEndpoint;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("OssRegion")
        public String ossRegion;

        /**
         * <strong>example:</strong>
         * <p>554c0098-9858-4871-9c4c-33d9d*****</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        public static DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo self = new DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setObjectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }
        public String getObjectKey() {
            return this.objectKey;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setOssEndpoint(String ossEndpoint) {
            this.ossEndpoint = ossEndpoint;
            return this;
        }
        public String getOssEndpoint() {
            return this.ossEndpoint;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setOssInternalEndpoint(String ossInternalEndpoint) {
            this.ossInternalEndpoint = ossInternalEndpoint;
            return this;
        }
        public String getOssInternalEndpoint() {
            return this.ossInternalEndpoint;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setOssRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }
        public String getOssRegion() {
            return this.ossRegion;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

    }

    public static class DescribeBakDataSourceStorageAccessInfoResponseBodyData extends TeaModel {
        @NameInMap("OssAccessInfo")
        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo ossAccessInfo;

        /**
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeBakDataSourceStorageAccessInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBakDataSourceStorageAccessInfoResponseBodyData self = new DescribeBakDataSourceStorageAccessInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyData setOssAccessInfo(DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo ossAccessInfo) {
            this.ossAccessInfo = ossAccessInfo;
            return this;
        }
        public DescribeBakDataSourceStorageAccessInfoResponseBodyDataOssAccessInfo getOssAccessInfo() {
            return this.ossAccessInfo;
        }

        public DescribeBakDataSourceStorageAccessInfoResponseBodyData setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
