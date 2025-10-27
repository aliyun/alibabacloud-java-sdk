// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class ReportTaskSucceededRequest extends TeaModel {
    /**
     * <p>The output information of the task whose execution success you want to report.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("Output")
    public String output;

    /**
     * <p>The token of the task whose execution you want to report. The task token is passed to the called service, such as Message Service (MNS) or Function Compute. For MNS, the value of this parameter can be obtained from a message. For Function Compute, the value of this parameter can be obtained from an event. For more information, see <a href="https://help.aliyun.com/document_detail/2592915.html">Service integration modes</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>emptyString</p>
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
