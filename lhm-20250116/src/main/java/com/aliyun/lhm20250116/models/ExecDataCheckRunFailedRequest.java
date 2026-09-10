// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckRunFailedRequest extends TeaModel {
    /**
     * <p>The batch ID returned by the ExecDataCheckSaveTask operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public Long batchId;

    /**
     * <p>The rerun type. Valid values:</p>
     * <ul>
     * <li>0: Reruns only execution-failed subtasks.</li>
     * <li>1: Reruns execution-failed and validation-failed subtasks.</li>
     * <li>2: Reruns execution-failed and stopped subtasks.</li>
     * </ul>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("type")
    public Integer type;

    public static ExecDataCheckRunFailedRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckRunFailedRequest self = new ExecDataCheckRunFailedRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckRunFailedRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

    public ExecDataCheckRunFailedRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
