// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterSpecificationResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryClusterSpecificationResponseBodyData> data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryClusterSpecificationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryClusterSpecificationResponseBody self = new QueryClusterSpecificationResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryClusterSpecificationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryClusterSpecificationResponseBody setData(java.util.List<QueryClusterSpecificationResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryClusterSpecificationResponseBodyData> getData() {
        return this.data;
    }

    public QueryClusterSpecificationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryClusterSpecificationResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryClusterSpecificationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryClusterSpecificationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryClusterSpecificationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryClusterSpecificationResponseBodyData extends TeaModel {
        /**
         * <p>The engine specifications that can be used.</p>
         */
        @NameInMap("ClusterSpecificationName")
        public String clusterSpecificationName;

        /**
         * <p>The number of vCPUs in the specifications.</p>
         */
        @NameInMap("CpuCapacity")
        public String cpuCapacity;

        /**
         * <p>The memory size in the specifications. Unit: GB.</p>
         */
        @NameInMap("MemoryCapacity")
        public String memoryCapacity;

        public static QueryClusterSpecificationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryClusterSpecificationResponseBodyData self = new QueryClusterSpecificationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryClusterSpecificationResponseBodyData setClusterSpecificationName(String clusterSpecificationName) {
            this.clusterSpecificationName = clusterSpecificationName;
            return this;
        }
        public String getClusterSpecificationName() {
            return this.clusterSpecificationName;
        }

        public QueryClusterSpecificationResponseBodyData setCpuCapacity(String cpuCapacity) {
            this.cpuCapacity = cpuCapacity;
            return this;
        }
        public String getCpuCapacity() {
            return this.cpuCapacity;
        }

        public QueryClusterSpecificationResponseBodyData setMemoryCapacity(String memoryCapacity) {
            this.memoryCapacity = memoryCapacity;
            return this;
        }
        public String getMemoryCapacity() {
            return this.memoryCapacity;
        }

    }

}
