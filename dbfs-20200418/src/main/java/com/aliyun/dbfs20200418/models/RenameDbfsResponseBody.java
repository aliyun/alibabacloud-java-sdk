// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class RenameDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static RenameDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RenameDbfsResponseBody self = new RenameDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public RenameDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
