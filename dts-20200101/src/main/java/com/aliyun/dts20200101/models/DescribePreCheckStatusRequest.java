// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckStatusRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i03e3zty16i****</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The task code. Set this parameter to specify the type of the subtask for the DTS task to query. Valid values:</p>
     * <ul>
     * <li><strong>01</strong>: Precheck.</li>
     * <li><strong>02</strong>: Database and table structure migration or initialization.</li>
     * <li><strong>03</strong>: Full data migration or initialization.</li>
     * <li><strong>04</strong>: Incremental data migration or synchronization.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("JobCode")
    public String jobCode;

    /**
     * <p>The filter condition used to perform a fuzzy match on table names.</p>
     * 
     * <strong>example:</strong>
     * <p>dewuprop</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The page number. Valid values: an integer greater than <strong>0</strong> and less than or equal to the maximum value of the Integer data type. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the DTS instance. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz4us4iruleja</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The filter condition for schema migration. Valid values: tables, views, and functions.</p>
     * 
     * <strong>example:</strong>
     * <p>View</p>
     */
    @NameInMap("StructPhase")
    public String structPhase;

    /**
     * <p>The type of the schema definition. Valid values:</p>
     * <ul>
     * <li><strong>before</strong>: Schema migration or initial schema synchronization.</li>
     * <li><strong>after</strong>: DDL operations in incremental data migration or synchronization.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>before</p>
     */
    @NameInMap("StructType")
    public String structType;

    /**
     * <p>Specifies whether the task is a seamless integration (Zero-ETL) task. Valid values:</p>
     * <ul>
     * <li><strong>false</strong>: No.</li>
     * <li><strong>true</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ZeroEtlJob")
    public Boolean zeroEtlJob;

    public static DescribePreCheckStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePreCheckStatusRequest self = new DescribePreCheckStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribePreCheckStatusRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribePreCheckStatusRequest setJobCode(String jobCode) {
        this.jobCode = jobCode;
        return this;
    }
    public String getJobCode() {
        return this.jobCode;
    }

    public DescribePreCheckStatusRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribePreCheckStatusRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public DescribePreCheckStatusRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePreCheckStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribePreCheckStatusRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribePreCheckStatusRequest setStructPhase(String structPhase) {
        this.structPhase = structPhase;
        return this;
    }
    public String getStructPhase() {
        return this.structPhase;
    }

    public DescribePreCheckStatusRequest setStructType(String structType) {
        this.structType = structType;
        return this;
    }
    public String getStructType() {
        return this.structType;
    }

    public DescribePreCheckStatusRequest setZeroEtlJob(Boolean zeroEtlJob) {
        this.zeroEtlJob = zeroEtlJob;
        return this;
    }
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

}
