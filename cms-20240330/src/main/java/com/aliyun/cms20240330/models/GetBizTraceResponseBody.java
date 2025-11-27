// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class GetBizTraceResponseBody extends TeaModel {
    @NameInMap("item")
    public BizTraceConfig item;

    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetBizTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBizTraceResponseBody self = new GetBizTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBizTraceResponseBody setItem(BizTraceConfig item) {
        this.item = item;
        return this;
    }
    public BizTraceConfig getItem() {
        return this.item;
    }

    public GetBizTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
