// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationRequest extends TeaModel {
    @NameInMap("AppIds")
    public String appIds;

    @NameInMap("TargetUserId")
    public String targetUserId;

    public static AuthorizeApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeApplicationRequest self = new AuthorizeApplicationRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeApplicationRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public AuthorizeApplicationRequest setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
        return this;
    }
    public String getTargetUserId() {
        return this.targetUserId;
    }

}
