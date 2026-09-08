// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosPolicyRequest extends TeaModel {
    /**
     * <p>The bandwidth guarantee mode. You can configure QoS queues based on absolute bandwidth values or bandwidth percentages. Valid values:</p>
     * <ul>
     * <li><p><strong>byBandwidth</strong>: configures QoS queues based on absolute bandwidth values.</p>
     * </li>
     * <li><p><strong>byBandwidthPercent</strong> (default): configures QoS queues based on bandwidth percentages.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>byBandwidthPercent</p>
     */
    @NameInMap("BandwidthGuaranteeMode")
    public String bandwidthGuaranteeMode;

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
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the cross-region traffic scheduling policy is created.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ConsoleDryRun")
    public Boolean consoleDryRun;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the traffic scheduling policy is created.</li>
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
     * <p>The description of the traffic scheduling policy.</p>
     * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>desctest</p>
     */
    @NameInMap("TrafficQosPolicyDescription")
    public String trafficQosPolicyDescription;

    /**
     * <p>The name of the traffic scheduling policy.</p>
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>nametest</p>
     */
    @NameInMap("TrafficQosPolicyName")
    public String trafficQosPolicyName;

    /**
     * <p>The queue information of the traffic scheduling policy.</p>
     * <p>You can create up to 3 queues. To create more queues, call CreateCenInterRegionTrafficQosQueue.</p>
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
     * <p>The ID of the transit router instance.</p>
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
         * <p>The absolute bandwidth value that the queue can use for inter-region traffic, in Mbit/s.</p>
         * <p>A traffic scheduling policy supports up to 10 queues, and each queue can be assigned an absolute bandwidth value.</p>
         * <p>For example, if you enter 1, traffic that matches the queue can use up to 1 Mbit/s of inter-region bandwidth.</p>
         * <blockquote>
         * <p>The sum of absolute bandwidth values of all allocated queues in a traffic scheduling policy cannot exceed the inter-region bandwidth value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Bandwidth")
        public String bandwidth;

        /**
         * <p>The DSCP values that the queue matches.</p>
         * <p>A traffic scheduling policy supports up to 3 queues, and each queue can match up to 60 DSCP values. Separate multiple DSCP values with commas (,).</p>
         */
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        /**
         * <p>The description of the queue.</p>
         * <p>A traffic scheduling policy supports up to 10 queues, and each queue can have a description.</p>
         * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        @NameInMap("QosQueueDescription")
        public String qosQueueDescription;

        /**
         * <p>The name of the queue.</p>
         * <p>A traffic scheduling policy supports up to 3 queues, and each queue can be assigned a name.</p>
         * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        @NameInMap("QosQueueName")
        public String qosQueueName;

        /**
         * <p>The percentage of inter-region bandwidth that the queue can use.</p>
         * <p>A traffic scheduling policy supports up to 10 queues, and each queue can be assigned a percentage of inter-region bandwidth.</p>
         * <p>For example, if you enter <strong>1</strong>, traffic that matches the queue can use up to 1% of the inter-region bandwidth.</p>
         * <blockquote>
         * <p>The sum of bandwidth percentages of all queues in a traffic scheduling policy cannot exceed 100%.</p>
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
