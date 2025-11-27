// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class DeleteJobRecordsShrinkRequest extends TeaModel {
    /**
     * <p>The list of job IDs.</p>
     */
    @NameInMap("JobIds")
    public String jobIdsShrink;

    public static DeleteJobRecordsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobRecordsShrinkRequest self = new DeleteJobRecordsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteJobRecordsShrinkRequest setJobIdsShrink(String jobIdsShrink) {
        this.jobIdsShrink = jobIdsShrink;
        return this;
    }
    public String getJobIdsShrink() {
        return this.jobIdsShrink;
    }

}
