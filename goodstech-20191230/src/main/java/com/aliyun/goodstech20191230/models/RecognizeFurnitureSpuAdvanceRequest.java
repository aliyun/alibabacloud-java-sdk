// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureSpuAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    @NameInMap("XLength")
    public Float XLength;

    @NameInMap("YLength")
    public Float YLength;

    @NameInMap("ZLength")
    public Float ZLength;

    public static RecognizeFurnitureSpuAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureSpuAdvanceRequest self = new RecognizeFurnitureSpuAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFurnitureSpuAdvanceRequest setImageURLObject(java.io.InputStream imageURLObject) {
        this.imageURLObject = imageURLObject;
        return this;
    }
    public java.io.InputStream getImageURLObject() {
        return this.imageURLObject;
    }

    public RecognizeFurnitureSpuAdvanceRequest setXLength(Float XLength) {
        this.XLength = XLength;
        return this;
    }
    public Float getXLength() {
        return this.XLength;
    }

    public RecognizeFurnitureSpuAdvanceRequest setYLength(Float YLength) {
        this.YLength = YLength;
        return this;
    }
    public Float getYLength() {
        return this.YLength;
    }

    public RecognizeFurnitureSpuAdvanceRequest setZLength(Float ZLength) {
        this.ZLength = ZLength;
        return this;
    }
    public Float getZLength() {
        return this.ZLength;
    }

}
