// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckGenerateReportRequest extends TeaModel {
    /**
     * <p>The batch ID returned by the ExecDataCheckSaveTask operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public Long batchId;

    public static ExecDataCheckGenerateReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckGenerateReportRequest self = new ExecDataCheckGenerateReportRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckGenerateReportRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

}
