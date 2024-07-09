// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetCoordinateTicketResponseBody extends TeaModel {
    /**
     * <p>The ID of the stream collaboration.</p>
     * 
     * <strong>example:</strong>
     * <p>co-0sot77uale3****</p>
     */
    @NameInMap("CoId")
    public String coId;

    /**
     * <p>The request ID.</p>
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
     * <p>39cc15e5-6998-4b9f-9b2c-7a4cc3e2****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task status.</p>
     * <p>Possible values:</p>
     * <ul>
     * <li><p>Finished</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Failed</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>Running</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The credentials of the stream collaboration.</p>
     * 
     * <strong>example:</strong>
     * <p>W0VuY29kaW5nXQ0KSW5wdXRFbmNvZGluZz1V********</p>
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
