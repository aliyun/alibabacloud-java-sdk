// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTraceAbJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>31fa3c9ca8134fb4b0b0f7878301****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>3e6149d5a8c944c09b1a8d2dc3e4****</p>
     */
    @NameInMap("MediaId")
    public String mediaId;

    public static QueryTraceAbJobRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceAbJobRequest self = new QueryTraceAbJobRequest();
        return TeaModel.build(map, self);
    }

    public QueryTraceAbJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QueryTraceAbJobRequest setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

}
