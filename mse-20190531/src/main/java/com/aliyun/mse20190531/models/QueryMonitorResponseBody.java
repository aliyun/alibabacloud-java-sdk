// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryMonitorResponseBody extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryMonitorResponseBodyData> data;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The timestamp when the monitoring ends.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The name of the pod.</p>
     */
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
        /**
         * <p>The request was successfully processed.</p>
         */
        @NameInMap("clusterNamePrefix")
        public String clusterNamePrefix;

        /**
         * <p>The message returned.</p>
         */
        @NameInMap("podName")
        public String podName;

        /**
         * <p>The ID of the request.</p>
         */
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
