// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GetSemanticViewResponseBody extends TeaModel {
    /**
     * <p>The details of the semantic view.</p>
     * 
     * <strong>example:</strong>
     * <p>69</p>
     */
    @NameInMap("Data")
    public SemanticViewModel data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSemanticViewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSemanticViewResponseBody self = new GetSemanticViewResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSemanticViewResponseBody setData(SemanticViewModel data) {
        this.data = data;
        return this;
    }
    public SemanticViewModel getData() {
        return this.data;
    }

    public GetSemanticViewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
