// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceMetadataOptionsRequest extends TeaModel {
    // Specifies whether to enable the metadata HTTP endpoint on the instance. Valid values:
    // 
    // *   enabled
    // *   disabled
    // 
    // Default value: enabled.
    // 
    // >  For more information about instance metadata, see [Metadata](~~49122~~).
    @NameInMap("HttpEndpoint")
    public String httpEndpoint;

    // >  This parameter is currently in invitational preview and unavailable for general users.
    @NameInMap("HttpPutResponseHopLimit")
    public Integer httpPutResponseHopLimit;

    // Specifies whether to forcibly use the security-enhanced mode (IMDSv2) to access instance metadata. Valid values:
    // 
    // *   optional: The security-enhancement mode (IMDSv2) is not forcibly used.
    // *   required: The security-enhancement mode (IMDSv2) is forcibly used. After you set this parameter to required, you cannot access the instance metadata in normal mode.
    // 
    // Default value: optional.
    // 
    // >  For more information about modes of accessing instance metadata, see [Access mode of instance metadata](~~150575~~).
    @NameInMap("HttpTokens")
    public String httpTokens;

    // The ID of the instance.
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The region ID of the instance. You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
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
