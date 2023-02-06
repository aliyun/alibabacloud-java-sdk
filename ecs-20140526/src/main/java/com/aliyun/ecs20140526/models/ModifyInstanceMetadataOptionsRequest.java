// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMetadataOptionsRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable the access channel for instance metadata. Valid values:</p>
     * <br>
     * <p>*   enabled: enables the access channel for instance metadata.</p>
     * <p>*   disabled: disables the access channel for instance metadata.</p>
     * <br>
     * <p>Default value: enabled.</p>
     * <br>
     * <p>> For more information about instance metadata, see [Overview of ECS instance metadata](~~49122~~).</p>
     */
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    /**
     * <p>> This parameter is in invitational preview and is unavailable to general users.</p>
     */
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    /**
     * <p>Specifies whether to forcefully use the security-enhanced mode (IMDSv2) to access instance metadata. Valid values:</p>
     * <br>
     * <p>*   optional: does not forcefully use the security-enhanced mode (IMDSv2).</p>
     * <p>*   required: forcefully uses the security-enhanced mode (IMDSv2). After you set this parameter to required, you cannot access instance metadata in normal mode.</p>
     * <br>
     * <p>Default value: optional.</p>
     * <br>
     * <p>> For more information about the modes of accessing instance metadata, see [Access mode of instance metadata](~~150575~~).</p>
     */
    @NameInMap("HttpTokens")
    public String httpTokens;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceMetadataTags")
    public String instanceMetadataTags;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent list of regions.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyInstanceMetadataOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceMetadataOptionsRequest self = new ModifyInstanceMetadataOptionsRequest();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceMetadataOptionsRequest setHttpEndpoint(String httpEndpoint) {
        this.httpEndpoint = httpEndpoint;
        return this;
    }
    public String getHttpEndpoint() {
        return this.httpEndpoint;
    }

    public ModifyInstanceMetadataOptionsRequest setHttpPutResponseHopLimit(Integer httpPutResponseHopLimit) {
        this.httpPutResponseHopLimit = httpPutResponseHopLimit;
        return this;
    }
    public Integer getHttpPutResponseHopLimit() {
        return this.httpPutResponseHopLimit;
    }

    public ModifyInstanceMetadataOptionsRequest setHttpTokens(String httpTokens) {
        this.httpTokens = httpTokens;
        return this;
    }
    public String getHttpTokens() {
        return this.httpTokens;
    }

    public ModifyInstanceMetadataOptionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyInstanceMetadataOptionsRequest setInstanceMetadataTags(String instanceMetadataTags) {
        this.instanceMetadataTags = instanceMetadataTags;
        return this;
    }
    public String getInstanceMetadataTags() {
        return this.instanceMetadataTags;
    }

    public ModifyInstanceMetadataOptionsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyInstanceMetadataOptionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyInstanceMetadataOptionsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyInstanceMetadataOptionsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
