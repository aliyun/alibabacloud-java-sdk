// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ChangeInstanceAzoneResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ChangeInstanceAzoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeInstanceAzoneResponseBody self = new ChangeInstanceAzoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeInstanceAzoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeInstanceAzoneResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
