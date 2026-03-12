// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class DeleteContactTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteContactTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactTemplateResponseBody self = new DeleteContactTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteContactTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteContactTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
