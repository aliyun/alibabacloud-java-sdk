// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.milvus20231012.models;

import com.aliyun.tea.*;

public class DlfTable extends TeaModel {
    /**
     * <p>The table description.</p>
     * 
     * <strong>example:</strong>
     * <p>Test table</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The table storage location.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://bucket/path</p>
     */
    @NameInMap("location")
    public String location;

    /**
     * <p>The table format.</p>
     * 
     * <strong>example:</strong>
     * <p>PAIMON</p>
     */
    @NameInMap("tableFormat")
    public String tableFormat;

    /**
     * <p>The table name.</p>
     * 
     * <strong>example:</strong>
     * <p>my_table</p>
     */
    @NameInMap("tableName")
    public String tableName;

    /**
     * <p>The table type.</p>
     * 
     * <strong>example:</strong>
     * <p>MANAGED</p>
     */
    @NameInMap("tableType")
    public String tableType;

    public static DlfTable build(java.util.Map<String, ?> map) throws Exception {
        DlfTable self = new DlfTable();
        return TeaModel.build(map, self);
    }

    public DlfTable setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DlfTable setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DlfTable setTableFormat(String tableFormat) {
        this.tableFormat = tableFormat;
        return this;
    }
    public String getTableFormat() {
        return this.tableFormat;
    }

    public DlfTable setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DlfTable setTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }
    public String getTableType() {
        return this.tableType;
    }

}
