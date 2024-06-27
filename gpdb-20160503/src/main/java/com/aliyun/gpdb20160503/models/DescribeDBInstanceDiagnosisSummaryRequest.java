// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBInstanceDiagnosisSummaryRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The page number. Pages start from page 1. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><strong>20</strong></li>
     * <li><strong>50</strong></li>
     * <li><strong>100</strong></li>
     * </ul>
     * <p>Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The role state of the node. It specifies whether a primary/secondary switchover occurs. Valid values:</p>
     * <ul>
     * <li><strong>normal</strong>: The node role is normal. No primary/secondary switchover occurs.</li>
     * <li><strong>reverse</strong>: The node role is reversed. A primary/secondary switchover occurs.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("RolePreferd")
    public String rolePreferd;

    /**
     * <p>The running state of the node. Valid values:</p>
     * <ul>
     * <li><strong>UP</strong>: The node is running.</li>
     * <li><strong>DOWN</strong>: The node is faulty.</li>
     * </ul>
     * <p>If you do not specify this parameter, the information about nodes in all running states is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>UP</p>
     */
    @NameInMap("StartStatus")
    public String startStatus;

    /**
     * <p>The data synchronization state of the node. Valid values:</p>
     * <ul>
     * <li><strong>synced</strong>: The node data is synchronized.</li>
     * <li><strong>notSyncing</strong>: The node data is not synchronized.</li>
     * </ul>
     * <p>If you do not specify this parameter, the information about nodes in all synchronization states is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>synced</p>
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
