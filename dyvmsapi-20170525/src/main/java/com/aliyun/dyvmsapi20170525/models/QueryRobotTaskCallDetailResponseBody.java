// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskCallDetailResponseBody extends TeaModel {
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
     * <p>The call details of a robocall task, in the JSON format.</p>
     * <ul>
     * <li><strong>taskId</strong>: the unique ID of the robocall task.</li>
     * <li><strong>caller</strong>: the calling number.</li>
     * <li><strong>called</strong>: the called number.</li>
     * <li><strong>duration</strong>: the call duration. Unit: seconds.</li>
     * <li><strong>label</strong>: the label of the called party.</li>
     * <li><strong>dialogCount</strong>: the number of conversation rounds in the call.</li>
     * <li><strong>callResult</strong>: the call result.</li>
     * <li><strong>hangupDirection</strong>: the party who hung up. Valid values: <strong>0</strong>: the robot. <strong>1</strong>: the called party.</li>
     * <li><strong>transferResult</strong>: the result of transferring the call to an agent. Valid values: <strong>1</strong>, <strong>0</strong>, and <strong>3</strong>. The value 1 indicates that the call was transferred to the agent. The value 0 indicates that the call failed to be transferred to the agent. The value 3 indicates that the call was not transferred to the agent.</li>
     * <li><strong>transferNumber</strong>: the phone number of the agent to whom the call was transferred.</li>
     * <li><strong>transferFailReason</strong>: the reason why the call failed to be transferred to the agent.</li>
     * <li><strong>callId</strong>: the unique receipt ID of the call, in the <code>taskId^bizId</code> format.</li>
     * <li><strong>recallCurTimes</strong>: the number of recalls.</li>
     * <li><strong>callStartTime</strong>: the start time of the call.</li>
     * <li><strong>callEndTime</strong>: the end time of the call.</li>
     * <li><strong>sureCount</strong>: the number of times that the robocall task was affirmed.</li>
     * <li><strong>denyCount</strong>: the number of times that the robocall task was denied.</li>
     * <li><strong>rejectCount</strong>: the number of times that the robocall task was rejected.</li>
     * <li><strong>customCount</strong>: the number of times that the robocall task was customized.</li>
     * <li><strong>knowledgeCount</strong>: the number of times that the knowledge base was queried.</li>
     * <li><strong>defaultCount</strong>: the default number of calls.</li>
     * <li><strong>knowledgeBusinessCount</strong>: the number of call failures caused by the business issues in the knowledge base.</li>
     * <li><strong>knowledgeCommonCount</strong>: the number of call failures caused by the common issues in the knowledge base.</li>
     * <li><strong>recordStatus</strong>: Indicates whether the call has a recording file. Valid values: <strong>1</strong>: The call has a recording file. <strong>2</strong>: The call does not have a recording file.</li>
     * <li><strong>recordFile</strong>: the download URL of the recording file.</li>
     * <li><strong>dialogDetail</strong>: the dialog details, in a JSON-formatted array. <strong>role</strong>: the object of the speech. <strong>content</strong>: the content of the speech. <strong>speakTime</strong>: the time of the speech.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;taskId&quot; : 1045001, &quot;caller&quot; : &quot;0571-8899****&quot;, &quot;called&quot; : &quot;130<strong><strong>0000&quot;, &quot;duration&quot; : &quot;60&quot;, &quot;label&quot; : &quot;Invitation&quot;, &quot;dialogCount&quot;: &quot;3&quot;, &quot;callResult&quot; : &quot;Not Available&quot;, &quot;hangupDirection&quot; : &quot;1&quot;, &quot;transferResult&quot; : &quot;3&quot;, &quot;transferNumber&quot; ：0571-8833</strong></strong>, &quot;transferFailReason&quot; ：&quot;User hangs up&quot;, &quot;callId&quot; ：&quot;116950320375^10375010****&quot;, &quot;recallCurTimes&quot; : 2, &quot;callStartTime&quot; : &quot;2019.06.14 15:22:23&quot;, &quot;callEndTime&quot; : &quot;2019.06.14 15:22:55&quot;, &quot;sureCount&quot; : 2, &quot;denyCount&quot; : 2, &quot;rejectCount&quot; : 0, &quot;customCount&quot; : 0, &quot;knowledgeCount&quot; : 0, &quot;defaultCount&quot; : 0, &quot;knowledgeBusinessCount&quot; : 0, &quot;knowledgeCommonCount&quot; : 0, &quot;recordStatus&quot;:1, &quot;recordFile&quot;: &quot;<a href="http://alicom-fc-record-biz.cn-hangzhou.oss.aliyun-inc.com/Freeswitch_RU_117074080001_ccd71132-8256-4eb4-9217-884e1d87c0d4_record.wav?Expires=1562740186&OSSAccessKeyId=bypFNbGJVk7****&Signature=99losPmytVl%2BMH85noZGD">http://alicom-fc-record-biz.cn-hangzhou.oss.aliyun-inc.com/Freeswitch_RU_117074080001_ccd71132-8256-4eb4-9217-884e1d87c0d4_record.wav?Expires=1562740186&amp;OSSAccessKeyId=bypFNbGJVk7****&amp;Signature=99losPmytVl%2BMH85noZGD</a>******&quot;, &quot;dialogDetail&quot;: [{&quot;role&quot;: &quot;robot&quot;,&quot;speakTime&quot;: &quot;2019-06-19 20:44:17&quot;,&quot;content&quot;:&quot;prologue&quot;}] }</p>
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

    public static QueryRobotTaskCallDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRobotTaskCallDetailResponseBody self = new QueryRobotTaskCallDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRobotTaskCallDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRobotTaskCallDetailResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryRobotTaskCallDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRobotTaskCallDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
