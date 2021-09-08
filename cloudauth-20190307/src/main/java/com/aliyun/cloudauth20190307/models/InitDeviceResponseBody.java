// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public InitDeviceResponseBodyResultObject resultObject;

    public static InitDeviceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InitDeviceResponseBody self = new InitDeviceResponseBody();
        return TeaModel.build(map, self);
    }

    public InitDeviceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitDeviceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitDeviceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitDeviceResponseBody setResultObject(InitDeviceResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public InitDeviceResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class InitDeviceResponseBodyResultObject extends TeaModel {
        @NameInMap("OssEndPoint")
        public String ossEndPoint;

        @NameInMap("RetCodeSub")
        public String retCodeSub;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("CertifyId")
        public String certifyId;

        @NameInMap("ExtParams")
        public String extParams;

        @NameInMap("Message")
        public String message;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("PresignedUrl")
        public String presignedUrl;

        @NameInMap("SecurityToken")
        public String securityToken;

        @NameInMap("FileNamePrefix")
        public String fileNamePrefix;

        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("RetMessageSub")
        public String retMessageSub;

        @NameInMap("RetCode")
        public String retCode;

        public static InitDeviceResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            InitDeviceResponseBodyResultObject self = new InitDeviceResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public InitDeviceResponseBodyResultObject setOssEndPoint(String ossEndPoint) {
            this.ossEndPoint = ossEndPoint;
            return this;
        }
        public String getOssEndPoint() {
            return this.ossEndPoint;
        }

        public InitDeviceResponseBodyResultObject setRetCodeSub(String retCodeSub) {
            this.retCodeSub = retCodeSub;
            return this;
        }
        public String getRetCodeSub() {
            return this.retCodeSub;
        }

        public InitDeviceResponseBodyResultObject setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public InitDeviceResponseBodyResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public InitDeviceResponseBodyResultObject setExtParams(String extParams) {
            this.extParams = extParams;
            return this;
        }
        public String getExtParams() {
            return this.extParams;
        }

        public InitDeviceResponseBodyResultObject setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InitDeviceResponseBodyResultObject setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public InitDeviceResponseBodyResultObject setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public InitDeviceResponseBodyResultObject setPresignedUrl(String presignedUrl) {
            this.presignedUrl = presignedUrl;
            return this;
        }
        public String getPresignedUrl() {
            return this.presignedUrl;
        }

        public InitDeviceResponseBodyResultObject setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public InitDeviceResponseBodyResultObject setFileNamePrefix(String fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public String getFileNamePrefix() {
            return this.fileNamePrefix;
        }

        public InitDeviceResponseBodyResultObject setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public InitDeviceResponseBodyResultObject setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public InitDeviceResponseBodyResultObject setRetMessageSub(String retMessageSub) {
            this.retMessageSub = retMessageSub;
            return this;
        }
        public String getRetMessageSub() {
            return this.retMessageSub;
        }

        public InitDeviceResponseBodyResultObject setRetCode(String retCode) {
            this.retCode = retCode;
            return this;
        }
        public String getRetCode() {
            return this.retCode;
        }

    }

}
