// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponseBody extends TeaModel {
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    @NameInMap("AppInstanceId")
    public String appInstanceId;

    @NameInMap("Code")
    public String code;

    @NameInMap("LoginToken")
    public String loginToken;

    @NameInMap("Message")
    public String message;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RetryTimes")
    public Integer retryTimes;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskStatus")
    public String taskStatus;

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

    public GetConnectionTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConnectionTicketResponseBody setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetConnectionTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConnectionTicketResponseBody setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public GetConnectionTicketResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetConnectionTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionTicketResponseBody setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
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
