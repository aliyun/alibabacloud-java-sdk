// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class UpdateAdxCreativeContentResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public Integer status;

    public static UpdateAdxCreativeContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdxCreativeContentResponseBody self = new UpdateAdxCreativeContentResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAdxCreativeContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateAdxCreativeContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAdxCreativeContentResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
