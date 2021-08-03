// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponseBody extends TeaModel {
    @NameInMap("Ticket")
    public String ticket;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskStatus")
    public String taskStatus;

    public static GetConnectionTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketResponseBody self = new GetConnectionTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

    public GetConnectionTicketResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionTicketResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
