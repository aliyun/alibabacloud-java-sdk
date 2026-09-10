// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class CreateSqlExecJobRequest extends TeaModel {
    /**
     * <p>The concurrency level. This is an optional parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("concurrency")
    public Integer concurrency;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static CreateSqlExecJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlExecJobRequest self = new CreateSqlExecJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateSqlExecJobRequest setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
        return this;
    }
    public Integer getConcurrency() {
        return this.concurrency;
    }

    public CreateSqlExecJobRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
