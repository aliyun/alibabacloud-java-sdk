// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateBizTraceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>e339260ed64c95d</p>
     */
    @NameInMap("bizTraceId")
    public String bizTraceId;

    /**
     * <strong>example:</strong>
     * <p>264C3E89-XXXX-XXXX-XXXX-CE9C2196C7DC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateBizTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBizTraceResponseBody self = new CreateBizTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBizTraceResponseBody setBizTraceId(String bizTraceId) {
        this.bizTraceId = bizTraceId;
        return this;
    }
    public String getBizTraceId() {
        return this.bizTraceId;
    }

    public CreateBizTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
