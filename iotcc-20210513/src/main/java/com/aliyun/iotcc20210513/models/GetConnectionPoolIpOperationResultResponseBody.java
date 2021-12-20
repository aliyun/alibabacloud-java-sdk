// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetConnectionPoolIpOperationResultResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // OssPath
    @NameInMap("ResultFilePaths")
    public java.util.List<String> resultFilePaths;

    public static GetConnectionPoolIpOperationResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionPoolIpOperationResultResponseBody self = new GetConnectionPoolIpOperationResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectionPoolIpOperationResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionPoolIpOperationResultResponseBody setResultFilePaths(java.util.List<String> resultFilePaths) {
        this.resultFilePaths = resultFilePaths;
        return this;
    }
    public java.util.List<String> getResultFilePaths() {
        return this.resultFilePaths;
    }

}
