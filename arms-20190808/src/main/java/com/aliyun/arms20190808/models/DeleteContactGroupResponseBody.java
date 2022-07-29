// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteContactGroupResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactGroupResponseBody self = new DeleteContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContactGroupResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
