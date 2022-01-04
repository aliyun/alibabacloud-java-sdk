// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateWorkspaceConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceConfigResponseBody self = new UpdateWorkspaceConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceConfigResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public UpdateWorkspaceConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateWorkspaceConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
