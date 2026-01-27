// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponseBody extends TeaModel {
    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("P2PToken")
    public String p2PToken;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********</p>
     */
    @NameInMap("TaskCode")
    public String taskCode;

    /**
     * <p>The ID of the task to connect to the cloud computer.</p>
     * 
     * <strong>example:</strong>
     * <p>2afbad19-778a-4fc5-9674-1f19c63862da</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>2afbad19-778a-4fc5-9674-1f19c638****</p>
     */
    @NameInMap("TaskMessage")
    public String taskMessage;

    /**
     * <strong>example:</strong>
     * <p>FINISHED</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The credentials for connecting to the cloud computer.</p>
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

    public GetConnectionTicketResponseBody setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public GetConnectionTicketResponseBody setP2PToken(String p2PToken) {
        this.p2PToken = p2PToken;
        return this;
    }
    public String getP2PToken() {
        return this.p2PToken;
    }

    public GetConnectionTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionTicketResponseBody setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }
    public String getTaskCode() {
        return this.taskCode;
    }

    public GetConnectionTicketResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketResponseBody setTaskMessage(String taskMessage) {
        this.taskMessage = taskMessage;
        return this;
    }
    public String getTaskMessage() {
        return this.taskMessage;
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
