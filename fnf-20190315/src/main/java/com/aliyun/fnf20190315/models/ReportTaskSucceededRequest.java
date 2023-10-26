// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskSucceededRequest extends TeaModel {
    /**
     * <p>The output information of the task whose execution success you want to report.</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The request ID. If you specify this parameter, the system uses this value as the ID of the request. If you do not specify this parameter, the system generates a value at random.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The token of the task whose execution success you want to report. If this parameter appears in **waitforCallback** mode, the parameter is passed to the called service, such as Message Service (MNS) or Function Compute. For MNS, the value of this parameter can be obtained from the message. For Function Compute, the value of this parameter can be obtained from the event.</p>
     */
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
