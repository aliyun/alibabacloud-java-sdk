// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ApmFilterConfig extends TeaModel {
    /**
     * <p>The dimension key name of the APM query filter condition. Specifies which dimension to filter by, such as hostname or service name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>host.name</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The matching type of the APM query filter condition. Valid values:</p>
     * <ul>
     * <li>ALL: Matches all values.</li>
     * <li>EQ: Exact match.</li>
     * <li>NE: Not equal to.</li>
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
     * <p>The filter value. Can be empty when type is set to ALL or DISABLED.</p>
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
