// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetGroupAuthAppCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AuthAppCode")
    public String authAppCode;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetGroupAuthAppCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGroupAuthAppCodeRequest self = new SetGroupAuthAppCodeRequest();
        return TeaModel.build(map, self);
    }

    public SetGroupAuthAppCodeRequest setAuthAppCode(String authAppCode) {
        this.authAppCode = authAppCode;
        return this;
    }
    public String getAuthAppCode() {
        return this.authAppCode;
    }

    public SetGroupAuthAppCodeRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetGroupAuthAppCodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
