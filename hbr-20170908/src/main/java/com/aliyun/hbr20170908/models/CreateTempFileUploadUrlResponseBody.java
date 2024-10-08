// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class CreateTempFileUploadUrlResponseBody extends TeaModel {
    /**
     * <p>The name of the OSS bucket to which the file is uploaded.</p>
     * 
     * <strong>example:</strong>
     * <p>hbr-temp-bucket</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The HTTP status code. The status code 200 indicates that the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The endpoint that is used to upload the file to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-shenzhen.aliyuncs.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The expiration time of the signature that is used to upload the file to OSS. This value is a UNIX timestamp. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1654326678</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The message that is returned. If the call is successful, &quot;successful&quot; is returned. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The AccessKey ID that is used to upload the file to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>LTAI****Up</p>
     */
    @NameInMap("OssAccessKeyId")
    public String ossAccessKeyId;

    /**
     * <p>The policy that is used to upload the file to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJleH****V19</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F4EEB401-DD21-588D-AE3B-1E835C7655E1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The signature that is used to upload the file to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>RmhI****0A=</p>
     */
    @NameInMap("Signature")
    public String signature;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The key that is used to upload the file to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>temp/1440155109798732/upload/2022-07-29/49bed34c-b430-4e7e-89b1-4be2b734f95c/iaclone.diff</p>
     */
    @NameInMap("TempFileKey")
    public String tempFileKey;

    public static CreateTempFileUploadUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTempFileUploadUrlResponseBody self = new CreateTempFileUploadUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTempFileUploadUrlResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public CreateTempFileUploadUrlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTempFileUploadUrlResponseBody setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateTempFileUploadUrlResponseBody setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateTempFileUploadUrlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTempFileUploadUrlResponseBody setOssAccessKeyId(String ossAccessKeyId) {
        this.ossAccessKeyId = ossAccessKeyId;
        return this;
    }
    public String getOssAccessKeyId() {
        return this.ossAccessKeyId;
    }

    public CreateTempFileUploadUrlResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public CreateTempFileUploadUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTempFileUploadUrlResponseBody setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

    public CreateTempFileUploadUrlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateTempFileUploadUrlResponseBody setTempFileKey(String tempFileKey) {
        this.tempFileKey = tempFileKey;
        return this;
    }
    public String getTempFileKey() {
        return this.tempFileKey;
    }

}
