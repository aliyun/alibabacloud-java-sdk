// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateCenInterRegionTrafficQosQueueAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to check the request without performing the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: checks the request but does not modify the queue. The system checks whether the required parameters are set, whether the formats of the values are valid, and the service limits. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): checks the request. If the request passes the check, the queue is modified.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The differentiated services code point (DSCP) value of the packets to be matched by the queue. Valid values: **0** to **63**.</p>
     * <br>
     * <p>You can enter up to 20 DSCP values at a time.</p>
     */
    @NameInMap("Dscps")
    public java.util.List<Integer> dscps;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new description of the queue.</p>
     * <br>
     * <p>The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The description must start with a letter.</p>
     */
    @NameInMap("QosQueueDescription")
    public String qosQueueDescription;

    /**
     * <p>The ID of the queue.</p>
     */
    @NameInMap("QosQueueId")
    public String qosQueueId;

    /**
     * <p>The new name of the queue.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.</p>
     */
    @NameInMap("QosQueueName")
    public String qosQueueName;

    /**
     * <p>The percentage of the inter-region bandwidth that can be used by the queue.</p>
     * <br>
     * <p>Enter a number. You do not need to enter a percent sign (%).</p>
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
