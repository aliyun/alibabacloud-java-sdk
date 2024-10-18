// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class DescribeAddonTemplateRequest extends TeaModel {
    /**
     * <p>The addon name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Login</p>
     */
    @NameInMap("AddonName")
    public String addonName;

    /**
     * <p>The addon version.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("AddonVersion")
    public String addonVersion;

    /**
     * <p>The page number of the page returned. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The zone ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static DescribeAddonTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAddonTemplateRequest self = new DescribeAddonTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAddonTemplateRequest setAddonName(String addonName) {
        this.addonName = addonName;
        return this;
    }
    public String getAddonName() {
        return this.addonName;
    }

    public DescribeAddonTemplateRequest setAddonVersion(String addonVersion) {
        this.addonVersion = addonVersion;
        return this;
    }
    public String getAddonVersion() {
        return this.addonVersion;
    }

    public DescribeAddonTemplateRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAddonTemplateRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeAddonTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAddonTemplateRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
