// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateResourceMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("roleName")
    public String roleName;

    public static CreateResourceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceMemberRequest self = new CreateResourceMemberRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceMemberRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public CreateResourceMemberRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
