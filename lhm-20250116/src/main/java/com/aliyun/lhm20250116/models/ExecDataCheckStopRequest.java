// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckStopRequest extends TeaModel {
    /**
     * <p>The check job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public Long batchId;

    public static ExecDataCheckStopRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckStopRequest self = new ExecDataCheckStopRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckStopRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

}
