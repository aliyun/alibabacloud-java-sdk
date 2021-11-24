// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryClusterSpecificationResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.List<QueryClusterSpecificationResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ClusterSpecificationName")
        public String clusterSpecificationName;

        @NameInMap("CpuCapacity")
        public String cpuCapacity;

        @NameInMap("DiskCapacity")
        public String diskCapacity;

        @NameInMap("InstanceCount")
        public String instanceCount;

        @NameInMap("MaxCon")
        public String maxCon;

        @NameInMap("MaxTps")
        public String maxTps;

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

        public QueryClusterSpecificationResponseBodyData setDiskCapacity(String diskCapacity) {
            this.diskCapacity = diskCapacity;
            return this;
        }
        public String getDiskCapacity() {
            return this.diskCapacity;
        }

        public QueryClusterSpecificationResponseBodyData setInstanceCount(String instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }
        public String getInstanceCount() {
            return this.instanceCount;
        }

        public QueryClusterSpecificationResponseBodyData setMaxCon(String maxCon) {
            this.maxCon = maxCon;
            return this;
        }
        public String getMaxCon() {
            return this.maxCon;
        }

        public QueryClusterSpecificationResponseBodyData setMaxTps(String maxTps) {
            this.maxTps = maxTps;
            return this;
        }
        public String getMaxTps() {
            return this.maxTps;
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
