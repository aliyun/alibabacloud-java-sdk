// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpgradeServiceInstanceRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655440000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run for the request to check information such as the permissions and instance status. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run for the request, but does not upgrade service instance.</li>
     * <li><strong>false</strong>: performs a dry run for the request, and upgrade service instance if the request passes the dry run.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public String dryRun;

    /**
     * <p>The parameters required for the upgrade. This parameter is required if the destination version of the service has new parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{ \&quot;RegionId\&quot;: \&quot;cn-hangzhou\&quot;, \&quot;InstanceType\&quot;: \&quot;ecs.g5.large\&quot;}</p>
     */
    @NameInMap("Parameters")
    public java.util.Map<String, ?> parameters;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the service instance.</p>
     * 
     * <strong>example:</strong>
     * <p>si-d6ab3a63ccbb4bxxxxxx</p>
     */
    @NameInMap("ServiceInstanceId")
    public String serviceInstanceId;

    /**
     * <p>The destination version.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ServiceVersion")
    public String serviceVersion;

    public static UpgradeServiceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpgradeServiceInstanceRequest self = new UpgradeServiceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpgradeServiceInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpgradeServiceInstanceRequest setDryRun(String dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public String getDryRun() {
        return this.dryRun;
    }

    public UpgradeServiceInstanceRequest setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public UpgradeServiceInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpgradeServiceInstanceRequest setServiceInstanceId(String serviceInstanceId) {
        this.serviceInstanceId = serviceInstanceId;
        return this;
    }
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public UpgradeServiceInstanceRequest setServiceVersion(String serviceVersion) {
        this.serviceVersion = serviceVersion;
        return this;
    }
    public String getServiceVersion() {
        return this.serviceVersion;
    }

}
