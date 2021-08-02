// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20210728.models;

import com.aliyun.tea.*;

public class QueryTraceAbRequest extends TeaModel {
    // 任务id
    @NameInMap("JobId")
    public String jobId;

    // 媒体id
    @NameInMap("MediaId")
    public String mediaId;

    public static QueryTraceAbRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbRequest self = new QueryTraceAbRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryTraceAbRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
