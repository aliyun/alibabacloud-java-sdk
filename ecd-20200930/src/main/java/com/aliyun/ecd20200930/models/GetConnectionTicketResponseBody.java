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
     * <p>The ID of the cloud computer connection task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task status.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   FAILED: The credential fails to be obtained.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   RUNNING: The credential is being obtained.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   FINISHED: The credential is obtained.</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The credential that is returned to connect to the cloud computer. Before you use the credential, you must Base64 decode the content of the credential, save the credential as an xxx.ica file, and then open the file. Python sample code:</p>
     * <br>
     * <p>    import base64</p>
     * <p>    response = {</p>
     * <p>        "Ticket": "W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********",</p>
     * <p>        "RequestId": "1CBAFFAB-B697-4049-A9B1-67E1FC5F****",</p>
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
