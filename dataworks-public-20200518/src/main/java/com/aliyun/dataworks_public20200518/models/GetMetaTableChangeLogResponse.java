// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogResponse extends TeaModel {
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
    public GetMetaTableChangeLogResponseData data;

    public static GetMetaTableChangeLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableChangeLogResponse self = new GetMetaTableChangeLogResponse();
        return TeaModel.build(map, self);
    }

    public GetMetaTableChangeLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableChangeLogResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableChangeLogResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableChangeLogResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableChangeLogResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetMetaTableChangeLogResponse setData(GetMetaTableChangeLogResponseData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableChangeLogResponseData getData() {
        return this.data;
    }

    public static class GetMetaTableChangeLogResponseDataDataEntityList extends TeaModel {
        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("ModifiedTime")
        @Validation(required = true)
        public Long modifiedTime;

        @NameInMap("ChangeType")
        @Validation(required = true)
        public String changeType;

        @NameInMap("Operator")
        @Validation(required = true)
        public String operator;

        @NameInMap("ObjectType")
        @Validation(required = true)
        public String objectType;

        @NameInMap("ChangeContent")
        @Validation(required = true)
        public String changeContent;

        public static GetMetaTableChangeLogResponseDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableChangeLogResponseDataDataEntityList self = new GetMetaTableChangeLogResponseDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableChangeLogResponseDataDataEntityList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableChangeLogResponseDataDataEntityList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaTableChangeLogResponseDataDataEntityList setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetMetaTableChangeLogResponseDataDataEntityList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetMetaTableChangeLogResponseDataDataEntityList setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetMetaTableChangeLogResponseDataDataEntityList setChangeContent(String changeContent) {
            this.changeContent = changeContent;
            return this;
        }
        public String getChangeContent() {
            return this.changeContent;
        }

    }

    public static class GetMetaTableChangeLogResponseData extends TeaModel {
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
        public java.util.List<GetMetaTableChangeLogResponseDataDataEntityList> dataEntityList;

        public static GetMetaTableChangeLogResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableChangeLogResponseData self = new GetMetaTableChangeLogResponseData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableChangeLogResponseData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTableChangeLogResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableChangeLogResponseData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetMetaTableChangeLogResponseData setDataEntityList(java.util.List<GetMetaTableChangeLogResponseDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTableChangeLogResponseDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

    }

}
