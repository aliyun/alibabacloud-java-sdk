// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RemoveScalingConfigItemV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static RemoveScalingConfigItemV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveScalingConfigItemV2ResponseBody self = new RemoveScalingConfigItemV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveScalingConfigItemV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveScalingConfigItemV2ResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
