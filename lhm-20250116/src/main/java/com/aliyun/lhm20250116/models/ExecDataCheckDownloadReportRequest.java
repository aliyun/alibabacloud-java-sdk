// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class ExecDataCheckDownloadReportRequest extends TeaModel {
    /**
     * <p>The batch ID. Prerequisite: the report status must be 2 (Generated).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public Long batchId;

    public static ExecDataCheckDownloadReportRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecDataCheckDownloadReportRequest self = new ExecDataCheckDownloadReportRequest();
        return TeaModel.build(map, self);
    }

    public ExecDataCheckDownloadReportRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

}
