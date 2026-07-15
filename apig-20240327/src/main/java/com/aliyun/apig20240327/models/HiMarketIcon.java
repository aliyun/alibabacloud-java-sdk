// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketIcon extends TeaModel {
    /**
     * <p>The icon type.</p>
     * 
     * <strong>example:</strong>
     * <p>url</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The icon value.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/icon.png">https://example.com/icon.png</a></p>
     */
    @NameInMap("value")
    public String value;

    public static HiMarketIcon build(java.util.Map<String, ?> map) throws Exception {
        HiMarketIcon self = new HiMarketIcon();
        return TeaModel.build(map, self);
    }

    public HiMarketIcon setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public HiMarketIcon setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
