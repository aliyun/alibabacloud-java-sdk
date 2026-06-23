// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedCostCredits extends TeaModel {
    /**
     * <p>The basic search service metering.</p>
     */
    @NameInMap("search")
    public SearchCredits search;

    /**
     * <p>The value-added service metering.</p>
     */
    @NameInMap("valueAdded")
    public ValueAddedCredits valueAdded;

    public static UnifiedCostCredits build(java.util.Map<String, ?> map) throws Exception {
        UnifiedCostCredits self = new UnifiedCostCredits();
        return TeaModel.build(map, self);
    }

    public UnifiedCostCredits setSearch(SearchCredits search) {
        this.search = search;
        return this;
    }
    public SearchCredits getSearch() {
        return this.search;
    }

    public UnifiedCostCredits setValueAdded(ValueAddedCredits valueAdded) {
        this.valueAdded = valueAdded;
        return this;
    }
    public ValueAddedCredits getValueAdded() {
        return this.valueAdded;
    }

}
