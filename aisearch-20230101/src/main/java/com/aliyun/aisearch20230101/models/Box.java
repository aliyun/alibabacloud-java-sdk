// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class Box extends TeaModel {
    @NameInMap("Height")
    public Integer height;

    @NameInMap("Left")
    public Integer left;

    @NameInMap("Top")
    public Integer top;

    @NameInMap("Width")
    public Integer width;

    public static Box build(java.util.Map<String, ?> map) throws Exception {
        Box self = new Box();
        return TeaModel.build(map, self);
    }

    public Box setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public Box setLeft(Integer left) {
        this.left = left;
        return this;
    }
    public Integer getLeft() {
        return this.left;
    }

    public Box setTop(Integer top) {
        this.top = top;
        return this;
    }
    public Integer getTop() {
        return this.top;
    }

    public Box setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
