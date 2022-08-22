// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteLiveFilesByIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeleteLiveFilesByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveFilesByIdResponseBody self = new DeleteLiveFilesByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteLiveFilesByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteLiveFilesByIdResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
