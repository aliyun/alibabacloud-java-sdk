// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the robocall task, in the JSON format.</p>
     * <br>
     * <p>*   **Id**: the unique ID of the robocall task.</p>
     * <p>*   **taskName**: the task name.</p>
     * <p>*   **robotId**: the robot ID.</p>
     * <p>*   **robotName**: the robot name.</p>
     * <p>*   **corpName**: the company name.</p>
     * <p>*   **caller**: the number displayed to the called party.</p>
     * <p>*   **numberStatusIdent**: indicates whether number status identification was enabled. Valid values: **true** and **false**. The value true indicates that number status identification was enabled. The value false indicates that number status identification was not enabled.</p>
     * <p>*   **status**: the task state. You can call the [QueryRobotTaskList](~~QueryRobotTaskList~~) operation to obtain the task state from the `status` parameter.</p>
     * <p>*   **scheduleType**: the scheduling type. Valid values: **SINGLE** and **ORDER**. The value SINGLE indicates that the task was started immediately after it was created. The value ORDER indicates that the task was started at a scheduled time.</p>
     * <p>*   **retryType**: indicates whether auto-redial was enabled. Valid values: **1** and **0**. The value 1 indicates that auto-redial was enabled. The value 0 indicates that auto-redial was not enabled.</p>
     * <p>*   **recallStateCodes**: the call state in which redial is required. Valid values: **200010**, **200011**, **200002**, **200012**, and **200005**. The value 200010 indicates that the phone of the called party was powered off. The value 200011 indicates that the number of the called party was out of service. The value 200002 indicates that the line was busy. The value 200012 indicates that the call was lost. The value 200005 indicates that the called party could not be connected.</p>
     * <p>*   **recallTimes**: the number of redial times.</p>
     * <p>*   **recallInterval**: the redial interval. Unit: minutes.</p>
     * <p>*   **createTime**: the time when the task was created, in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>*   **fireTime**: the time when the task was started, in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>*   **completeTime**: the time when the task was completed, in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>*   **filename**: the name of the called number file.</p>
     * <p>*   **ossFilePath**: the path of the called number file.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryRobotTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskDetailResponseBody self = new QueryRobotTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRobotTaskDetailResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryRobotTaskDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRobotTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
