// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetLatestVersionDifferencesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static GetLatestVersionDifferencesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLatestVersionDifferencesResponseBody self = new GetLatestVersionDifferencesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLatestVersionDifferencesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
