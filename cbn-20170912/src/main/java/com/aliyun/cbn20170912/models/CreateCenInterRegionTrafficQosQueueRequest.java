// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosQueueRequest extends TeaModel {
    /**
     * <p>The maximum inter-region bandwidth that the queue can use when bandwidth is allocated by absolute value. Unit: Mbit/s.</p>
     * <ul>
     * <li><p>The bandwidth value is calculated as an absolute value. For example, if you enter 20, the queue can use up to 20 Mbit/s of inter-region bandwidth.</p>
     * </li>
     * <li><p>The sum of the bandwidth values of all queues under an inter-region connection cannot exceed the inter-region bandwidth value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Bandwidth")
    public Long bandwidth;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> value as the <strong>ClientToken</strong> value. The <strong>RequestId</strong> value of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the queue is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The DSCP values to be matched by the queue.</p>
     * <p>You can specify up to 20 DSCP values at a time. Separate multiple DSCP values with commas (,).</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Dscps")
    public java.util.List<Integer> dscps;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The description of the queue.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("QosQueueDescription")
    public String qosQueueDescription;

    /**
     * <p>The name of the queue.</p>
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("QosQueueName")
    public String qosQueueName;

    /**
     * <p>The maximum inter-region bandwidth that the queue can use when bandwidth is allocated by percentage.</p>
     * <ul>
     * <li><p>The bandwidth value is calculated as a percentage. For example, if you enter 20, the queue can use up to 20% of the inter-region bandwidth.</p>
     * </li>
     * <li><p>The sum of the bandwidth percentages of all queues under an inter-region connection cannot exceed 100%.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("RemainBandwidthPercent")
    public String remainBandwidthPercent;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the traffic scheduling policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-qdvybn468kaoxx****</p>
     */
    @NameInMap("TrafficQosPolicyId")
    public String trafficQosPolicyId;

    public static CreateCenInterRegionTrafficQosQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenInterRegionTrafficQosQueueRequest self = new CreateCenInterRegionTrafficQosQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenInterRegionTrafficQosQueueRequest setBandwidth(Long bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Long getBandwidth() {
        return this.bandwidth;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setDscps(java.util.List<Integer> dscps) {
        this.dscps = dscps;
        return this;
    }
    public java.util.List<Integer> getDscps() {
        return this.dscps;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setQosQueueDescription(String qosQueueDescription) {
        this.qosQueueDescription = qosQueueDescription;
        return this;
    }
    public String getQosQueueDescription() {
        return this.qosQueueDescription;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setQosQueueName(String qosQueueName) {
        this.qosQueueName = qosQueueName;
        return this;
    }
    public String getQosQueueName() {
        return this.qosQueueName;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setRemainBandwidthPercent(String remainBandwidthPercent) {
        this.remainBandwidthPercent = remainBandwidthPercent;
        return this;
    }
    public String getRemainBandwidthPercent() {
        return this.remainBandwidthPercent;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCenInterRegionTrafficQosQueueRequest setTrafficQosPolicyId(String trafficQosPolicyId) {
        this.trafficQosPolicyId = trafficQosPolicyId;
        return this;
    }
    public String getTrafficQosPolicyId() {
        return this.trafficQosPolicyId;
    }

}
