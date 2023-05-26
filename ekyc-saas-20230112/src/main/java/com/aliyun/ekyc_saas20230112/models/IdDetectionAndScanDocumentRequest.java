// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class IdDetectionAndScanDocumentRequest extends TeaModel {
    @NameInMap("countryCode")
    public String countryCode;

    @NameInMap("documentType")
    public String documentType;

    @NameInMap("imageAType")
    public String imageAType;

    @NameInMap("imageBType")
    public String imageBType;

    @NameInMap("imageDataA")
    public String imageDataA;

    @NameInMap("imageDataB")
    public String imageDataB;

    @NameInMap("imageUrlA")
    public String imageUrlA;

    @NameInMap("imageUrlB")
    public String imageUrlB;

    public static IdDetectionAndScanDocumentRequest build(java.util.Map<String, ?> map) throws Exception {
        IdDetectionAndScanDocumentRequest self = new IdDetectionAndScanDocumentRequest();
        return TeaModel.build(map, self);
    }

    public IdDetectionAndScanDocumentRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public IdDetectionAndScanDocumentRequest setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public IdDetectionAndScanDocumentRequest setImageAType(String imageAType) {
        this.imageAType = imageAType;
        return this;
    }
    public String getImageAType() {
        return this.imageAType;
    }

    public IdDetectionAndScanDocumentRequest setImageBType(String imageBType) {
        this.imageBType = imageBType;
        return this;
    }
    public String getImageBType() {
        return this.imageBType;
    }

    public IdDetectionAndScanDocumentRequest setImageDataA(String imageDataA) {
        this.imageDataA = imageDataA;
        return this;
    }
    public String getImageDataA() {
        return this.imageDataA;
    }

    public IdDetectionAndScanDocumentRequest setImageDataB(String imageDataB) {
        this.imageDataB = imageDataB;
        return this;
    }
    public String getImageDataB() {
        return this.imageDataB;
    }

    public IdDetectionAndScanDocumentRequest setImageUrlA(String imageUrlA) {
        this.imageUrlA = imageUrlA;
        return this;
    }
    public String getImageUrlA() {
        return this.imageUrlA;
    }

    public IdDetectionAndScanDocumentRequest setImageUrlB(String imageUrlB) {
        this.imageUrlB = imageUrlB;
        return this;
    }
    public String getImageUrlB() {
        return this.imageUrlB;
    }

}
