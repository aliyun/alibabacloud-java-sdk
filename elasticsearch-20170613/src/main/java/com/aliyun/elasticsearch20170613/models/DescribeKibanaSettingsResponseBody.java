// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeKibanaSettingsResponseBody extends TeaModel {
    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeKibanaSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKibanaSettingsResponseBody self = new DescribeKibanaSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKibanaSettingsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    public DescribeKibanaSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
