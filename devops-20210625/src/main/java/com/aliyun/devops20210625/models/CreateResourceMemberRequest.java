// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateResourceMemberRequest extends TeaModel {
    // 用户id
    @NameInMap("accountId")
    public String accountId;

    // 角色部署组 deployGroup   user  成员，使用权限   admin 管理员，使用编辑权限 流水线 pipeline   admin 查看、运行、编辑权限   member  运行权限   viewer 查看权限
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
