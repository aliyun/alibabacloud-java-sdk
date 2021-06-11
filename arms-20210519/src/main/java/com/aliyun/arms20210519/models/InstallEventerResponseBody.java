// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class InstallEventerResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static InstallEventerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallEventerResponseBody self = new InstallEventerResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallEventerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallEventerResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
