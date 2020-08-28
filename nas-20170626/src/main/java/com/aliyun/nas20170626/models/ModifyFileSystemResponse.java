// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nas20170626.models;

import com.aliyun.tea.*;

public class ModifyFileSystemResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFileSystemResponse self = new ModifyFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFileSystemResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
