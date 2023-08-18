// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class RunTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Task")
    public RunTaskResponseBodyTask task;

    public static RunTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RunTaskResponseBody self = new RunTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RunTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RunTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RunTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RunTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RunTaskResponseBody setTask(RunTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public RunTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class RunTaskResponseBodyTask extends TeaModel {
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

        public static RunTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            RunTaskResponseBodyTask self = new RunTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public RunTaskResponseBodyTask setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public RunTaskResponseBodyTask setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public RunTaskResponseBodyTask setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public RunTaskResponseBodyTask setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public RunTaskResponseBodyTask setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public RunTaskResponseBodyTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RunTaskResponseBodyTask setSeizeHost(String seizeHost) {
            this.seizeHost = seizeHost;
            return this;
        }
        public String getSeizeHost() {
            return this.seizeHost;
        }

        public RunTaskResponseBodyTask setSrcProjectGlobalConfig(String srcProjectGlobalConfig) {
            this.srcProjectGlobalConfig = srcProjectGlobalConfig;
            return this;
        }
        public String getSrcProjectGlobalConfig() {
            return this.srcProjectGlobalConfig;
        }

        public RunTaskResponseBodyTask setSrcProjectId(String srcProjectId) {
            this.srcProjectId = srcProjectId;
            return this;
        }
        public String getSrcProjectId() {
            return this.srcProjectId;
        }

        public RunTaskResponseBodyTask setSrcProjectName(String srcProjectName) {
            this.srcProjectName = srcProjectName;
            return this;
        }
        public String getSrcProjectName() {
            return this.srcProjectName;
        }

        public RunTaskResponseBodyTask setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public RunTaskResponseBodyTask setTargetNamespace(String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public String getTargetNamespace() {
            return this.targetNamespace;
        }

        public RunTaskResponseBodyTask setTargetUserId(String targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public String getTargetUserId() {
            return this.targetUserId;
        }

        public RunTaskResponseBodyTask setTargetWorkspace(String targetWorkspace) {
            this.targetWorkspace = targetWorkspace;
            return this;
        }
        public String getTargetWorkspace() {
            return this.targetWorkspace;
        }

        public RunTaskResponseBodyTask setTransferType(Integer transferType) {
            this.transferType = transferType;
            return this;
        }
        public Integer getTransferType() {
            return this.transferType;
        }

    }

}
