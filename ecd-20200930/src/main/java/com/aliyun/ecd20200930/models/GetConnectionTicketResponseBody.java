// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the desktop connection task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The state of the task. Valid values: running, finished, and failed.</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The credential that is used to connect to the cloud desktop of the end user. Before you use the credential, decode the credential in Base64. Then, save the credential as a xxx.ica file and open the file. Sample Python code:</p>
     * <br>
     * <p>    import base64</p>
     * <p>    response = {</p>
     * <p>        "Ticket": "XXXX",</p>
     * <p>        "RequestId": "XXX-XXX",</p>
     * <p>    }</p>
     * <p>    f = open (\"xxx.ica\", \"w\")</p>
     * <p>    out = base64.b64decode(response[\"Ticket\"])</p>
     * <p>    f.write(out)</p>
     * <p>    f.close()</p>
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
