// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class UpdateQuotaScheduleResponseBody extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateQuotaScheduleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaScheduleResponseBody self = new UpdateQuotaScheduleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaScheduleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UpdateQuotaScheduleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
