// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListServiceTaskResponseBody extends TeaModel {
    /**
     * <p>The maxResults value of the current request.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An encrypted hexadecimal string is returned when a next page exists. An empty value or absence of this field indicates no more data. Pass this value as-is in the nextToken parameter for the next page request.</p>
     * 
     * <strong>example:</strong>
     * <p>d23d8f3f0f0cd1984566b1986c9343122fa0385a05c09694c17fe87709f3eb56d1a7ead56b4a2536</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The list of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;taskId&quot;:&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;,&quot;taskType&quot;:&quot;live_debug_log_probe&quot;}]</p>
     */
    @NameInMap("serviceTasks")
    public java.util.List<java.util.Map<String, ?>> serviceTasks;

    /**
     * <p>The total number of entries that match the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListServiceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceTaskResponseBody self = new ListServiceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceTaskResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListServiceTaskResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListServiceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceTaskResponseBody setServiceTasks(java.util.List<java.util.Map<String, ?>> serviceTasks) {
        this.serviceTasks = serviceTasks;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getServiceTasks() {
        return this.serviceTasks;
    }

    public ListServiceTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
