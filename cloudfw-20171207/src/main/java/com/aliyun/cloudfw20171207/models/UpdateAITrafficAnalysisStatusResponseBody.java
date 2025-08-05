// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdateAITrafficAnalysisStatusResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4E7F94C7-781F-5192-86CF-DB085013C810</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAITrafficAnalysisStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAITrafficAnalysisStatusResponseBody self = new UpdateAITrafficAnalysisStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAITrafficAnalysisStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
