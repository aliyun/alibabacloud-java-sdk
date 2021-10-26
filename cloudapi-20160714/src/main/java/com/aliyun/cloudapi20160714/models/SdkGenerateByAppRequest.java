// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByAppRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Language")
    public String language;

    public static SdkGenerateByAppRequest build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByAppRequest self = new SdkGenerateByAppRequest();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByAppRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SdkGenerateByAppRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public SdkGenerateByAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

}
