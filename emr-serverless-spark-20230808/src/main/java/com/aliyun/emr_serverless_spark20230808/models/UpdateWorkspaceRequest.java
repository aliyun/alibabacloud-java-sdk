// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceRequest extends TeaModel {
    /**
     * <p>The upper limit of workspace resources.</p>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("cu")
    public Integer cu;

    /**
     * <p>The number of GPU cards.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("gpu")
    public Integer gpu;

    /**
     * <p>The GPU instance type.</p>
     */
    @NameInMap("gpuSpec")
    public java.util.List<String> gpuSpec;

    @NameInMap("gpuSubscription")
    public UpdateWorkspaceRequestGpuSubscription gpuSubscription;

    @NameInMap("ipWhiteList")
    public java.util.List<String> ipWhiteList;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmwpi66knkxny</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The information for converting from pay-as-you-go to subscription.</p>
     */
    @NameInMap("subscription")
    public UpdateWorkspaceRequestSubscription subscription;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>w-975bcfda9625****</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("workspaceName")
    public String workspaceName;

    /**
     * <p>The region ID.</p>
     * 
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

    public UpdateWorkspaceRequest setGpuSubscription(UpdateWorkspaceRequestGpuSubscription gpuSubscription) {
        this.gpuSubscription = gpuSubscription;
        return this;
    }
    public UpdateWorkspaceRequestGpuSubscription getGpuSubscription() {
        return this.gpuSubscription;
    }

    public UpdateWorkspaceRequest setIpWhiteList(java.util.List<String> ipWhiteList) {
        this.ipWhiteList = ipWhiteList;
        return this;
    }
    public java.util.List<String> getIpWhiteList() {
        return this.ipWhiteList;
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

    public static class UpdateWorkspaceRequestGpuSubscription extends TeaModel {
        @NameInMap("autoRenew")
        public Boolean autoRenew;

        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("gpuMachineNum")
        public Integer gpuMachineNum;

        @NameInMap("instanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>ecs.gn7i-c8g1.2xlarge</p>
         */
        @NameInMap("instanceTypeId")
        public String instanceTypeId;

        /**
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("operation")
        public String operation;

        @NameInMap("paymentDurationUnit")
        public String paymentDurationUnit;

        public static UpdateWorkspaceRequestGpuSubscription build(java.util.Map<String, ?> map) throws Exception {
            UpdateWorkspaceRequestGpuSubscription self = new UpdateWorkspaceRequestGpuSubscription();
            return TeaModel.build(map, self);
        }

        public UpdateWorkspaceRequestGpuSubscription setAutoRenew(Boolean autoRenew) {
            this.autoRenew = autoRenew;
            return this;
        }
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        public UpdateWorkspaceRequestGpuSubscription setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public UpdateWorkspaceRequestGpuSubscription setGpuMachineNum(Integer gpuMachineNum) {
            this.gpuMachineNum = gpuMachineNum;
            return this;
        }
        public Integer getGpuMachineNum() {
            return this.gpuMachineNum;
        }

        public UpdateWorkspaceRequestGpuSubscription setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public UpdateWorkspaceRequestGpuSubscription setInstanceTypeId(String instanceTypeId) {
            this.instanceTypeId = instanceTypeId;
            return this;
        }
        public String getInstanceTypeId() {
            return this.instanceTypeId;
        }

        public UpdateWorkspaceRequestGpuSubscription setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public UpdateWorkspaceRequestGpuSubscription setPaymentDurationUnit(String paymentDurationUnit) {
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }
        public String getPaymentDurationUnit() {
            return this.paymentDurationUnit;
        }

    }

    public static class UpdateWorkspaceRequestSubscription extends TeaModel {
        /**
         * <p>Specifies whether to enable auto-renewal. This parameter is required for the pre-paid billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("autoRenew")
        public String autoRenew;

        /**
         * <p>The auto-renewal duration. This parameter is required for the pre-paid billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("autoRenewPeriod")
        public String autoRenewPeriod;

        /**
         * <p>The auto-renewal period unit. This parameter is required for the pre-paid billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>MONTH</p>
         */
        @NameInMap("autoRenewPeriodUnit")
        public String autoRenewPeriodUnit;

        /**
         * <p>The idempotency token.</p>
         * 
         * <strong>example:</strong>
         * <p>my-token-asxkxxxxxxx</p>
         */
        @NameInMap("clientToken")
        public String clientToken;

        /**
         * <p>The number of subscription periods. This parameter is required for the pre-paid billing type.</p>
         * 
         * <strong>example:</strong>
         * <p>1799</p>
         */
        @NameInMap("duration")
        public String duration;

        /**
         * <p>The subscription period unit.</p>
         * 
         * <strong>example:</strong>
         * <p>MONTH</p>
         */
        @NameInMap("paymentDurationUnit")
        public String paymentDurationUnit;

        /**
         * <p>The list of running queues to be converted.</p>
         */
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
