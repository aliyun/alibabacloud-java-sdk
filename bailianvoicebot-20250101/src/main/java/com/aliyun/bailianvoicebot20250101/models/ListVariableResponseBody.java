// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianvoicebot20250101.models;

import com.aliyun.tea.*;

public class ListVariableResponseBody extends TeaModel {
    /**
     * <p>The internal error code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The paginated data of the variable list.</p>
     */
    @NameInMap("Data")
    public ListVariableResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>Instance llm-rj6aqmctjcit4acy does not exist.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of dynamic error parameters.</p>
     */
    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CF6D3484-19A1-5C77-863B-AC8B5754D37C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListVariableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVariableResponseBody self = new ListVariableResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVariableResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVariableResponseBody setData(ListVariableResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVariableResponseBodyData getData() {
        return this.data;
    }

    public ListVariableResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListVariableResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVariableResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListVariableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListVariableResponseBodyDataVariables extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1754013825102</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Current age of the user</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The display name.</p>
         * 
         * <strong>example:</strong>
         * <p>Age</p>
         */
        @NameInMap("DisplayName")
        public String displayName;

        /**
         * <p>The Bailian business workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-zop7ukgtksltamo4</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The variable name.</p>
         * 
         * <strong>example:</strong>
         * <p>age</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1308144684576655</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1754013825102</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        /**
         * <p>The variable ID.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66b</p>
         */
        @NameInMap("VariableId")
        public String variableId;

        public static ListVariableResponseBodyDataVariables build(java.util.Map<String, ?> map) throws Exception {
            ListVariableResponseBodyDataVariables self = new ListVariableResponseBodyDataVariables();
            return TeaModel.build(map, self);
        }

        public ListVariableResponseBodyDataVariables setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public ListVariableResponseBodyDataVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListVariableResponseBodyDataVariables setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListVariableResponseBodyDataVariables setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListVariableResponseBodyDataVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListVariableResponseBodyDataVariables setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ListVariableResponseBodyDataVariables setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public ListVariableResponseBodyDataVariables setVariableId(String variableId) {
            this.variableId = variableId;
            return this;
        }
        public String getVariableId() {
            return this.variableId;
        }

    }

    public static class ListVariableResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The list of variable objects.</p>
         */
        @NameInMap("Variables")
        public java.util.List<ListVariableResponseBodyDataVariables> variables;

        public static ListVariableResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVariableResponseBodyData self = new ListVariableResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVariableResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListVariableResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVariableResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListVariableResponseBodyData setVariables(java.util.List<ListVariableResponseBodyDataVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<ListVariableResponseBodyDataVariables> getVariables() {
            return this.variables;
        }

    }

}
