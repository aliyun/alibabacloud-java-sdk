// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTablePartitionResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMetaTablePartitionResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTablePartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTablePartitionResponseBody self = new GetMetaTablePartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTablePartitionResponseBody setData(GetMetaTablePartitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTablePartitionResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTablePartitionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTablePartitionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTablePartitionResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTablePartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTablePartitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTablePartitionResponseBodyDataDataEntityList extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DataSize")
        public Long dataSize;

        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        @NameInMap("PartitionGuid")
        public String partitionGuid;

        @NameInMap("PartitionLocation")
        public String partitionLocation;

        @NameInMap("PartitionName")
        public String partitionName;

        @NameInMap("PartitionPath")
        public String partitionPath;

        @NameInMap("PartitionType")
        public String partitionType;

        @NameInMap("RecordCount")
        public Long recordCount;

        @NameInMap("TableGuid")
        public String tableGuid;

        public static GetMetaTablePartitionResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTablePartitionResponseBodyDataDataEntityList self = new GetMetaTablePartitionResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setDataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Long getDataSize() {
            return this.dataSize;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setPartitionGuid(String partitionGuid) {
            this.partitionGuid = partitionGuid;
            return this;
        }
        public String getPartitionGuid() {
            return this.partitionGuid;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setPartitionLocation(String partitionLocation) {
            this.partitionLocation = partitionLocation;
            return this;
        }
        public String getPartitionLocation() {
            return this.partitionLocation;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setPartitionName(String partitionName) {
            this.partitionName = partitionName;
            return this;
        }
        public String getPartitionName() {
            return this.partitionName;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setPartitionPath(String partitionPath) {
            this.partitionPath = partitionPath;
            return this;
        }
        public String getPartitionPath() {
            return this.partitionPath;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setPartitionType(String partitionType) {
            this.partitionType = partitionType;
            return this;
        }
        public String getPartitionType() {
            return this.partitionType;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setRecordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
        public Long getRecordCount() {
            return this.recordCount;
        }

        public GetMetaTablePartitionResponseBodyDataDataEntityList setTableGuid(String tableGuid) {
            this.tableGuid = tableGuid;
            return this;
        }
        public String getTableGuid() {
            return this.tableGuid;
        }

    }

    public static class GetMetaTablePartitionResponseBodyData extends TeaModel {
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaTablePartitionResponseBodyDataDataEntityList> dataEntityList;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaTablePartitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTablePartitionResponseBodyData self = new GetMetaTablePartitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTablePartitionResponseBodyData setDataEntityList(java.util.List<GetMetaTablePartitionResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTablePartitionResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        public GetMetaTablePartitionResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTablePartitionResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTablePartitionResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
