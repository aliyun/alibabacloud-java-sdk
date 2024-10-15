// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The robocall tasks, in the JSON format.</p>
     * <ul>
     * <li><strong>id</strong>: the unique ID of the robocall task.</li>
     * <li><strong>taskName</strong>: the task name.</li>
     * <li><strong>robotId</strong>: the robot ID.</li>
     * <li><strong>robotName</strong>: the robot name.</li>
     * <li><strong>status</strong>: the task state.</li>
     * <li><strong>scheduleType</strong>: the scheduling type. Valid values: <strong>SINGLE</strong> and <strong>ORDER</strong>. The value SINGLE indicates that the task was started immediately after it was created. The value ORDER indicates that the task was started at a scheduled time.</li>
     * <li><strong>createTime</strong>: the time when the task was created, in the yyyy.MM.dd HH:mm:ss format.</li>
     * <li><strong>completeTime</strong>: the time when the task was completed, in the yyyy.MM.dd HH:mm:ss format.</li>
     * <li><strong>fireTime</strong>: the time when the task was started, in the yyyy.MM.dd HH:mm:ss format.</li>
     * <li><strong>totalCount</strong>: the total number of calls processed.</li>
     * <li><strong>finishCount</strong>: the number of calls completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[ {&quot;id&quot;: 1045001, &quot;taskName&quot;: &quot;Test Template&quot;, &quot;robotId&quot;: 1000000075003, &quot;robotName&quot;: &quot;robot&quot;, &quot;status&quot;: &quot;INIT&quot;,&quot;scheduleType&quot;: &quot;SINGLE&quot;, &quot;createTime&quot;: &quot;2019.06.14 14:55:23&quot;, &quot;completeTime&quot;: &quot;2019.06.14 14:55:23&quot;, &quot;fireTime&quot;: &quot;2019.06.14 14:55:23&quot;, &quot;totalCount&quot;: 1000, &quot;finishCount&quot;: 998} ]</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public String pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
