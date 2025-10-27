// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DescribeFlowAliasRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-flow-name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-alias-name</p>
     */
    @NameInMap("Name")
    public String name;

    public static DescribeFlowAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFlowAliasRequest self = new DescribeFlowAliasRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFlowAliasRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public DescribeFlowAliasRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
