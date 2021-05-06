// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopIdsByVulNamesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("Type")
    @Validation(required = true)
    public String type;

    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    public String officeSiteId;

    @NameInMap("Necessity")
    public String necessity;

    @NameInMap("VulName")
    @Validation(required = true)
    public java.util.List<String> vulName;

    public static DescribeDesktopIdsByVulNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDesktopIdsByVulNamesRequest self = new DescribeDesktopIdsByVulNamesRequest();
        return TeaModel.build(map, self);
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

    public DescribeDesktopIdsByVulNamesRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeDesktopIdsByVulNamesRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeDesktopIdsByVulNamesRequest setVulName(java.util.List<String> vulName) {
        this.vulName = vulName;
        return this;
    }
    public java.util.List<String> getVulName() {
        return this.vulName;
    }

}
