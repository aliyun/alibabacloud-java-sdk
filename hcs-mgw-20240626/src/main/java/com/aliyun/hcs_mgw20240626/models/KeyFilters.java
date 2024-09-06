// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class KeyFilters extends TeaModel {
    @NameInMap("Excludes")
    public KeyFilterItem excludes;

    @NameInMap("Includes")
    public KeyFilterItem includes;

    public static KeyFilters build(java.util.Map<String, ?> map) throws Exception {
        KeyFilters self = new KeyFilters();
        return TeaModel.build(map, self);
    }

    public KeyFilters setExcludes(KeyFilterItem excludes) {
        this.excludes = excludes;
        return this;
    }
    public KeyFilterItem getExcludes() {
        return this.excludes;
    }

    public KeyFilters setIncludes(KeyFilterItem includes) {
        this.includes = includes;
        return this;
    }
    public KeyFilterItem getIncludes() {
        return this.includes;
    }

}
