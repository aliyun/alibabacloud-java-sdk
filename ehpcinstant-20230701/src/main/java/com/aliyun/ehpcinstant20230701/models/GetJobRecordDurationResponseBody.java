// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class GetJobRecordDurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("JobRecordDuration")
    public Long jobRecordDuration;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetJobRecordDurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetJobRecordDurationResponseBody self = new GetJobRecordDurationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetJobRecordDurationResponseBody setJobRecordDuration(Long jobRecordDuration) {
        this.jobRecordDuration = jobRecordDuration;
        return this;
    }
    public Long getJobRecordDuration() {
        return this.jobRecordDuration;
    }

    public GetJobRecordDurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
