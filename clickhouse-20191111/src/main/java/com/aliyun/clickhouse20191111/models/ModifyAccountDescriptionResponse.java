// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyAccountDescriptionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionResponse self = new ModifyAccountDescriptionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
