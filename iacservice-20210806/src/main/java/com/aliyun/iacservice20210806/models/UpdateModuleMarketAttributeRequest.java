// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateModuleMarketAttributeRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("moduleDetail")
    public String moduleDetail;

    @NameInMap("name")
    public String name;

    public static UpdateModuleMarketAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateModuleMarketAttributeRequest self = new UpdateModuleMarketAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateModuleMarketAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateModuleMarketAttributeRequest setModuleDetail(String moduleDetail) {
        this.moduleDetail = moduleDetail;
        return this;
    }
    public String getModuleDetail() {
        return this.moduleDetail;
    }

    public UpdateModuleMarketAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
