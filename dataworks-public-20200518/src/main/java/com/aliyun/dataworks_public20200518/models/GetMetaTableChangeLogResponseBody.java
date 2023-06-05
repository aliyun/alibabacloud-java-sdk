// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned per page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("Data")
    public GetMetaTableChangeLogResponseBodyData data;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The business data returned.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableChangeLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableChangeLogResponseBody self = new GetMetaTableChangeLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableChangeLogResponseBody setData(GetMetaTableChangeLogResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMetaTableChangeLogResponseBodyData getData() {
        return this.data;
    }

    public GetMetaTableChangeLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableChangeLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableChangeLogResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableChangeLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableChangeLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableChangeLogResponseBodyDataDataEntityList extends TeaModel {
        /**
         * <p>The type of the change.</p>
         */
        @NameInMap("ChangeContent")
        public String changeContent;

        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The name of the operator.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The content of the change.</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The time when the metatable was created.</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        @NameInMap("Operator")
        public String operator;

        public static GetMetaTableChangeLogResponseBodyDataDataEntityList build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableChangeLogResponseBodyDataDataEntityList self = new GetMetaTableChangeLogResponseBodyDataDataEntityList();
            return TeaModel.build(map, self);
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setChangeContent(String changeContent) {
            this.changeContent = changeContent;
            return this;
        }
        public String getChangeContent() {
            return this.changeContent;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setChangeType(String changeType) {
            this.changeType = changeType;
            return this;
        }
        public String getChangeType() {
            return this.changeType;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setModifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public GetMetaTableChangeLogResponseBodyDataDataEntityList setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

    }

    public static class GetMetaTableChangeLogResponseBodyData extends TeaModel {
        /**
         * <p>The last time when the metatable was modified.</p>
         */
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaTableChangeLogResponseBodyDataDataEntityList> dataEntityList;

        /**
         * <p>The total number of returned entries.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The information about the change logs of the metatable.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The entity on which the change was made. Valid values: TABLE and PARTITION.</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static GetMetaTableChangeLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableChangeLogResponseBodyData self = new GetMetaTableChangeLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableChangeLogResponseBodyData setDataEntityList(java.util.List<GetMetaTableChangeLogResponseBodyDataDataEntityList> dataEntityList) {
            this.dataEntityList = dataEntityList;
            return this;
        }
        public java.util.List<GetMetaTableChangeLogResponseBodyDataDataEntityList> getDataEntityList() {
            return this.dataEntityList;
        }

        public GetMetaTableChangeLogResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetMetaTableChangeLogResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetMetaTableChangeLogResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
