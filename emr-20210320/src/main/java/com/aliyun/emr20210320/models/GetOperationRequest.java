// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class GetOperationRequest extends TeaModel {
    /**
     * <p>The ID of the cluster that you want to query.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the operation.</p>
     */
    @NameInMap("OperationId")
    public String operationId;

    /**
     * <p>The district ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOperationRequest self = new GetOperationRequest();
        return TeaModel.build(map, self);
    }

    public GetOperationRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public GetOperationRequest setOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }
    public String getOperationId() {
        return this.operationId;
    }

    public GetOperationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
