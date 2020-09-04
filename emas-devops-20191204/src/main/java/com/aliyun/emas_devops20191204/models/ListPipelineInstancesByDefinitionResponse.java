// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPipelineInstancesByDefinitionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNum")
    @Validation(required = true)
    public Integer pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Items")
    @Validation(required = true)
    public java.util.List<ListPipelineInstancesByDefinitionResponseItems> items;

    public static ListPipelineInstancesByDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineInstancesByDefinitionResponse self = new ListPipelineInstancesByDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineInstancesByDefinitionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineInstancesByDefinitionResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListPipelineInstancesByDefinitionResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineInstancesByDefinitionResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListPipelineInstancesByDefinitionResponse setItems(java.util.List<ListPipelineInstancesByDefinitionResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPipelineInstancesByDefinitionResponseItems> getItems() {
        return this.items;
    }

    public static class ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts extends TeaModel {
        @NameInMap("FileKey")
        @Validation(required = true)
        public String fileKey;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileType")
        @Validation(required = true)
        public String fileType;

        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("ArtifactType")
        @Validation(required = true)
        public String artifactType;

        @NameInMap("IsPublic")
        @Validation(required = true)
        public Boolean isPublic;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Md5")
        @Validation(required = true)
        public String md5;

        @NameInMap("JobInstanceId")
        @Validation(required = true)
        public String jobInstanceId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        public static ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts self = new ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts();
            return TeaModel.build(map, self);
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setJobInstanceId(String jobInstanceId) {
            this.jobInstanceId = jobInstanceId;
            return this;
        }
        public String getJobInstanceId() {
            return this.jobInstanceId;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListPipelineInstancesByDefinitionResponseItems extends TeaModel {
        @NameInMap("PipelineInstanceId")
        @Validation(required = true)
        public String pipelineInstanceId;

        @NameInMap("PipelineDefinitionName")
        @Validation(required = true)
        public String pipelineDefinitionName;

        @NameInMap("PipelineDefinitionId")
        @Validation(required = true)
        public String pipelineDefinitionId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("PipelineArtifacts")
        @Validation(required = true)
        public java.util.List<ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts> pipelineArtifacts;

        public static ListPipelineInstancesByDefinitionResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineInstancesByDefinitionResponseItems self = new ListPipelineInstancesByDefinitionResponseItems();
            return TeaModel.build(map, self);
        }

        public ListPipelineInstancesByDefinitionResponseItems setPipelineInstanceId(String pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public String getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public ListPipelineInstancesByDefinitionResponseItems setPipelineDefinitionName(String pipelineDefinitionName) {
            this.pipelineDefinitionName = pipelineDefinitionName;
            return this;
        }
        public String getPipelineDefinitionName() {
            return this.pipelineDefinitionName;
        }

        public ListPipelineInstancesByDefinitionResponseItems setPipelineDefinitionId(String pipelineDefinitionId) {
            this.pipelineDefinitionId = pipelineDefinitionId;
            return this;
        }
        public String getPipelineDefinitionId() {
            return this.pipelineDefinitionId;
        }

        public ListPipelineInstancesByDefinitionResponseItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineInstancesByDefinitionResponseItems setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListPipelineInstancesByDefinitionResponseItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListPipelineInstancesByDefinitionResponseItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListPipelineInstancesByDefinitionResponseItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListPipelineInstancesByDefinitionResponseItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPipelineInstancesByDefinitionResponseItems setPipelineArtifacts(java.util.List<ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts> pipelineArtifacts) {
            this.pipelineArtifacts = pipelineArtifacts;
            return this;
        }
        public java.util.List<ListPipelineInstancesByDefinitionResponseItemsPipelineArtifacts> getPipelineArtifacts() {
            return this.pipelineArtifacts;
        }

    }

}
