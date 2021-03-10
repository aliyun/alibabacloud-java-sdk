// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeDriverResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("DriverList")
    @Validation(required = true)
    public java.util.List<BatchGetEdgeDriverResponseDriverList> driverList;

    public static BatchGetEdgeDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeDriverResponse self = new BatchGetEdgeDriverResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeDriverResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetEdgeDriverResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetEdgeDriverResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetEdgeDriverResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchGetEdgeDriverResponse setDriverList(java.util.List<BatchGetEdgeDriverResponseDriverList> driverList) {
        this.driverList = driverList;
        return this;
    }
    public java.util.List<BatchGetEdgeDriverResponseDriverList> getDriverList() {
        return this.driverList;
    }

    public static class BatchGetEdgeDriverResponseDriverList extends TeaModel {
        @NameInMap("DriverId")
        @Validation(required = true)
        public String driverId;

        @NameInMap("DriverName")
        @Validation(required = true)
        public String driverName;

        @NameInMap("DriverProtocol")
        @Validation(required = true)
        public String driverProtocol;

        @NameInMap("Runtime")
        @Validation(required = true)
        public String runtime;

        @NameInMap("CpuArch")
        @Validation(required = true)
        public String cpuArch;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("IsBuiltIn")
        @Validation(required = true)
        public Boolean isBuiltIn;

        @NameInMap("GmtCreateTimestamp")
        @Validation(required = true)
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        @Validation(required = true)
        public Long gmtModifiedTimestamp;

        public static BatchGetEdgeDriverResponseDriverList build(java.util.Map<String, ?> map) throws Exception {
            BatchGetEdgeDriverResponseDriverList self = new BatchGetEdgeDriverResponseDriverList();
            return TeaModel.build(map, self);
        }

        public BatchGetEdgeDriverResponseDriverList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public BatchGetEdgeDriverResponseDriverList setDriverName(String driverName) {
            this.driverName = driverName;
            return this;
        }
        public String getDriverName() {
            return this.driverName;
        }

        public BatchGetEdgeDriverResponseDriverList setDriverProtocol(String driverProtocol) {
            this.driverProtocol = driverProtocol;
            return this;
        }
        public String getDriverProtocol() {
            return this.driverProtocol;
        }

        public BatchGetEdgeDriverResponseDriverList setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public BatchGetEdgeDriverResponseDriverList setCpuArch(String cpuArch) {
            this.cpuArch = cpuArch;
            return this;
        }
        public String getCpuArch() {
            return this.cpuArch;
        }

        public BatchGetEdgeDriverResponseDriverList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public BatchGetEdgeDriverResponseDriverList setIsBuiltIn(Boolean isBuiltIn) {
            this.isBuiltIn = isBuiltIn;
            return this;
        }
        public Boolean getIsBuiltIn() {
            return this.isBuiltIn;
        }

        public BatchGetEdgeDriverResponseDriverList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public BatchGetEdgeDriverResponseDriverList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

    }

}
