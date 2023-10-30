// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordDownloadJobByIdRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    public String jobId;

    public static QueryRecordDownloadJobByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordDownloadJobByIdRequest self = new QueryRecordDownloadJobByIdRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordDownloadJobByIdRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryRecordDownloadJobByIdRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
