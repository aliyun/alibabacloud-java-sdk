// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpgradeDBVersionResponseBody extends TeaModel {
    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. No value is returned for this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-wz9kmr708m155j***</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25C11EE5-B7E8-481A-A07C-BD619971A570</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>101450956</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpgradeDBVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpgradeDBVersionResponseBody self = new UpgradeDBVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpgradeDBVersionResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public UpgradeDBVersionResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public UpgradeDBVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpgradeDBVersionResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
