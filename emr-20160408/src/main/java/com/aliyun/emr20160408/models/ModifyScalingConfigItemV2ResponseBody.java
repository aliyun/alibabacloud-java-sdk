// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyScalingConfigItemV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public Boolean data;

    public static ModifyScalingConfigItemV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyScalingConfigItemV2ResponseBody self = new ModifyScalingConfigItemV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyScalingConfigItemV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyScalingConfigItemV2ResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

}
