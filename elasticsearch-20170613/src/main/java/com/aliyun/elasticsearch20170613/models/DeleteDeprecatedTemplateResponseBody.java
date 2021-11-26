// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DeleteDeprecatedTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public Boolean result;

    public static DeleteDeprecatedTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeprecatedTemplateResponseBody self = new DeleteDeprecatedTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDeprecatedTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDeprecatedTemplateResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
