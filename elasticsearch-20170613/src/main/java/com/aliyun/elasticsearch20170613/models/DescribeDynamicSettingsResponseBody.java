// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDynamicSettingsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // Id of the request
    @NameInMap("Result")
    public String result;

    public static DescribeDynamicSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDynamicSettingsResponseBody self = new DescribeDynamicSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDynamicSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDynamicSettingsResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
