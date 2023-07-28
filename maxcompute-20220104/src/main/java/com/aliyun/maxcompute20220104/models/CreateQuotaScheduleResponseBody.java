// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class CreateQuotaScheduleResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateQuotaScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateQuotaScheduleResponseBody self = new CreateQuotaScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateQuotaScheduleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateQuotaScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
