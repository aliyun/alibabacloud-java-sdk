// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class HandleActiveSQLRecordRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp***************</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The type of the operation on the process ID. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: cancel.</li>
     * <li><strong>1</strong>: terminate.</li>
     * <li><strong>2</strong>: forcefully terminate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("OperateType")
    public Integer operateType;

    /**
     * <p>The process IDs. A process ID is a unique identifier of a query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;3003925,3003928&quot;</p>
     */
    @NameInMap("Pids")
    public String pids;

    public static HandleActiveSQLRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleActiveSQLRecordRequest self = new HandleActiveSQLRecordRequest();
        return TeaModel.build(map, self);
    }

    public HandleActiveSQLRecordRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public HandleActiveSQLRecordRequest setOperateType(Integer operateType) {
        this.operateType = operateType;
        return this;
    }
    public Integer getOperateType() {
        return this.operateType;
    }

    public HandleActiveSQLRecordRequest setPids(String pids) {
        this.pids = pids;
        return this;
    }
    public String getPids() {
        return this.pids;
    }

}
