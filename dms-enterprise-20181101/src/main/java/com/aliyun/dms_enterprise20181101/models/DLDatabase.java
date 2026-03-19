// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DLDatabase extends TeaModel {
    /**
     * <p>The name of the catalog.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The database ID.</p>
     * 
     * <strong>example:</strong>
     * <p>19</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>The description of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>Default database for catalog hive</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The storage path of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://xxx</p>
     */
    @NameInMap("Location")
    public String location;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The parameters related to the database.</p>
     * 
     * <strong>example:</strong>
     * <p>key/value</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    public static DLDatabase build(java.util.Map<String, ?> map) throws Exception {
        DLDatabase self = new DLDatabase();
        return TeaModel.build(map, self);
    }

    public DLDatabase setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public DLDatabase setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public DLDatabase setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DLDatabase setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DLDatabase setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DLDatabase setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

}
