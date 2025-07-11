// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateUsersToRoleRequest extends TeaModel {
    /**
     * <p>The accounts.</p>
     */
    @NameInMap("add")
    public java.util.List<String> add;

    /**
     * <p>The accounts.</p>
     */
    @NameInMap("remove")
    public java.util.List<String> remove;

    public static UpdateUsersToRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUsersToRoleRequest self = new UpdateUsersToRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUsersToRoleRequest setAdd(java.util.List<String> add) {
        this.add = add;
        return this;
    }
    public java.util.List<String> getAdd() {
        return this.add;
    }

    public UpdateUsersToRoleRequest setRemove(java.util.List<String> remove) {
        this.remove = remove;
        return this;
    }
    public java.util.List<String> getRemove() {
        return this.remove;
    }

}
