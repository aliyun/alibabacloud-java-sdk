// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateCertificateAdvanceRequest extends TeaModel {
    @NameInMap("ImageUrlObject")
    @Validation(required = true)
    public java.io.InputStream imageUrlObject;

    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    @NameInMap("TargetLanguage")
    public String targetLanguage;

    @NameInMap("CertificateType")
    public String certificateType;

    @NameInMap("ResultType")
    public String resultType;

    public static TranslateCertificateAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateCertificateAdvanceRequest self = new TranslateCertificateAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public TranslateCertificateAdvanceRequest setImageUrlObject(java.io.InputStream imageUrlObject) {
        this.imageUrlObject = imageUrlObject;
        return this;
    }
    public java.io.InputStream getImageUrlObject() {
        return this.imageUrlObject;
    }

    public TranslateCertificateAdvanceRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateCertificateAdvanceRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public TranslateCertificateAdvanceRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public TranslateCertificateAdvanceRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

}
