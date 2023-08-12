// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20181012.models;

import com.aliyun.tea.*;

public class GetAsyncTranslateRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetAsyncTranslateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsyncTranslateRequest self = new GetAsyncTranslateRequest();
        return TeaModel.build(map, self);
    }

    public GetAsyncTranslateRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
