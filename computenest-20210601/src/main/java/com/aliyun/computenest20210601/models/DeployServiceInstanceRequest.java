// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class DeployServiceInstanceRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of a request. Generate a unique value from the client for this parameter. The token can contain only ASCII characters and must be no more than 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region ID. Possible values:</p>
     * <ul>
     * <li><p>cn-hangzhou: China (Hangzhou).</p>
     * </li>
     * <li><p>ap-southeast-1: Singapore.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the service instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>si-b58c874912fc4294****</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    public static DeployServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeployServiceInstanceRequest self = new DeployServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DeployServiceInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeployServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeployServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

}
