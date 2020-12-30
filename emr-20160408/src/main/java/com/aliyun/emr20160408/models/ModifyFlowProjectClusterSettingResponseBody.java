// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyFlowProjectClusterSettingResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static ModifyFlowProjectClusterSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyFlowProjectClusterSettingResponseBody self = new ModifyFlowProjectClusterSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyFlowProjectClusterSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyFlowProjectClusterSettingResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
