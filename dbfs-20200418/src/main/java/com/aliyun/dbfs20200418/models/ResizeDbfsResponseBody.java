// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ResizeDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResizeDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResizeDbfsResponseBody self = new ResizeDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public ResizeDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
