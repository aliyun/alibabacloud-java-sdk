// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class ModifyFlowLogAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-7qthudw0ll6jmc****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not set this parameter, ClientToken is set to the value of RequestId. The value of RequestId for each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The new description of the flow log.</p>
     * <p>The description can be empty or 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the flow log.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flowlog-m5evbtbpt****</p>
     */
    @NameInMap("FlowLogId")
    public String flowLogId;

    /**
     * <p>The new name of the flow log.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    @NameInMap("Interval")
    public Long interval;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region where the flow log is deployed.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/132080.html">DescribeChildInstanceRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyFlowLogAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowLogAttributeRequest self = new ModifyFlowLogAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFlowLogAttributeRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public ModifyFlowLogAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyFlowLogAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyFlowLogAttributeRequest setFlowLogId(String flowLogId) {
        this.flowLogId = flowLogId;
        return this;
    }
    public String getFlowLogId() {
        return this.flowLogId;
    }

    public ModifyFlowLogAttributeRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public ModifyFlowLogAttributeRequest setInterval(Long interval) {
        this.interval = interval;
        return this;
    }
    public Long getInterval() {
        return this.interval;
    }

    public ModifyFlowLogAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyFlowLogAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyFlowLogAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyFlowLogAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyFlowLogAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
