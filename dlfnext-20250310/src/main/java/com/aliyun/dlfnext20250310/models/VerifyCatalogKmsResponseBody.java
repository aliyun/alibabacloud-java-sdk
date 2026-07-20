// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class VerifyCatalogKmsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("hint")
    public String hint;

    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    @NameInMap("serverSideEncryption")
    public String serverSideEncryption;

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
