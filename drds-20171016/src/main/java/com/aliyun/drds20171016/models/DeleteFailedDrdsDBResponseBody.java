// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DeleteFailedDrdsDBResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteFailedDrdsDBResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFailedDrdsDBResponseBody self = new DeleteFailedDrdsDBResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFailedDrdsDBResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFailedDrdsDBResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
