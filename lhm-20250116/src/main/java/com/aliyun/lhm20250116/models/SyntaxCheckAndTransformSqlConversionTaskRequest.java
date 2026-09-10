// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class SyntaxCheckAndTransformSqlConversionTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static SyntaxCheckAndTransformSqlConversionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SyntaxCheckAndTransformSqlConversionTaskRequest self = new SyntaxCheckAndTransformSqlConversionTaskRequest();
        return TeaModel.build(map, self);
    }

    public SyntaxCheckAndTransformSqlConversionTaskRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
