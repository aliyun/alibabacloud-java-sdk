// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class FaceRecognitionCompareRequest extends TeaModel {
    @NameInMap("idCardImageData")
    public String idCardImageData;

    @NameInMap("idCardImageType")
    public String idCardImageType;

    @NameInMap("idCardImageUrl")
    public String idCardImageUrl;

    @NameInMap("portraitImageData")
    public String portraitImageData;

    @NameInMap("portraitImageType")
    public String portraitImageType;

    @NameInMap("portraitImageUrl")
    public String portraitImageUrl;

    @NameInMap("qualityControl")
    public String qualityControl;

    public static FaceRecognitionCompareRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceRecognitionCompareRequest self = new FaceRecognitionCompareRequest();
        return TeaModel.build(map, self);
    }

    public FaceRecognitionCompareRequest setIdCardImageData(String idCardImageData) {
        this.idCardImageData = idCardImageData;
        return this;
    }
    public String getIdCardImageData() {
        return this.idCardImageData;
    }

    public FaceRecognitionCompareRequest setIdCardImageType(String idCardImageType) {
        this.idCardImageType = idCardImageType;
        return this;
    }
    public String getIdCardImageType() {
        return this.idCardImageType;
    }

    public FaceRecognitionCompareRequest setIdCardImageUrl(String idCardImageUrl) {
        this.idCardImageUrl = idCardImageUrl;
        return this;
    }
    public String getIdCardImageUrl() {
        return this.idCardImageUrl;
    }

    public FaceRecognitionCompareRequest setPortraitImageData(String portraitImageData) {
        this.portraitImageData = portraitImageData;
        return this;
    }
    public String getPortraitImageData() {
        return this.portraitImageData;
    }

    public FaceRecognitionCompareRequest setPortraitImageType(String portraitImageType) {
        this.portraitImageType = portraitImageType;
        return this;
    }
    public String getPortraitImageType() {
        return this.portraitImageType;
    }

    public FaceRecognitionCompareRequest setPortraitImageUrl(String portraitImageUrl) {
        this.portraitImageUrl = portraitImageUrl;
        return this;
    }
    public String getPortraitImageUrl() {
        return this.portraitImageUrl;
    }

    public FaceRecognitionCompareRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }
    public String getQualityControl() {
        return this.qualityControl;
    }

}
