// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingGroupV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static ModifyScalingGroupV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingGroupV2ResponseBody self = new ModifyScalingGroupV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScalingGroupV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScalingGroupV2ResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
