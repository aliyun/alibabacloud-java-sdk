// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskTypesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupportResources")
    public DescribeCloudDiskTypesResponseBodySupportResources supportResources;

    public static DescribeCloudDiskTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudDiskTypesResponseBody self = new DescribeCloudDiskTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudDiskTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudDiskTypesResponseBody setSupportResources(DescribeCloudDiskTypesResponseBodySupportResources supportResources) {
        this.supportResources = supportResources;
        return this;
    }
    public DescribeCloudDiskTypesResponseBodySupportResources getSupportResources() {
        return this.supportResources;
    }

    public static class DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("EnsRegionId")
        public String ensRegionId;

        public static DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource self = new DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource setEnsRegionId(String ensRegionId) {
            this.ensRegionId = ensRegionId;
            return this;
        }
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

    }

    public static class DescribeCloudDiskTypesResponseBodySupportResources extends TeaModel {
        @NameInMap("SupportResource")
        public java.util.List<DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource> supportResource;

        public static DescribeCloudDiskTypesResponseBodySupportResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudDiskTypesResponseBodySupportResources self = new DescribeCloudDiskTypesResponseBodySupportResources();
            return TeaModel.build(map, self);
        }

        public DescribeCloudDiskTypesResponseBodySupportResources setSupportResource(java.util.List<DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource> supportResource) {
            this.supportResource = supportResource;
            return this;
        }
        public java.util.List<DescribeCloudDiskTypesResponseBodySupportResourcesSupportResource> getSupportResource() {
            return this.supportResource;
        }

    }

}
