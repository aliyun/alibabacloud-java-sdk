// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDiagnosisSummaryRequest extends TeaModel {
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RolePreferd")
    public String rolePreferd;

    @NameInMap("StartStatus")
    public String startStatus;

    @NameInMap("SyncMode")
    public String syncMode;

    public static DescribeDBInstanceDiagnosisSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstanceDiagnosisSummaryRequest self = new DescribeDBInstanceDiagnosisSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstanceDiagnosisSummaryRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstanceDiagnosisSummaryRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBInstanceDiagnosisSummaryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBInstanceDiagnosisSummaryRequest setRolePreferd(String rolePreferd) {
        this.rolePreferd = rolePreferd;
        return this;
    }
    public String getRolePreferd() {
        return this.rolePreferd;
    }

    public DescribeDBInstanceDiagnosisSummaryRequest setStartStatus(String startStatus) {
        this.startStatus = startStatus;
        return this;
    }
    public String getStartStatus() {
        return this.startStatus;
    }

    public DescribeDBInstanceDiagnosisSummaryRequest setSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }
    public String getSyncMode() {
        return this.syncMode;
    }

}
