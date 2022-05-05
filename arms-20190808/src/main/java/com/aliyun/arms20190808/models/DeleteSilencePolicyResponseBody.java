// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSilencePolicyResponseBody extends TeaModel {
    // 删除静默策略是否成功
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSilencePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSilencePolicyResponseBody self = new DeleteSilencePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSilencePolicyResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteSilencePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
