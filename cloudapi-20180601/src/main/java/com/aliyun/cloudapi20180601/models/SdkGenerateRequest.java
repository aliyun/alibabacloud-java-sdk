// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class SdkGenerateRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Language")
    public String language;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SdkGenerateRequest build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateRequest self = new SdkGenerateRequest();
        return TeaModel.build(map, self);
    }

    public SdkGenerateRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public SdkGenerateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SdkGenerateRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SdkGenerateRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
