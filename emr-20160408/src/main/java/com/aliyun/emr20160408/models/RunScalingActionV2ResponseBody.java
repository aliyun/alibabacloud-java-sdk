// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RunScalingActionV2ResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public String data;

    public static RunScalingActionV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunScalingActionV2ResponseBody self = new RunScalingActionV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public RunScalingActionV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunScalingActionV2ResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
