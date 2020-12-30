// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class InstallLibrariesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static InstallLibrariesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallLibrariesResponseBody self = new InstallLibrariesResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallLibrariesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallLibrariesResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
