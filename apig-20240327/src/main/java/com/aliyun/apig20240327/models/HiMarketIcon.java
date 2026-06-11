// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HiMarketIcon extends TeaModel {
    /**
     * <p>Specifies the icon type. Example: <code>URL</code>.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The value of the icon, based on the specified <code>type</code>. For example, if <code>type</code> is <code>URL</code>, this is the URL of the icon.</p>
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
