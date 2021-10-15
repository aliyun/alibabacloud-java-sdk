// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Boundary extends TeaModel {
    // Height
    @NameInMap("Height")
    public Long height;

    // Left
    @NameInMap("Left")
    public Long left;

    // Top
    @NameInMap("Top")
    public Long top;

    // Width
    @NameInMap("Width")
    public Long width;

    public static Boundary build(java.util.Map<String, ?> map) throws Exception {
        Boundary self = new Boundary();
        return TeaModel.build(map, self);
    }

    public Boundary setHeight(Long height) {
        this.height = height;
        return this;
    }
    public Long getHeight() {
        return this.height;
    }

    public Boundary setLeft(Long left) {
        this.left = left;
        return this;
    }
    public Long getLeft() {
        return this.left;
    }

    public Boundary setTop(Long top) {
        this.top = top;
        return this;
    }
    public Long getTop() {
        return this.top;
    }

    public Boundary setWidth(Long width) {
        this.width = width;
        return this;
    }
    public Long getWidth() {
        return this.width;
    }

}
