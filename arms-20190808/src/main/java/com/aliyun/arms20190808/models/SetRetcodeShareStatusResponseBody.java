// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SetRetcodeShareStatusResponseBody extends TeaModel {
    // Indicates whether the call was successful. Valid values:
    // 
    // *   `true`: The call was successful.
    // *   `false`: The call failed.
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // The ID of the request.
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
