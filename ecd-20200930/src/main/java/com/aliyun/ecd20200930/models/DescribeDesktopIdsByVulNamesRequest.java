// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopIdsByVulNamesRequest extends TeaModel {
    /**
     * <p>The priority to fix the vulnerability or the risk level of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   asap: high</p>
     * <p>*   later: medium</p>
     * <p>*   nntf: low</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The ID of the workspace.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   cve: Linux software vulnerability</p>
     * <p>*   sys: Windows system vulnerability</p>
     */
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
