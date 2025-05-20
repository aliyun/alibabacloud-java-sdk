// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterCatalogRequest extends TeaModel {
    @NameInMap("removals")
    public java.util.List<String> removals;

    @NameInMap("updates")
    public java.util.Map<String, String> updates;

    public static AlterCatalogRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterCatalogRequest self = new AlterCatalogRequest();
        return TeaModel.build(map, self);
    }

    public AlterCatalogRequest setRemovals(java.util.List<String> removals) {
        this.removals = removals;
        return this;
    }
    public java.util.List<String> getRemovals() {
        return this.removals;
    }

    public AlterCatalogRequest setUpdates(java.util.Map<String, String> updates) {
        this.updates = updates;
        return this;
    }
    public java.util.Map<String, String> getUpdates() {
        return this.updates;
    }

}
