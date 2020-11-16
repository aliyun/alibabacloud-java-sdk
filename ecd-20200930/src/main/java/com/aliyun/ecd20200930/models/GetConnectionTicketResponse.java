// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Ticket")
    @Validation(required = true)
    public String ticket;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TaskStatus")
    @Validation(required = true)
    public String taskStatus;

    public static GetConnectionTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketResponse self = new GetConnectionTicketResponse();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionTicketResponse setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

    public GetConnectionTicketResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketResponse setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

}
