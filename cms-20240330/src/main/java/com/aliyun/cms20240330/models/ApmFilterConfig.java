// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmFilterConfig extends TeaModel {
    /**
     * <p>The dimension key.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The filter type.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The filter value. This can be empty when type is ALL or DISABLED.</p>
     */
    @NameInMap("value")
    public String value;

    public static ApmFilterConfig build(java.util.Map<String, ?> map) throws Exception {
        ApmFilterConfig self = new ApmFilterConfig();
        return TeaModel.build(map, self);
    }

    public ApmFilterConfig setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ApmFilterConfig setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ApmFilterConfig setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
