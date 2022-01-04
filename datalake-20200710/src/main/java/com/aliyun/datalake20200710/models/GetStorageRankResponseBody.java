// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetStorageRankResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetStorageRankResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStorageRankResponseBody self = new GetStorageRankResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStorageRankResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
