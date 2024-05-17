// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can specify multiple IDs. Separate multiple IDs with semicolons (;). If you leave this parameter empty, the permissions on the application are revoked.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>The ID of the RAM user to be authorized. The value of the parameter is in the `sub-account name@primary account UID` format.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
