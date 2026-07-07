// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DescribeEdgeMobileAgentPackagesRequest extends TeaModel {
    /**
     * <p>The device type filter. Valid values: BOX, PHONE, PAD, and OTHER.</p>
     * 
     * <strong>example:</strong>
     * <p>BOX</p>
     */
    @NameInMap("DeviceClass")
    public String deviceClass;

    /**
     * <p>The list of license keys. Separate multiple keys with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>lic-ez197xvdf0j5eo0*****</p>
     */
    @NameInMap("LicenseKeys")
    public String licenseKeys;

    /**
     * <p>The maximum number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Leave this parameter empty for the first query. For subsequent queries, use the value returned in the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6kU****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of package IDs. Separate multiple IDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>cmag-0c1g77wjljl9hc****</p>
     */
    @NameInMap("PackageIds")
    public String packageIds;

    /**
     * <p>The package status filter.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("Status")
    public String status;

    public static DescribeEdgeMobileAgentPackagesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEdgeMobileAgentPackagesRequest self = new DescribeEdgeMobileAgentPackagesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEdgeMobileAgentPackagesRequest setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
        return this;
    }
    public String getDeviceClass() {
        return this.deviceClass;
    }

    public DescribeEdgeMobileAgentPackagesRequest setLicenseKeys(String licenseKeys) {
        this.licenseKeys = licenseKeys;
        return this;
    }
    public String getLicenseKeys() {
        return this.licenseKeys;
    }

    public DescribeEdgeMobileAgentPackagesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeEdgeMobileAgentPackagesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeEdgeMobileAgentPackagesRequest setPackageIds(String packageIds) {
        this.packageIds = packageIds;
        return this;
    }
    public String getPackageIds() {
        return this.packageIds;
    }

    public DescribeEdgeMobileAgentPackagesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
