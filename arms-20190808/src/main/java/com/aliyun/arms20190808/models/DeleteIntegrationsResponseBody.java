// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIntegrationsResponseBody extends TeaModel {
    // 删除成功或者失败
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIntegrationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIntegrationsResponseBody self = new DeleteIntegrationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIntegrationsResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteIntegrationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
