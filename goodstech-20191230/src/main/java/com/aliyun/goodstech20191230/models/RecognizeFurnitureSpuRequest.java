// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.goodstech20191230.models;

import com.aliyun.tea.*;

public class RecognizeFurnitureSpuRequest extends TeaModel {
    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("XLength")
    public Float XLength;

    @NameInMap("YLength")
    public Float YLength;

    @NameInMap("ZLength")
    public Float ZLength;

    public static RecognizeFurnitureSpuRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeFurnitureSpuRequest self = new RecognizeFurnitureSpuRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeFurnitureSpuRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public RecognizeFurnitureSpuRequest setXLength(Float XLength) {
        this.XLength = XLength;
        return this;
    }
    public Float getXLength() {
        return this.XLength;
    }

    public RecognizeFurnitureSpuRequest setYLength(Float YLength) {
        this.YLength = YLength;
        return this;
    }
    public Float getYLength() {
        return this.YLength;
    }

    public RecognizeFurnitureSpuRequest setZLength(Float ZLength) {
        this.ZLength = ZLength;
        return this;
    }
    public Float getZLength() {
        return this.ZLength;
    }

}
