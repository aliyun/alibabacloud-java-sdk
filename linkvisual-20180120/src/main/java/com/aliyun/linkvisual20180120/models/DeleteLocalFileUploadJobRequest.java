// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteLocalFileUploadJobRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JobId")
    public String jobId;

    public static DeleteLocalFileUploadJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLocalFileUploadJobRequest self = new DeleteLocalFileUploadJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLocalFileUploadJobRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public DeleteLocalFileUploadJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
