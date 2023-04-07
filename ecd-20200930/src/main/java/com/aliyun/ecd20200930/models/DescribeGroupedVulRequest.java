// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulRequest extends TeaModel {
    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The processing status of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   y: handled</p>
     * <p>*   n: unhandled</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The natural language of the request and response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Lang")
    public String lang;

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
     * <p>The maximum number of entries to return on each page.</p>
     * <br>
     * <p>Default value: 20.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    public static DescribeGroupedVulRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulRequest self = new DescribeGroupedVulRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedVulRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeGroupedVulRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupedVulRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeGroupedVulRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeGroupedVulRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedVulRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGroupedVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
