// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetDefaultStorageLocationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SetDefaultStorageLocationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultStorageLocationResponseBody self = new SetDefaultStorageLocationResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultStorageLocationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetDefaultStorageLocationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
