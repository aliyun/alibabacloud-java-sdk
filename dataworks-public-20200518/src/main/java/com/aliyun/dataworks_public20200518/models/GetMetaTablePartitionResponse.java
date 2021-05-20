// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Data")
    @Validation(required = true)
    public GetMetaTablePartitionResponseData data;

    public static GetMetaTablePartitionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTablePartitionResponse self = new GetMetaTablePartitionResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTablePartitionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTablePartitionResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTablePartitionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTablePartitionResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTablePartitionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTablePartitionResponse setData(GetMetaTablePartitionResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaTablePartitionResponseData getData() {
        return this.data;
    }

    public static class GetMetaTablePartitionResponseDataDataEntityList extends TeaModel {
        @NameInMap("PartitionGuid")
        @Validation(required = true)
        public String partitionGuid;

        @NameInMap("PartitionName")
        @Validation(required = true)
        public String partitionName;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("DataSize")
        @Validation(required = true)
        public Long dataSize;

        @NameInMap("RecordCount")
        @Validation(required = true)
        public Long recordCount;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("TableGuid")
        @Validation(required = true)
        public String tableGuid;

        @NameInMap("Comment")
        @Validation(required = true)
        public String comment;

        @NameInMap("PartitionType")
        @Validation(required = true)
        public String partitionType;

        @NameInMap("PartitionPath")
        @Validation(required = true)
        public String partitionPath;

        @NameInMap("PartitionLocation")
        @Validation(required = true)
        public String partitionLocation;

        public static GetMetaTablePartitionResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTablePartitionResponseDataDataEntityList self = new GetMetaTablePartitionResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTablePartitionResponseDataDataEntityList setPartitionGuid(String partitionGuid) {
            this.partitionGuid = partitionGuid;
            return this;
        }
        public String getPartitionGuid() {
            return this.partitionGuid;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setPartitionName(String partitionName) {
            this.partitionName = partitionName;
            return this;
        }
        public String getPartitionName() {
            return this.partitionName;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setPartitionPath(String partitionPath) {
            this.partitionPath = partitionPath;
            return this;
        }
        public String getPartitionPath() {
            return this.partitionPath;
        }

        public GetMetaTablePartitionResponseDataDataEntityList setPartitionLocation(String partitionLocation) {
            this.partitionLocation = partitionLocation;
            return this;
        }
        public String getPartitionLocation() {
            return this.partitionLocation;
        }

    }

    public static class GetMetaTablePartitionResponseData extends TeaModel {
        @NameInMap("PageNumber")
        @Validation(required = true)
        public Integer pageNumber;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Long totalCount;

        @NameInMap("DataEntityList")
        @Validation(required = true)
        public java.util.List<GetMetaTablePartitionResponseDataDataEntityList> dataEntityList;

        public static GetMetaTablePartitionResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTablePartitionResponseData self = new GetMetaTablePartitionResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaTablePartitionResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTablePartitionResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTablePartitionResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaTablePartitionResponseData setDataEntityList(java.util.List<GetMetaTablePartitionResponseDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTablePartitionResponseDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

    }

}
