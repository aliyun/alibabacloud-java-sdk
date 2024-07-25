// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CheckServiceLinkedRoleResult extends TeaModel {
    @NameInMap("existed")
    public Boolean existed;

    public static CheckServiceLinkedRoleResult build(java.util.Map<String, ?> map) throws Exception {
        CheckServiceLinkedRoleResult self = new CheckServiceLinkedRoleResult();
        return TeaModel.build(map, self);
    }

    public CheckServiceLinkedRoleResult setExisted(Boolean existed) {
        this.existed = existed;
        return this;
    }
    public Boolean getExisted() {
        return this.existed;
    }

}
