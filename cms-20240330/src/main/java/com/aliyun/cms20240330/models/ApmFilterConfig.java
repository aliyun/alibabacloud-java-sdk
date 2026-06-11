// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmFilterConfig extends TeaModel {
    /**
     * <p>The tag key to filter by. For example, to filter traces by region, set this parameter to <code>RegionId</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The comparison operator used to match the tag\&quot;s value. Valid values: <code>EQUAL</code> and <code>NOT_EQUAL</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The value to compare against the tag\&quot;s value. Used with the <code>key</code> and <code>type</code> parameters to form a complete filter condition.</p>
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
