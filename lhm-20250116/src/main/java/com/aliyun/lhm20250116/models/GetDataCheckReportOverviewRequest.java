// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetDataCheckReportOverviewRequest extends TeaModel {
    /**
     * <p>The ID of the validation job (batch).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20001</p>
     */
    @NameInMap("batchId")
    public Long batchId;

    public static GetDataCheckReportOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCheckReportOverviewRequest self = new GetDataCheckReportOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCheckReportOverviewRequest setBatchId(Long batchId) {
        this.batchId = batchId;
        return this;
    }
    public Long getBatchId() {
        return this.batchId;
    }

}
