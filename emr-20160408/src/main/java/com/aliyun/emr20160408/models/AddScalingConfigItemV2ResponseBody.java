// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class AddScalingConfigItemV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static AddScalingConfigItemV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddScalingConfigItemV2ResponseBody self = new AddScalingConfigItemV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public AddScalingConfigItemV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddScalingConfigItemV2ResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
