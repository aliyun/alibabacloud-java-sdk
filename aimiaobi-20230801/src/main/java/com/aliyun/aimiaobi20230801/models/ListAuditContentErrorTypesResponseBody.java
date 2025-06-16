// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAuditContentErrorTypesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DataNotExists</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAuditContentErrorTypesResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAuditContentErrorTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuditContentErrorTypesResponseBody self = new ListAuditContentErrorTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuditContentErrorTypesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAuditContentErrorTypesResponseBody setData(java.util.List<ListAuditContentErrorTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAuditContentErrorTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListAuditContentErrorTypesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAuditContentErrorTypesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAuditContentErrorTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAuditContentErrorTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAuditContentErrorTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAuditContentErrorTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAuditContentErrorTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAuditContentErrorTypesResponseBodyDataSubClasses extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PunctuationError</p>
         */
        @NameInMap("ClassCode")
        public String classCode;

        @NameInMap("ClassName")
        public String className;

        public static ListAuditContentErrorTypesResponseBodyDataSubClasses build(java.util.Map<String, ?> map) throws Exception {
            ListAuditContentErrorTypesResponseBodyDataSubClasses self = new ListAuditContentErrorTypesResponseBodyDataSubClasses();
            return TeaModel.build(map, self);
        }

        public ListAuditContentErrorTypesResponseBodyDataSubClasses setClassCode(String classCode) {
            this.classCode = classCode;
            return this;
        }
        public String getClassCode() {
            return this.classCode;
        }

        public ListAuditContentErrorTypesResponseBodyDataSubClasses setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

    }

    public static class ListAuditContentErrorTypesResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ContentAccuracy</p>
         */
        @NameInMap("MajorClassCode")
        public String majorClassCode;

        @NameInMap("MajorClassName")
        public String majorClassName;

        @NameInMap("SubClasses")
        public java.util.List<ListAuditContentErrorTypesResponseBodyDataSubClasses> subClasses;

        public static ListAuditContentErrorTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAuditContentErrorTypesResponseBodyData self = new ListAuditContentErrorTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAuditContentErrorTypesResponseBodyData setMajorClassCode(String majorClassCode) {
            this.majorClassCode = majorClassCode;
            return this;
        }
        public String getMajorClassCode() {
            return this.majorClassCode;
        }

        public ListAuditContentErrorTypesResponseBodyData setMajorClassName(String majorClassName) {
            this.majorClassName = majorClassName;
            return this;
        }
        public String getMajorClassName() {
            return this.majorClassName;
        }

        public ListAuditContentErrorTypesResponseBodyData setSubClasses(java.util.List<ListAuditContentErrorTypesResponseBodyDataSubClasses> subClasses) {
            this.subClasses = subClasses;
            return this;
        }
        public java.util.List<ListAuditContentErrorTypesResponseBodyDataSubClasses> getSubClasses() {
            return this.subClasses;
        }

    }

}
