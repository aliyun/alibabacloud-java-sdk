// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListJobInstanceRunLogsRequest extends TeaModel {
    @NameInMap("JobInstanceId")
    public Long jobInstanceId;

    @NameInMap("Verbose")
    public Boolean verbose;

    public static ListJobInstanceRunLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListJobInstanceRunLogsRequest self = new ListJobInstanceRunLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListJobInstanceRunLogsRequest setJobInstanceId(Long jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public Long getJobInstanceId() {
        return this.jobInstanceId;
    }

    public ListJobInstanceRunLogsRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
