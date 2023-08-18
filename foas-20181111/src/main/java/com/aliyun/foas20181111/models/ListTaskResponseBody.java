// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageIndex")
    public Integer pageIndex;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Tasks")
    public java.util.List<ListTaskResponseBodyTasks> tasks;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskResponseBody self = new ListTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskResponseBody setTasks(java.util.List<ListTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public ListTaskResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListTaskResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListTaskResponseBodyTasks extends TeaModel {
        @NameInMap("CanRun")
        public Boolean canRun;

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

        public static ListTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListTaskResponseBodyTasks self = new ListTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListTaskResponseBodyTasks setCanRun(Boolean canRun) {
            this.canRun = canRun;
            return this;
        }
        public Boolean getCanRun() {
            return this.canRun;
        }

        public ListTaskResponseBodyTasks setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTaskResponseBodyTasks setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTaskResponseBodyTasks setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTaskResponseBodyTasks setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskResponseBodyTasks setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListTaskResponseBodyTasks setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTaskResponseBodyTasks setSeizeHost(String seizeHost) {
            this.seizeHost = seizeHost;
            return this;
        }
        public String getSeizeHost() {
            return this.seizeHost;
        }

        public ListTaskResponseBodyTasks setSrcProjectGlobalConfig(String srcProjectGlobalConfig) {
            this.srcProjectGlobalConfig = srcProjectGlobalConfig;
            return this;
        }
        public String getSrcProjectGlobalConfig() {
            return this.srcProjectGlobalConfig;
        }

        public ListTaskResponseBodyTasks setSrcProjectId(String srcProjectId) {
            this.srcProjectId = srcProjectId;
            return this;
        }
        public String getSrcProjectId() {
            return this.srcProjectId;
        }

        public ListTaskResponseBodyTasks setSrcProjectName(String srcProjectName) {
            this.srcProjectName = srcProjectName;
            return this;
        }
        public String getSrcProjectName() {
            return this.srcProjectName;
        }

        public ListTaskResponseBodyTasks setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTaskResponseBodyTasks setTargetNamespace(String targetNamespace) {
            this.targetNamespace = targetNamespace;
            return this;
        }
        public String getTargetNamespace() {
            return this.targetNamespace;
        }

        public ListTaskResponseBodyTasks setTargetUserId(String targetUserId) {
            this.targetUserId = targetUserId;
            return this;
        }
        public String getTargetUserId() {
            return this.targetUserId;
        }

        public ListTaskResponseBodyTasks setTargetWorkspace(String targetWorkspace) {
            this.targetWorkspace = targetWorkspace;
            return this;
        }
        public String getTargetWorkspace() {
            return this.targetWorkspace;
        }

        public ListTaskResponseBodyTasks setTransferType(Integer transferType) {
            this.transferType = transferType;
            return this;
        }
        public Integer getTransferType() {
            return this.transferType;
        }

    }

}
