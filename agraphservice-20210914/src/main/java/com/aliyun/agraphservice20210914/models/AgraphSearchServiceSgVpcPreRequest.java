// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agraphservice20210914.models;

import com.aliyun.tea.*;

public class AgraphSearchServiceSgVpcPreRequest extends TeaModel {
    // param0
    @NameInMap("secretKeyId")
    public String secretKeyId;

    // param1
    @NameInMap("graphCode")
    public String graphCode;

    // param2
    @NameInMap("nodeId")
    public String nodeId;

    public static AgraphSearchServiceSgVpcPreRequest build(java.util.Map<String, ?> map) throws Exception {
        AgraphSearchServiceSgVpcPreRequest self = new AgraphSearchServiceSgVpcPreRequest();
        return TeaModel.build(map, self);
    }

    public AgraphSearchServiceSgVpcPreRequest setSecretKeyId(String secretKeyId) {
        this.secretKeyId = secretKeyId;
        return this;
    }
    public String getSecretKeyId() {
        return this.secretKeyId;
    }

    public AgraphSearchServiceSgVpcPreRequest setGraphCode(String graphCode) {
        this.graphCode = graphCode;
        return this;
    }
    public String getGraphCode() {
        return this.graphCode;
    }

    public AgraphSearchServiceSgVpcPreRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
