// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QueryRtcAsrTasksResponseBody extends TeaModel {
    /**
     * <p>The result of the request. If success is returned, the request was successful. If an error message is returned, the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D8ADAB55-1BB8-5C01-8434-C45D353BB1FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The HTTP status code. HTTP status code 2000 indicates that the request was successful. Other HTTP status codes indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("RetCode")
    public Long retCode;

    /**
     * <p>The results returned for the tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.Map<String, ?> tasks;

    public static QueryRtcAsrTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRtcAsrTasksResponseBody self = new QueryRtcAsrTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRtcAsrTasksResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public QueryRtcAsrTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRtcAsrTasksResponseBody setRetCode(Long retCode) {
        this.retCode = retCode;
        return this;
    }
    public Long getRetCode() {
        return this.retCode;
    }

    public QueryRtcAsrTasksResponseBody setTasks(java.util.Map<String, ?> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.Map<String, ?> getTasks() {
        return this.tasks;
    }

}
