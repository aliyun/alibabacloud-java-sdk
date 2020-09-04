// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePipelineJobInstanceDetailRequest extends TeaModel {
    @NameInMap("JobInstanceId")
    @Validation(required = true)
    public String jobInstanceId;

    public static DescribePipelineJobInstanceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineJobInstanceDetailRequest self = new DescribePipelineJobInstanceDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribePipelineJobInstanceDetailRequest setJobInstanceId(String jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public String getJobInstanceId() {
        return this.jobInstanceId;
    }

}
