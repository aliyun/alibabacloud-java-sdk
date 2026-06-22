// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class InsightsLabel extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    public static InsightsLabel build(java.util.Map<String, ?> map) throws Exception {
        InsightsLabel self = new InsightsLabel();
        return TeaModel.build(map, self);
    }

    public InsightsLabel setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public InsightsLabel setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
