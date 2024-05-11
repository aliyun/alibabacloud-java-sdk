// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class HandleActiveSQLRecordRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("OperateType")
    public Integer operateType;

    /**
     * <p>This parameter is required.</p>
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
