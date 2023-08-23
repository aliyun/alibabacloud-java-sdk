// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class SaveWebRtcInfoRequest extends TeaModel {
    @NameInMap("CallId")
    public String callId;

    @NameInMap("Content")
    public String content;

    @NameInMap("ContentType")
    public String contentType;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobId")
    public String jobId;

    public static SaveWebRtcInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveWebRtcInfoRequest self = new SaveWebRtcInfoRequest();
        return TeaModel.build(map, self);
    }

    public SaveWebRtcInfoRequest setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SaveWebRtcInfoRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public SaveWebRtcInfoRequest setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    public String getContentType() {
        return this.contentType;
    }

    public SaveWebRtcInfoRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SaveWebRtcInfoRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
