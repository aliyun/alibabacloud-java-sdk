// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceTidyupRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("ShapeType")
    public Integer shapeType;

    @NameInMap("Strength")
    public Float strength;

    public static FaceTidyupRequest build(java.util.Map<String, ?> map) throws Exception {
        FaceTidyupRequest self = new FaceTidyupRequest();
        return TeaModel.build(map, self);
    }

    public FaceTidyupRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public FaceTidyupRequest setShapeType(Integer shapeType) {
        this.shapeType = shapeType;
        return this;
    }
    public Integer getShapeType() {
        return this.shapeType;
    }

    public FaceTidyupRequest setStrength(Float strength) {
        this.strength = strength;
        return this;
    }
    public Float getStrength() {
        return this.strength;
    }

}
