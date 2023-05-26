// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteSilencePolicyResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the silence policy was deleted successfully. Valid values:</p>
     * <br>
     * <p>*   `true`: The silence policy was deleted successfully.</p>
     * <p>*   `false`: The silence policy failed to be deleted.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The operation that you want to perform. Set the value to **DeleteSilencePolicy**.</p>
     */
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
