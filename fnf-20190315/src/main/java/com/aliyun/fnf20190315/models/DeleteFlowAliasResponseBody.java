// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fnf20190315.models;

import com.aliyun.tea.*;

public class DeleteFlowAliasResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>3A44E113-9962-5B0B-AB92-14060EFE3164</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFlowAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowAliasResponseBody self = new DeleteFlowAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowAliasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
