// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosPolicyRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether only to precheck the API request. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request but does not create the QoS policy. The system checks the required parameters, the request format, and the service limits. If the request fails the check, an error message is returned. If the request passes the check, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**: sends the API request. If the request passes the precheck, the QoS policy is created. This is the default value.</p>
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
     * <br>
     * <p>The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The description must start with a letter.</p>
     */
    @NameInMap("TrafficQosPolicyDescription")
    public String trafficQosPolicyDescription;

    /**
     * <p>The name of the QoS policy.</p>
     * <br>
     * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
     */
    @NameInMap("TrafficQosPolicyName")
    public String trafficQosPolicyName;

    /**
     * <p>The information about the QoS queue.</p>
     * <br>
     * <p>You can call this operation to create at most three QoS queues. To create more queues, you must call the CreateCenInterRegionTrafficQosQueue operation.</p>
     */
    @NameInMap("TrafficQosQueues")
    public java.util.List<CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues> trafficQosQueues;

    /**
     * <p>The ID of the inter-region connection.</p>
     */
    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

    /**
     * <p>The ID of the transit router.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateCenInterRegionTrafficQosPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCenInterRegionTrafficQosPolicyRequest self = new CreateCenInterRegionTrafficQosPolicyRequest();
        return TeaModel.build(map, self);
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
         * <p>The DSCP value that matches the current queue.</p>
         * <br>
         * <p>Each QoS policy supports up to three queues. You can specify at most 60 DSCP values for each queue. Separate DSCP values with commas (,).</p>
         */
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        /**
         * <p>The description of the current queue.</p>
         * <br>
         * <p>Each QoS policy supports up to three queues. You can add a description to each queue.</p>
         * <br>
         * <p>The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The description must start with a letter.</p>
         */
        @NameInMap("QosQueueDescription")
        public String qosQueueDescription;

        /**
         * <p>The name of the current queue.</p>
         * <br>
         * <p>Each QoS policy supports up to three queues. You can specify a name for each queue.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.</p>
         */
        @NameInMap("QosQueueName")
        public String qosQueueName;

        /**
         * <p>The percentage of bandwidth resources that can be allocated to the current queue.</p>
         * <br>
         * <p>Each QoS policy supports up to three queues. You can specify a percentage of bandwidth resources for each queue.</p>
         * <br>
         * <p>If you enter **1**, it indicates that the current queue can consume at most \*\*1%\*\* of the bandwidth resources.</p>
         * <br>
         * <p>>  The sum of the percentage values of all the queues in a QoS policy cannot exceed 100%.</p>
         */
        @NameInMap("RemainBandwidthPercent")
        public String remainBandwidthPercent;

        public static CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues build(java.util.Map<String, ?> map) throws Exception {
            CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues self = new CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues();
            return TeaModel.build(map, self);
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
