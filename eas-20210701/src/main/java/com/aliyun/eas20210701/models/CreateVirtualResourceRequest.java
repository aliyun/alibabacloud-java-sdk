// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateVirtualResourceRequest extends TeaModel {
    @NameInMap("DisableSpotProtectionPeriod")
    public Boolean disableSpotProtectionPeriod;

    /**
     * <p>The list of resources in the virtual resource group.</p>
     */
    @NameInMap("Resources")
    public java.util.List<CreateVirtualResourceRequestResources> resources;

    /**
     * <p>The name of the virtual resource group. Default value: the ID of the virtual resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>MyVirtualResource</p>
     */
    @NameInMap("VirtualResourceName")
    public String virtualResourceName;

    public static CreateVirtualResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVirtualResourceRequest self = new CreateVirtualResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateVirtualResourceRequest setDisableSpotProtectionPeriod(Boolean disableSpotProtectionPeriod) {
        this.disableSpotProtectionPeriod = disableSpotProtectionPeriod;
        return this;
    }
    public Boolean getDisableSpotProtectionPeriod() {
        return this.disableSpotProtectionPeriod;
    }

    public CreateVirtualResourceRequest setResources(java.util.List<CreateVirtualResourceRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<CreateVirtualResourceRequestResources> getResources() {
        return this.resources;
    }

    public CreateVirtualResourceRequest setVirtualResourceName(String virtualResourceName) {
        this.virtualResourceName = virtualResourceName;
        return this;
    }
    public String getVirtualResourceName() {
        return this.virtualResourceName;
    }

    public static class CreateVirtualResourceRequestResources extends TeaModel {
        /**
         * <p>The instance type of the public resource group.</p>
         * <blockquote>
         * <p> You must specify one and only one of the InstanceType, ResourceId, and QuotaId parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs.s6-c1m2.xlarge</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The priority of resource scheduling. A greater number specifies a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Lingjun Resource Quota ID.</p>
         * <blockquote>
         * <p> You must specify one and only one of the InstanceType, ResourceId, and QuotaId parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>quota185lqxxxxxx</p>
         */
        @NameInMap("QuotaId")
        public String quotaId;

        /**
         * <p>The region where the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the dedicated resource group. For information about how to query the ID of a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
         * <blockquote>
         * <p> You must specify one and only one of the InstanceType, ResourceId, and QuotaId parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eas-r-g55ieatgg3buxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The maximum price of preemptible instances in a public resource group.</p>
         * <blockquote>
         * <p> If you do not set this value, preemptible instances are not used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.05</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        public static CreateVirtualResourceRequestResources build(java.util.Map<String, ?> map) throws Exception {
            CreateVirtualResourceRequestResources self = new CreateVirtualResourceRequestResources();
            return TeaModel.build(map, self);
        }

        public CreateVirtualResourceRequestResources setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public CreateVirtualResourceRequestResources setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public CreateVirtualResourceRequestResources setQuotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }
        public String getQuotaId() {
            return this.quotaId;
        }

        public CreateVirtualResourceRequestResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public CreateVirtualResourceRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public CreateVirtualResourceRequestResources setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

    }

}
