// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class PointInt64 extends TeaModel {
    /**
     * <p>The distance from the X-coordinate of the vertex to the left edge. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("X")
    public Long x;

    /**
     * <p>The distance from the Y-coordinate of the vertex to the top. Unit: pixel.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Y")
    public Long y;

    public static PointInt64 build(java.util.Map<String, ?> map) throws Exception {
        PointInt64 self = new PointInt64();
        return TeaModel.build(map, self);
    }

    public PointInt64 setX(Long x) {
        this.x = x;
        return this;
    }
    public Long getX() {
        return this.x;
    }

    public PointInt64 setY(Long y) {
        this.y = y;
        return this;
    }
    public Long getY() {
        return this.y;
    }

}
