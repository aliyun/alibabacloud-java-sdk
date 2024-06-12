// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TripCCInfoQueryRequest extends TeaModel {
    @NameInMap("business_instance_id")
    public String businessInstanceId;

    @NameInMap("node_id")
    public String nodeId;

    @NameInMap("third_business_id")
    public String thirdBusinessId;

    public static TripCCInfoQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        TripCCInfoQueryRequest self = new TripCCInfoQueryRequest();
        return TeaModel.build(map, self);
    }

    public TripCCInfoQueryRequest setBusinessInstanceId(String businessInstanceId) {
        this.businessInstanceId = businessInstanceId;
        return this;
    }
    public String getBusinessInstanceId() {
        return this.businessInstanceId;
    }

    public TripCCInfoQueryRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public TripCCInfoQueryRequest setThirdBusinessId(String thirdBusinessId) {
        this.thirdBusinessId = thirdBusinessId;
        return this;
    }
    public String getThirdBusinessId() {
        return this.thirdBusinessId;
    }

}
