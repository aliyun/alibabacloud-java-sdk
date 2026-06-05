// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteAgentRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentRequest self = new DeleteAgentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
