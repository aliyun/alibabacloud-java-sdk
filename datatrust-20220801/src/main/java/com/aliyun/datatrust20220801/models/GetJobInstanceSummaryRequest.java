// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetJobInstanceSummaryRequest extends TeaModel {
    @NameInMap("LogId")
    public Long logId;

    public static GetJobInstanceSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobInstanceSummaryRequest self = new GetJobInstanceSummaryRequest();
        return TeaModel.build(map, self);
    }

    public GetJobInstanceSummaryRequest setLogId(Long logId) {
        this.logId = logId;
        return this;
    }
    public Long getLogId() {
        return this.logId;
    }

}
