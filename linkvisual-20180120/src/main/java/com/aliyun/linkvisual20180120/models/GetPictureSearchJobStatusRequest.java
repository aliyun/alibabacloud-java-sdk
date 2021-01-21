// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureSearchJobStatusRequest extends TeaModel {
    @NameInMap("AppInstanceId")
    @Validation(required = true)
    public String appInstanceId;

    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static GetPictureSearchJobStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPictureSearchJobStatusRequest self = new GetPictureSearchJobStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetPictureSearchJobStatusRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public GetPictureSearchJobStatusRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
