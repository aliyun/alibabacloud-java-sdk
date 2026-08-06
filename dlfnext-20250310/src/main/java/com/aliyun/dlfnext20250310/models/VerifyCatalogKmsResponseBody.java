// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class VerifyCatalogKmsResponseBody extends TeaModel {
    /**
     * <p>The error code returned when the validation fails. An empty string is returned when the validation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>KeyNotFound</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The description of the failure cause and remediation suggestions returned when the validation fails. An empty string is returned when the validation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter KMS keyId is not found.</p>
     */
    @NameInMap("hint")
    public String hint;

    /**
     * <p>The KMS key identifier actually used by the probe object. When the validation is successful, this corresponds to the customer master key (CMK) specified in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>key-1234567890abcdef</p>
     */
    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The server-side encryption method actually used by the probe object. Returns KMS when the validation is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>KMS</p>
     */
    @NameInMap("serverSideEncryption")
    public String serverSideEncryption;

    /**
     * <p>Indicates whether the validation is successful. A value of true indicates that the write probe succeeded and the SSE-KMS configuration of the object meets expectations. A value of false indicates that the validation failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static VerifyCatalogKmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyCatalogKmsResponseBody self = new VerifyCatalogKmsResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyCatalogKmsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public VerifyCatalogKmsResponseBody setHint(String hint) {
        this.hint = hint;
        return this;
    }
    public String getHint() {
        return this.hint;
    }

    public VerifyCatalogKmsResponseBody setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    public VerifyCatalogKmsResponseBody setServerSideEncryption(String serverSideEncryption) {
        this.serverSideEncryption = serverSideEncryption;
        return this;
    }
    public String getServerSideEncryption() {
        return this.serverSideEncryption;
    }

    public VerifyCatalogKmsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
