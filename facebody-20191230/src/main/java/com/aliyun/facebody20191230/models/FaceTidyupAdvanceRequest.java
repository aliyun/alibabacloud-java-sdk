// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceTidyupAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("ShapeType")
    public Integer shapeType;

    @NameInMap("Strength")
    public Float strength;

    public static FaceTidyupAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceTidyupAdvanceRequest self = new FaceTidyupAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public FaceTidyupAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public FaceTidyupAdvanceRequest setShapeType(Integer shapeType) {
        this.shapeType = shapeType;
        return this;
    }
    public Integer getShapeType() {
        return this.shapeType;
    }

    public FaceTidyupAdvanceRequest setStrength(Float strength) {
        this.strength = strength;
        return this;
    }
    public Float getStrength() {
        return this.strength;
    }

}
