// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class UpdateLibraryInstallTaskStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static UpdateLibraryInstallTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryInstallTaskStatusResponseBody self = new UpdateLibraryInstallTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryInstallTaskStatusResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateLibraryInstallTaskStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
