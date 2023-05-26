// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class FaceToFaceCompareRequest extends TeaModel {
    @NameInMap("portraitImageData1")
    public String portraitImageData1;

    @NameInMap("portraitImageData2")
    public String portraitImageData2;

    @NameInMap("portraitImageType1")
    public String portraitImageType1;

    @NameInMap("portraitImageType2")
    public String portraitImageType2;

    @NameInMap("portraitImageUrl1")
    public String portraitImageUrl1;

    @NameInMap("portraitImageUrl2")
    public String portraitImageUrl2;

    @NameInMap("qualityControl")
    public String qualityControl;

    public static FaceToFaceCompareRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceToFaceCompareRequest self = new FaceToFaceCompareRequest();
        return TeaModel.build(map, self);
    }

    public FaceToFaceCompareRequest setPortraitImageData1(String portraitImageData1) {
        this.portraitImageData1 = portraitImageData1;
        return this;
    }
    public String getPortraitImageData1() {
        return this.portraitImageData1;
    }

    public FaceToFaceCompareRequest setPortraitImageData2(String portraitImageData2) {
        this.portraitImageData2 = portraitImageData2;
        return this;
    }
    public String getPortraitImageData2() {
        return this.portraitImageData2;
    }

    public FaceToFaceCompareRequest setPortraitImageType1(String portraitImageType1) {
        this.portraitImageType1 = portraitImageType1;
        return this;
    }
    public String getPortraitImageType1() {
        return this.portraitImageType1;
    }

    public FaceToFaceCompareRequest setPortraitImageType2(String portraitImageType2) {
        this.portraitImageType2 = portraitImageType2;
        return this;
    }
    public String getPortraitImageType2() {
        return this.portraitImageType2;
    }

    public FaceToFaceCompareRequest setPortraitImageUrl1(String portraitImageUrl1) {
        this.portraitImageUrl1 = portraitImageUrl1;
        return this;
    }
    public String getPortraitImageUrl1() {
        return this.portraitImageUrl1;
    }

    public FaceToFaceCompareRequest setPortraitImageUrl2(String portraitImageUrl2) {
        this.portraitImageUrl2 = portraitImageUrl2;
        return this;
    }
    public String getPortraitImageUrl2() {
        return this.portraitImageUrl2;
    }

    public FaceToFaceCompareRequest setQualityControl(String qualityControl) {
        this.qualityControl = qualityControl;
        return this;
    }
    public String getQualityControl() {
        return this.qualityControl;
    }

}
