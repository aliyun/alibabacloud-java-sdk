// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryMonitorResponseBody extends TeaModel {
    // The details of the data.
    @NameInMap("Data")
    public java.util.List<QueryMonitorResponseBodyData> data;

    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static QueryMonitorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorResponseBody self = new QueryMonitorResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMonitorResponseBody setData(java.util.List<QueryMonitorResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryMonitorResponseBodyData> getData() {
        return this.data;
    }

    public QueryMonitorResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryMonitorResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryMonitorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMonitorResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryMonitorResponseBodyData extends TeaModel {
        // The prefix of the name.
        @NameInMap("clusterNamePrefix")
        public String clusterNamePrefix;

        // The name of the pod.
        @NameInMap("podName")
        public String podName;

        // The details of the data.
        @NameInMap("values")
        public java.util.List<java.util.Map<String, ?>> values;

        public static QueryMonitorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryMonitorResponseBodyData self = new QueryMonitorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryMonitorResponseBodyData setClusterNamePrefix(String clusterNamePrefix) {
            this.clusterNamePrefix = clusterNamePrefix;
            return this;
        }
        public String getClusterNamePrefix() {
            return this.clusterNamePrefix;
        }

        public QueryMonitorResponseBodyData setPodName(String podName) {
            this.podName = podName;
            return this;
        }
        public String getPodName() {
            return this.podName;
        }

        public QueryMonitorResponseBodyData setValues(java.util.List<java.util.Map<String, ?>> values) {
            this.values = values;
            return this;
        }
        public java.util.List<java.util.Map<String, ?>> getValues() {
            return this.values;
        }

    }

}
