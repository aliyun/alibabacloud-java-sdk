// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The robocall tasks, in the JSON format.</p>
     * <br>
     * <p>*   **id**: the unique ID of the robocall task.</p>
     * <p>*   **taskName**: the task name.</p>
     * <p>*   **robotId**: the robot ID.</p>
     * <p>*   **robotName**: the robot name.</p>
     * <p>*   **status**: the task state.</p>
     * <p>*   **scheduleType**: the scheduling type. Valid values: **SINGLE** and **ORDER**. The value SINGLE indicates that the task was started immediately after it was created. The value ORDER indicates that the task was started at a scheduled time.</p>
     * <p>*   **createTime**: the time when the task was created, in the yyyy.MM.dd HH:mm:ss format.</p>
     * <p>*   **completeTime**: the time when the task was completed, in the yyyy.MM.dd HH:mm:ss format.</p>
     * <p>*   **fireTime**: the time when the task was started, in the yyyy.MM.dd HH:mm:ss format.</p>
     * <p>*   **totalCount**: the total number of calls processed.</p>
     * <p>*   **finishCount**: the number of calls completed.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static QueryRobotTaskListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskListResponseBody self = new QueryRobotTaskListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRobotTaskListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryRobotTaskListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRobotTaskListResponseBody setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public QueryRobotTaskListResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryRobotTaskListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRobotTaskListResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

}
