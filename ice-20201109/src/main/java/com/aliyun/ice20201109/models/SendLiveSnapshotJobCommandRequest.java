// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SendLiveSnapshotJobCommandRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>start</p>
     */
    @NameInMap("Command")
    public String command;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
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
