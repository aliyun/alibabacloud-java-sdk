// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetStorageAnalysisResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetStorageAnalysisResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageAnalysisResponseBody self = new GetStorageAnalysisResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageAnalysisResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
