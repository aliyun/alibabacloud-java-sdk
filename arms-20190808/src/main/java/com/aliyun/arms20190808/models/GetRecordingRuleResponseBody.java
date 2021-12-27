// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRecordingRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public String data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetRecordingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRecordingRuleResponseBody self = new GetRecordingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRecordingRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetRecordingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
