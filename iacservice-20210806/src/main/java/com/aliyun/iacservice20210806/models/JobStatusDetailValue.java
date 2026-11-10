// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class JobStatusDetailValue extends TeaModel {
    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>Remarks</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <p>The execution result.</p>
     * 
     * <strong>example:</strong>
     * <p>Apply complete! Resources: 0 added, 0 changed, 0 destroyed.</p>
     */
    @NameInMap("jobResult")
    public String jobResult;

    /**
     * <p>The time when the status is reached.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-06-13 17:11:34</p>
     */
    @NameInMap("timeStamps")
    public String timeStamps;

    /**
     * <p>The error details.</p>
     * 
     * <strong>example:</strong>
     * <p>Error：Cannot import non-existent remote object</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

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

    public JobStatusDetailValue setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

}
