// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterSpecificationResponseBody extends TeaModel {
    /**
     * <p>The return value.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
     * <p>EE5C32A1-BC0E-4B79-817C-103E4EDF****</p>
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
         * 
         * <strong>example:</strong>
         * <p>MSE_SC_1_2_200_c</p>
         */
        @NameInMap("ClusterSpecificationName")
        public String clusterSpecificationName;

        /**
         * <p>The number of vCPUs in the specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CpuCapacity")
        public String cpuCapacity;

        /**
         * <p>The memory size in the specifications. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
