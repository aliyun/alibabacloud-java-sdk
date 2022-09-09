// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateAuthorizationAttributeRequest extends TeaModel {
    @NameInMap("dueTime")
    public String dueTime;

    @NameInMap("name")
    public String name;

    public static UpdateAuthorizationAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorizationAttributeRequest self = new UpdateAuthorizationAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorizationAttributeRequest setDueTime(String dueTime) {
        this.dueTime = dueTime;
        return this;
    }
    public String getDueTime() {
        return this.dueTime;
    }

    public UpdateAuthorizationAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
