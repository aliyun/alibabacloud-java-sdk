// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DescribeDynamicSettingsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Id of the request</p>
     */
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
