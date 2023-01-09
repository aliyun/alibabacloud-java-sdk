// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterSpecificationResponseBody extends TeaModel {
    // The return value.
    @NameInMap("Code")
    public Integer code;

    // The details of the data.
    @NameInMap("Data")
    public java.util.List<QueryClusterSpecificationResponseBodyData> data;

    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The HTTP status code returned.
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

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
        // The engine specifications that can be used.
        @NameInMap("ClusterSpecificationName")
        public String clusterSpecificationName;

        // The number of vCPUs in the specifications.
        @NameInMap("CpuCapacity")
        public String cpuCapacity;

        // The memory size in the specifications. Unit: GB.
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
