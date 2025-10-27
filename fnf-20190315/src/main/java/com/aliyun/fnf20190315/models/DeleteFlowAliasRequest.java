// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteFlowAliasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>my_flow_name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alias_name</p>
     */
    @NameInMap("Name")
    public String name;

    public static DeleteFlowAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowAliasRequest self = new DeleteFlowAliasRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowAliasRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DeleteFlowAliasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
