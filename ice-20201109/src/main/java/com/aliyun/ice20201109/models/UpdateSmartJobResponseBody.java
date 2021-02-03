// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateSmartJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("FEExtend")
    public String FEExtend;

    public static UpdateSmartJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSmartJobResponseBody self = new UpdateSmartJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSmartJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSmartJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateSmartJobResponseBody setFEExtend(String FEExtend) {
        this.FEExtend = FEExtend;
        return this;
    }
    public String getFEExtend() {
        return this.FEExtend;
    }

}
