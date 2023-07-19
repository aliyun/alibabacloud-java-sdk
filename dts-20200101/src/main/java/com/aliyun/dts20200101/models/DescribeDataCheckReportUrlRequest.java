// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckReportUrlRequest extends TeaModel {
    @NameInMap("CheckType")
    public Integer checkType;

    @NameInMap("DbName")
    public String dbName;

    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("TbName")
    public String tbName;

    public static DescribeDataCheckReportUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataCheckReportUrlRequest self = new DescribeDataCheckReportUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDataCheckReportUrlRequest setCheckType(Integer checkType) {
        this.checkType = checkType;
        return this;
    }
    public Integer getCheckType() {
        return this.checkType;
    }

    public DescribeDataCheckReportUrlRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public DescribeDataCheckReportUrlRequest setDtsJobId(String dtsJobId) {
        this.dtsJobId = dtsJobId;
        return this;
    }
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    public DescribeDataCheckReportUrlRequest setTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }
    public String getTbName() {
        return this.tbName;
    }

}
