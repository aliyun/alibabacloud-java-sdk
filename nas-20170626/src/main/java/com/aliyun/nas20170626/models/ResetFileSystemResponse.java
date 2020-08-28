// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ResetFileSystemResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ResetFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetFileSystemResponse self = new ResetFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public ResetFileSystemResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
