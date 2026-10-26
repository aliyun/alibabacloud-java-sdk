// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmFilterConfig extends TeaModel {
    /**
     * <p>The name of the dimension key for the APM query filter condition, which specifies the dimension to filter by, such as the hostname or service name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>host.name</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The match type of the APM query filter condition. Valid values:</p>
     * <ul>
     * <li>ALL: Matches all values.</li>
     * <li>EQ: Matches the exact value.</li>
     * <li>NE: Does not match the value.</li>
     * <li>DISABLED: Disables the filter condition.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EQ</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The filter value. This parameter can be empty when the type is ALL or DISABLED.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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
