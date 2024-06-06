// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class TranslateCertificateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CertificateType")
    public String certificateType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("ResultType")
    public String resultType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static TranslateCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        TranslateCertificateRequest self = new TranslateCertificateRequest();
        return TeaModel.build(map, self);
    }

    public TranslateCertificateRequest setCertificateType(String certificateType) {
        this.certificateType = certificateType;
        return this;
    }
    public String getCertificateType() {
        return this.certificateType;
    }

    public TranslateCertificateRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public TranslateCertificateRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public TranslateCertificateRequest setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public TranslateCertificateRequest setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
