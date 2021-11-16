// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeInputOrOutputResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListNodeInputOrOutputResponseBodyData> data;

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
        @NameInMap("Data")
        public String data;

        @NameInMap("NodeId")
        public Long nodeId;

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
