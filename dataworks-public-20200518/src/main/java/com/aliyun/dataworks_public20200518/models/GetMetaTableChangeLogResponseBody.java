// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogResponseBody extends TeaModel {
    /**
     * <p>The business data.</p>
     */
    @NameInMap("Data")
    public GetMetaTableChangeLogResponseBodyData data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ConnectionNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The connection does not exist.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0bc1ec92159376</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The content of the change.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[{\&quot;action\&quot;:\&quot;ADD_COLUMN\&quot;,\&quot;value\&quot;:[{\&quot;originName\&quot;:\&quot;\&quot;,\&quot;originType\&quot;:\&quot;\&quot;,\&quot;originComment\&quot;:\&quot;\&quot;,\&quot;name\&quot;:\&quot;id\&quot;,\&quot;type\&quot;:\&quot;struct<a href="name:string">name:string</a>\&quot;,\&quot;comment\&quot;:\&quot;\&quot;}]}]&quot;,</p>
         */
        @NameInMap("ChangeContent")
        public String changeContent;

        /**
         * <p>The type of the change.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_TABLE</p>
         */
        @NameInMap("ChangeType")
        public String changeType;

        /**
         * <p>The time when the metatable was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1590722845000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the metatable was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>1590722845000</p>
         */
        @NameInMap("ModifiedTime")
        public Long modifiedTime;

        /**
         * <p>The entity on which the change was made. Valid values: TABLE and PARTITION.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
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
         * <p>The list of instances.</p>
         */
        @NameInMap("DataEntityList")
        public java.util.List<GetMetaTableChangeLogResponseBodyDataDataEntityList> dataEntityList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of metatables.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
