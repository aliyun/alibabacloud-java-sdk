// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveStreamTranscodeRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("App")
    @Validation(required = true)
    public String app;

    @NameInMap("Template")
    @Validation(required = true)
    public String template;

    public static DeleteLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveStreamTranscodeRequest self = new DeleteLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveStreamTranscodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DeleteLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public DeleteLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
