// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class DataField extends TeaModel {
    /**
     * <p>The column description.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The column ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Integer id;

    /**
     * <p>The column name.</p>
     * 
     * <strong>example:</strong>
     * <p>order_id</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The column type.</p>
     */
    @NameInMap("type")
    public FullDataType type;

    public static DataField build(java.util.Map<String, ?> map) throws Exception {
        DataField self = new DataField();
        return TeaModel.build(map, self);
    }

    public DataField setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DataField setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DataField setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DataField setType(FullDataType type) {
        this.type = type;
        return this;
    }
    public FullDataType getType() {
        return this.type;
    }

}
