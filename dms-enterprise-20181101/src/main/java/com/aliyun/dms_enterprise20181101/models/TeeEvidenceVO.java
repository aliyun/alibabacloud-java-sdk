// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class TeeEvidenceVO extends TeaModel {
    @NameInMap("CipherSuite")
    public String cipherSuite;

    @NameInMap("EnclaveData")
    public String enclaveData;

    @NameInMap("EncryptPublicKeyPem")
    public String encryptPublicKeyPem;

    @NameInMap("EncryptPublicKeyType")
    public String encryptPublicKeyType;

    @NameInMap("ModifiedDate")
    public String modifiedDate;

    @NameInMap("PublicKey")
    public String publicKey;

    @NameInMap("PublicKeyRaBase64")
    public String publicKeyRaBase64;

    @NameInMap("PublicKeyRaType")
    public String publicKeyRaType;

    @NameInMap("QuoteReport")
    public String quoteReport;

    @NameInMap("SignPublicKeyPem")
    public String signPublicKeyPem;

    @NameInMap("SignPublicKeyType")
    public String signPublicKeyType;

    @NameInMap("TrustedMrEnclave")
    public java.util.List<String> trustedMrEnclave;

    public static TeeEvidenceVO build(java.util.Map<String, ?> map) throws Exception {
        TeeEvidenceVO self = new TeeEvidenceVO();
        return TeaModel.build(map, self);
    }

    public TeeEvidenceVO setCipherSuite(String cipherSuite) {
        this.cipherSuite = cipherSuite;
        return this;
    }
    public String getCipherSuite() {
        return this.cipherSuite;
    }

    public TeeEvidenceVO setEnclaveData(String enclaveData) {
        this.enclaveData = enclaveData;
        return this;
    }
    public String getEnclaveData() {
        return this.enclaveData;
    }

    public TeeEvidenceVO setEncryptPublicKeyPem(String encryptPublicKeyPem) {
        this.encryptPublicKeyPem = encryptPublicKeyPem;
        return this;
    }
    public String getEncryptPublicKeyPem() {
        return this.encryptPublicKeyPem;
    }

    public TeeEvidenceVO setEncryptPublicKeyType(String encryptPublicKeyType) {
        this.encryptPublicKeyType = encryptPublicKeyType;
        return this;
    }
    public String getEncryptPublicKeyType() {
        return this.encryptPublicKeyType;
    }

    public TeeEvidenceVO setModifiedDate(String modifiedDate) {
        this.modifiedDate = modifiedDate;
        return this;
    }
    public String getModifiedDate() {
        return this.modifiedDate;
    }

    public TeeEvidenceVO setPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }
    public String getPublicKey() {
        return this.publicKey;
    }

    public TeeEvidenceVO setPublicKeyRaBase64(String publicKeyRaBase64) {
        this.publicKeyRaBase64 = publicKeyRaBase64;
        return this;
    }
    public String getPublicKeyRaBase64() {
        return this.publicKeyRaBase64;
    }

    public TeeEvidenceVO setPublicKeyRaType(String publicKeyRaType) {
        this.publicKeyRaType = publicKeyRaType;
        return this;
    }
    public String getPublicKeyRaType() {
        return this.publicKeyRaType;
    }

    public TeeEvidenceVO setQuoteReport(String quoteReport) {
        this.quoteReport = quoteReport;
        return this;
    }
    public String getQuoteReport() {
        return this.quoteReport;
    }

    public TeeEvidenceVO setSignPublicKeyPem(String signPublicKeyPem) {
        this.signPublicKeyPem = signPublicKeyPem;
        return this;
    }
    public String getSignPublicKeyPem() {
        return this.signPublicKeyPem;
    }

    public TeeEvidenceVO setSignPublicKeyType(String signPublicKeyType) {
        this.signPublicKeyType = signPublicKeyType;
        return this;
    }
    public String getSignPublicKeyType() {
        return this.signPublicKeyType;
    }

    public TeeEvidenceVO setTrustedMrEnclave(java.util.List<String> trustedMrEnclave) {
        this.trustedMrEnclave = trustedMrEnclave;
        return this;
    }
    public java.util.List<String> getTrustedMrEnclave() {
        return this.trustedMrEnclave;
    }

}
