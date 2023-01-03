// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UninstallPromClusterResponseBody extends TeaModel {
    // Indicates whether the call was successful. Valid values:
    // 
    // true: The call was successful. false: The call failed.
    @NameInMap("Data")
    public Boolean data;

    // The ID of the request. You can query logs and troubleshoot issues based on the ID.
    @NameInMap("RequestId")
    public String requestId;

    public static UninstallPromClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallPromClusterResponseBody self = new UninstallPromClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallPromClusterResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UninstallPromClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
