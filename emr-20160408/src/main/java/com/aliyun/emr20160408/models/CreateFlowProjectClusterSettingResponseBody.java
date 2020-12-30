// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateFlowProjectClusterSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static CreateFlowProjectClusterSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowProjectClusterSettingResponseBody self = new CreateFlowProjectClusterSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFlowProjectClusterSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFlowProjectClusterSettingResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
