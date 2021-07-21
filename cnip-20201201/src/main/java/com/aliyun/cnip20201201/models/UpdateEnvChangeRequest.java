// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class UpdateEnvChangeRequest extends TeaModel {
    // 交付描述
    @NameInMap("description")
    public String description;

    public static UpdateEnvChangeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvChangeRequest self = new UpdateEnvChangeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEnvChangeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
