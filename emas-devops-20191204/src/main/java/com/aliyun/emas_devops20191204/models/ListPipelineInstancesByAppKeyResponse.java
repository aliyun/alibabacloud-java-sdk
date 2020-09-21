// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class ListPipelineInstancesByAppKeyResponse extends TeaModel {
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
    public java.util.List<ListPipelineInstancesByAppKeyResponseItems> items;

    public static ListPipelineInstancesByAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPipelineInstancesByAppKeyResponse self = new ListPipelineInstancesByAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public ListPipelineInstancesByAppKeyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPipelineInstancesByAppKeyResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListPipelineInstancesByAppKeyResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelineInstancesByAppKeyResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListPipelineInstancesByAppKeyResponse setItems(java.util.List<ListPipelineInstancesByAppKeyResponseItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListPipelineInstancesByAppKeyResponseItems> getItems() {
        return this.items;
    }

    public static class ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts extends TeaModel {
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

        @NameInMap("Ext")
        @Validation(required = true)
        public String ext;

        public static ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts self = new ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts();
            return TeaModel.build(map, self);
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setJobInstanceId(String jobInstanceId) {
            this.jobInstanceId = jobInstanceId;
            return this;
        }
        public String getJobInstanceId() {
            return this.jobInstanceId;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

    }

    public static class ListPipelineInstancesByAppKeyResponseItems extends TeaModel {
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
        public java.util.List<ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts> pipelineArtifacts;

        public static ListPipelineInstancesByAppKeyResponseItems build(java.util.Map<String, ?> map) throws Exception {
            ListPipelineInstancesByAppKeyResponseItems self = new ListPipelineInstancesByAppKeyResponseItems();
            return TeaModel.build(map, self);
        }

        public ListPipelineInstancesByAppKeyResponseItems setPipelineInstanceId(String pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public String getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public ListPipelineInstancesByAppKeyResponseItems setPipelineDefinitionName(String pipelineDefinitionName) {
            this.pipelineDefinitionName = pipelineDefinitionName;
            return this;
        }
        public String getPipelineDefinitionName() {
            return this.pipelineDefinitionName;
        }

        public ListPipelineInstancesByAppKeyResponseItems setPipelineDefinitionId(String pipelineDefinitionId) {
            this.pipelineDefinitionId = pipelineDefinitionId;
            return this;
        }
        public String getPipelineDefinitionId() {
            return this.pipelineDefinitionId;
        }

        public ListPipelineInstancesByAppKeyResponseItems setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListPipelineInstancesByAppKeyResponseItems setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListPipelineInstancesByAppKeyResponseItems setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListPipelineInstancesByAppKeyResponseItems setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListPipelineInstancesByAppKeyResponseItems setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListPipelineInstancesByAppKeyResponseItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPipelineInstancesByAppKeyResponseItems setPipelineArtifacts(java.util.List<ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts> pipelineArtifacts) {
            this.pipelineArtifacts = pipelineArtifacts;
            return this;
        }
        public java.util.List<ListPipelineInstancesByAppKeyResponseItemsPipelineArtifacts> getPipelineArtifacts() {
            return this.pipelineArtifacts;
        }

    }

}
