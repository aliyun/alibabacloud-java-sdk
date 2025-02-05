// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class RollbackServiceInstanceRequest extends TeaModel {
    /**
     * <p>Ensures idempotence of the request. Generate a value from your client to ensure it is unique across different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>10CM943JP0EN9D51H</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Service instance ID.</p>
     * <p>You can obtain the service instance ID by calling <a href="https://help.aliyun.com/document_detail/396200.html">ListServiceInstances - Query Service Instance List</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>si-3a8f9a75da074f52b969</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static RollbackServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackServiceInstanceRequest self = new RollbackServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public RollbackServiceInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RollbackServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RollbackServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
