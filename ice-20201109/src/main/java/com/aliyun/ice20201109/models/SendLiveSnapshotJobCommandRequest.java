// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendLiveSnapshotJobCommandRequest extends TeaModel {
    @NameInMap("Command")
    public String command;

    @NameInMap("JobId")
    public String jobId;

    public static SendLiveSnapshotJobCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        SendLiveSnapshotJobCommandRequest self = new SendLiveSnapshotJobCommandRequest();
        return TeaModel.build(map, self);
    }

    public SendLiveSnapshotJobCommandRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public SendLiveSnapshotJobCommandRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
