// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateProjectDefaultQuotaResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateProjectDefaultQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectDefaultQuotaResponseBody self = new UpdateProjectDefaultQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectDefaultQuotaResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateProjectDefaultQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
