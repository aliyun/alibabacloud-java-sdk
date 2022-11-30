// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class UpdateResourceInstanceRequest extends TeaModel {
    @NameInMap("Action")
    public String action;

    public static UpdateResourceInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceInstanceRequest self = new UpdateResourceInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateResourceInstanceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

}
