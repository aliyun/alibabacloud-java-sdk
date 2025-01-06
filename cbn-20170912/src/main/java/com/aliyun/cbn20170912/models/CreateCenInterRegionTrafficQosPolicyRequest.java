// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosPolicyRequest extends TeaModel {
    /**
     * <p>The allocation mode of the guaranteed bandwidth. You can specify an absolute bandwidth value or a bandwidth percentage. Valid values:</p>
     * <ul>
     * <li><strong>byBandwidth</strong>: allocates an absolute bandwidth value for the QoS queue.</li>
     * <li><strong>byBandwidthPercent</strong> (default): allocates a bandwidth percentage for the OoS queue.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>byBandwidthPercent</p>
     */
    @NameInMap("BandwidthGuaranteeMode")
    public String bandwidthGuaranteeMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck the API request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request but does not create the QoS policy. The system checks the required parameters, the request format, and the service limits. If the request fails the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>: sends the API request. If the request passes the precheck, the QoS policy is created. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The description of the QoS policy.</p>
     * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TrafficQosPolicyDescription")
    public String trafficQosPolicyDescription;

    /**
     * <p>The name of the QoS policy.</p>
     * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TrafficQosPolicyName")
    public String trafficQosPolicyName;

    /**
     * <p>The information about the QoS queue.</p>
     * <p>You can add at most three QoS queues in a QoS policy by calling this operation. To add more QoS queues, call the CreateCenInterRegionTrafficQosQueue operation.</p>
     */
    @NameInMap("TrafficQosQueues")
    public java.util.List<CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues> trafficQosQueues;

    /**
     * <p>The ID of the inter-region connection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-attach-r6g0m3epjehw57****</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the transit router.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-8vbuqeo5h5pu3m01d****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateCenInterRegionTrafficQosPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenInterRegionTrafficQosPolicyRequest self = new CreateCenInterRegionTrafficQosPolicyRequest();
        return TeaModel.build(map, self);
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setBandwidthGuaranteeMode(String bandwidthGuaranteeMode) {
        this.bandwidthGuaranteeMode = bandwidthGuaranteeMode;
        return this;
    }
    public String getBandwidthGuaranteeMode() {
        return this.bandwidthGuaranteeMode;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setTrafficQosPolicyDescription(String trafficQosPolicyDescription) {
        this.trafficQosPolicyDescription = trafficQosPolicyDescription;
        return this;
    }
    public String getTrafficQosPolicyDescription() {
        return this.trafficQosPolicyDescription;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setTrafficQosPolicyName(String trafficQosPolicyName) {
        this.trafficQosPolicyName = trafficQosPolicyName;
        return this;
    }
    public String getTrafficQosPolicyName() {
        return this.trafficQosPolicyName;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setTrafficQosQueues(java.util.List<CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues> trafficQosQueues) {
        this.trafficQosQueues = trafficQosQueues;
        return this;
    }
    public java.util.List<CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues> getTrafficQosQueues() {
        return this.trafficQosQueues;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setTransitRouterAttachmentId(String transitRouterAttachmentId) {
        this.transitRouterAttachmentId = transitRouterAttachmentId;
        return this;
    }
    public String getTransitRouterAttachmentId() {
        return this.transitRouterAttachmentId;
    }

    public CreateCenInterRegionTrafficQosPolicyRequest setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static class CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues extends TeaModel {
        /**
         * <p>The absolute bandwidth that can be consumed by the QoS queue. Unit: Mbit/s.</p>
         * <p>Each QoS policy supports at most 10 queues. You can specify a valid bandwidth value for each queue.</p>
         * <p>For example, a value of 1 specifies that the queue can consume 1 Mbit/s of the inter-region bandwidth.</p>
         * <blockquote>
         * <p> The sum of the absolute bandwidth values of all the queues in a QoS policy cannot exceed the total bandwidth of the inter-region connection.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The Differentiated Services Code Point (DSCP) value that matches the current queue.</p>
         * <p>Each QoS policy supports at most three queues. You can specify at most 60 DSCP values for each queue. Separate multiple DCSP values with commas (,).</p>
         */
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        /**
         * <p>The description of the current queue.</p>
         * <p>Each QoS policy supports at most 10 queues. You can specify a description for each queue.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("QosQueueDescription")
        public String qosQueueDescription;

        /**
         * <p>The name of the current queue.</p>
         * <p>Each QoS policy supports at most three queues. You can specify a name for each queue.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("QosQueueName")
        public String qosQueueName;

        /**
         * <p>The percentage of the inter-region bandwidth that can be used by the queue.</p>
         * <p>Each QoS policy supports at most 10 queues. You can specify a valid percentage for each queue.</p>
         * <p>For example, a value of <strong>1</strong> specifies that the queue can consume 1% of the inter-region bandwidth.</p>
         * <blockquote>
         * <p> The sum of the percentage values of all the queues in a QoS policy cannot exceed 100%.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RemainBandwidthPercent")
        public String remainBandwidthPercent;

        public static CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues build(java.util.Map<String, ?> map) throws Exception {
            CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues self = new CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues();
            return TeaModel.build(map, self);
        }

        public CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues setBandwidth(String bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public String getBandwidth() {
            return this.bandwidth;
        }

        public CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues setDscps(java.util.List<Integer> dscps) {
            this.dscps = dscps;
            return this;
        }
        public java.util.List<Integer> getDscps() {
            return this.dscps;
        }

        public CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues setQosQueueDescription(String qosQueueDescription) {
            this.qosQueueDescription = qosQueueDescription;
            return this;
        }
        public String getQosQueueDescription() {
            return this.qosQueueDescription;
        }

        public CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues setQosQueueName(String qosQueueName) {
            this.qosQueueName = qosQueueName;
            return this;
        }
        public String getQosQueueName() {
            return this.qosQueueName;
        }

        public CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues setRemainBandwidthPercent(String remainBandwidthPercent) {
            this.remainBandwidthPercent = remainBandwidthPercent;
            return this;
        }
        public String getRemainBandwidthPercent() {
            return this.remainBandwidthPercent;
        }

    }

}
