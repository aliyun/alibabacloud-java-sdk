// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class IdDetectOcrCompareFacesRequest extends TeaModel {
    @NameInMap("OCR")
    public Boolean OCR;

    @NameInMap("Unrepeat")
    public Boolean unrepeat;

    @NameInMap("cardDetect")
    public Boolean cardDetect;

    @NameInMap("countryCode")
    public String countryCode;

    @NameInMap("documentType")
    public String documentType;

    @NameInMap("faceCompare")
    public Boolean faceCompare;

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

    @NameInMap("portraitImageData")
    public String portraitImageData;

    @NameInMap("portraitImageUrl")
    public String portraitImageUrl;

    @NameInMap("qualityControl")
    public String qualityControl;

    public static IdDetectOcrCompareFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        IdDetectOcrCompareFacesRequest self = new IdDetectOcrCompareFacesRequest();
        return TeaModel.build(map, self);
    }

    public IdDetectOcrCompareFacesRequest setOCR(Boolean OCR) {
        this.OCR = OCR;
        return this;
    }
    public Boolean getOCR() {
        return this.OCR;
    }

    public IdDetectOcrCompareFacesRequest setUnrepeat(Boolean unrepeat) {
        this.unrepeat = unrepeat;
        return this;
    }
    public Boolean getUnrepeat() {
        return this.unrepeat;
    }

    public IdDetectOcrCompareFacesRequest setCardDetect(Boolean cardDetect) {
        this.cardDetect = cardDetect;
        return this;
    }
    public Boolean getCardDetect() {
        return this.cardDetect;
    }

    public IdDetectOcrCompareFacesRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public IdDetectOcrCompareFacesRequest setDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }
    public String getDocumentType() {
        return this.documentType;
    }

    public IdDetectOcrCompareFacesRequest setFaceCompare(Boolean faceCompare) {
        this.faceCompare = faceCompare;
        return this;
    }
    public Boolean getFaceCompare() {
        return this.faceCompare;
    }

    public IdDetectOcrCompareFacesRequest setImageAType(String imageAType) {
        this.imageAType = imageAType;
        return this;
    }
    public String getImageAType() {
        return this.imageAType;
    }

    public IdDetectOcrCompareFacesRequest setImageBType(String imageBType) {
        this.imageBType = imageBType;
        return this;
    }
    public String getImageBType() {
        return this.imageBType;
    }

    public IdDetectOcrCompareFacesRequest setImageDataA(String imageDataA) {
        this.imageDataA = imageDataA;
        return this;
    }
    public String getImageDataA() {
        return this.imageDataA;
    }

    public IdDetectOcrCompareFacesRequest setImageDataB(String imageDataB) {
        this.imageDataB = imageDataB;
        return this;
    }
    public String getImageDataB() {
        return this.imageDataB;
    }

    public IdDetectOcrCompareFacesRequest setImageUrlA(String imageUrlA) {
        this.imageUrlA = imageUrlA;
        return this;
    }
    public String getImageUrlA() {
        return this.imageUrlA;
    }

    public IdDetectOcrCompareFacesRequest setImageUrlB(String imageUrlB) {
        this.imageUrlB = imageUrlB;
        return this;
    }
    public String getImageUrlB() {
        return this.imageUrlB;
    }

    public IdDetectOcrCompareFacesRequest setPortraitImageData(String portraitImageData) {
        this.portraitImageData = portraitImageData;
        return this;
    }
    public String getPortraitImageData() {
        return this.portraitImageData;
    }

    public IdDetectOcrCompareFacesRequest setPortraitImageUrl(String portraitImageUrl) {
        this.portraitImageUrl = portraitImageUrl;
        return this;
    }
    public String getPortraitImageUrl() {
        return this.portraitImageUrl;
    }

    public IdDetectOcrCompareFacesRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }
    public String getQualityControl() {
        return this.qualityControl;
    }

}
