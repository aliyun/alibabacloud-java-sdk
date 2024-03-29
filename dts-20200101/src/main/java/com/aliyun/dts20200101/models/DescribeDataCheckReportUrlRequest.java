// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeDataCheckReportUrlRequest extends TeaModel {
    /**
     * <p>The data verification method. Valid values:</p>
     * <br>
     * <p>*   **1**: full data verification.</p>
     * <p>*   **2**: incremental data verification.</p>
     */
    @NameInMap("CheckType")
    public Integer checkType;

    /**
     * <p>The name of the verified source database.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the Data Transmission Service (DTS) task. You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobId")
    public String dtsJobId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the table verified in the source database.</p>
     */
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

    public DescribeDataCheckReportUrlRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeDataCheckReportUrlRequest setTbName(String tbName) {
        this.tbName = tbName;
        return this;
    }
    public String getTbName() {
        return this.tbName;
    }

}
