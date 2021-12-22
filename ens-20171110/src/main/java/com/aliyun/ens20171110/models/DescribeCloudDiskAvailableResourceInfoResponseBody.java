// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskAvailableResourceInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

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

    public static class DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource extends TeaModel {
        @NameInMap("CanBuyCount")
        public Long canBuyCount;

        @NameInMap("Category")
        public String category;

        @NameInMap("DefaultDiskSize")
        public Long defaultDiskSize;

        @NameInMap("DiskMaxSize")
        public Long diskMaxSize;

        @NameInMap("DiskMinSize")
        public Long diskMinSize;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        @NameInMap("EnsRegionName")
        public String ensRegionName;

        public static DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource self = new DescribeCloudDiskAvailableResourceInfoResponseBodySupportResourcesSupportResource();
            return TeaModel.build(map, self);
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
