// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GenerateHumanSketchStyleAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("ReturnType")
    public String returnType;

    public static GenerateHumanSketchStyleAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateHumanSketchStyleAdvanceRequest self = new GenerateHumanSketchStyleAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public GenerateHumanSketchStyleAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public GenerateHumanSketchStyleAdvanceRequest setReturnType(String returnType) {
        this.returnType = returnType;
        return this;
    }
    public String getReturnType() {
        return this.returnType;
    }

}
