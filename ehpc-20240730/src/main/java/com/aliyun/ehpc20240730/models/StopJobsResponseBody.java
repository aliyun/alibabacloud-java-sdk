// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730.models;

import com.aliyun.tea.*;

public class StopJobsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F8868A00-6757-5542-BDD6-E1040D94****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static StopJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopJobsResponseBody self = new StopJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public StopJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopJobsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
