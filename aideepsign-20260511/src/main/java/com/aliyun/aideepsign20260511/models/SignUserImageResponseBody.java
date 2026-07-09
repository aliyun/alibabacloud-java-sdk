// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aideepsign20260511.models;

import com.aliyun.tea.*;

public class SignUserImageResponseBody extends TeaModel {
    /**
     * <p>The algorithm used for signing, such as ps256 or es256.</p>
     * 
     * <strong>example:</strong>
     * <p>ps256</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The subject information of the signing certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>CN=AIDeepSign User Certificate,O=Alibaba Cloud</p>
     */
    @NameInMap("CertificateSubject")
    public String certificateSubject;

    /**
     * <p>The business error code. The value &quot;OK&quot; is returned if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code. The value 200 is returned if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The additional information. The value &quot;success&quot; is returned if the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ObjectKey of the signed image in OSS. You can use this value for subsequent API calls.</p>
     * 
     * <strong>example:</strong>
     * <p>deepsign/123456789/signed/abc12345-def6-7890-abcd-ef1234567890.png</p>
     */
    @NameInMap("ObjectKey")
    public String objectKey;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The signing time in ISO 8601 format, such as <code>2026-01-15T08:30:00Z</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-06-18T10:30:00Z</p>
     */
    @NameInMap("SignTime")
    public String signTime;

    /**
     * <p>The pre-signed download URL of the signed image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://bucket.oss-cn-hangzhou.aliyuncs.com/deepsign/123456789/signed/abc12345.png?Expires=1718700000&OSSAccessKeyId=">https://bucket.oss-cn-hangzhou.aliyuncs.com/deepsign/123456789/signed/abc12345.png?Expires=1718700000&amp;OSSAccessKeyId=</a>...</p>
     */
    @NameInMap("SignedImageUrl")
    public String signedImageUrl;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static SignUserImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SignUserImageResponseBody self = new SignUserImageResponseBody();
        return TeaModel.build(map, self);
    }

    public SignUserImageResponseBody setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public SignUserImageResponseBody setCertificateSubject(String certificateSubject) {
        this.certificateSubject = certificateSubject;
        return this;
    }
    public String getCertificateSubject() {
        return this.certificateSubject;
    }

    public SignUserImageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SignUserImageResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SignUserImageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SignUserImageResponseBody setObjectKey(String objectKey) {
        this.objectKey = objectKey;
        return this;
    }
    public String getObjectKey() {
        return this.objectKey;
    }

    public SignUserImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SignUserImageResponseBody setSignTime(String signTime) {
        this.signTime = signTime;
        return this;
    }
    public String getSignTime() {
        return this.signTime;
    }

    public SignUserImageResponseBody setSignedImageUrl(String signedImageUrl) {
        this.signedImageUrl = signedImageUrl;
        return this;
    }
    public String getSignedImageUrl() {
        return this.signedImageUrl;
    }

    public SignUserImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
