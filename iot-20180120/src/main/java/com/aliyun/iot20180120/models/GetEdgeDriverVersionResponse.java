// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeDriverVersionResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public GetEdgeDriverVersionResponseData data;

    public static GetEdgeDriverVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeDriverVersionResponse self = new GetEdgeDriverVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetEdgeDriverVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeDriverVersionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEdgeDriverVersionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeDriverVersionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEdgeDriverVersionResponse setData(GetEdgeDriverVersionResponseData data) {
        this.data = data;
        return this;
    }
    public GetEdgeDriverVersionResponseData getData() {
        return this.data;
    }

    public static class GetEdgeDriverVersionResponseData extends TeaModel {
        @NameInMap("DriverId")
        @Validation(required = true)
        public String driverId;

        @NameInMap("DriverVersion")
        @Validation(required = true)
        public String driverVersion;

        @NameInMap("VersionState")
        @Validation(required = true)
        public String versionState;

        @NameInMap("EdgeVersion")
        @Validation(required = true)
        public String edgeVersion;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("SourceConfig")
        @Validation(required = true)
        public String sourceConfig;

        @NameInMap("DriverConfig")
        @Validation(required = true)
        public String driverConfig;

        @NameInMap("ContainerConfig")
        @Validation(required = true)
        public String containerConfig;

        @NameInMap("ConfigCheckRule")
        @Validation(required = true)
        public String configCheckRule;

        @NameInMap("GmtCreateTimestamp")
        @Validation(required = true)
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        @Validation(required = true)
        public Long gmtModifiedTimestamp;

        @NameInMap("Argument")
        @Validation(required = true)
        public String argument;

        public static GetEdgeDriverVersionResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeDriverVersionResponseData self = new GetEdgeDriverVersionResponseData();
            return TeaModel.build(map, self);
        }

        public GetEdgeDriverVersionResponseData setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public GetEdgeDriverVersionResponseData setDriverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            return this;
        }
        public String getDriverVersion() {
            return this.driverVersion;
        }

        public GetEdgeDriverVersionResponseData setVersionState(String versionState) {
            this.versionState = versionState;
            return this;
        }
        public String getVersionState() {
            return this.versionState;
        }

        public GetEdgeDriverVersionResponseData setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

        public GetEdgeDriverVersionResponseData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEdgeDriverVersionResponseData setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public GetEdgeDriverVersionResponseData setDriverConfig(String driverConfig) {
            this.driverConfig = driverConfig;
            return this;
        }
        public String getDriverConfig() {
            return this.driverConfig;
        }

        public GetEdgeDriverVersionResponseData setContainerConfig(String containerConfig) {
            this.containerConfig = containerConfig;
            return this;
        }
        public String getContainerConfig() {
            return this.containerConfig;
        }

        public GetEdgeDriverVersionResponseData setConfigCheckRule(String configCheckRule) {
            this.configCheckRule = configCheckRule;
            return this;
        }
        public String getConfigCheckRule() {
            return this.configCheckRule;
        }

        public GetEdgeDriverVersionResponseData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeDriverVersionResponseData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeDriverVersionResponseData setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

    }

}
