// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetLifecycleRuleResponseBody extends TeaModel {
    /**
     * <p>The information about the lifecycle rule.</p>
     */
    @NameInMap("Data")
    public LifecycleRule data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBC848F-7CC7-52E3-9FBF-924D09B5C27A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false.</li>
     * </ul>
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
