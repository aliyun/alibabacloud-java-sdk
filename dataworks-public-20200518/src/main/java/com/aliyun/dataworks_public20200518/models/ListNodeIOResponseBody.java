// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeIOResponseBody extends TeaModel {
    /**
     * <p>The node information.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListNodeIOResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Invalid.Tenant.ProjectNotExists</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The project does not exist.</p>
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
     * <p>E6F0DBDD-5AD****</p>
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

    public static ListNodeIOResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeIOResponseBody self = new ListNodeIOResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeIOResponseBody setData(java.util.List<ListNodeIOResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodeIOResponseBodyData> getData() {
        return this.data;
    }

    public ListNodeIOResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodeIOResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodeIOResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodeIOResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeIOResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodeIOResponseBodyData extends TeaModel {
        /**
         * <p>The name of the ancestor or descendant node.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks_a.1234_out</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>The name of the input or output table.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks_a.datastudio_tenant_waitres_alarm</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListNodeIOResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodeIOResponseBodyData self = new ListNodeIOResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodeIOResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListNodeIOResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodeIOResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
