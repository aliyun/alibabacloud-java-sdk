// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckReportStatusRequest extends TeaModel {
    /**
     * <p>The batch ID returned by the ExecDataCheckSaveTask operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public Long batchId;

    public static GetDataCheckReportStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckReportStatusRequest self = new GetDataCheckReportStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCheckReportStatusRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

}
