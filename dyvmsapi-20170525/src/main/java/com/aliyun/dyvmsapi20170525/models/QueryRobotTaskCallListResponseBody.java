// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the robocall task, which is a JSON-formatted array.</p>
     * <br>
     * <p>*   **taskId**: the unique ID of the robocall task.</p>
     * <p>*   **caller**: the calling number.</p>
     * <p>*   **called**: the called number.</p>
     * <p>*   **duration**: the call duration. Unit: seconds.</p>
     * <p>*   **label**: the label of the called party.</p>
     * <p>*   **dialogCount**: the number of conversation rounds in the call.</p>
     * <p>*   **callResult**: the call result.</p>
     * <p>*   **hangupDirection**: the party who hung up. Valid values: **1** and **0**. The value 1 indicates the called party, and the value 0 indicates the robot.</p>
     * <p>*   **transferResult**: the result of transferring the call to an agent. Valid values: **1**, **0**, and **3**. The value 1 indicates that the call was transferred to an agent. The value 0 indicates that the call failed to be transferred to an agent. The value 3 indicates that the call was not transferred to an agent.</p>
     * <p>*   **transferNumber**: the phone number of the agent to whom the call was transferred.</p>
     * <p>*   **transferFailReason**: the reason why the call failed to be transferred to an agent.</p>
     * <p>*   **callId**: the unique receipt ID of the call.</p>
     * <p>*   **recallCurTimes**: the number of recalls.</p>
     * <p>*   **callStartTime**: the start time of the call.</p>
     * <p>*   **callEndTime**: the end time of the call.</p>
     * <p>*   **sureCount**: the number of times that the robocall task was acknowledged.</p>
     * <p>*   **denyCount**: the number of times that the robocall task was denied.</p>
     * <p>*   **rejectCount**: the number of times that the robocall task was rejected.</p>
     * <p>*   **customCount**: the number of times that the robocall task was customized.</p>
     * <p>*   **knowledgeCount**: the number of times that the knowledge base was queried.</p>
     * <p>*   **defaultCount**: the default number of calls.</p>
     * <p>*   **knowledgeBusinessCount**: the number of call failures caused by the business issues in the knowledge base.</p>
     * <p>*   **knowledgeCommonCount**: the number of call failures caused by the common issues in the knowledge base.</p>
     * <p>*   ****</p>
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

    public static QueryRobotTaskCallListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskCallListResponseBody self = new QueryRobotTaskCallListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskCallListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRobotTaskCallListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryRobotTaskCallListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRobotTaskCallListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
