// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetReportUnReadCountResponseBody extends TeaModel {
    @NameInMap("count")
    public Long count;

    /**
     * <p>requestId</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetReportUnReadCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetReportUnReadCountResponseBody self = new GetReportUnReadCountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetReportUnReadCountResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public GetReportUnReadCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
