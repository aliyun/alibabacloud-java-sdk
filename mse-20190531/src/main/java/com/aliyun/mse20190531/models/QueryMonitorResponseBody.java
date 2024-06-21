// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryMonitorResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryMonitorResponseBodyData> data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ADDD8AB7-8D1C-4697-A83E-410D2607****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * <p>The prefix of the name.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-xxxx-xxxxxx</p>
         */
        @NameInMap("clusterNamePrefix")
        public String clusterNamePrefix;

        /**
         * <p>The name of the pod.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-xxxxxx-xxxxxx-reg-center-0-0</p>
         */
        @NameInMap("podName")
        public String podName;

        /**
         * <p>The details of the data.</p>
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
