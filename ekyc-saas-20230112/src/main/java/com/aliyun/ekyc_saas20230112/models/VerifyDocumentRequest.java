// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class VerifyDocumentRequest extends TeaModel {
    @NameInMap("countryCode")
    public String countryCode;

    @NameInMap("detThickness")
    public Boolean detThickness;

    @NameInMap("documentType")
    public String documentType;

    @NameInMap("imageAType")
    public String imageAType;

    @NameInMap("imageBType")
    public String imageBType;

    @NameInMap("imageCType")
    public String imageCType;

    @NameInMap("imageDataA")
    public String imageDataA;

    @NameInMap("imageDataB")
    public String imageDataB;

    @NameInMap("imageDataC")
    public String imageDataC;

    @NameInMap("imageUrlA")
    public String imageUrlA;

    @NameInMap("imageUrlB")
    public String imageUrlB;

    @NameInMap("imageUrlC")
    public String imageUrlC;

    public static VerifyDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyDocumentRequest self = new VerifyDocumentRequest();
        return TeaModel.build(map, self);
    }

    public VerifyDocumentRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public VerifyDocumentRequest setDetThickness(Boolean detThickness) {
        this.detThickness = detThickness;
        return this;
    }
    public Boolean getDetThickness() {
        return this.detThickness;
    }

    public VerifyDocumentRequest setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public VerifyDocumentRequest setImageAType(String imageAType) {
        this.imageAType = imageAType;
        return this;
    }
    public String getImageAType() {
        return this.imageAType;
    }

    public VerifyDocumentRequest setImageBType(String imageBType) {
        this.imageBType = imageBType;
        return this;
    }
    public String getImageBType() {
        return this.imageBType;
    }

    public VerifyDocumentRequest setImageCType(String imageCType) {
        this.imageCType = imageCType;
        return this;
    }
    public String getImageCType() {
        return this.imageCType;
    }

    public VerifyDocumentRequest setImageDataA(String imageDataA) {
        this.imageDataA = imageDataA;
        return this;
    }
    public String getImageDataA() {
        return this.imageDataA;
    }

    public VerifyDocumentRequest setImageDataB(String imageDataB) {
        this.imageDataB = imageDataB;
        return this;
    }
    public String getImageDataB() {
        return this.imageDataB;
    }

    public VerifyDocumentRequest setImageDataC(String imageDataC) {
        this.imageDataC = imageDataC;
        return this;
    }
    public String getImageDataC() {
        return this.imageDataC;
    }

    public VerifyDocumentRequest setImageUrlA(String imageUrlA) {
        this.imageUrlA = imageUrlA;
        return this;
    }
    public String getImageUrlA() {
        return this.imageUrlA;
    }

    public VerifyDocumentRequest setImageUrlB(String imageUrlB) {
        this.imageUrlB = imageUrlB;
        return this;
    }
    public String getImageUrlB() {
        return this.imageUrlB;
    }

    public VerifyDocumentRequest setImageUrlC(String imageUrlC) {
        this.imageUrlC = imageUrlC;
        return this;
    }
    public String getImageUrlC() {
        return this.imageUrlC;
    }

}
