// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DeleteNodeToolExecutionHistoryRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("DataCenterId")
    public String dataCenterId;

    public static DeleteNodeToolExecutionHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeToolExecutionHistoryRequest self = new DeleteNodeToolExecutionHistoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNodeToolExecutionHistoryRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteNodeToolExecutionHistoryRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DeleteNodeToolExecutionHistoryRequest setDataCenterId(String dataCenterId) {
        this.dataCenterId = dataCenterId;
        return this;
    }
    public String getDataCenterId() {
        return this.dataCenterId;
    }

}
