// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteBizTraceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DeleteBizTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteBizTraceResponseBody self = new DeleteBizTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteBizTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
