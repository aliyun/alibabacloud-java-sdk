// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeleteCopyrightPersonResponseBody extends TeaModel {
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteCopyrightPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCopyrightPersonResponseBody self = new DeleteCopyrightPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCopyrightPersonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteCopyrightPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
