// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Type")
    public String type;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("Necessity")
    public String necessity;

    @NameInMap("Dealed")
    public String dealed;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static DescribeGroupedVulRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulRequest self = new DescribeGroupedVulRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeGroupedVulRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGroupedVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeGroupedVulRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public DescribeGroupedVulRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeGroupedVulRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeGroupedVulRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedVulRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
