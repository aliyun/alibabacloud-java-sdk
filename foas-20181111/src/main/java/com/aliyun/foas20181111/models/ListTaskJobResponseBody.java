// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListTaskJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Jobs")
    public java.util.List<ListTaskJobResponseBodyJobs> jobs;

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

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListTaskJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTaskJobResponseBody self = new ListTaskJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTaskJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTaskJobResponseBody setJobs(java.util.List<ListTaskJobResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListTaskJobResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListTaskJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTaskJobResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListTaskJobResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTaskJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTaskJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTaskJobResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListTaskJobResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListTaskJobResponseBodyJobs extends TeaModel {
        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("BlinkVersion")
        public String blinkVersion;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public Long instanceId;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("NodeName")
        public String nodeName;

        @NameInMap("SeizeHost")
        public String seizeHost;

        @NameInMap("SrcProperties")
        public String srcProperties;

        @NameInMap("SrcSql")
        public String srcSql;

        @NameInMap("State")
        public String state;

        @NameInMap("TargetProperties")
        public String targetProperties;

        @NameInMap("TargetSql")
        public String targetSql;

        @NameInMap("TaskId")
        public Long taskId;

        public static ListTaskJobResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListTaskJobResponseBodyJobs self = new ListTaskJobResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListTaskJobResponseBodyJobs setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public ListTaskJobResponseBodyJobs setBlinkVersion(String blinkVersion) {
            this.blinkVersion = blinkVersion;
            return this;
        }
        public String getBlinkVersion() {
            return this.blinkVersion;
        }

        public ListTaskJobResponseBodyJobs setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTaskJobResponseBodyJobs setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public ListTaskJobResponseBodyJobs setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListTaskJobResponseBodyJobs setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListTaskJobResponseBodyJobs setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListTaskJobResponseBodyJobs setInstanceId(Long instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Long getInstanceId() {
            return this.instanceId;
        }

        public ListTaskJobResponseBodyJobs setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListTaskJobResponseBodyJobs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListTaskJobResponseBodyJobs setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public ListTaskJobResponseBodyJobs setSeizeHost(String seizeHost) {
            this.seizeHost = seizeHost;
            return this;
        }
        public String getSeizeHost() {
            return this.seizeHost;
        }

        public ListTaskJobResponseBodyJobs setSrcProperties(String srcProperties) {
            this.srcProperties = srcProperties;
            return this;
        }
        public String getSrcProperties() {
            return this.srcProperties;
        }

        public ListTaskJobResponseBodyJobs setSrcSql(String srcSql) {
            this.srcSql = srcSql;
            return this;
        }
        public String getSrcSql() {
            return this.srcSql;
        }

        public ListTaskJobResponseBodyJobs setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTaskJobResponseBodyJobs setTargetProperties(String targetProperties) {
            this.targetProperties = targetProperties;
            return this;
        }
        public String getTargetProperties() {
            return this.targetProperties;
        }

        public ListTaskJobResponseBodyJobs setTargetSql(String targetSql) {
            this.targetSql = targetSql;
            return this;
        }
        public String getTargetSql() {
            return this.targetSql;
        }

        public ListTaskJobResponseBodyJobs setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
