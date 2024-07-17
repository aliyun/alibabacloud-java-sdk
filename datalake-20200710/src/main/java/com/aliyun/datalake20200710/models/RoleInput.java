// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class RoleInput extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>显示名称，允许中文</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("Name")
    public String name;

    public static RoleInput build(java.util.Map<String, ?> map) throws Exception {
        RoleInput self = new RoleInput();
        return TeaModel.build(map, self);
    }

    public RoleInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public RoleInput setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public RoleInput setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
