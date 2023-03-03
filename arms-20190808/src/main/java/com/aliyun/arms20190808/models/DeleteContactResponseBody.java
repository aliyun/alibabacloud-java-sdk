// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteContactResponseBody extends TeaModel {
    /**
     * <p>Indicates whether the alert contact was successfully deleted.</p>
     * <br>
     * <p>*   `true`: The specified data is deleted.</p>
     * <p>*   `false`: The specified data fails to be deleted.</p>
     */
    @NameInMap("IsSuccess")
    public Boolean isSuccess;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactResponseBody self = new DeleteContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContactResponseBody setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
        return this;
    }
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public DeleteContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
