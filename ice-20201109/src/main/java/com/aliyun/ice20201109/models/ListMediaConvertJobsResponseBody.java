// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaConvertJobsResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public java.util.List<MediaConvertJobWithoutDetail> jobs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMediaConvertJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaConvertJobsResponseBody self = new ListMediaConvertJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaConvertJobsResponseBody setJobs(java.util.List<MediaConvertJobWithoutDetail> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<MediaConvertJobWithoutDetail> getJobs() {
        return this.jobs;
    }

    public ListMediaConvertJobsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListMediaConvertJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
