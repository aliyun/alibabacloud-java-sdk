// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateWebFilterRulesResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateWebFilterRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebFilterRulesResponseBody self = new UpdateWebFilterRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWebFilterRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
