// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitDeviceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ResultObject")
    @Validation(required = true)
    public InitDeviceResponseResultObject resultObject;

    public static InitDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        InitDeviceResponse self = new InitDeviceResponse();
        return TeaModel.build(map, self);
    }

    public InitDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InitDeviceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InitDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InitDeviceResponse setResultObject(InitDeviceResponseResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public InitDeviceResponseResultObject getResultObject() {
        return this.resultObject;
    }

    public static class InitDeviceResponseResultObject extends TeaModel {
        @NameInMap("CertifyId")
        @Validation(required = true)
        public String certifyId;

        @NameInMap("Protocol")
        @Validation(required = true)
        public String protocol;

        @NameInMap("ExtParams")
        @Validation(required = true)
        public String extParams;

        @NameInMap("RetCode")
        @Validation(required = true)
        public String retCode;

        @NameInMap("RetCodeSub")
        @Validation(required = true)
        public String retCodeSub;

        @NameInMap("RetMessageSub")
        @Validation(required = true)
        public String retMessageSub;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("OssEndPoint")
        @Validation(required = true)
        public String ossEndPoint;

        @NameInMap("AccessKeyId")
        @Validation(required = true)
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        @Validation(required = true)
        public String accessKeySecret;

        @NameInMap("SecurityToken")
        @Validation(required = true)
        public String securityToken;

        @NameInMap("BucketName")
        @Validation(required = true)
        public String bucketName;

        @NameInMap("FileNamePrefix")
        @Validation(required = true)
        public String fileNamePrefix;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("PresignedUrl")
        @Validation(required = true)
        public String presignedUrl;

        public static InitDeviceResponseResultObject build(java.util.Map<String, ?> map) throws Exception {
            InitDeviceResponseResultObject self = new InitDeviceResponseResultObject();
            return TeaModel.build(map, self);
        }

        public InitDeviceResponseResultObject setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public InitDeviceResponseResultObject setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public InitDeviceResponseResultObject setExtParams(String extParams) {
            this.extParams = extParams;
            return this;
        }
        public String getExtParams() {
            return this.extParams;
        }

        public InitDeviceResponseResultObject setRetCode(String retCode) {
            this.retCode = retCode;
            return this;
        }
        public String getRetCode() {
            return this.retCode;
        }

        public InitDeviceResponseResultObject setRetCodeSub(String retCodeSub) {
            this.retCodeSub = retCodeSub;
            return this;
        }
        public String getRetCodeSub() {
            return this.retCodeSub;
        }

        public InitDeviceResponseResultObject setRetMessageSub(String retMessageSub) {
            this.retMessageSub = retMessageSub;
            return this;
        }
        public String getRetMessageSub() {
            return this.retMessageSub;
        }

        public InitDeviceResponseResultObject setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public InitDeviceResponseResultObject setOssEndPoint(String ossEndPoint) {
            this.ossEndPoint = ossEndPoint;
            return this;
        }
        public String getOssEndPoint() {
            return this.ossEndPoint;
        }

        public InitDeviceResponseResultObject setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public InitDeviceResponseResultObject setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public InitDeviceResponseResultObject setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public InitDeviceResponseResultObject setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public InitDeviceResponseResultObject setFileNamePrefix(String fileNamePrefix) {
            this.fileNamePrefix = fileNamePrefix;
            return this;
        }
        public String getFileNamePrefix() {
            return this.fileNamePrefix;
        }

        public InitDeviceResponseResultObject setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public InitDeviceResponseResultObject setPresignedUrl(String presignedUrl) {
            this.presignedUrl = presignedUrl;
            return this;
        }
        public String getPresignedUrl() {
            return this.presignedUrl;
        }

    }

}
