// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanAnimeStyleAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("AlgoType")
    public String algoType;

    public static GenerateHumanAnimeStyleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanAnimeStyleAdvanceRequest self = new GenerateHumanAnimeStyleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanAnimeStyleAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public GenerateHumanAnimeStyleAdvanceRequest setAlgoType(String algoType) {
        this.algoType = algoType;
        return this;
    }
    public String getAlgoType() {
        return this.algoType;
    }

}
