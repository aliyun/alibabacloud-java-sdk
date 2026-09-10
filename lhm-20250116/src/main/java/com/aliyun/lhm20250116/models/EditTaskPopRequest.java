// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class EditTaskPopRequest extends TeaModel {
    /**
     * <p>The concurrency for controlling the number of concurrent conversion executions.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("concurrency")
    public Integer concurrency;

    /**
     * <p>The name of the test data source associated with a DQL task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive_test_ds</p>
     */
    @NameInMap("dqlTestDatasourceName")
    public String dqlTestDatasourceName;

    /**
     * <p>The source SQL dialect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("sourceDialect")
    public String sourceDialect;

    /**
     * <p>The target SQL dialect.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("targetDialect")
    public String targetDialect;

    /**
     * <p>The task ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    /**
     * <p>The task name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>data_check_task_demo</p>
     */
    @NameInMap("taskName")
    public String taskName;

    /**
     * <p>The task type. Valid values:</p>
     * <ul>
     * <li>1: DDL</li>
     * <li>2: DQL</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("taskType")
    public Integer taskType;

    public static EditTaskPopRequest build(java.util.Map<String, ?> map) throws Exception {
        EditTaskPopRequest self = new EditTaskPopRequest();
        return TeaModel.build(map, self);
    }

    public EditTaskPopRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public EditTaskPopRequest setDqlTestDatasourceName(String dqlTestDatasourceName) {
        this.dqlTestDatasourceName = dqlTestDatasourceName;
        return this;
    }
    public String getDqlTestDatasourceName() {
        return this.dqlTestDatasourceName;
    }

    public EditTaskPopRequest setSourceDialect(String sourceDialect) {
        this.sourceDialect = sourceDialect;
        return this;
    }
    public String getSourceDialect() {
        return this.sourceDialect;
    }

    public EditTaskPopRequest setTargetDialect(String targetDialect) {
        this.targetDialect = targetDialect;
        return this;
    }
    public String getTargetDialect() {
        return this.targetDialect;
    }

    public EditTaskPopRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public EditTaskPopRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public EditTaskPopRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

}
