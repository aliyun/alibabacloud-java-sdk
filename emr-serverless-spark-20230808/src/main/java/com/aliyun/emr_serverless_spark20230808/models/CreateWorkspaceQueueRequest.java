// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateWorkspaceQueueRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>Ray Cluster for dev.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The list of GPU models.</p>
     */
    @NameInMap("gpuSpec")
    public java.util.List<String> gpuSpec;

    /**
     * <p>The Ray cluster instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ray-k7nm8ahl5te4tg91-ey7blpbg</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <ul>
     * <li>PayAsYouGo: pay-as-you-go</li>
     * <li>Pre: subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>Indicates whether resource prefetch is enabled.</p>
     */
    @NameInMap("preheat")
    public Boolean preheat;

    /**
     * <p>The queue type. Valid values: CPU and GPU.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("queueCategory")
    public String queueCategory;

    /**
     * <p>The resource specifications.</p>
     */
    @NameInMap("resourceSpec")
    public CreateWorkspaceQueueRequestResourceSpec resourceSpec;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>w-975bcfda9625****</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <p>The workspace queue name.</p>
     * 
     * <strong>example:</strong>
     * <p>dev_queue</p>
     */
    @NameInMap("workspaceQueueName")
    public String workspaceQueueName;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static CreateWorkspaceQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceQueueRequest self = new CreateWorkspaceQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceQueueRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWorkspaceQueueRequest setGpuSpec(java.util.List<String> gpuSpec) {
        this.gpuSpec = gpuSpec;
        return this;
    }
    public java.util.List<String> getGpuSpec() {
        return this.gpuSpec;
    }

    public CreateWorkspaceQueueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateWorkspaceQueueRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateWorkspaceQueueRequest setPreheat(Boolean preheat) {
        this.preheat = preheat;
        return this;
    }
    public Boolean getPreheat() {
        return this.preheat;
    }

    public CreateWorkspaceQueueRequest setQueueCategory(String queueCategory) {
        this.queueCategory = queueCategory;
        return this;
    }
    public String getQueueCategory() {
        return this.queueCategory;
    }

    public CreateWorkspaceQueueRequest setResourceSpec(CreateWorkspaceQueueRequestResourceSpec resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public CreateWorkspaceQueueRequestResourceSpec getResourceSpec() {
        return this.resourceSpec;
    }

    public CreateWorkspaceQueueRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public CreateWorkspaceQueueRequest setWorkspaceQueueName(String workspaceQueueName) {
        this.workspaceQueueName = workspaceQueueName;
        return this;
    }
    public String getWorkspaceQueueName() {
        return this.workspaceQueueName;
    }

    public CreateWorkspaceQueueRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateWorkspaceQueueRequestResourceSpec extends TeaModel {
        /**
         * <p>The maximum workspace resource capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("cu")
        public Long cu;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("gpu")
        public Integer gpu;

        /**
         * <p>The number of GPU machines. This parameter is valid only for subscription instances.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("gpuMachineNum")
        public Integer gpuMachineNum;

        /**
         * <p>The maximum number of CUs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("maxCu")
        public Long maxCu;

        public static CreateWorkspaceQueueRequestResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateWorkspaceQueueRequestResourceSpec self = new CreateWorkspaceQueueRequestResourceSpec();
            return TeaModel.build(map, self);
        }

        public CreateWorkspaceQueueRequestResourceSpec setCu(Long cu) {
            this.cu = cu;
            return this;
        }
        public Long getCu() {
            return this.cu;
        }

        public CreateWorkspaceQueueRequestResourceSpec setGpu(Integer gpu) {
            this.gpu = gpu;
            return this;
        }
        public Integer getGpu() {
            return this.gpu;
        }

        public CreateWorkspaceQueueRequestResourceSpec setGpuMachineNum(Integer gpuMachineNum) {
            this.gpuMachineNum = gpuMachineNum;
            return this;
        }
        public Integer getGpuMachineNum() {
            return this.gpuMachineNum;
        }

        public CreateWorkspaceQueueRequestResourceSpec setMaxCu(Long maxCu) {
            this.maxCu = maxCu;
            return this;
        }
        public Long getMaxCu() {
            return this.maxCu;
        }

    }

}
