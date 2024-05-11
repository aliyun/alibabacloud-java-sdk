// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDiagnosisSummaryRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>> You can call the [DescribeDBInstances](https://help.aliyun.com/document_detail/86911.html) operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The page number. Pages start from page 1. Default value: **1**.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <br>
     * <p>*   **20**</p>
     * <p>*   **50**</p>
     * <p>*   **100**</p>
     * <br>
     * <p>Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role state of the node. It specifies whether a primary/secondary switchover occurs. Valid values:</p>
     * <br>
     * <p>*   **normal**: The node role is normal. No primary/secondary switchover occurs.</p>
     * <p>*   **reverse**: The node role is reversed. A primary/secondary switchover occurs.</p>
     */
    @NameInMap("RolePreferd")
    public String rolePreferd;

    /**
     * <p>The running state of the node. Valid values:</p>
     * <br>
     * <p>*   **UP**: The node is running.</p>
     * <p>*   **DOWN**: The node is faulty.</p>
     * <br>
     * <p>If you do not specify this parameter, the information about nodes in all running states is returned.</p>
     */
    @NameInMap("StartStatus")
    public String startStatus;

    /**
     * <p>The data synchronization state of the node. Valid values:</p>
     * <br>
     * <p>*   **synced**: The node data is synchronized.</p>
     * <p>*   **notSyncing**: The node data is not synchronized.</p>
     * <br>
     * <p>If you do not specify this parameter, the information about nodes in all synchronization states is returned.</p>
     */
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
