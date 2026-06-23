// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMetaEntityDefRequest extends TeaModel {
    /**
     * <p>A list of attribute definitions for the pure custom type. Do not specify this parameter if the <code>Extend</code> parameter is set to <code>TABLE</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AttributeDefs")
    public java.util.List<MetaEntityAttributeDef> attributeDefs;

    /**
     * <p>A description of the entity definition.</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The display name. The maximum length is 32 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business API</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <p>The extension mode. Valid values:</p>
     * <ul>
     * <li><p><code>NONE</code>: The default value. Specifies a pure custom type with user-defined attributes.</p>
     * </li>
     * <li><p><code>TABLE</code>: Specifies an extended table type that references an existing table type in Data Map. Attribute definitions are not required for this type. You can create corresponding <code>Database</code> and <code>Table</code> objects for it.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
     * <p>The type definition name. For a pure custom type, the name must match <code>^[a-z0-9][a-z0-9_]*$</code>. For an extended table type, the name must match <code>^[a-z0-9][a-z0-9_]*-table$</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>biz_api</p>
     */
    @NameInMap("Name")
    public String name;

    public static CreateMetaEntityDefRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetaEntityDefRequest self = new CreateMetaEntityDefRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetaEntityDefRequest setAttributeDefs(java.util.List<MetaEntityAttributeDef> attributeDefs) {
        this.attributeDefs = attributeDefs;
        return this;
    }
    public java.util.List<MetaEntityAttributeDef> getAttributeDefs() {
        return this.attributeDefs;
    }

    public CreateMetaEntityDefRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMetaEntityDefRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateMetaEntityDefRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public CreateMetaEntityDefRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
