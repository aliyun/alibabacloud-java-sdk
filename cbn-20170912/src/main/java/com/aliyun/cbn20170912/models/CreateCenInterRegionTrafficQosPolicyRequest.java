// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateCenInterRegionTrafficQosPolicyRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

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

    @NameInMap("TrafficQosPolicyDescription")
    public String trafficQosPolicyDescription;

    @NameInMap("TrafficQosPolicyName")
    public String trafficQosPolicyName;

    @NameInMap("TrafficQosQueues")
    public java.util.List<CreateCenInterRegionTrafficQosPolicyRequestTrafficQosQueues> trafficQosQueues;

    @NameInMap("TransitRouterAttachmentId")
    public String transitRouterAttachmentId;

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
        @NameInMap("Dscps")
        public java.util.List<Integer> dscps;

        @NameInMap("QosQueueDescription")
        public String qosQueueDescription;

        @NameInMap("QosQueueName")
        public String qosQueueName;

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
