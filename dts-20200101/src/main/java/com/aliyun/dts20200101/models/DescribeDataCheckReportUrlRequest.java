// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckReportUrlRequest extends TeaModel {
    @NameInMap("DbName")
    public String dbName;

    @NameInMap("JobStepId")
    public String jobStepId;

    @NameInMap("TbName")
    public String tbName;

    public static DescribeDataCheckReportUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckReportUrlRequest self = new DescribeDataCheckReportUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckReportUrlRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDataCheckReportUrlRequest setJobStepId(String jobStepId) {
        this.jobStepId = jobStepId;
        return this;
    }
    public String getJobStepId() {
        return this.jobStepId;
    }

    public DescribeDataCheckReportUrlRequest setTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }
    public String getTbName() {
        return this.tbName;
    }

}
