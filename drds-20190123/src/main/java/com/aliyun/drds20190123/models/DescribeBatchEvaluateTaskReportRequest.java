// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeBatchEvaluateTaskReportRequest extends TeaModel {
    @NameInMap("BatchEvaluateTaskId")
    public Long batchEvaluateTaskId;

    public static DescribeBatchEvaluateTaskReportRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchEvaluateTaskReportRequest self = new DescribeBatchEvaluateTaskReportRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBatchEvaluateTaskReportRequest setBatchEvaluateTaskId(Long batchEvaluateTaskId) {
        this.batchEvaluateTaskId = batchEvaluateTaskId;
        return this;
    }
    public Long getBatchEvaluateTaskId() {
        return this.batchEvaluateTaskId;
    }

}
