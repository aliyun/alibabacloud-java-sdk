// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryOTAJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static QueryOTAJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOTAJobRequest self = new QueryOTAJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryOTAJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryOTAJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
