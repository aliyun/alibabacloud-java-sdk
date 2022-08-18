// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDetailsRequest extends TeaModel {
    @NameInMap("JobStepId")
    public String jobStepId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Status")
    public String status;

    @NameInMap("TableName")
    public String tableName;

    public static DescribeDataCheckTableDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDetailsRequest self = new DescribeDataCheckTableDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDetailsRequest setJobStepId(String jobStepId) {
        this.jobStepId = jobStepId;
        return this;
    }
    public String getJobStepId() {
        return this.jobStepId;
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
