// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstallAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static InstallAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallAppResponseBody self = new InstallAppResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
