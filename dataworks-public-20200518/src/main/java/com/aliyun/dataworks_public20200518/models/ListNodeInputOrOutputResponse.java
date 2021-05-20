// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeInputOrOutputResponse extends TeaModel {
    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    @Validation(required = true)
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListNodeInputOrOutputResponseData> data;

    public static ListNodeInputOrOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        ListNodeInputOrOutputResponse self = new ListNodeInputOrOutputResponse();
        return TeaModel.build(map, self);
    }

    public ListNodeInputOrOutputResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNodeInputOrOutputResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodeInputOrOutputResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodeInputOrOutputResponse setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListNodeInputOrOutputResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNodeInputOrOutputResponse setData(java.util.List<ListNodeInputOrOutputResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodeInputOrOutputResponseData> getData() {
        return this.data;
    }

    public static class ListNodeInputOrOutputResponseData extends TeaModel {
        @NameInMap("TableName")
        @Validation(required = true)
        public String tableName;

        @NameInMap("Data")
        @Validation(required = true)
        public String data;

        @NameInMap("NodeId")
        @Validation(required = true)
        public Long nodeId;

        public static ListNodeInputOrOutputResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListNodeInputOrOutputResponseData self = new ListNodeInputOrOutputResponseData();
            return TeaModel.build(map, self);
        }

        public ListNodeInputOrOutputResponseData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListNodeInputOrOutputResponseData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public ListNodeInputOrOutputResponseData setNodeId(Long nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public Long getNodeId() {
            return this.nodeId;
        }

    }

}
