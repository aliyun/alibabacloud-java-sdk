// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeDriverVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public GetEdgeDriverVersionResponseBodyData data;

    public static GetEdgeDriverVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeDriverVersionResponseBody self = new GetEdgeDriverVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeDriverVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeDriverVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEdgeDriverVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeDriverVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEdgeDriverVersionResponseBody setData(GetEdgeDriverVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEdgeDriverVersionResponseBodyData getData() {
        return this.data;
    }

    public static class GetEdgeDriverVersionResponseBodyData extends TeaModel {
        @NameInMap("DriverId")
        public String driverId;

        @NameInMap("DriverVersion")
        public String driverVersion;

        @NameInMap("VersionState")
        public String versionState;

        @NameInMap("EdgeVersion")
        public String edgeVersion;

        @NameInMap("Description")
        public String description;

        @NameInMap("SourceConfig")
        public String sourceConfig;

        @NameInMap("DriverConfig")
        public String driverConfig;

        @NameInMap("ContainerConfig")
        public String containerConfig;

        @NameInMap("ConfigCheckRule")
        public String configCheckRule;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("Argument")
        public String argument;

        public static GetEdgeDriverVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeDriverVersionResponseBodyData self = new GetEdgeDriverVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEdgeDriverVersionResponseBodyData setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public GetEdgeDriverVersionResponseBodyData setDriverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            return this;
        }
        public String getDriverVersion() {
            return this.driverVersion;
        }

        public GetEdgeDriverVersionResponseBodyData setVersionState(String versionState) {
            this.versionState = versionState;
            return this;
        }
        public String getVersionState() {
            return this.versionState;
        }

        public GetEdgeDriverVersionResponseBodyData setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

        public GetEdgeDriverVersionResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEdgeDriverVersionResponseBodyData setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public GetEdgeDriverVersionResponseBodyData setDriverConfig(String driverConfig) {
            this.driverConfig = driverConfig;
            return this;
        }
        public String getDriverConfig() {
            return this.driverConfig;
        }

        public GetEdgeDriverVersionResponseBodyData setContainerConfig(String containerConfig) {
            this.containerConfig = containerConfig;
            return this;
        }
        public String getContainerConfig() {
            return this.containerConfig;
        }

        public GetEdgeDriverVersionResponseBodyData setConfigCheckRule(String configCheckRule) {
            this.configCheckRule = configCheckRule;
            return this;
        }
        public String getConfigCheckRule() {
            return this.configCheckRule;
        }

        public GetEdgeDriverVersionResponseBodyData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeDriverVersionResponseBodyData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeDriverVersionResponseBodyData setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

    }

}
