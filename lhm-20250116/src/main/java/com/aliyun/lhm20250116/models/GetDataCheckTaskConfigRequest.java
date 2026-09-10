// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckTaskConfigRequest extends TeaModel {
    /**
     * <p>The ID of the data validation task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static GetDataCheckTaskConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckTaskConfigRequest self = new GetDataCheckTaskConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCheckTaskConfigRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
