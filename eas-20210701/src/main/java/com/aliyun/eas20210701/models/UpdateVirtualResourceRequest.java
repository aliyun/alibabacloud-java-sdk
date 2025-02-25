// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateVirtualResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to disable the retention period of preemptible instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableSpotProtectionPeriod")
    public Boolean disableSpotProtectionPeriod;

    /**
     * <p>The resources in the virtual resource group.</p>
     * <blockquote>
     * <p> If you specify this parameter, previous data is overwritten.</p>
     * </blockquote>
     */
    @NameInMap("Resources")
    public java.util.List<UpdateVirtualResourceRequestResources> resources;

    /**
     * <p>The new name of the virtual resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>NewMyVirtualResource</p>
     */
    @NameInMap("VirtualResourceName")
    public String virtualResourceName;

    public static UpdateVirtualResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVirtualResourceRequest self = new UpdateVirtualResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVirtualResourceRequest setDisableSpotProtectionPeriod(Boolean disableSpotProtectionPeriod) {
        this.disableSpotProtectionPeriod = disableSpotProtectionPeriod;
        return this;
    }
    public Boolean getDisableSpotProtectionPeriod() {
        return this.disableSpotProtectionPeriod;
    }

    public UpdateVirtualResourceRequest setResources(java.util.List<UpdateVirtualResourceRequestResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<UpdateVirtualResourceRequestResources> getResources() {
        return this.resources;
    }

    public UpdateVirtualResourceRequest setVirtualResourceName(String virtualResourceName) {
        this.virtualResourceName = virtualResourceName;
        return this;
    }
    public String getVirtualResourceName() {
        return this.virtualResourceName;
    }

    public static class UpdateVirtualResourceRequestResources extends TeaModel {
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
         * <p>The priority of resource scheduling. A greater number indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The ID of the Lingjun resource quota.</p>
         * <blockquote>
         * <p> You must specify one and only one of the InstanceType, ResourceId, and QuotaId parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>quota185lqf994k6</p>
         */
        @NameInMap("QuotaId")
        public String quotaId;

        /**
         * <p>The region in which the resource resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The ID of the dedicated resource group. For information about how to obtain the ID of a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/412133.html">ListResources</a>.</p>
         * <blockquote>
         * <p> You must specify one and only one of the InstanceType, ResourceId, and QuotaId parameters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>eas-r-g55ieatgg3butwrn7a</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The maximum price of preemptible instances in a public resource group.</p>
         * <blockquote>
         * <p> If you leave this parameter empty, preemptible instances are not used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.05</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        public static UpdateVirtualResourceRequestResources build(java.util.Map<String, ?> map) throws Exception {
            UpdateVirtualResourceRequestResources self = new UpdateVirtualResourceRequestResources();
            return TeaModel.build(map, self);
        }

        public UpdateVirtualResourceRequestResources setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public UpdateVirtualResourceRequestResources setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public UpdateVirtualResourceRequestResources setQuotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }
        public String getQuotaId() {
            return this.quotaId;
        }

        public UpdateVirtualResourceRequestResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public UpdateVirtualResourceRequestResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public UpdateVirtualResourceRequestResources setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

    }

}
