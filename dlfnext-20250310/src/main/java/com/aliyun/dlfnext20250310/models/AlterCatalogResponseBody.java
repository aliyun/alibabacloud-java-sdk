// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class AlterCatalogResponseBody extends TeaModel {
    /**
     * <p>The unchanged items.</p>
     */
    @NameInMap("missing")
    public java.util.List<String> missing;

    /**
     * <p>The deleted items.</p>
     */
    @NameInMap("removed")
    public java.util.List<String> removed;

    /**
     * <p>The updated items.</p>
     */
    @NameInMap("updated")
    public java.util.List<String> updated;

    public static AlterCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AlterCatalogResponseBody self = new AlterCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public AlterCatalogResponseBody setMissing(java.util.List<String> missing) {
        this.missing = missing;
        return this;
    }
    public java.util.List<String> getMissing() {
        return this.missing;
    }

    public AlterCatalogResponseBody setRemoved(java.util.List<String> removed) {
        this.removed = removed;
        return this;
    }
    public java.util.List<String> getRemoved() {
        return this.removed;
    }

    public AlterCatalogResponseBody setUpdated(java.util.List<String> updated) {
        this.updated = updated;
        return this;
    }
    public java.util.List<String> getUpdated() {
        return this.updated;
    }

}
