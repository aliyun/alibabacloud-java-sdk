// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserViewPort extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("height")
    public Double height;

    /**
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("width")
    public Double width;

    public static BrowserViewPort build(java.util.Map<String, ?> map) throws Exception {
        BrowserViewPort self = new BrowserViewPort();
        return TeaModel.build(map, self);
    }

    public BrowserViewPort setHeight(Double height) {
        this.height = height;
        return this;
    }
    public Double getHeight() {
        return this.height;
    }

    public BrowserViewPort setWidth(Double width) {
        this.width = width;
        return this;
    }
    public Double getWidth() {
        return this.width;
    }

}
