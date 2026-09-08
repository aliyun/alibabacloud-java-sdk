// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class UpdateCenInterRegionTrafficQosQueueAttributeRequest extends TeaModel {
    /**
     * <p>The absolute value of cross-region bandwidth that the current queue can use when bandwidth is allocated by absolute value. Unit: Mbit/s.</p>
     * <p>Enter a number only. Do not include the unit.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run without modifying the queue configurations. The system checks the required parameters, request format, and business restrictions. If the check fails, the corresponding error is returned. If the check succeeds, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and then modifies the queue configurations after the check succeeds.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The DSCP values of traffic packets to be matched by the current queue.</p>
     */
    @NameInMap("Dscps")
    public java.util.List<Integer> dscps;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The new description of the queue.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("QosQueueDescription")
    public String qosQueueDescription;

    /**
     * <p>The QoS queue ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-queue-nv2vfzqkewhk4t****</p>
     */
    @NameInMap("QosQueueId")
    public String qosQueueId;

    /**
     * <p>The new name of the queue.</p>
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("QosQueueName")
    public String qosQueueName;

    /**
     * <p>The percentage of cross-region bandwidth that the current queue can use when bandwidth is allocated by percentage.</p>
     * <p>Enter a number only. Do not include the percent sign (%).</p>
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
