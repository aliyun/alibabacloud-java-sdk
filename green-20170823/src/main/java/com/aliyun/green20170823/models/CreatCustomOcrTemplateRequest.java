// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreatCustomOcrTemplateRequest extends TeaModel {
    @NameInMap("ImgUrl")
    public String imgUrl;

    @NameInMap("Name")
    public String name;

    @NameInMap("RecognizeArea")
    public String recognizeArea;

    @NameInMap("ReferArea")
    public String referArea;

    public static CreatCustomOcrTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatCustomOcrTemplateRequest self = new CreatCustomOcrTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreatCustomOcrTemplateRequest setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }
    public String getImgUrl() {
        return this.imgUrl;
    }

    public CreatCustomOcrTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreatCustomOcrTemplateRequest setRecognizeArea(String recognizeArea) {
        this.recognizeArea = recognizeArea;
        return this;
    }
    public String getRecognizeArea() {
        return this.recognizeArea;
    }

    public CreatCustomOcrTemplateRequest setReferArea(String referArea) {
        this.referArea = referArea;
        return this;
    }
    public String getReferArea() {
        return this.referArea;
    }

}
