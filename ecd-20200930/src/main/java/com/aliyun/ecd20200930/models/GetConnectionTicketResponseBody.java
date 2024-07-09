// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the cloud computer connection task.</p>
     * 
     * <strong>example:</strong>
     * <p>2afbad19-778a-4fc5-9674-1f19c638****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>FAILED: The credential fails to be obtained.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>RUNNING: The credential is being obtained.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>FINISHED: The credential is obtained.</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The credential that is returned to connect to the cloud computer. Before you use the credential, you must Base64 decode the content of the credential, save the credential as an xxx.ica file, and then open the file. Python sample code:</p>
     * <pre><code>import base64
     * response = {
     *     &quot;Ticket&quot;: &quot;W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********&quot;,
     *     &quot;RequestId&quot;: &quot;1CBAFFAB-B697-4049-A9B1-67E1FC5F****&quot;,
     * }
     * f = open (\\&quot;xxx.ica\\&quot;, \\&quot;w\\&quot;)
     * out = base64.b64decode(response[\\&quot;Ticket\\&quot;])
     * f.write(out)
     * f.close()
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static GetConnectionTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketResponseBody self = new GetConnectionTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionTicketResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetConnectionTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
