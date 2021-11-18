// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class DownloadRecordingRequest extends TeaModel {
    @NameInMap("Channel")
    public String channel;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static DownloadRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        DownloadRecordingRequest self = new DownloadRecordingRequest();
        return TeaModel.build(map, self);
    }

    public DownloadRecordingRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public DownloadRecordingRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public DownloadRecordingRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
