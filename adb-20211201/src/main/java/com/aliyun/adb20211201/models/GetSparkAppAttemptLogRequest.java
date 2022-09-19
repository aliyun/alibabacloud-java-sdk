// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSparkAppAttemptLogRequest extends TeaModel {
    @NameInMap("AttemptId")
    public String attemptId;

    @NameInMap("LogLength")
    public Long logLength;

    public static GetSparkAppAttemptLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSparkAppAttemptLogRequest self = new GetSparkAppAttemptLogRequest();
        return TeaModel.build(map, self);
    }

    public GetSparkAppAttemptLogRequest setAttemptId(String attemptId) {
        this.attemptId = attemptId;
        return this;
    }
    public String getAttemptId() {
        return this.attemptId;
    }

    public GetSparkAppAttemptLogRequest setLogLength(Long logLength) {
        this.logLength = logLength;
        return this;
    }
    public Long getLogLength() {
        return this.logLength;
    }

}
