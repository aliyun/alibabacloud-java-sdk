// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateConsumerGroupRequest extends TeaModel {
    /**
     * <p>The consumer group description.</p>
     * 
     * <strong>example:</strong>
     * <p>Used for grouping online API callers.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The consumer group name.</p>
     * 
     * <strong>example:</strong>
     * <p>api-consumer-group</p>
     */
    @NameInMap("name")
    public String name;

    public static UpdateConsumerGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerGroupRequest self = new UpdateConsumerGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateConsumerGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
