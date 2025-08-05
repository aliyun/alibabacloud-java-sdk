// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class CreateBusinessBaselineResponseBody extends TeaModel {
    @NameInMap("BaselineId")
    public Long baselineId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateBusinessBaselineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBusinessBaselineResponseBody self = new CreateBusinessBaselineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBusinessBaselineResponseBody setBaselineId(Long baselineId) {
        this.baselineId = baselineId;
        return this;
    }
    public Long getBaselineId() {
        return this.baselineId;
    }

    public CreateBusinessBaselineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
