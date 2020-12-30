// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class DeleteFlowProjectClusterSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static DeleteFlowProjectClusterSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowProjectClusterSettingResponseBody self = new DeleteFlowProjectClusterSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteFlowProjectClusterSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteFlowProjectClusterSettingResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
