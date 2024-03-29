// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDiffDetailsRequest extends TeaModel {
    @NameInMap("CheckType")
    public Integer checkType;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TbName")
    public String tbName;

    public static DescribeDataCheckTableDiffDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDiffDetailsRequest self = new DescribeDataCheckTableDiffDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDiffDetailsRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public DescribeDataCheckTableDiffDetailsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDataCheckTableDiffDetailsRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDataCheckTableDiffDetailsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataCheckTableDiffDetailsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDataCheckTableDiffDetailsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDataCheckTableDiffDetailsRequest setTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }
    public String getTbName() {
        return this.tbName;
    }

}
