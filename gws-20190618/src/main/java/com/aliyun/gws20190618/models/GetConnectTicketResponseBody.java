// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class GetConnectTicketResponseBody extends TeaModel {
    @NameInMap("Ticket")
    public String ticket;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskFinished")
    public Boolean taskFinished;

    public static GetConnectTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectTicketResponseBody self = new GetConnectTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

    public GetConnectTicketResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectTicketResponseBody setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

}
