// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class SgVpcSearchServicePreRequest extends TeaModel {
    // param0
    @NameInMap("secretKeyId")
    public String secretKeyId;

    // param1
    @NameInMap("graphCode")
    public String graphCode;

    // param2
    @NameInMap("nodeId")
    public String nodeId;

    public static SgVpcSearchServicePreRequest build(java.util.Map<String, ?> map) throws Exception {
        SgVpcSearchServicePreRequest self = new SgVpcSearchServicePreRequest();
        return TeaModel.build(map, self);
    }

    public SgVpcSearchServicePreRequest setSecretKeyId(String secretKeyId) {
        this.secretKeyId = secretKeyId;
        return this;
    }
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    public SgVpcSearchServicePreRequest setGraphCode(String graphCode) {
        this.graphCode = graphCode;
        return this;
    }
    public String getGraphCode() {
        return this.graphCode;
    }

    public SgVpcSearchServicePreRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
