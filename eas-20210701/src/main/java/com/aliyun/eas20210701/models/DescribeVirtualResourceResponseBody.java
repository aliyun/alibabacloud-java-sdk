// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DescribeVirtualResourceResponseBody extends TeaModel {
    /**
     * <p>The time when the virtual resource group was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16T17:52:49Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>Indicates whether the retention period of preemptible instances was disabled.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DisableSpotProtectionPeriod")
    public Boolean disableSpotProtectionPeriod;

    @NameInMap("Features")
    public java.util.List<String> features;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of resources in the virtual resource group.</p>
     */
    @NameInMap("Resources")
    public java.util.List<DescribeVirtualResourceResponseBodyResources> resources;

    /**
     * <p>The number of deployed services.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ServiceCount")
    public Integer serviceCount;

    /**
     * <p>The time when the virtual resource group was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-10-16T19:52:49Z</p>
     */
    @NameInMap("UpdateTime")
    public String updateTime;

    /**
     * <p>The ID of the virtual resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>eas-vr-npovr28onap1xxxxxx</p>
     */
    @NameInMap("VirtualResourceId")
    public String virtualResourceId;

    /**
     * <p>The name of the virtual resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>MyVirtualResource</p>
     */
    @NameInMap("VirtualResourceName")
    public String virtualResourceName;

    public static DescribeVirtualResourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVirtualResourceResponseBody self = new DescribeVirtualResourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVirtualResourceResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DescribeVirtualResourceResponseBody setDisableSpotProtectionPeriod(Boolean disableSpotProtectionPeriod) {
        this.disableSpotProtectionPeriod = disableSpotProtectionPeriod;
        return this;
    }
    public Boolean getDisableSpotProtectionPeriod() {
        return this.disableSpotProtectionPeriod;
    }

    public DescribeVirtualResourceResponseBody setFeatures(java.util.List<String> features) {
        this.features = features;
        return this;
    }
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    public DescribeVirtualResourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVirtualResourceResponseBody setResources(java.util.List<DescribeVirtualResourceResponseBodyResources> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<DescribeVirtualResourceResponseBodyResources> getResources() {
        return this.resources;
    }

    public DescribeVirtualResourceResponseBody setServiceCount(Integer serviceCount) {
        this.serviceCount = serviceCount;
        return this;
    }
    public Integer getServiceCount() {
        return this.serviceCount;
    }

    public DescribeVirtualResourceResponseBody setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public DescribeVirtualResourceResponseBody setVirtualResourceId(String virtualResourceId) {
        this.virtualResourceId = virtualResourceId;
        return this;
    }
    public String getVirtualResourceId() {
        return this.virtualResourceId;
    }

    public DescribeVirtualResourceResponseBody setVirtualResourceName(String virtualResourceName) {
        this.virtualResourceName = virtualResourceName;
        return this;
    }
    public String getVirtualResourceName() {
        return this.virtualResourceName;
    }

    public static class DescribeVirtualResourceResponseBodyResources extends TeaModel {
        /**
         * <p>The instance type of the public resource group.</p>
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
         * <p>3</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>The instance type of the public resource group.</p>
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
         * <p>The ID of the dedicated resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>eas-r-g55ieatgg3buxxxxxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The maximum price of preemptible instances in a public resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>10.05</p>
         */
        @NameInMap("SpotPriceLimit")
        public Float spotPriceLimit;

        public static DescribeVirtualResourceResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeVirtualResourceResponseBodyResources self = new DescribeVirtualResourceResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeVirtualResourceResponseBodyResources setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeVirtualResourceResponseBodyResources setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribeVirtualResourceResponseBodyResources setQuotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }
        public String getQuotaId() {
            return this.quotaId;
        }

        public DescribeVirtualResourceResponseBodyResources setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeVirtualResourceResponseBodyResources setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeVirtualResourceResponseBodyResources setSpotPriceLimit(Float spotPriceLimit) {
            this.spotPriceLimit = spotPriceLimit;
            return this;
        }
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

    }

}
