// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ShrinkNodeRequest extends TeaModel {
    @NameInMap("nodeType")
    public String nodeType;

    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("ignoreStatus")
    public Boolean ignoreStatus;

    public static ShrinkNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ShrinkNodeRequest self = new ShrinkNodeRequest();
        return TeaModel.build(map, self);
    }

    public ShrinkNodeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public ShrinkNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ShrinkNodeRequest setIgnoreStatus(Boolean ignoreStatus) {
        this.ignoreStatus = ignoreStatus;
        return this;
    }
    public Boolean getIgnoreStatus() {
        return this.ignoreStatus;
    }

}
