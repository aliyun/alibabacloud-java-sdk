// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class UninstallLibrariesResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static UninstallLibrariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallLibrariesResponseBody self = new UninstallLibrariesResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallLibrariesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public UninstallLibrariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
