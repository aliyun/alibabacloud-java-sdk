// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosPolicyRequest extends TeaModel {
    /**
     * <p>The bandwidth guarantee mode. You can specify an absolute bandwidth value or a bandwidth percentage. Valid values:</p>
     * <ul>
     * <li><p><strong>byBandwidth</strong>: configures the QoS queue based on an absolute bandwidth value.</p>
     * </li>
     * <li><p><strong>byBandwidthPercent</strong> (default): configures the QoS queue based on a bandwidth percentage.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>byBandwidthPercent</p>
     */
    @NameInMap("BandwidthGuaranteeMode")
    public String bandwidthGuaranteeMode;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426655****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without creating the inter-region traffic QoS policy. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, the inter-region traffic QoS policy is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConsoleDryRun")
    public Boolean consoleDryRun;

    /**
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: prechecks the request without creating the traffic QoS policy. The system checks whether required parameters are specified, the request format, and service limits. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends the request. If the request passes the precheck, the traffic QoS policy is created.</li>
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
     * <p>The description of the traffic QoS policy.</p>
     * <p>The description must be 1 to 256 characters in length, and can be left empty. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TrafficQosPolicyDescription")
    public String trafficQosPolicyDescription;

    /**
     * <p>The name of the traffic QoS policy.</p>
     * <p>The name must be 1 to 128 characters in length, and can be left empty. It cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TrafficQosPolicyName")
    public String trafficQosPolicyName;

    /**
     * <p>The information about the queues in the traffic QoS policy.</p>
     * <p>You can create up to three queues. To create more queues, call the CreateCenInterRegionTrafficQosQueue operation.</p>
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
     * <p>The transit router instance ID, which is used for forward and routing.</p>
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

    public CreateCenInterRegionTrafficQosPolicyRequest setConsoleDryRun(Boolean consoleDryRun) {
        this.consoleDryRun = consoleDryRun;
        return this;
    }
    public Boolean getConsoleDryRun() {
        return this.consoleDryRun;
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
         * <p>The absolute value of the inter-region bandwidth that the queue can use. Unit: Mbit/s.</p>
         * <p>You can create up to 10 queues in a traffic QoS policy and specify the inter-region bandwidth that each queue can use.</p>
         * <p>For example, if you enter 1, packets that match the queue can use up to 1 Mbit/s of the inter-region bandwidth.</p>
         * <blockquote>
         * <p>The sum of the absolute values of the inter-region bandwidth allocated to all queues in a traffic QoS policy cannot exceed the total inter-region bandwidth.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The DSCP values that match the queue.</p>
         * <p>You can create up to three queues in a traffic QoS policy. Each queue can match up to 60 DSCP values. Separate multiple DSCP values with commas (,).</p>
         */
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        /**
         * <p>The description of the queue.</p>
         * <p>You can create up to 10 queues in a traffic QoS policy and add a description to each queue.</p>
         * <p>The description must be 1 to 256 characters in length, and can be left empty. It cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("QosQueueDescription")
        public String qosQueueDescription;

        /**
         * <p>The name of the queue.</p>
         * <p>You can create up to three queues in a traffic QoS policy and specify a name for each queue.</p>
         * <p>The name must be 1 to 128 characters in length, and can be left empty. It cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("QosQueueName")
        public String qosQueueName;

        /**
         * <p>The percentage of the inter-region bandwidth that the queue can use.</p>
         * <p>You can create up to 10 queues in a traffic QoS policy and specify the percentage of the inter-region bandwidth that each queue can use.</p>
         * <p>For example, if you enter <strong>1</strong>, packets that match the queue can use up to 1% of the inter-region bandwidth.</p>
         * <blockquote>
         * <p>The sum of the inter-region bandwidth percentages of all queues in a traffic QoS policy cannot exceed 100%.</p>
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
