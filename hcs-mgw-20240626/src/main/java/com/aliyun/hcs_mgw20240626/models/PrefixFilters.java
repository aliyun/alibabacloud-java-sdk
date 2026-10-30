// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class PrefixFilters extends TeaModel {
    /**
     * <p>The collection of object prefixes to migrate, where multiple prefixes are matched using OR logic.</p>
     */
    @NameInMap("Includes")
    public PrefixFiltersIncludeItem includes;

    public static PrefixFilters build(java.util.Map<String, ?> map) throws Exception {
        PrefixFilters self = new PrefixFilters();
        return TeaModel.build(map, self);
    }

    public PrefixFilters setIncludes(PrefixFiltersIncludeItem includes) {
        this.includes = includes;
        return this;
    }
    public PrefixFiltersIncludeItem getIncludes() {
        return this.includes;
    }

}
