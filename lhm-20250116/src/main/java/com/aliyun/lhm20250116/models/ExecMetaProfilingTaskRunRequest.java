// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecMetaProfilingTaskRunRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1/0</p>
     */
    @NameInMap("batchNo")
    public String batchNo;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("componentId")
    public Long componentId;

    public static ExecMetaProfilingTaskRunRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecMetaProfilingTaskRunRequest self = new ExecMetaProfilingTaskRunRequest();
        return TeaModel.build(map, self);
    }

    public ExecMetaProfilingTaskRunRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public ExecMetaProfilingTaskRunRequest setComponentId(Long componentId) {
        this.componentId = componentId;
        return this;
    }
    public Long getComponentId() {
        return this.componentId;
    }

}
