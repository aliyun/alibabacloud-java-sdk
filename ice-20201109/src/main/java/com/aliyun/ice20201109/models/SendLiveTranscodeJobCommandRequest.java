// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendLiveTranscodeJobCommandRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stop</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    public static SendLiveTranscodeJobCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLiveTranscodeJobCommandRequest self = new SendLiveTranscodeJobCommandRequest();
        return TeaModel.build(map, self);
    }

    public SendLiveTranscodeJobCommandRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public SendLiveTranscodeJobCommandRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
