// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteIMRobotResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the call was successful.</p>
     * <br>
     * <p>*   `true`: The call was successful.</p>
     * <p>*   `false`: The call failed.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID. You can use the ID to find logs and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteIMRobotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteIMRobotResponseBody self = new DeleteIMRobotResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteIMRobotResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteIMRobotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
