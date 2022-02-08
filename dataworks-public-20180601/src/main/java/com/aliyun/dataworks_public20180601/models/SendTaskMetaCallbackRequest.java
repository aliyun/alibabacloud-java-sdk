// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class SendTaskMetaCallbackRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ConnectionInfo")
    public String connectionInfo;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Resources")
    public java.util.List<String> resources;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("SubType")
    public String subType;

    @NameInMap("TaskEnvParam")
    public String taskEnvParam;

    @NameInMap("TenantId")
    public Long tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("User")
    public String user;

    public static SendTaskMetaCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        SendTaskMetaCallbackRequest self = new SendTaskMetaCallbackRequest();
        return TeaModel.build(map, self);
    }

    public SendTaskMetaCallbackRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendTaskMetaCallbackRequest setConnectionInfo(String connectionInfo) {
        this.connectionInfo = connectionInfo;
        return this;
    }
    public String getConnectionInfo() {
        return this.connectionInfo;
    }

    public SendTaskMetaCallbackRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SendTaskMetaCallbackRequest setResources(java.util.List<String> resources) {
        this.resources = resources;
        return this;
    }
    public java.util.List<String> getResources() {
        return this.resources;
    }

    public SendTaskMetaCallbackRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SendTaskMetaCallbackRequest setSubType(String subType) {
        this.subType = subType;
        return this;
    }
    public String getSubType() {
        return this.subType;
    }

    public SendTaskMetaCallbackRequest setTaskEnvParam(String taskEnvParam) {
        this.taskEnvParam = taskEnvParam;
        return this;
    }
    public String getTaskEnvParam() {
        return this.taskEnvParam;
    }

    public SendTaskMetaCallbackRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public SendTaskMetaCallbackRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public SendTaskMetaCallbackRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
