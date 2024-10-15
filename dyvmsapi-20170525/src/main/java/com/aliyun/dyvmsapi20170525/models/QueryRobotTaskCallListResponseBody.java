// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallListResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information about the robocall task, which is a JSON-formatted array.</p>
     * <ul>
     * <li><strong>taskId</strong>: the unique ID of the robocall task.</li>
     * <li><strong>caller</strong>: the calling number.</li>
     * <li><strong>called</strong>: the called number.</li>
     * <li><strong>duration</strong>: the call duration. Unit: seconds.</li>
     * <li><strong>label</strong>: the label of the called party.</li>
     * <li><strong>dialogCount</strong>: the number of conversation rounds in the call.</li>
     * <li><strong>callResult</strong>: the call result.</li>
     * <li><strong>hangupDirection</strong>: the party who hung up. Valid values: <strong>1</strong> and <strong>0</strong>. The value 1 indicates the called party, and the value 0 indicates the robot.</li>
     * <li><strong>transferResult</strong>: the result of transferring the call to an agent. Valid values: <strong>1</strong>, <strong>0</strong>, and <strong>3</strong>. The value 1 indicates that the call was transferred to an agent. The value 0 indicates that the call failed to be transferred to an agent. The value 3 indicates that the call was not transferred to an agent.</li>
     * <li><strong>transferNumber</strong>: the phone number of the agent to whom the call was transferred.</li>
     * <li><strong>transferFailReason</strong>: the reason why the call failed to be transferred to an agent.</li>
     * <li><strong>callId</strong>: the unique receipt ID of the call.</li>
     * <li><strong>recallCurTimes</strong>: the number of recalls.</li>
     * <li><strong>callStartTime</strong>: the start time of the call.</li>
     * <li><strong>callEndTime</strong>: the end time of the call.</li>
     * <li><strong>sureCount</strong>: the number of times that the robocall task was acknowledged.</li>
     * <li><strong>denyCount</strong>: the number of times that the robocall task was denied.</li>
     * <li><strong>rejectCount</strong>: the number of times that the robocall task was rejected.</li>
     * <li><strong>customCount</strong>: the number of times that the robocall task was customized.</li>
     * <li><strong>knowledgeCount</strong>: the number of times that the knowledge base was queried.</li>
     * <li><strong>defaultCount</strong>: the default number of calls.</li>
     * <li><strong>knowledgeBusinessCount</strong>: the number of call failures caused by the business issues in the knowledge base.</li>
     * <li><strong>knowledgeCommonCount</strong>: the number of call failures caused by the common issues in the knowledge base.</li>
     * </ul>
     * <hr>
     * 
     * <strong>example:</strong>
     * <p>[ {&quot;taskId&quot;:&quot;1045001&quot;, &quot;caller&quot;:&quot;0571-889****&quot;, &quot;called&quot;: &quot;130<strong><strong>0000&quot;, &quot;duration&quot;:&quot;60&quot;, &quot;label&quot;:&quot;Invitation&quot;, &quot;dialogCount&quot;:&quot;3&quot;, &quot;callResult&quot;:&quot;Not Available&quot;, &quot;hangupDirection&quot;:&quot;1&quot;, &quot;transferResult&quot;:&quot;3&quot;, &quot;transferNumber&quot;:&quot;0571-8833</strong></strong>&quot;, &quot;transferFailReason&quot;:&quot;User hangs up&quot;, &quot;callId&quot;:&quot;116950320375^10375010****&quot;, &quot;recallCurTimes&quot;:&quot;2&quot;, &quot;callStartTime&quot;:&quot;2019.06.14 15:22:23&quot;, &quot;callEndTime&quot;:&quot;2019.06.14 15:22:55&quot;, &quot;sureCount&quot;:&quot;2&quot;, &quot;denyCount&quot;:&quot;2&quot;, &quot;rejectCount&quot;:&quot;0&quot;, &quot;customCount:&quot;0&quot;, &quot;knowledgeCount&quot;:&quot;0&quot;, &quot;defaultCount&quot;:&quot;0&quot;, &quot;knowledgeBusinessCount&quot;:&quot;0&quot;, &quot;knowledgeCommonCount&quot;:&quot;0&quot;} ]</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
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
