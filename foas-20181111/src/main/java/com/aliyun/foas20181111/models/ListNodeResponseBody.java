// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class ListNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Nodes")
    public java.util.List<ListNodeResponseBodyNodes> nodes;

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

    public static ListNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeResponseBody self = new ListNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListNodeResponseBody setNodes(java.util.List<ListNodeResponseBodyNodes> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<ListNodeResponseBodyNodes> getNodes() {
        return this.nodes;
    }

    public ListNodeResponseBody setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public ListNodeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNodeResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListNodeResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListNodeResponseBodyNodes extends TeaModel {
        @NameInMap("ActualState")
        public Integer actualState;

        @NameInMap("ApiType")
        public String apiType;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorName")
        public String creatorName;

        @NameInMap("ExpectState")
        public Integer expectState;

        @NameInMap("FolderId")
        public String folderId;

        @NameInMap("FolderName")
        public String folderName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("JobType")
        public String jobType;

        @NameInMap("MigrateState")
        public String migrateState;

        @NameInMap("Modifier")
        public String modifier;

        @NameInMap("Name")
        public String name;

        @NameInMap("NodeId")
        public String nodeId;

        @NameInMap("Priority")
        public Integer priority;

        public static ListNodeResponseBodyNodes build(java.util.Map<String, ?> map) throws Exception {
            ListNodeResponseBodyNodes self = new ListNodeResponseBodyNodes();
            return TeaModel.build(map, self);
        }

        public ListNodeResponseBodyNodes setActualState(Integer actualState) {
            this.actualState = actualState;
            return this;
        }
        public Integer getActualState() {
            return this.actualState;
        }

        public ListNodeResponseBodyNodes setApiType(String apiType) {
            this.apiType = apiType;
            return this;
        }
        public String getApiType() {
            return this.apiType;
        }

        public ListNodeResponseBodyNodes setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListNodeResponseBodyNodes setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListNodeResponseBodyNodes setExpectState(Integer expectState) {
            this.expectState = expectState;
            return this;
        }
        public Integer getExpectState() {
            return this.expectState;
        }

        public ListNodeResponseBodyNodes setFolderId(String folderId) {
            this.folderId = folderId;
            return this;
        }
        public String getFolderId() {
            return this.folderId;
        }

        public ListNodeResponseBodyNodes setFolderName(String folderName) {
            this.folderName = folderName;
            return this;
        }
        public String getFolderName() {
            return this.folderName;
        }

        public ListNodeResponseBodyNodes setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListNodeResponseBodyNodes setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListNodeResponseBodyNodes setJobType(String jobType) {
            this.jobType = jobType;
            return this;
        }
        public String getJobType() {
            return this.jobType;
        }

        public ListNodeResponseBodyNodes setMigrateState(String migrateState) {
            this.migrateState = migrateState;
            return this;
        }
        public String getMigrateState() {
            return this.migrateState;
        }

        public ListNodeResponseBodyNodes setModifier(String modifier) {
            this.modifier = modifier;
            return this;
        }
        public String getModifier() {
            return this.modifier;
        }

        public ListNodeResponseBodyNodes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListNodeResponseBodyNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public ListNodeResponseBodyNodes setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

}
