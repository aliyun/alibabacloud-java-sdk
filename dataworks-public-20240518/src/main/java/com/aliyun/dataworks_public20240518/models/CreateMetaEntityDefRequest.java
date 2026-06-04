// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateMetaEntityDefRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("AttributeDefs")
    public java.util.List<MetaEntityAttributeDef> attributeDefs;

    /**
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Business API</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("Extend")
    public String extend;

    /**
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
