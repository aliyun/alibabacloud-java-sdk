// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class BatchGroup extends TeaModel {
    @NameInMap("batchId")
    public String batchId;

    @NameInMap("records")
    public java.util.List<ExperimentRecord> records;

    public static BatchGroup build(java.util.Map<String, ?> map) throws Exception {
        BatchGroup self = new BatchGroup();
        return TeaModel.build(map, self);
    }

    public BatchGroup setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public BatchGroup setRecords(java.util.List<ExperimentRecord> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ExperimentRecord> getRecords() {
        return this.records;
    }

}
