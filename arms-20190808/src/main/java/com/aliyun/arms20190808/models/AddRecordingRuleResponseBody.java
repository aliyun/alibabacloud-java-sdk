// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddRecordingRuleResponseBody extends TeaModel {
    // The status of the response.
    @NameInMap("Data")
    public String data;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static AddRecordingRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddRecordingRuleResponseBody self = new AddRecordingRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public AddRecordingRuleResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AddRecordingRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
