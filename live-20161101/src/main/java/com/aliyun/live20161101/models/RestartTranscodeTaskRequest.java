// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RestartTranscodeTaskRequest extends TeaModel {
    @NameInMap("App")
    public String app;

    @NameInMap("PushDomain")
    public String pushDomain;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StreamName")
    public String streamName;

    @NameInMap("TranscodingTemplate")
    public String transcodingTemplate;

    public static RestartTranscodeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartTranscodeTaskRequest self = new RestartTranscodeTaskRequest();
        return TeaModel.build(map, self);
    }

    public RestartTranscodeTaskRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public RestartTranscodeTaskRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public RestartTranscodeTaskRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RestartTranscodeTaskRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public RestartTranscodeTaskRequest setTranscodingTemplate(String transcodingTemplate) {
        this.transcodingTemplate = transcodingTemplate;
        return this;
    }
    public String getTranscodingTemplate() {
        return this.transcodingTemplate;
    }

}
