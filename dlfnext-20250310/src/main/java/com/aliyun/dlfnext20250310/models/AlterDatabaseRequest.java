// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterDatabaseRequest extends TeaModel {
    @NameInMap("removals")
    public java.util.List<String> removals;

    @NameInMap("updates")
    public java.util.Map<String, String> updates;

    public static AlterDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        AlterDatabaseRequest self = new AlterDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public AlterDatabaseRequest setRemovals(java.util.List<String> removals) {
        this.removals = removals;
        return this;
    }
    public java.util.List<String> getRemovals() {
        return this.removals;
    }

    public AlterDatabaseRequest setUpdates(java.util.Map<String, String> updates) {
        this.updates = updates;
        return this;
    }
    public java.util.Map<String, String> getUpdates() {
        return this.updates;
    }

}
