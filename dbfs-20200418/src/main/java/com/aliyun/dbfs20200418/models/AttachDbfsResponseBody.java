// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class AttachDbfsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AttachDbfsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachDbfsResponseBody self = new AttachDbfsResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachDbfsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
