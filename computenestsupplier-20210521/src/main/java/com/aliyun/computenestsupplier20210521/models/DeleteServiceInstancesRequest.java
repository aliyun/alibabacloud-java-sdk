// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class DeleteServiceInstancesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ServiceInstanceId")
    public java.util.List<String> serviceInstanceId;

    public static DeleteServiceInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceInstancesRequest self = new DeleteServiceInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceInstancesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteServiceInstancesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteServiceInstancesRequest setServiceInstanceId(java.util.List<String> serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public java.util.List<String> getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
