// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeProcessDefinitionsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("FilterEmptyGlobal")
    public Boolean filterEmptyGlobal;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProjectCode")
    public Long projectCode;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeProcessDefinitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProcessDefinitionsRequest self = new DescribeProcessDefinitionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProcessDefinitionsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeProcessDefinitionsRequest setFilterEmptyGlobal(Boolean filterEmptyGlobal) {
        this.filterEmptyGlobal = filterEmptyGlobal;
        return this;
    }
    public Boolean getFilterEmptyGlobal() {
        return this.filterEmptyGlobal;
    }

    public DescribeProcessDefinitionsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeProcessDefinitionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProcessDefinitionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProcessDefinitionsRequest setProjectCode(Long projectCode) {
        this.projectCode = projectCode;
        return this;
    }
    public Long getProjectCode() {
        return this.projectCode;
    }

    public DescribeProcessDefinitionsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
