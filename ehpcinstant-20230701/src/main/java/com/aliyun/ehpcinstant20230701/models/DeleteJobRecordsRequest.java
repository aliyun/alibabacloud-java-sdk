// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteJobRecordsRequest extends TeaModel {
    /**
     * <p>The list of job IDs.</p>
     */
    @NameInMap("JobIds")
    public java.util.List<String> jobIds;

    public static DeleteJobRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobRecordsRequest self = new DeleteJobRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobRecordsRequest setJobIds(java.util.List<String> jobIds) {
        this.jobIds = jobIds;
        return this;
    }
    public java.util.List<String> getJobIds() {
        return this.jobIds;
    }

}
