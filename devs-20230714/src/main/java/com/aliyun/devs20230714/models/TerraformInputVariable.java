// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TerraformInputVariable extends TeaModel {
    @NameInMap("defaultJson")
    public String defaultJson;

    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("nullable")
    public Boolean nullable;

    @NameInMap("sensitive")
    public Boolean sensitive;

    @NameInMap("type")
    public String type;

    public static TerraformInputVariable build(java.util.Map<String, ?> map) throws Exception {
        TerraformInputVariable self = new TerraformInputVariable();
        return TeaModel.build(map, self);
    }

    public TerraformInputVariable setDefaultJson(String defaultJson) {
        this.defaultJson = defaultJson;
        return this;
    }
    public String getDefaultJson() {
        return this.defaultJson;
    }

    public TerraformInputVariable setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TerraformInputVariable setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TerraformInputVariable setNullable(Boolean nullable) {
        this.nullable = nullable;
        return this;
    }
    public Boolean getNullable() {
        return this.nullable;
    }

    public TerraformInputVariable setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
    public Boolean getSensitive() {
        return this.sensitive;
    }

    public TerraformInputVariable setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
