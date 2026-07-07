// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeEdgeMobileAgentPackagesResponseBody extends TeaModel {
    /**
     * <p>The actual number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more data exists.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU+SQXzm0H9mu/FiSc****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of packages.</p>
     */
    @NameInMap("Packages")
    public java.util.List<DescribeEdgeMobileAgentPackagesResponseBodyPackages> packages;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5C5CEF0A-D6E1-58D3-8750-67DB4F82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEdgeMobileAgentPackagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMobileAgentPackagesResponseBody self = new DescribeEdgeMobileAgentPackagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMobileAgentPackagesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEdgeMobileAgentPackagesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEdgeMobileAgentPackagesResponseBody setPackages(java.util.List<DescribeEdgeMobileAgentPackagesResponseBodyPackages> packages) {
        this.packages = packages;
        return this;
    }
    public java.util.List<DescribeEdgeMobileAgentPackagesResponseBodyPackages> getPackages() {
        return this.packages;
    }

    public DescribeEdgeMobileAgentPackagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEdgeMobileAgentPackagesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEdgeMobileAgentPackagesResponseBodyPackages extends TeaModel {
        /**
         * <p>The device type.</p>
         * 
         * <strong>example:</strong>
         * <p>BOX</p>
         */
        @NameInMap("DeviceClass")
        public String deviceClass;

        /**
         * <p>The expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-05 10:04:07</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>The list of license keys.</p>
         */
        @NameInMap("LicenseKeys")
        public java.util.List<String> licenseKeys;

        /**
         * <p>The package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cmag-0c1g77wjljl9hc****</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The package specification. Currently, only hardware is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>hardware</p>
         */
        @NameInMap("PackageSpec")
        public String packageSpec;

        /**
         * <p>The package status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeEdgeMobileAgentPackagesResponseBodyPackages build(java.util.Map<String, ?> map) throws Exception {
            DescribeEdgeMobileAgentPackagesResponseBodyPackages self = new DescribeEdgeMobileAgentPackagesResponseBodyPackages();
            return TeaModel.build(map, self);
        }

        public DescribeEdgeMobileAgentPackagesResponseBodyPackages setDeviceClass(String deviceClass) {
            this.deviceClass = deviceClass;
            return this;
        }
        public String getDeviceClass() {
            return this.deviceClass;
        }

        public DescribeEdgeMobileAgentPackagesResponseBodyPackages setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public DescribeEdgeMobileAgentPackagesResponseBodyPackages setLicenseKeys(java.util.List<String> licenseKeys) {
            this.licenseKeys = licenseKeys;
            return this;
        }
        public java.util.List<String> getLicenseKeys() {
            return this.licenseKeys;
        }

        public DescribeEdgeMobileAgentPackagesResponseBodyPackages setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeEdgeMobileAgentPackagesResponseBodyPackages setPackageSpec(String packageSpec) {
            this.packageSpec = packageSpec;
            return this;
        }
        public String getPackageSpec() {
            return this.packageSpec;
        }

        public DescribeEdgeMobileAgentPackagesResponseBodyPackages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
