// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class SubmitJobsResponseBody extends TeaModel {
    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Data")
    public Integer data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobsResponseBody self = new SubmitJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitJobsResponseBody setData(Integer data) {
        this.data = data;
        return this;
    }
    public Integer getData() {
        return this.data;
    }

    public SubmitJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
