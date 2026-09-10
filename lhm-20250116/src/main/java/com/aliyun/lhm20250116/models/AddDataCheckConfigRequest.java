// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddDataCheckConfigRequest extends TeaModel {
    /**
     * <p>Specifies whether to perform full-table validation. Valid values:</p>
     * <ul>
     * <li>0: partition-level comparison.</li>
     * <li>1: full-table comparison.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("isFullTableCount")
    public Integer isFullTableCount;

    /**
     * <p>The columns of the source table. You can specify multiple columns separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>col_a,col_b</p>
     */
    @NameInMap("sourceColumns")
    public String sourceColumns;

    /**
     * <p>The GROUP condition of the source table.</p>
     * 
     * <strong>example:</strong>
     * <p>col_a,col_b</p>
     */
    @NameInMap("sourceGroupClause")
    public String sourceGroupClause;

    /**
     * <p>The hint for the source.</p>
     */
    @NameInMap("sourceHint")
    public String sourceHint;

    /**
     * <p>The partition of the source table.</p>
     * 
     * <strong>example:</strong>
     * <p>ds=20260116</p>
     */
    @NameInMap("sourcePartition")
    public String sourcePartition;

    /**
     * <p>The name of the source table.</p>
     * 
     * <strong>example:</strong>
     * <p>table_demo</p>
     */
    @NameInMap("sourceTable")
    public String sourceTable;

    /**
     * <p>The WHERE condition of the source table.</p>
     * 
     * <strong>example:</strong>
     * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
     */
    @NameInMap("sourceWhereClause")
    public String sourceWhereClause;

    /**
     * <p>The columns of the target table. You can specify multiple columns separated by commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>col_a,col_b</p>
     */
    @NameInMap("targetColumns")
    public String targetColumns;

    /**
     * <p>The GROUP condition of the target table.</p>
     * 
     * <strong>example:</strong>
     * <p>col_a,col_b</p>
     */
    @NameInMap("targetGroupClause")
    public String targetGroupClause;

    /**
     * <p>The hint for the target.</p>
     */
    @NameInMap("targetHint")
    public String targetHint;

    /**
     * <p>The partition of the target table.</p>
     * 
     * <strong>example:</strong>
     * <p>ds=20260116</p>
     */
    @NameInMap("targetPartition")
    public String targetPartition;

    /**
     * <p>The name of the target table.</p>
     * 
     * <strong>example:</strong>
     * <p>table_demo</p>
     */
    @NameInMap("targetTable")
    public String targetTable;

    /**
     * <p>The WHERE condition of the target table.</p>
     * 
     * <strong>example:</strong>
     * <p>col_a &gt; 0 and col_b = \&quot;x\&quot;</p>
     */
    @NameInMap("targetWhereClause")
    public String targetWhereClause;

    /**
     * <p>The batch table configurations for same-pattern creation (<code>taskMode=1</code>). Separate multiple configurations with a line break (<code> </code>).</p>
     * 
     * <strong>example:</strong>
     * <p>lhm|lhm_dw|*</p>
     */
    @NameInMap("taskConfigInfo")
    public String taskConfigInfo;

    /**
     * <p>The ID of the validation task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    /**
     * <p>The total data volume comparison threshold.</p>
     * 
     * <strong>example:</strong>
     * <p>0.5</p>
     */
    @NameInMap("totalCountThreshold")
    public Float totalCountThreshold;

    public static AddDataCheckConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDataCheckConfigRequest self = new AddDataCheckConfigRequest();
        return TeaModel.build(map, self);
    }

    public AddDataCheckConfigRequest setIsFullTableCount(Integer isFullTableCount) {
        this.isFullTableCount = isFullTableCount;
        return this;
    }
    public Integer getIsFullTableCount() {
        return this.isFullTableCount;
    }

    public AddDataCheckConfigRequest setSourceColumns(String sourceColumns) {
        this.sourceColumns = sourceColumns;
        return this;
    }
    public String getSourceColumns() {
        return this.sourceColumns;
    }

    public AddDataCheckConfigRequest setSourceGroupClause(String sourceGroupClause) {
        this.sourceGroupClause = sourceGroupClause;
        return this;
    }
    public String getSourceGroupClause() {
        return this.sourceGroupClause;
    }

    public AddDataCheckConfigRequest setSourceHint(String sourceHint) {
        this.sourceHint = sourceHint;
        return this;
    }
    public String getSourceHint() {
        return this.sourceHint;
    }

    public AddDataCheckConfigRequest setSourcePartition(String sourcePartition) {
        this.sourcePartition = sourcePartition;
        return this;
    }
    public String getSourcePartition() {
        return this.sourcePartition;
    }

    public AddDataCheckConfigRequest setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
        return this;
    }
    public String getSourceTable() {
        return this.sourceTable;
    }

    public AddDataCheckConfigRequest setSourceWhereClause(String sourceWhereClause) {
        this.sourceWhereClause = sourceWhereClause;
        return this;
    }
    public String getSourceWhereClause() {
        return this.sourceWhereClause;
    }

    public AddDataCheckConfigRequest setTargetColumns(String targetColumns) {
        this.targetColumns = targetColumns;
        return this;
    }
    public String getTargetColumns() {
        return this.targetColumns;
    }

    public AddDataCheckConfigRequest setTargetGroupClause(String targetGroupClause) {
        this.targetGroupClause = targetGroupClause;
        return this;
    }
    public String getTargetGroupClause() {
        return this.targetGroupClause;
    }

    public AddDataCheckConfigRequest setTargetHint(String targetHint) {
        this.targetHint = targetHint;
        return this;
    }
    public String getTargetHint() {
        return this.targetHint;
    }

    public AddDataCheckConfigRequest setTargetPartition(String targetPartition) {
        this.targetPartition = targetPartition;
        return this;
    }
    public String getTargetPartition() {
        return this.targetPartition;
    }

    public AddDataCheckConfigRequest setTargetTable(String targetTable) {
        this.targetTable = targetTable;
        return this;
    }
    public String getTargetTable() {
        return this.targetTable;
    }

    public AddDataCheckConfigRequest setTargetWhereClause(String targetWhereClause) {
        this.targetWhereClause = targetWhereClause;
        return this;
    }
    public String getTargetWhereClause() {
        return this.targetWhereClause;
    }

    public AddDataCheckConfigRequest setTaskConfigInfo(String taskConfigInfo) {
        this.taskConfigInfo = taskConfigInfo;
        return this;
    }
    public String getTaskConfigInfo() {
        return this.taskConfigInfo;
    }

    public AddDataCheckConfigRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public AddDataCheckConfigRequest setTotalCountThreshold(Float totalCountThreshold) {
        this.totalCountThreshold = totalCountThreshold;
        return this;
    }
    public Float getTotalCountThreshold() {
        return this.totalCountThreshold;
    }

}
