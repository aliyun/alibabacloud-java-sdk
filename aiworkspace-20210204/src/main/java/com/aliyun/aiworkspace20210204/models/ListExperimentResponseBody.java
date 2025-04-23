// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListExperimentResponseBody extends TeaModel {
    /**
     * <p>The list of experiments.</p>
     */
    @NameInMap("Experiments")
    public java.util.List<Experiment> experiments;

    /**
     * <p>The pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0C6835C5-A424-5AFB-ACC2-F1E3CA1ABF7C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListExperimentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExperimentResponseBody self = new ListExperimentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExperimentResponseBody setExperiments(java.util.List<Experiment> experiments) {
        this.experiments = experiments;
        return this;
    }
    public java.util.List<Experiment> getExperiments() {
        return this.experiments;
    }

    public ListExperimentResponseBody setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListExperimentResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListExperimentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
