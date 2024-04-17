// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteApiTemplateResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    @Deprecated
    public Boolean success;

    public static DeleteApiTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiTemplateResponseBody self = new DeleteApiTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteApiTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteApiTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
