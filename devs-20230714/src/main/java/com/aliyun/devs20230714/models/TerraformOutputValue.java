// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class TerraformOutputValue extends TeaModel {
    @NameInMap("description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("name")
    public String name;

    @NameInMap("sensitive")
    public Boolean sensitive;

    public static TerraformOutputValue build(java.util.Map<String, ?> map) throws Exception {
        TerraformOutputValue self = new TerraformOutputValue();
        return TeaModel.build(map, self);
    }

    public TerraformOutputValue setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TerraformOutputValue setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public TerraformOutputValue setSensitive(Boolean sensitive) {
        this.sensitive = sensitive;
        return this;
    }
    public Boolean getSensitive() {
        return this.sensitive;
    }

}
