// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateFlowProjectClusterSettingResponseBody extends TeaModel {
    @NameInMap("Data")
    public Boolean data;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateFlowProjectClusterSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectClusterSettingResponseBody self = new CreateFlowProjectClusterSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectClusterSettingResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public CreateFlowProjectClusterSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
