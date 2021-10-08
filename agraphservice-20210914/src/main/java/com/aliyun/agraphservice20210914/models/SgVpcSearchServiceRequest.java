// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SgVpcSearchServiceRequest extends TeaModel {
    // param0
    @NameInMap("SecretKeyId")
    public String secretKeyId;

    // param1
    @NameInMap("GraphCode")
    public String graphCode;

    // param2
    @NameInMap("NodeId")
    public String nodeId;

    public static SgVpcSearchServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        SgVpcSearchServiceRequest self = new SgVpcSearchServiceRequest();
        return TeaModel.build(map, self);
    }

    public SgVpcSearchServiceRequest setSecretKeyId(String secretKeyId) {
        this.secretKeyId = secretKeyId;
        return this;
    }
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    public SgVpcSearchServiceRequest setGraphCode(String graphCode) {
        this.graphCode = graphCode;
        return this;
    }
    public String getGraphCode() {
        return this.graphCode;
    }

    public SgVpcSearchServiceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
