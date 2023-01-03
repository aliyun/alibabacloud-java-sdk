// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateAlertContactResponseBody extends TeaModel {
    // Indicates whether the update was successful. Valid values:
    // 
    // *   true: The update was successful.
    // *   false: The update failed.
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertContactResponseBody self = new UpdateAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAlertContactResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public UpdateAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
