// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class TransferNodeRequest extends TeaModel {
    @NameInMap("clientToken")
    public String clientToken;

    @NameInMap("nodeType")
    public String nodeType;

    public static TransferNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferNodeRequest self = new TransferNodeRequest();
        return TeaModel.build(map, self);
    }

    public TransferNodeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public TransferNodeRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

}
