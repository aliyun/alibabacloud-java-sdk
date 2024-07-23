// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aig-53fvrq1oan****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <strong>example:</strong>
     * <p>ai-7ybdeiyoeh5e****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("BizRegionId")
    public String bizRegionId;

    /**
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>f3d1b31c-605e-4d04-a896****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <strong>example:</strong>
     * <p>DQpbRGVza3RvcF0NCkZvcmNlVGxzVHlwZT0xDQpHV1Rva2VuUGFydDE9MDAva09ROW1FUTU3dU****</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static GetConnectionTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketResponseBody self = new GetConnectionTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketResponseBody setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public GetConnectionTicketResponseBody setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public GetConnectionTicketResponseBody setAppInstancePersistentId(String appInstancePersistentId) {
        this.appInstancePersistentId = appInstancePersistentId;
        return this;
    }
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    public GetConnectionTicketResponseBody setBizRegionId(String bizRegionId) {
        this.bizRegionId = bizRegionId;
        return this;
    }
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    public GetConnectionTicketResponseBody setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
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

    public GetConnectionTicketResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetConnectionTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

}
