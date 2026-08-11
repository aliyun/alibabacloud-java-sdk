// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DLCatalog extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>init default catalog</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>oss://xxxx</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("Name")
    public String name;

    public static DLCatalog build(java.util.Map<String, ?> map) throws Exception {
        DLCatalog self = new DLCatalog();
        return TeaModel.build(map, self);
    }

    public DLCatalog setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DLCatalog setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DLCatalog setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
