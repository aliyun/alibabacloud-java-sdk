// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosQueueRequest extends TeaModel {
    /**
     * <p>The maximum cross-region bandwidth that the queue can use when bandwidth is allocated in absolute value mode. Unit: Mbit/s.</p>
     * <ul>
     * <li><p>The bandwidth value is calculated as an absolute value. For example, if you enter 20, the queue can use up to 20 Mbit/s of the cross-region bandwidth.</p>
     * </li>
     * <li><p>The sum of the bandwidth of all queues under a cross-region connection instance cannot exceed the cross-region bandwidth.</p>
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
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The client token only supports ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the RequestId of the API request as the client token. The RequestId of each API request may be different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request and does not create the queue. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the check, the system returns an error. If the request passes the check, the system returns the <code>DryRunOperation</code> error code.</li>
     * <li><strong>false</strong> (default): sends a regular request and creates the queue after the request passes the check.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The Differentiated Services Code Point (DSCP) values to be matched by the queue.</p>
     * <p>You can enter up to 20 DSCP values at a time. Separate multiple DSCP values with commas (,).</p>
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
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("QosQueueDescription")
    public String qosQueueDescription;

    /**
     * <p>The name of the queue.</p>
     * <p>The name can be empty or 1 to 128 characters in length. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("QosQueueName")
    public String qosQueueName;

    /**
     * <p>The maximum cross-region bandwidth that the queue can use when bandwidth is allocated in percentage mode.</p>
     * <ul>
     * <li><p>The bandwidth value is calculated as a percentage. For example, if you enter 20, the queue can use up to 20% of the cross-region bandwidth.</p>
     * </li>
     * <li><p>The sum of the bandwidth percentages of all queues under a cross-region connection instance cannot exceed 100%.</p>
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
