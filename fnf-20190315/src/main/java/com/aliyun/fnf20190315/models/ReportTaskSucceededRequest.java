// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskSucceededRequest extends TeaModel {
    @NameInMap("Output")
    public String output;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskToken")
    public String taskToken;

    public static ReportTaskSucceededRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportTaskSucceededRequest self = new ReportTaskSucceededRequest();
        return TeaModel.build(map, self);
    }

    public ReportTaskSucceededRequest setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public ReportTaskSucceededRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReportTaskSucceededRequest setTaskToken(String taskToken) {
        this.taskToken = taskToken;
        return this;
    }
    public String getTaskToken() {
        return this.taskToken;
    }

}
