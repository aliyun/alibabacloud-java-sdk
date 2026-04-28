// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("cu")
    public Integer cu;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("gpu")
    public Integer gpu;

    @NameInMap("gpuSpec")
    public java.util.List<String> gpuSpec;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmwpi66knkxny</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("subscription")
    public UpdateWorkspaceRequestSubscription subscription;

    /**
     * <strong>example:</strong>
     * <p>w-975bcfda9625****</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static UpdateWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceRequest self = new UpdateWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceRequest setCu(Integer cu) {
        this.cu = cu;
        return this;
    }
    public Integer getCu() {
        return this.cu;
    }

    public UpdateWorkspaceRequest setGpu(Integer gpu) {
        this.gpu = gpu;
        return this;
    }
    public Integer getGpu() {
        return this.gpu;
    }

    public UpdateWorkspaceRequest setGpuSpec(java.util.List<String> gpuSpec) {
        this.gpuSpec = gpuSpec;
        return this;
    }
    public java.util.List<String> getGpuSpec() {
        return this.gpuSpec;
    }

    public UpdateWorkspaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateWorkspaceRequest setSubscription(UpdateWorkspaceRequestSubscription subscription) {
        this.subscription = subscription;
        return this;
    }
    public UpdateWorkspaceRequestSubscription getSubscription() {
        return this.subscription;
    }

    public UpdateWorkspaceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public UpdateWorkspaceRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public UpdateWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateWorkspaceRequestSubscription extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoRenew")
        public String autoRenew;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("autoRenewPeriod")
        public String autoRenewPeriod;

        /**
         * <strong>example:</strong>
         * <p>MONTH</p>
         */
        @NameInMap("autoRenewPeriodUnit")
        public String autoRenewPeriodUnit;

        /**
         * <strong>example:</strong>
         * <p>my-token-asxkxxxxxxx</p>
         */
        @NameInMap("clientToken")
        public String clientToken;

        /**
         * <strong>example:</strong>
         * <p>1799</p>
         */
        @NameInMap("duration")
        public String duration;

        /**
         * <strong>example:</strong>
         * <p>MONTH</p>
         */
        @NameInMap("paymentDurationUnit")
        public String paymentDurationUnit;

        @NameInMap("queue")
        public java.util.List<String> queue;

        public static UpdateWorkspaceRequestSubscription build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRequestSubscription self = new UpdateWorkspaceRequestSubscription();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceRequestSubscription setAutoRenew(String autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public String getAutoRenew() {
            return this.autoRenew;
        }

        public UpdateWorkspaceRequestSubscription setAutoRenewPeriod(String autoRenewPeriod) {
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }
        public String getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        public UpdateWorkspaceRequestSubscription setAutoRenewPeriodUnit(String autoRenewPeriodUnit) {
            this.autoRenewPeriodUnit = autoRenewPeriodUnit;
            return this;
        }
        public String getAutoRenewPeriodUnit() {
            return this.autoRenewPeriodUnit;
        }

        public UpdateWorkspaceRequestSubscription setClientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }
        public String getClientToken() {
            return this.clientToken;
        }

        public UpdateWorkspaceRequestSubscription setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public UpdateWorkspaceRequestSubscription setPaymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }
        public String getPaymentDurationUnit() {
            return this.paymentDurationUnit;
        }

        public UpdateWorkspaceRequestSubscription setQueue(java.util.List<String> queue) {
            this.queue = queue;
            return this;
        }
        public java.util.List<String> getQueue() {
            return this.queue;
        }

    }

}
