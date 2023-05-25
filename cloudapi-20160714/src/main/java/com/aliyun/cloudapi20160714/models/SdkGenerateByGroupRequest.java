// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SdkGenerateByGroupRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Language")
    public String language;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SdkGenerateByGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        SdkGenerateByGroupRequest self = new SdkGenerateByGroupRequest();
        return TeaModel.build(map, self);
    }

    public SdkGenerateByGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SdkGenerateByGroupRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SdkGenerateByGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
