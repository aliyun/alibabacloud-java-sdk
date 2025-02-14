// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateMediaConnectFlowRequest extends TeaModel {
    /**
     * <p>Flow instance name</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliTestFlow</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    /**
     * <p>Region to which the Flow instance belongs</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ap-southeast-1</p>
     */
    @NameInMap("FlowRegion")
    public String flowRegion;

    public static CreateMediaConnectFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaConnectFlowRequest self = new CreateMediaConnectFlowRequest();
        return TeaModel.build(map, self);
    }

    public CreateMediaConnectFlowRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateMediaConnectFlowRequest setFlowRegion(String flowRegion) {
        this.flowRegion = flowRegion;
        return this;
    }
    public String getFlowRegion() {
        return this.flowRegion;
    }

}
