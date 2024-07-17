// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLifecycleRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public LifecycleRule data;

    /**
     * <p>RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>EDBC848F-7CC7-52E3-9FBF-924D09B5C27A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetLifecycleRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLifecycleRuleResponseBody self = new GetLifecycleRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLifecycleRuleResponseBody setData(LifecycleRule data) {
        this.data = data;
        return this;
    }
    public LifecycleRule getData() {
        return this.data;
    }

    public GetLifecycleRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLifecycleRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
