// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class UpdateApiTemplateResponseBody extends TeaModel {
    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    @Deprecated
    public Boolean success;

    public static UpdateApiTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateApiTemplateResponseBody self = new UpdateApiTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateApiTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateApiTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
