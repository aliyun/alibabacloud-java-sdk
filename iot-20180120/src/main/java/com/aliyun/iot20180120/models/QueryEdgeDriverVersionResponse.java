// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverVersionResponse extends TeaModel {
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
    public QueryEdgeDriverVersionResponseData data;

    public static QueryEdgeDriverVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverVersionResponse self = new QueryEdgeDriverVersionResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverVersionResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeDriverVersionResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeDriverVersionResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeDriverVersionResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeDriverVersionResponse setData(QueryEdgeDriverVersionResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeDriverVersionResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeDriverVersionResponseDataDriverVersionList extends TeaModel {
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

        public static QueryEdgeDriverVersionResponseDataDriverVersionList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverVersionResponseDataDriverVersionList self = new QueryEdgeDriverVersionResponseDataDriverVersionList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setDriverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            return this;
        }
        public String getDriverVersion() {
            return this.driverVersion;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setVersionState(String versionState) {
            this.versionState = versionState;
            return this;
        }
        public String getVersionState() {
            return this.versionState;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setDriverConfig(String driverConfig) {
            this.driverConfig = driverConfig;
            return this;
        }
        public String getDriverConfig() {
            return this.driverConfig;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setContainerConfig(String containerConfig) {
            this.containerConfig = containerConfig;
            return this;
        }
        public String getContainerConfig() {
            return this.containerConfig;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setConfigCheckRule(String configCheckRule) {
            this.configCheckRule = configCheckRule;
            return this;
        }
        public String getConfigCheckRule() {
            return this.configCheckRule;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeDriverVersionResponseDataDriverVersionList setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

    }

    public static class QueryEdgeDriverVersionResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("DriverVersionList")
        @Validation(required = true)
        public java.util.List<QueryEdgeDriverVersionResponseDataDriverVersionList> driverVersionList;

        public static QueryEdgeDriverVersionResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverVersionResponseData self = new QueryEdgeDriverVersionResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverVersionResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeDriverVersionResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeDriverVersionResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeDriverVersionResponseData setDriverVersionList(java.util.List<QueryEdgeDriverVersionResponseDataDriverVersionList> driverVersionList) {
            this.driverVersionList = driverVersionList;
            return this;
        }
        public java.util.List<QueryEdgeDriverVersionResponseDataDriverVersionList> getDriverVersionList() {
            return this.driverVersionList;
        }

    }

}
