// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateResourceMemberRequest extends TeaModel {
    // 角色部署组 deployGroup   user  成员，使用权限   admin 管理员，使用编辑权限   owner 拥有者，所有权限 流水线 pipeline   owner 拥有者，所有权限   admin 查看、运行、编辑权限   member  运行权限   viewer 查看权限
    @NameInMap("roleName")
    public String roleName;

    public static UpdateResourceMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceMemberRequest self = new UpdateResourceMemberRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceMemberRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
