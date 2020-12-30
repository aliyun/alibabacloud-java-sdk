// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateScalingGroupV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static CreateScalingGroupV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateScalingGroupV2ResponseBody self = new CreateScalingGroupV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateScalingGroupV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateScalingGroupV2ResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
