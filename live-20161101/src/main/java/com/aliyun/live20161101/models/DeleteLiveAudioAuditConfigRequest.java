// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAudioAuditConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    @Validation(required = true)
    public String appName;

    @NameInMap("StreamName")
    @Validation(required = true)
    public String streamName;

    public static DeleteLiveAudioAuditConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAudioAuditConfigRequest self = new DeleteLiveAudioAuditConfigRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAudioAuditConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DeleteLiveAudioAuditConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DeleteLiveAudioAuditConfigRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
