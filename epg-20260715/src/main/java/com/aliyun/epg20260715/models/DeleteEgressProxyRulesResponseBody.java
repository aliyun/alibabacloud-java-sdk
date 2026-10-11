// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.epg20260715.models;

import com.aliyun.tea.*;

public class DeleteEgressProxyRulesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C79118A9-CA6D-5359-B53E-111BE8A03DCF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteEgressProxyRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteEgressProxyRulesResponseBody self = new DeleteEgressProxyRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteEgressProxyRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
