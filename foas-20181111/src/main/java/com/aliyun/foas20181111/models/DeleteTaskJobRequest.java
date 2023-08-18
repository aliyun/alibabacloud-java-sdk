// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DeleteTaskJobRequest extends TeaModel {
    @NameInMap("jobIds")
    public java.util.List<Long> jobIds;

    public static DeleteTaskJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskJobRequest self = new DeleteTaskJobRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskJobRequest setJobIds(java.util.List<Long> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<Long> getJobIds() {
        return this.jobIds;
    }

}
