// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDirectoriesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoriesResponse self = new DeleteDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoriesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
