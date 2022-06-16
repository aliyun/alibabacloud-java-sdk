// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByAppForRegionRequest extends TeaModel {
    @NameInMap("AppId")
    public Long appId;

    @NameInMap("Language")
    public String language;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SdkGenerateByAppForRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByAppForRegionRequest self = new SdkGenerateByAppForRegionRequest();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByAppForRegionRequest setAppId(Long appId) {
        this.appId = appId;
        return this;
    }
    public Long getAppId() {
        return this.appId;
    }

    public SdkGenerateByAppForRegionRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SdkGenerateByAppForRegionRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
