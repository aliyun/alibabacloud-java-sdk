// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeVulListRequest extends TeaModel {
    // The alias of the vulnerability.
    @NameInMap("AliasName")
    public String aliasName;

    // The number of the page to return.
    // 
    // Pages start from page 1.
    // 
    // Default value: 1.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The status of the vulnerability. Valid values:
    // 
    // *   y: processed
    // *   n: not processed
    @NameInMap("Dealed")
    public String dealed;

    // The natural language of the request and response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

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

    // The maximum number of entries to return on each page.
    // 
    // Default value: 20.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // The type of the vulnerability. Valid values:
    // 
    // *   cve: Linux software vulnerability
    // *   sys: Windows system vulnerability
    @NameInMap("Type")
    public String type;

    public static DescribeVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListRequest self = new DescribeVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulListRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeVulListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeVulListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVulListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVulListRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeVulListRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeVulListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
