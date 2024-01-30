// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class InitAppFailOverRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    public static InitAppFailOverRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAppFailOverRequest self = new InitAppFailOverRequest();
        return TeaModel.build(map, self);
    }

    public InitAppFailOverRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

}
