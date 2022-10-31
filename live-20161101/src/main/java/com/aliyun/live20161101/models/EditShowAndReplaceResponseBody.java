// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditShowAndReplaceResponseBody extends TeaModel {
    @NameInMap("JobInfo")
    public String jobInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static EditShowAndReplaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditShowAndReplaceResponseBody self = new EditShowAndReplaceResponseBody();
        return TeaModel.build(map, self);
    }

    public EditShowAndReplaceResponseBody setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
        return this;
    }
    public String getJobInfo() {
        return this.jobInfo;
    }

    public EditShowAndReplaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
