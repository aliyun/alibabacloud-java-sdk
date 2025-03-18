// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskAvailableResourceInfoResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AE4F26E-7527-569F-A987-E3CF269A3C11</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The specifications of resources that you can purchase.</p>
     */
    @NameInMap("SupportResources")
    public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResources supportResources;

    public static DescribeCloudDiskAvailableResourceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskAvailableResourceInfoResponseBody self = new DescribeCloudDiskAvailableResourceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskAvailableResourceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudDiskAvailableResourceInfoResponseBody setSupportResources(DescribeCloudDiskAvailableResourceInfoResponseBodySupportResources supportResources) {
        this.supportResources = supportResources;
        return this;
    }
    public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResources getSupportResources() {
        return this.supportResources;
    }

    public static class DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResourceAbility extends TeaModel {
        @NameInMap("Ability")
        public java.util.List<String> ability;

        public static DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResourceAbility build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResourceAbility self = new DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResourceAbility();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResourceAbility setAbility(java.util.List<String> ability) {
            this.ability = ability;
            return this;
        }
        public java.util.List<String> getAbility() {
            return this.ability;
        }

    }

    public static class DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource extends TeaModel {
        /**
         * <p>Node product capability.</p>
         */
        @NameInMap("Ability")
        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResourceAbility ability;

        /**
         * <p>The number of disks that you can purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CanBuyCount")
        public Long canBuyCount;

        /**
         * <p>The type of the disk.</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: all-flash disk.</li>
         * <li>local_hdd: local HDD.</li>
         * <li>local_ssd: local SSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The default size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DefaultDiskSize")
        public Long defaultDiskSize;

        /**
         * <p>The maximum size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DiskMaxSize")
        public Long diskMaxSize;

        /**
         * <p>The minimum size of the disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("DiskMinSize")
        public Long diskMinSize;

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-cmcc</p>
         */
        @NameInMap("EnsRegionId")
        public String ensRegionId;

        /**
         * <p>The name of the task node.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing Mobile</p>
         */
        @NameInMap("EnsRegionName")
        public String ensRegionName;

        public static DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource self = new DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource setAbility(DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResourceAbility ability) {
            this.ability = ability;
            return this;
        }
        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResourceAbility getAbility() {
            return this.ability;
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource setCanBuyCount(Long canBuyCount) {
            this.canBuyCount = canBuyCount;
            return this;
        }
        public Long getCanBuyCount() {
            return this.canBuyCount;
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource setDefaultDiskSize(Long defaultDiskSize) {
            this.defaultDiskSize = defaultDiskSize;
            return this;
        }
        public Long getDefaultDiskSize() {
            return this.defaultDiskSize;
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource setDiskMaxSize(Long diskMaxSize) {
            this.diskMaxSize = diskMaxSize;
            return this;
        }
        public Long getDiskMaxSize() {
            return this.diskMaxSize;
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource setDiskMinSize(Long diskMinSize) {
            this.diskMinSize = diskMinSize;
            return this;
        }
        public Long getDiskMinSize() {
            return this.diskMinSize;
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource setEnsRegionName(String ensRegionName) {
            this.ensRegionName = ensRegionName;
            return this;
        }
        public String getEnsRegionName() {
            return this.ensRegionName;
        }

    }

    public static class DescribeCloudDiskAvailableResourceInfoResponseBodySupportResources extends TeaModel {
        @NameInMap("SupportResource")
        public java.util.List<DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource> supportResource;

        public static DescribeCloudDiskAvailableResourceInfoResponseBodySupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDiskAvailableResourceInfoResponseBodySupportResources self = new DescribeCloudDiskAvailableResourceInfoResponseBodySupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDiskAvailableResourceInfoResponseBodySupportResources setSupportResource(java.util.List<DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

}
