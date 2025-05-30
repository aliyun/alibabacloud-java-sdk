// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class JobStatusDetailValue extends TeaModel {
    @NameInMap("comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("jobResult")
    public String jobResult;

    /**
     * <strong>example:</strong>
     * <p>2022-06-13 17:11:34</p>
     */
    @NameInMap("timeStamps")
    public String timeStamps;

    public static JobStatusDetailValue build(java.util.Map<String, ?> map) throws Exception {
        JobStatusDetailValue self = new JobStatusDetailValue();
        return TeaModel.build(map, self);
    }

    public JobStatusDetailValue setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public JobStatusDetailValue setJobResult(String jobResult) {
        this.jobResult = jobResult;
        return this;
    }
    public String getJobResult() {
        return this.jobResult;
    }

    public JobStatusDetailValue setTimeStamps(String timeStamps) {
        this.timeStamps = timeStamps;
        return this;
    }
    public String getTimeStamps() {
        return this.timeStamps;
    }

}
