// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDiffDetailsRequest extends TeaModel {
    /**
     * <p>The data verification method. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: full data verification.</li>
     * <li><strong>2</strong>: incremental data verification.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CheckType")
    public Integer checkType;

    /**
     * <p>The name of the database to which the table that contains inconsistent data belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>db_dtstest</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the data migration or data synchronization task. You can call the <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> operation to query the ID of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xd4e4xb419q****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The page number of the page to return. The value must be an integer greater than 0. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzawhxxc****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the table that contains inconsistent data exists.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_person</p>
     */
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
