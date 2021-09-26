// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateNodeOwnerResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateNodeOwnerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateNodeOwnerResponseBody self = new UpdateNodeOwnerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateNodeOwnerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateNodeOwnerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
