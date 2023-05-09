// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeRegionsResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The name of the region where the cloud assets reside.</p>
     */
    @NameInMap("Regions")
    public java.util.List<DescribeRegionsResponseBodyRegions> regions;

    /**
     * <p>The information about regions of the cloud assets that are supported by the Anti-DDoS Origin instance. The information includes region IDs and names.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The English name of the region where the cloud assets reside.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionsResponseBody self = new DescribeRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRegionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRegionsResponseBody setRegions(java.util.List<DescribeRegionsResponseBodyRegions> regions) {
        this.regions = regions;
        return this;
    }
    public java.util.List<DescribeRegionsResponseBodyRegions> getRegions() {
        return this.regions;
    }

    public DescribeRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRegionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRegionsResponseBodyRegions extends TeaModel {
        /**
         * <p>The ID of the region.</p>
         */
        @NameInMap("RegionEnName")
        public String regionEnName;

        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).</p>
         * <br>
         * <p>For more information about sample requests, see the **"Examples"** section of this topic.</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        public static DescribeRegionsResponseBodyRegions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRegionsResponseBodyRegions self = new DescribeRegionsResponseBodyRegions();
            return TeaModel.build(map, self);
        }

        public DescribeRegionsResponseBodyRegions setRegionEnName(String regionEnName) {
            this.regionEnName = regionEnName;
            return this;
        }
        public String getRegionEnName() {
            return this.regionEnName;
        }

        public DescribeRegionsResponseBodyRegions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeRegionsResponseBodyRegions setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

    }

}
