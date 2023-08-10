// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDetailsRequest extends TeaModel {
    /**
     * <p>The data verification method. Valid values:</p>
     * <br>
     * <p>*   **1**: full data verification.</p>
     * <p>*   **2**: incremental data verification.</p>
     */
    @NameInMap("CheckType")
    public Integer checkType;

    /**
     * <p>The ID of the data migration or data synchronization task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    /**
     * <p>The page number. Pages start from page 1. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SchemaName")
    public String schemaName;

    /**
     * <p>The status of data verification results. Valid values:</p>
     * <br>
     * <p>*   **-1** (default): all states.</p>
     * <p>*   **6**: inconsistent data detected in tables.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The name of the table whose data is verified in the source database.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    public static DescribeDataCheckTableDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDetailsRequest self = new DescribeDataCheckTableDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDetailsRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public DescribeDataCheckTableDetailsRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDataCheckTableDetailsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataCheckTableDetailsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataCheckTableDetailsRequest setSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }
    public String getSchemaName() {
        return this.schemaName;
    }

    public DescribeDataCheckTableDetailsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDataCheckTableDetailsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

}
