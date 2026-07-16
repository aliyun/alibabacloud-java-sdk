// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class InsightsLabel extends TeaModel {
    /**
     * <p>The label description.</p>
     * 
     * <strong>example:</strong>
     * <p>有人摔倒</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The label name.</p>
     * 
     * <strong>example:</strong>
     * <p>摔倒</p>
     */
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
