// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetCoordinateTicketResponseBody extends TeaModel {
    /**
     * <p>The ID of the stream collaboration.</p>
     */
    @NameInMap("CoId")
    public String coId;

    /**
     * <p>The request ID.</p>
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
     * <p>Possible values:</p>
     * <br>
     * <p>*   Finished</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Failed</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   Running</p>
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
     * <p>The credentials of the stream collaboration.</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static GetCoordinateTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCoordinateTicketResponseBody self = new GetCoordinateTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCoordinateTicketResponseBody setCoId(String coId) {
        this.coId = coId;
        return this;
    }
    public String getCoId() {
        return this.coId;
    }

    public GetCoordinateTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCoordinateTicketResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetCoordinateTicketResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetCoordinateTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
