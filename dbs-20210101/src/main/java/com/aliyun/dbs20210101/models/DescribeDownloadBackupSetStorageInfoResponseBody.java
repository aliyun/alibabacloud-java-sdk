// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadBackupSetStorageInfoResponseBody extends TeaModel {
    // The error code.
    @NameInMap("Code")
    public String code;

    // The response parameters.
    @NameInMap("Data")
    public DescribeDownloadBackupSetStorageInfoResponseBodyData data;

    // The error code.
    @NameInMap("ErrCode")
    public String errCode;

    // The error message.
    @NameInMap("ErrMessage")
    public String errMessage;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: the request is successful.
    // *   **false**: the request fails.
    @NameInMap("Success")
    public String success;

    public static DescribeDownloadBackupSetStorageInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadBackupSetStorageInfoResponseBody self = new DescribeDownloadBackupSetStorageInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setData(DescribeDownloadBackupSetStorageInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDownloadBackupSetStorageInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadBackupSetStorageInfoResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class DescribeDownloadBackupSetStorageInfoResponseBodyData extends TeaModel {
        // The expiration time of the URL.
        // 
        // >  The return value is in the timestamp format.
        @NameInMap("ExpirationTime")
        public Long expirationTime;

        // The private download URL of the backup set.
        @NameInMap("PrivateUrl")
        public String privateUrl;

        // The public download URL of the backup set.
        @NameInMap("PublicUrl")
        public String publicUrl;

        public static DescribeDownloadBackupSetStorageInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadBackupSetStorageInfoResponseBodyData self = new DescribeDownloadBackupSetStorageInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadBackupSetStorageInfoResponseBodyData setExpirationTime(Long expirationTime) {
            this.expirationTime = expirationTime;
            return this;
        }
        public Long getExpirationTime() {
            return this.expirationTime;
        }

        public DescribeDownloadBackupSetStorageInfoResponseBodyData setPrivateUrl(String privateUrl) {
            this.privateUrl = privateUrl;
            return this;
        }
        public String getPrivateUrl() {
            return this.privateUrl;
        }

        public DescribeDownloadBackupSetStorageInfoResponseBodyData setPublicUrl(String publicUrl) {
            this.publicUrl = publicUrl;
            return this;
        }
        public String getPublicUrl() {
            return this.publicUrl;
        }

    }

}
