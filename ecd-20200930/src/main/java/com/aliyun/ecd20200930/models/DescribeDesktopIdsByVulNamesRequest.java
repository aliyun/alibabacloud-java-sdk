// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopIdsByVulNamesRequest extends TeaModel {
    // The priority to fix the vulnerability or the risk level of the vulnerability. Valid values:
    // 
    // *   asap: high
    // *   later: medium
    // *   nntf: low
    @NameInMap("Necessity")
    public String necessity;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the vulnerability. Valid values:
    // 
    // *   cve: Linux software vulnerability
    // *   sys: Windows system vulnerability
    @NameInMap("Type")
    public String type;

    @NameInMap("VulName")
    public java.util.List<String> vulName;

    public static DescribeDesktopIdsByVulNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopIdsByVulNamesRequest self = new DescribeDesktopIdsByVulNamesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDesktopIdsByVulNamesRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeDesktopIdsByVulNamesRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopIdsByVulNamesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDesktopIdsByVulNamesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeDesktopIdsByVulNamesRequest setVulName(java.util.List<String> vulName) {
        this.vulName = vulName;
        return this;
    }
    public java.util.List<String> getVulName() {
        return this.vulName;
    }

}
