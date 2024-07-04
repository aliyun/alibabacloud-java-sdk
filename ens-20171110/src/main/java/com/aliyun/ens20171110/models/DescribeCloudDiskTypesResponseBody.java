// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DescribeCloudDiskTypesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>77990CEE-B714-5702-BDE6-943F702277DD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The specifications of resources that you can purchase.</p>
     */
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
        /**
         * <p>The category of the disk.</p>
         * <ul>
         * <li>cloud_efficiency: ultra disk.</li>
         * <li>cloud_ssd: all-flash disk.</li>
         * <li>local_hdd: local HDD.</li>
         * <li>local_ssd: local SSD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The ID of the edge node.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-guangzhou-10</p>
         */
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
