// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateShrinkNodesRequest extends TeaModel {
    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

    @NameInMap("nodeType")
    public String nodeType;

    public static ValidateShrinkNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateShrinkNodesRequest self = new ValidateShrinkNodesRequest();
        return TeaModel.build(map, self);
    }

    public ValidateShrinkNodesRequest setIgnoreStatus(Boolean ignoreStatus) {
        this.ignoreStatus = ignoreStatus;
        return this;
    }
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

    public ValidateShrinkNodesRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
