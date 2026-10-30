// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateCenInterRegionTrafficQosQueueAttributeRequest extends TeaModel {
    /**
     * <p>The absolute value of the cross-region bandwidth that can be used by the current queue when bandwidth is allocated by absolute value. Unit: Mbit/s. Enter a number without the unit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can generate the token value on the client side. Ensure that the token is unique across different requests and does not exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the request for required parameters, request format, and service limits, but does not modify the queue configuration. If the request fails the check, an error is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a standard request. If the request passes the check, the queue configuration is modified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The DSCP values of the traffic packets to be matched by the current queue.</p>
     */
    @NameInMap("Dscps")
    public java.util.List<Integer> dscps;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new description of the queue. The description can be empty or 1 to 256 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("QosQueueDescription")
    public String qosQueueDescription;

    /**
     * <p>The ID of the queue.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-nv2vfzqkewhk4t****</p>
     */
    @NameInMap("QosQueueId")
    public String qosQueueId;

    /**
     * <p>The new name of the queue. The name can be empty or 1 to 128 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("QosQueueName")
    public String qosQueueName;

    /**
     * <p>The percentage of the cross-region bandwidth that can be used by the current queue when bandwidth is allocated by percentage. Enter a number without the percent sign (%).</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RemainBandwidthPercent")
    public String remainBandwidthPercent;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateCenInterRegionTrafficQosQueueAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCenInterRegionTrafficQosQueueAttributeRequest self = new UpdateCenInterRegionTrafficQosQueueAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setDscps(java.util.List<Integer> dscps) {
        this.dscps = dscps;
        return this;
    }
    public java.util.List<Integer> getDscps() {
        return this.dscps;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setQosQueueDescription(String qosQueueDescription) {
        this.qosQueueDescription = qosQueueDescription;
        return this;
    }
    public String getQosQueueDescription() {
        return this.qosQueueDescription;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setQosQueueId(String qosQueueId) {
        this.qosQueueId = qosQueueId;
        return this;
    }
    public String getQosQueueId() {
        return this.qosQueueId;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setQosQueueName(String qosQueueName) {
        this.qosQueueName = qosQueueName;
        return this;
    }
    public String getQosQueueName() {
        return this.qosQueueName;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setRemainBandwidthPercent(String remainBandwidthPercent) {
        this.remainBandwidthPercent = remainBandwidthPercent;
        return this;
    }
    public String getRemainBandwidthPercent() {
        return this.remainBandwidthPercent;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateCenInterRegionTrafficQosQueueAttributeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
