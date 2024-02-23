// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByTaskIdResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The call details of the outbound robocall task, in the JSON format.</p>
     * <br>
     * <p>*   **startDate**: the time when the call was answered.</p>
     * <br>
     * <p>*   **stateDesc**: the reason why the call was hung up. If the status code of early media was returned, this parameter indicates the reason why the status code of early media was used.</p>
     * <br>
     * <p>*   **statusCode**: the status code.</p>
     * <br>
     * <p>*   **EndDate**: the time when the call was ended.</p>
     * <br>
     * <p>*   **calleeShowNumber**: the calling number displayed to the called party.</p>
     * <br>
     * <p>*   **callee**: the called number.</p>
     * <br>
     * <p>*   **duration**: the billing duration.</p>
     * <br>
     * <p>*   **gmtCreate**: the time when the outbound robocall task was created.</p>
     * <br>
     * <p>*   **hangupDirection**: the party who hung up.</p>
     * <br>
     * <p>*   **tags**: the call tags.</p>
     * <br>
     * <p>*   **dialogCount**: the number of conversation rounds in the call.</p>
     * <br>
     * <p>*   **sureCount**: the number of times that the robocall task was acknowledged.</p>
     * <br>
     * <p>*   **denyCount**: the number of times that the robocall task was denied.</p>
     * <br>
     * <p>*   **rejectCount**: the number of times that the robocall task was rejected.</p>
     * <br>
     * <p>*   **customCount**: the number of times that the robocall task was customized.</p>
     * <br>
     * <p>*   **knowledgeCount**: the number of times that the knowledge base was queried.</p>
     * <br>
     * <p>*   **recordFile**: the download URL of the recording file. The URL is valid only for 48 hours. The recording file must be downloaded in time.</p>
     * <br>
     * <p>*   **callId**: the call ID.</p>
     * <br>
     * <p>*   **recordStatus**: indicates whether a recording file was available. Valid values:</p>
     * <br>
     * <p>    *   1: A recording file was available.</p>
     * <p>    *   2: No recording file was available.</p>
     * <br>
     * <p>*   **knowledgeCommonCount**: the number of call failures caused by the common issues in the knowledge base.</p>
     * <br>
     * <p>*   **knowledgeBusinessCount**: the number of call failures caused by the business issues in the knowledge base.</p>
     * <br>
     * <p>*   **callee**: the called number.</p>
     * <br>
     * <p>*   **dialogDetail**: the conversation details. The value is a JSON array that contains the following parameters:</p>
     * <br>
     * <p>    *   **role**: the role who spoke.</p>
     * <p>    *   **content**: the content of the speech.</p>
     * <p>    *   **time**: the start time of the speech.</p>
     * <br>
     * <p>> The preceding parameters are for reference only. The actually returned parameters prevail.</p>
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

    public static QueryCallDetailByTaskIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByTaskIdResponseBody self = new QueryCallDetailByTaskIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallDetailByTaskIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCallDetailByTaskIdResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryCallDetailByTaskIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCallDetailByTaskIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
