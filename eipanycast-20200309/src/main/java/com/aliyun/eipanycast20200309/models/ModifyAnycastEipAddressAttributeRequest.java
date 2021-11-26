// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressAttributeRequest extends TeaModel {
    @NameInMap("AnycastId")
    public String anycastId;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static ModifyAnycastEipAddressAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnycastEipAddressAttributeRequest self = new ModifyAnycastEipAddressAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAnycastEipAddressAttributeRequest setAnycastId(String anycastId) {
        this.anycastId = anycastId;
        return this;
    }
    public String getAnycastId() {
        return this.anycastId;
    }

    public ModifyAnycastEipAddressAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyAnycastEipAddressAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
