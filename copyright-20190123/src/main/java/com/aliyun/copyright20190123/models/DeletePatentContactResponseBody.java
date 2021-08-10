// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeletePatentContactResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static DeletePatentContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeletePatentContactResponseBody self = new DeletePatentContactResponseBody();
        return TeaModel.build(map, self);
    }

    public DeletePatentContactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeletePatentContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
