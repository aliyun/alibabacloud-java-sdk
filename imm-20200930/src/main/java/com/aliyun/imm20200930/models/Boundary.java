// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Boundary extends TeaModel {
    /**
     * <p>The height. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>300</p>
     */
    @NameInMap("Height")
    public Long height;

    /**
     * <p>The distance from the X-coordinate of the vertex to the left edge.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Left")
    public Long left;

    /**
     * <p>The polygon formed by a number of points. This parameter takes effect only when the boundary describes a polygon rather than a rectangle.</p>
     * <blockquote>
     * <p> This parameter is mutually exclusive to the following parameters that form a rectangle: Width, Height, Left, and Top. A boundary describes only a rectangle or a polygon.</p>
     * </blockquote>
     */
    @NameInMap("Polygon")
    public java.util.List<PointInt64> polygon;

    /**
     * <p>The distance from the Y-coordinate of the vertex to the top.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Top")
    public Long top;

    /**
     * <p>The width. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
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
