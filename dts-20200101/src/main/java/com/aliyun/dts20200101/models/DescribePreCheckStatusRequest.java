// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribePreCheckStatusRequest extends TeaModel {
    /**
     * <p>The ID of the data migration, data synchronization, or change tracking task.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The task code that specifies the type of the DTS subtask. Valid values:</p>
     * <br>
     * <p>*   **01**: precheck</p>
     * <p>*   **02**: schema migration or initial schema synchronization</p>
     * <p>*   **03**: full data migration or initial full data synchronization</p>
     * <p>*   **04**: incremental data migration or synchronization</p>
     */
    @NameInMap("JobCode")
    public String jobCode;

    /**
     * <p>The filter item used to filter tables in fuzzy match.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of the page to return. The value must be an integer that is greater than **0** and does not exceed the maximum value of the Integer data type. Default value: **1**.</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries to return on each page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The region ID of the DTS instance. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The filter item used to filter tables, views, and functions during schema migration.</p>
     */
    @NameInMap("StructPhase")
    public String structPhase;

    /**
     * <p>The type of schema definition. Valid values:</p>
     * <br>
     * <p>*   **before**: schema migration or initial schema synchronization</p>
     * <p>*   **after**: DDL operations performed during incremental data migration or synchronization</p>
     */
    @NameInMap("StructType")
    public String structType;

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

}
