// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetTranscodeTaskStatusRequest extends TeaModel {
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

    public static GetTranscodeTaskStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeTaskStatusRequest self = new GetTranscodeTaskStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetTranscodeTaskStatusRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public GetTranscodeTaskStatusRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public GetTranscodeTaskStatusRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetTranscodeTaskStatusRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

    public GetTranscodeTaskStatusRequest setTranscodingTemplate(String transcodingTemplate) {
        this.transcodingTemplate = transcodingTemplate;
        return this;
    }
    public String getTranscodingTemplate() {
        return this.transcodingTemplate;
    }

}
