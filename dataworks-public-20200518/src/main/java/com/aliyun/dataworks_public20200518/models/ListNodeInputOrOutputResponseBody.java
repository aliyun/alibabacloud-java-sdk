// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeInputOrOutputResponseBody extends TeaModel {
    /**
     * <p>The ancestor or descendant nodes.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListNodeInputOrOutputResponseBodyData> data;

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

    public static ListNodeInputOrOutputResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInputOrOutputResponseBody self = new ListNodeInputOrOutputResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNodeInputOrOutputResponseBody setData(java.util.List<ListNodeInputOrOutputResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodeInputOrOutputResponseBodyData> getData() {
        return this.data;
    }

    public ListNodeInputOrOutputResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodeInputOrOutputResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodeInputOrOutputResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodeInputOrOutputResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeInputOrOutputResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListNodeInputOrOutputResponseBodyData extends TeaModel {
        /**
         * <p>The name of the ancestor or descendant node.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx.123141254_out</p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234667</p>
         */
        @NameInMap("NodeId")
        public Long nodeId;

        /**
         * <p>This parameter does not take effect. You cannot obtain the parameter settings.</p>
         * 
         * <strong>example:</strong>
         * <p>dwd_xxx_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static ListNodeInputOrOutputResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodeInputOrOutputResponseBodyData self = new ListNodeInputOrOutputResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodeInputOrOutputResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListNodeInputOrOutputResponseBodyData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

        public ListNodeInputOrOutputResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
