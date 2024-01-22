// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Boundary extends TeaModel {
    @NameInMap("Height")
    public Long height;

    @NameInMap("Left")
    public Long left;

    @NameInMap("Polygon")
    public java.util.List<PointInt64> polygon;

    @NameInMap("Top")
    public Long top;

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

    public Boundary setPolygon(java.util.List<PointInt64> polygon) {
        this.polygon = polygon;
        return this;
    }
    public java.util.List<PointInt64> getPolygon() {
        return this.polygon;
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
