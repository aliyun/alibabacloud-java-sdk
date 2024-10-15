// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByTaskIdResponseBody extends TeaModel {
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
     * <p>The call details of the outbound robocall task, in the JSON format.</p>
     * <ul>
     * <li><p><strong>startDate</strong>: the time when the call was answered.</p>
     * </li>
     * <li><p><strong>stateDesc</strong>: the reason why the call was hung up. If the status code of early media was returned, this parameter indicates the reason why the status code of early media was used.</p>
     * </li>
     * <li><p><strong>statusCode</strong>: the status code.</p>
     * </li>
     * <li><p><strong>EndDate</strong>: the time when the call was ended.</p>
     * </li>
     * <li><p><strong>calleeShowNumber</strong>: the calling number displayed to the called party.</p>
     * </li>
     * <li><p><strong>callee</strong>: the called number.</p>
     * </li>
     * <li><p><strong>duration</strong>: the billing duration.</p>
     * </li>
     * <li><p><strong>gmtCreate</strong>: the time when the outbound robocall task was created.</p>
     * </li>
     * <li><p><strong>hangupDirection</strong>: the party who hung up.</p>
     * </li>
     * <li><p><strong>tags</strong>: the call tags.</p>
     * </li>
     * <li><p><strong>dialogCount</strong>: the number of conversation rounds in the call.</p>
     * </li>
     * <li><p><strong>sureCount</strong>: the number of times that the robocall task was acknowledged.</p>
     * </li>
     * <li><p><strong>denyCount</strong>: the number of times that the robocall task was denied.</p>
     * </li>
     * <li><p><strong>rejectCount</strong>: the number of times that the robocall task was rejected.</p>
     * </li>
     * <li><p><strong>customCount</strong>: the number of times that the robocall task was customized.</p>
     * </li>
     * <li><p><strong>knowledgeCount</strong>: the number of times that the knowledge base was queried.</p>
     * </li>
     * <li><p><strong>recordFile</strong>: the download URL of the recording file. The URL is valid only for 48 hours. The recording file must be downloaded in time.</p>
     * </li>
     * <li><p><strong>callId</strong>: the call ID.</p>
     * </li>
     * <li><p><strong>recordStatus</strong>: indicates whether a recording file was available. Valid values:</p>
     * <ul>
     * <li>1: A recording file was available.</li>
     * <li>2: No recording file was available.</li>
     * </ul>
     * </li>
     * <li><p><strong>knowledgeCommonCount</strong>: the number of call failures caused by the common issues in the knowledge base.</p>
     * </li>
     * <li><p><strong>knowledgeBusinessCount</strong>: the number of call failures caused by the business issues in the knowledge base.</p>
     * </li>
     * <li><p><strong>callee</strong>: the called number.</p>
     * </li>
     * <li><p><strong>dialogDetail</strong>: the conversation details. The value is a JSON array that contains the following parameters:</p>
     * <ul>
     * <li><strong>role</strong>: the role who spoke.</li>
     * <li><strong>content</strong>: the content of the speech.</li>
     * <li><strong>time</strong>: the start time of the speech.</li>
     * </ul>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The preceding parameters are for reference only. The actually returned parameters prevail.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;rejectCount&quot;:0,&quot;dialogCount&quot;:3,&quot;tags&quot;:&quot;&quot;,&quot;startDate&quot;:&quot;2019-03-27 10:34:54&quot;,&quot;gmtCreate&quot;:&quot;2019-03-27 10:34:40&quot;,&quot;sureCount&quot;:0,&quot;state&quot;:&quot;200000&quot;,&quot;recordFile&quot;:&quot;<a href="http://alicom-fc-record-biz.cn-hangzhou.oss.aliyun-inc.com/Freeswitch_RU_115987800002_02c3554f-ea24-422d-b1de-e671f455f21a_record.wav?OSSAccessKeyId=bypFNbGJVk73****&Signature=VWHOX%2FFhvvtSkxfMTw%2F5fdJUQuk%3D&Expires=1554382725%22,%22defaultCount%22:0,%22endDate%22:%222019-03-27">http://alicom-fc-record-biz.cn-hangzhou.oss.aliyun-inc.com/Freeswitch_RU_115987800002_02c3554f-ea24-422d-b1de-e671f455f21a_record.wav?OSSAccessKeyId=bypFNbGJVk73****&amp;Signature=VWHOX%2FFhvvtSkxfMTw%2F5fdJUQuk%3D&amp;Expires=1554382725&quot;,&quot;defaultCount&quot;:0,&quot;endDate&quot;:&quot;2019-03-27</a> 10:35:09&quot;,&quot;calleeShowNumber&quot;:&quot;1390000****&quot;,&quot;customCount&quot;:0,&quot;callId&quot;:&quot;1390000****&quot;,&quot;knowledgeCount&quot;:0,&quot;recordStatus&quot;:1,&quot;denyCount&quot;:0,&quot;duration&quot;:16,&quot;knowledgeCommonCount&quot;:0,&quot;callee&quot;:&quot;1390000****&quot;,&quot;knowledgeBusinessCount&quot;:0,&quot;hangupDirection&quot;:1}</p>
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
     * <p>D86B61A8-F2EE-4E4C-9F05-08A4676FFD89</p>
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
