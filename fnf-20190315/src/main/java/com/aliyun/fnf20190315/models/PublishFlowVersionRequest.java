// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class PublishFlowVersionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example flow description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example-flow-name</p>
     */
    @NameInMap("FlowName")
    public String flowName;

    public static PublishFlowVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishFlowVersionRequest self = new PublishFlowVersionRequest();
        return TeaModel.build(map, self);
    }

    public PublishFlowVersionRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public PublishFlowVersionRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

}
