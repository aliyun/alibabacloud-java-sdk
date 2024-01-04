// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteContactGroupResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the alert contact group was deleted. Valid values:</p>
     * <br>
     * <p>*   `true`</p>
     * <p>*   `false`</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The request ID.</p>
     */
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
