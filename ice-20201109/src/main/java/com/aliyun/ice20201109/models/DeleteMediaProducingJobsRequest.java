// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteMediaProducingJobsRequest extends TeaModel {
    @NameInMap("JobIds")
    public String jobIds;

    public static DeleteMediaProducingJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMediaProducingJobsRequest self = new DeleteMediaProducingJobsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMediaProducingJobsRequest setJobIds(String jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public String getJobIds() {
        return this.jobIds;
    }

}
