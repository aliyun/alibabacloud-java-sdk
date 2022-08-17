// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class UpdateDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDbfsResponseBody self = new UpdateDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
