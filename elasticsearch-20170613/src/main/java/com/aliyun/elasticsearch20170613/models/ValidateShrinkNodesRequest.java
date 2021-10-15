// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateShrinkNodesRequest extends TeaModel {
    @NameInMap("nodeType")
    public String nodeType;

    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

    public static ValidateShrinkNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateShrinkNodesRequest self = new ValidateShrinkNodesRequest();
        return TeaModel.build(map, self);
    }

    public ValidateShrinkNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ValidateShrinkNodesRequest setIgnoreStatus(Boolean ignoreStatus) {
        this.ignoreStatus = ignoreStatus;
        return this;
    }
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

}
