// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateCustomOcrTemplateRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

    @NameInMap("RecognizeArea")
    public String recognizeArea;

    @NameInMap("ReferArea")
    public String referArea;

    public static UpdateCustomOcrTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomOcrTemplateRequest self = new UpdateCustomOcrTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomOcrTemplateRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateCustomOcrTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateCustomOcrTemplateRequest setRecognizeArea(String recognizeArea) {
        this.recognizeArea = recognizeArea;
        return this;
    }
    public String getRecognizeArea() {
        return this.recognizeArea;
    }

    public UpdateCustomOcrTemplateRequest setReferArea(String referArea) {
        this.referArea = referArea;
        return this;
    }
    public String getReferArea() {
        return this.referArea;
    }

}
