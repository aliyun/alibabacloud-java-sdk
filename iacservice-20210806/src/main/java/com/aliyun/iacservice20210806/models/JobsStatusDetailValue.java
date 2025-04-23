// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class JobsStatusDetailValue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("jobResult")
    public String jobResult;

    /**
     * <strong>example:</strong>
     * <p>2022-06-13 17:11:34</p>
     */
    @NameInMap("timeStamps")
    public String timeStamps;

    public static JobsStatusDetailValue build(java.util.Map<String, ?> map) throws Exception {
        JobsStatusDetailValue self = new JobsStatusDetailValue();
        return TeaModel.build(map, self);
    }

    public JobsStatusDetailValue setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public JobsStatusDetailValue setJobResult(String jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public String getJobResult() {
        return this.jobResult;
    }

    public JobsStatusDetailValue setTimeStamps(String timeStamps) {
        this.timeStamps = timeStamps;
        return this;
    }
    public String getTimeStamps() {
        return this.timeStamps;
    }

}
