// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class QueryRtcAsrTasksResponseBody extends TeaModel {
    /**
     * <p>The description of the result. A value of \<code>success\\</code> indicates that the call is successful. If the call fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D8ADAB55-1BB8-5C01-8434-C45D353BB1FD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code. A value of 2000 indicates that the call is successful. Other values indicate that an error occurred.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("RetCode")
    public Long retCode;

    /**
     * <p>The result set of tasks.</p>
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
