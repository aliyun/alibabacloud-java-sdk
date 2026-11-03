// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListRunsResponseBody extends TeaModel {
    /**
     * <p>The pagination token. Leave this parameter empty when you query the first page. The response returns the token for the next page. A value of 0 indicates that all entries are returned. You can obtain the token for the next page from the <strong>NextPageToken</strong> field in the response.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("NextPageToken")
    public Long nextPageToken;

    /**
     * <p>The list of runs.</p>
     */
    @NameInMap("Runs")
    public java.util.List<Run> runs;

    /**
     * <p>The total number of entries that meet the current request conditions. This parameter is optional and is not returned by default.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ADF6D849-*****-7E7030F0CE53</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRunsResponseBody self = new ListRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRunsResponseBody setNextPageToken(Long nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public Long getNextPageToken() {
        return this.nextPageToken;
    }

    public ListRunsResponseBody setRuns(java.util.List<Run> runs) {
        this.runs = runs;
        return this;
    }
    public java.util.List<Run> getRuns() {
        return this.runs;
    }

    public ListRunsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
