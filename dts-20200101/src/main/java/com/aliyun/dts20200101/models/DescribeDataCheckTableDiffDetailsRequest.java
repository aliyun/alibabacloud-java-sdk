// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckTableDiffDetailsRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("JobStepId")
    public String jobStepId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("TbName")
    public String tbName;

    public static DescribeDataCheckTableDiffDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckTableDiffDetailsRequest self = new DescribeDataCheckTableDiffDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckTableDiffDetailsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDataCheckTableDiffDetailsRequest setJobStepId(String jobStepId) {
        this.jobStepId = jobStepId;
        return this;
    }
    public String getJobStepId() {
        return this.jobStepId;
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

    public DescribeDataCheckTableDiffDetailsRequest setTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }
    public String getTbName() {
        return this.tbName;
    }

}
