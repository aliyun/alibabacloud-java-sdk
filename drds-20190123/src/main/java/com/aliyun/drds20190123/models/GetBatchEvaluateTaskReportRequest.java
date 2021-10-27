// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class GetBatchEvaluateTaskReportRequest extends TeaModel {
    @NameInMap("BatchEvaluateTaskId")
    public Long batchEvaluateTaskId;

    public static GetBatchEvaluateTaskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchEvaluateTaskReportRequest self = new GetBatchEvaluateTaskReportRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchEvaluateTaskReportRequest setBatchEvaluateTaskId(Long batchEvaluateTaskId) {
        this.batchEvaluateTaskId = batchEvaluateTaskId;
        return this;
    }
    public Long getBatchEvaluateTaskId() {
        return this.batchEvaluateTaskId;
    }

}
