// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class GetTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Task")
    public GetTaskResponseBodyTask task;

    public static GetTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskResponseBody self = new GetTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTaskResponseBody setTask(GetTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public GetTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class GetTaskResponseBodyTask extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("SeizeHost")
        public String seizeHost;

        @NameInMap("SrcProjectGlobalConfig")
        public String srcProjectGlobalConfig;

        @NameInMap("SrcProjectId")
        public String srcProjectId;

        @NameInMap("SrcProjectName")
        public String srcProjectName;

        @NameInMap("State")
        public String state;

        @NameInMap("TargetNamespace")
        public String targetNamespace;

        @NameInMap("TargetUserId")
        public String targetUserId;

        @NameInMap("TargetWorkspace")
        public String targetWorkspace;

        @NameInMap("TransferType")
        public Integer transferType;

        public static GetTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            GetTaskResponseBodyTask self = new GetTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public GetTaskResponseBodyTask setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetTaskResponseBodyTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetTaskResponseBodyTask setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetTaskResponseBodyTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetTaskResponseBodyTask setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public GetTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTaskResponseBodyTask setSeizeHost(String seizeHost) {
            this.seizeHost = seizeHost;
            return this;
        }
        public String getSeizeHost() {
            return this.seizeHost;
        }

        public GetTaskResponseBodyTask setSrcProjectGlobalConfig(String srcProjectGlobalConfig) {
            this.srcProjectGlobalConfig = srcProjectGlobalConfig;
            return this;
        }
        public String getSrcProjectGlobalConfig() {
            return this.srcProjectGlobalConfig;
        }

        public GetTaskResponseBodyTask setSrcProjectId(String srcProjectId) {
            this.srcProjectId = srcProjectId;
            return this;
        }
        public String getSrcProjectId() {
            return this.srcProjectId;
        }

        public GetTaskResponseBodyTask setSrcProjectName(String srcProjectName) {
            this.srcProjectName = srcProjectName;
            return this;
        }
        public String getSrcProjectName() {
            return this.srcProjectName;
        }

        public GetTaskResponseBodyTask setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetTaskResponseBodyTask setTargetNamespace(String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public String getTargetNamespace() {
            return this.targetNamespace;
        }

        public GetTaskResponseBodyTask setTargetUserId(String targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public String getTargetUserId() {
            return this.targetUserId;
        }

        public GetTaskResponseBodyTask setTargetWorkspace(String targetWorkspace) {
            this.targetWorkspace = targetWorkspace;
            return this;
        }
        public String getTargetWorkspace() {
            return this.targetWorkspace;
        }

        public GetTaskResponseBodyTask setTransferType(Integer transferType) {
            this.transferType = transferType;
            return this;
        }
        public Integer getTransferType() {
            return this.transferType;
        }

    }

}
