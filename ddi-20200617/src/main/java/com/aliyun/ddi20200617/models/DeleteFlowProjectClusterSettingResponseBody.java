// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class DeleteFlowProjectClusterSettingResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteFlowProjectClusterSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowProjectClusterSettingResponseBody self = new DeleteFlowProjectClusterSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowProjectClusterSettingResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public DeleteFlowProjectClusterSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
