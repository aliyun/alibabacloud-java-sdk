// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class EnableSqlAuditRequest extends TeaModel {
    /**
     * <p>The name of the database for which you want to enable the SQL audit feature.</p>
     */
    @NameInMap("DbName")
    public String dbName;

    /**
     * <p>The ID of the PolarDB-X 1.0 instance.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    /**
     * <p>Specifies whether to backtrack historical SQL statements for auditing.</p>
     */
    @NameInMap("IsRecall")
    public Boolean isRecall;

    /**
     * <p>The timestamp that indicates when the backtracking ends. Unit: milliseconds.</p>
     * <br>
     * <p>> The end time of the backtracking must be later than the start time of the backtracking.</p>
     */
    @NameInMap("RecallEndTimestamp")
    public String recallEndTimestamp;

    /**
     * <p>The timestamp that indicates when the backtracking starts. Unit: milliseconds.</p>
     */
    @NameInMap("RecallStartTimestamp")
    public String recallStartTimestamp;

    public static EnableSqlAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableSqlAuditRequest self = new EnableSqlAuditRequest();
        return TeaModel.build(map, self);
    }

    public EnableSqlAuditRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public EnableSqlAuditRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public EnableSqlAuditRequest setIsRecall(Boolean isRecall) {
        this.isRecall = isRecall;
        return this;
    }
    public Boolean getIsRecall() {
        return this.isRecall;
    }

    public EnableSqlAuditRequest setRecallEndTimestamp(String recallEndTimestamp) {
        this.recallEndTimestamp = recallEndTimestamp;
        return this;
    }
    public String getRecallEndTimestamp() {
        return this.recallEndTimestamp;
    }

    public EnableSqlAuditRequest setRecallStartTimestamp(String recallStartTimestamp) {
        this.recallStartTimestamp = recallStartTimestamp;
        return this;
    }
    public String getRecallStartTimestamp() {
        return this.recallStartTimestamp;
    }

}
