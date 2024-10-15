// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryRobotTaskDetailResponseBody extends TeaModel {
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
     * <p>The details of the robocall task, in the JSON format.</p>
     * <ul>
     * <li><strong>Id</strong>: the unique ID of the robocall task.</li>
     * <li><strong>taskName</strong>: the task name.</li>
     * <li><strong>robotId</strong>: the robot ID.</li>
     * <li><strong>robotName</strong>: the robot name.</li>
     * <li><strong>corpName</strong>: the company name.</li>
     * <li><strong>caller</strong>: the number displayed to the called party.</li>
     * <li><strong>numberStatusIdent</strong>: indicates whether number status identification was enabled. Valid values: <strong>true</strong> and <strong>false</strong>. The value true indicates that number status identification was enabled. The value false indicates that number status identification was not enabled.</li>
     * <li><strong>status</strong>: the task state. You can call the <a href="~~QueryRobotTaskList~~">QueryRobotTaskList</a> operation to obtain the task state from the <code>status</code> parameter.</li>
     * <li><strong>scheduleType</strong>: the scheduling type. Valid values: <strong>SINGLE</strong> and <strong>ORDER</strong>. The value SINGLE indicates that the task was started immediately after it was created. The value ORDER indicates that the task was started at a scheduled time.</li>
     * <li><strong>retryType</strong>: indicates whether auto-redial was enabled. Valid values: <strong>1</strong> and <strong>0</strong>. The value 1 indicates that auto-redial was enabled. The value 0 indicates that auto-redial was not enabled.</li>
     * <li><strong>recallStateCodes</strong>: the call state in which redial is required. Valid values: <strong>200010</strong>, <strong>200011</strong>, <strong>200002</strong>, <strong>200012</strong>, and <strong>200005</strong>. The value 200010 indicates that the phone of the called party was powered off. The value 200011 indicates that the number of the called party was out of service. The value 200002 indicates that the line was busy. The value 200012 indicates that the call was lost. The value 200005 indicates that the called party could not be connected.</li>
     * <li><strong>recallTimes</strong>: the number of redial times.</li>
     * <li><strong>recallInterval</strong>: the redial interval. Unit: minutes.</li>
     * <li><strong>createTime</strong>: the time when the task was created, in the yyyy-MM-dd HH:mm:ss format.</li>
     * <li><strong>fireTime</strong>: the time when the task was started, in the yyyy-MM-dd HH:mm:ss format.</li>
     * <li><strong>completeTime</strong>: the time when the task was completed, in the yyyy-MM-dd HH:mm:ss format.</li>
     * <li><strong>filename</strong>: the name of the called number file.</li>
     * <li><strong>ossFilePath</strong>: the path of the called number file.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;id&quot;:1045001,&quot;taskName&quot;:&quot;Test Template&quot;,&quot;robotId&quot;:1000000075003,&quot;robotName&quot;:&quot;robot&quot;,&quot;corpName&quot;:&quot;company &quot;,&quot;caller&quot;:&quot;057156xxxx,0571568xxxx&quot;, &quot;numberStatusIdent&quot;:true,&quot;status&quot;:&quot;INIT&quot;,&quot;scheduleType&quot;:&quot;SINGLE&quot;, &quot;retryType&quot;:1,&quot;recallStateCodes&quot;:&quot;200010,200011&quot;, &quot;recallTimes&quot;:2,&quot;recallInterval&quot;:5,&quot;createTime&quot;: &quot;2019-06-14 11:04:19&quot;,&quot;fireTime&quot;:&quot;2019-06-14 11:05:23&quot;,&quot;completeTime&quot;: &quot;2019-06-14 18:21:06&quot;,&quot;called&quot;: [{&quot;fileName&quot;: &quot;5102636f-7be6-4a2d-9ac7-755a2e140a50--robotCallApi&quot;, &quot;ossFilePath&quot;: &quot;<a href="http://test.cn-hangzhou.oss.aliyun-inc.com/5102636f-7be6-4a2d-9ac7-755a2e140a50--robotCallApi.xlsx%22%7D%5D%7D">http://test.cn-hangzhou.oss.aliyun-inc.com/5102636f-7be6-4a2d-9ac7-755a2e140a50--robotCallApi.xlsx&quot;}]}</a></p>
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
