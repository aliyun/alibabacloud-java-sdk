// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ViewPortConfiguration extends TeaModel {
    /**
     * <p>视口高度（像素）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("height")
    public Float height;

    /**
     * <p>视口宽度（像素）</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("width")
    public Float width;

    public static ViewPortConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ViewPortConfiguration self = new ViewPortConfiguration();
        return TeaModel.build(map, self);
    }

    public ViewPortConfiguration setHeight(Float height) {
        this.height = height;
        return this;
    }
    public Float getHeight() {
        return this.height;
    }

    public ViewPortConfiguration setWidth(Float width) {
        this.width = width;
        return this;
    }
    public Float getWidth() {
        return this.width;
    }

}
