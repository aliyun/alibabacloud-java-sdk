// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateConsumerAPIKeyInput extends TeaModel {
    /**
     * <p>是否启用该密钥</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("active")
    public Boolean active;

    /**
     * <p>更新后的描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>更新后的密钥描述</p>
     */
    @NameInMap("description")
    public String description;

    public static UpdateConsumerAPIKeyInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerAPIKeyInput self = new UpdateConsumerAPIKeyInput();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerAPIKeyInput setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public UpdateConsumerAPIKeyInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
