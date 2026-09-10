// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class FilterList extends TeaModel {
    /**
     * <p>The dimension key.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>The filter type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALL</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The filter value. This parameter can be left empty when type is set to ALL or DISABLED.</p>
     * 
     * <strong>example:</strong>
     * <p>prod</p>
     */
    @NameInMap("value")
    public String value;

    public static FilterList build(java.util.Map<String, ?> map) throws Exception {
        FilterList self = new FilterList();
        return TeaModel.build(map, self);
    }

    public FilterList setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public FilterList setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public FilterList setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
