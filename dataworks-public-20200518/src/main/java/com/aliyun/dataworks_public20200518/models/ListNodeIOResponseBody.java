// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListNodeIOResponseBody extends TeaModel {
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<ListNodeIOResponseBodyData> data;

    public static ListNodeIOResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNodeIOResponseBody self = new ListNodeIOResponseBody();
        return TeaModel.build(map, self);
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

    public ListNodeIOResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListNodeIOResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListNodeIOResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListNodeIOResponseBody setData(java.util.List<ListNodeIOResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListNodeIOResponseBodyData> getData() {
        return this.data;
    }

    public static class ListNodeIOResponseBodyData extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Data")
        public String data;

        @NameInMap("NodeId")
        public Long nodeId;

        public static ListNodeIOResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListNodeIOResponseBodyData self = new ListNodeIOResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListNodeIOResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
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

    }

}
