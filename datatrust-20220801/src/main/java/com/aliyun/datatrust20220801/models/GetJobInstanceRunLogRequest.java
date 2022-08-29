// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetJobInstanceRunLogRequest extends TeaModel {
    @NameInMap("LogId")
    public Long logId;

    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetJobInstanceRunLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceRunLogRequest self = new GetJobInstanceRunLogRequest();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceRunLogRequest setLogId(Long logId) {
        this.logId = logId;
        return this;
    }
    public Long getLogId() {
        return this.logId;
    }

    public GetJobInstanceRunLogRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
