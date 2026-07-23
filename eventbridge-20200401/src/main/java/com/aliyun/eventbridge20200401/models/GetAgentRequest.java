// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class GetAgentRequest extends TeaModel {
    /**
     * <p>The agent name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my-agent</p>
     */
    @NameInMap("Name")
    public String name;

    public static GetAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgentRequest self = new GetAgentRequest();
        return TeaModel.build(map, self);
    }

    public GetAgentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
