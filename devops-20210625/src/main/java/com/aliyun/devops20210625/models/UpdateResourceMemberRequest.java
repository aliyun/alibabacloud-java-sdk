// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateResourceMemberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
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
