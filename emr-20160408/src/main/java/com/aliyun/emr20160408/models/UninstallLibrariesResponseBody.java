// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class UninstallLibrariesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static UninstallLibrariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UninstallLibrariesResponseBody self = new UninstallLibrariesResponseBody();
        return TeaModel.build(map, self);
    }

    public UninstallLibrariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UninstallLibrariesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
