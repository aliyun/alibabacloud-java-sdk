// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusResponseBody extends TeaModel {
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    @NameInMap("RequestId")
    public String requestId;

    public static SetRetcodeShareStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetRetcodeShareStatusResponseBody self = new SetRetcodeShareStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public SetRetcodeShareStatusResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public SetRetcodeShareStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
