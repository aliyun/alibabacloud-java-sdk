// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class LastModifiedFilters extends TeaModel {
    @NameInMap("Excludes")
    public LastModifyFilterItem excludes;

    @NameInMap("Includes")
    public LastModifyFilterItem includes;

    public static LastModifiedFilters build(java.util.Map<String, ?> map) throws Exception {
        LastModifiedFilters self = new LastModifiedFilters();
        return TeaModel.build(map, self);
    }

    public LastModifiedFilters setExcludes(LastModifyFilterItem excludes) {
        this.excludes = excludes;
        return this;
    }
    public LastModifyFilterItem getExcludes() {
        return this.excludes;
    }

    public LastModifiedFilters setIncludes(LastModifyFilterItem includes) {
        this.includes = includes;
        return this;
    }
    public LastModifyFilterItem getIncludes() {
        return this.includes;
    }

}
