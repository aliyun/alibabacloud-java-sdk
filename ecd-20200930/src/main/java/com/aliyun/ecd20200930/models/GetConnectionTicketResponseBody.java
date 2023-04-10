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
     * <p>The status of the task.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   FAILED</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    Failed to obtain the token</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     * <br>
     * <p>*   RUNNING</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    The token is being obtained</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     * <br>
     * <p>*   FINISHED</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    The token-based logon is successful</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    .</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The credentials that are used to connect to the cloud desktop. To use the credentials, you must decode the credentials in Base64, save the credentials as a xxx.ica file, and then open the file. Sample Python code:</p>
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
