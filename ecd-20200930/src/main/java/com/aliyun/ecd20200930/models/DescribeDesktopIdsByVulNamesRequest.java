// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeDesktopIdsByVulNamesRequest extends TeaModel {
    /**
     * <p>The necessity level for vulnerability fixing, which indicates the urgency of the vulnerability. Valid values:</p>
     * <ul>
     * <li>asap: high</li>
     * <li>later: medium</li>
     * <li>nntf: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The vulnerability type. Valid values:</p>
     * <ul>
     * <li>cve: Linux software vulnerability</li>
     * <li>sys: Windows system vulnerability</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The array of vulnerability names.</p>
     * <p>This parameter is required.</p>
     */
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
