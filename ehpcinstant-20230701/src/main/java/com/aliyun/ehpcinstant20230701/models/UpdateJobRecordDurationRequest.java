// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class UpdateJobRecordDurationRequest extends TeaModel {
    /**
     * <p>The job record duration, in days. The value must be an integer from 1 to 30. Default value: 30.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("JobRecordDuration")
    public Long jobRecordDuration;

    public static UpdateJobRecordDurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateJobRecordDurationRequest self = new UpdateJobRecordDurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateJobRecordDurationRequest setJobRecordDuration(Long jobRecordDuration) {
        this.jobRecordDuration = jobRecordDuration;
        return this;
    }
    public Long getJobRecordDuration() {
        return this.jobRecordDuration;
    }

}
