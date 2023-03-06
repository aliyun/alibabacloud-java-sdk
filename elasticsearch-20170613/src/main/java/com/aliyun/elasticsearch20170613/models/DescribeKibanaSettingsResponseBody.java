// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeKibanaSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Some configurable Kibana settings information. For more information, see [Kibana settings](https://www.elastic.co/guide/cn/kibana/current/settings.html).</p>
     */
    @NameInMap("Result")
    public java.util.Map<String, ?> result;

    public static DescribeKibanaSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKibanaSettingsResponseBody self = new DescribeKibanaSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKibanaSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKibanaSettingsResponseBody setResult(java.util.Map<String, ?> result) {
        this.result = result;
        return this;
    }
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

}
