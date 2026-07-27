// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class FilterList extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

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
