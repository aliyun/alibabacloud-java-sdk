// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaConvertJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static GetMediaConvertJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaConvertJobRequest self = new GetMediaConvertJobRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaConvertJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
