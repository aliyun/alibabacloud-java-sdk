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

    public ReportTaskSucceededRequest setTaskToken(String taskToken) {
        this.taskToken = taskToken;
        return this;
    }
    public String getTaskToken() {
        return this.taskToken;
    }

}
