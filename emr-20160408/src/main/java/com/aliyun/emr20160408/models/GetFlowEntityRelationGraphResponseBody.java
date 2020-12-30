// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class GetFlowEntityRelationGraphResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static GetFlowEntityRelationGraphResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFlowEntityRelationGraphResponseBody self = new GetFlowEntityRelationGraphResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFlowEntityRelationGraphResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetFlowEntityRelationGraphResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
