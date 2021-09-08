// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverVersionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public QueryEdgeDriverVersionResponseBodyData data;

    public static QueryEdgeDriverVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverVersionResponseBody self = new QueryEdgeDriverVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeDriverVersionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeDriverVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeDriverVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeDriverVersionResponseBody setData(QueryEdgeDriverVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeDriverVersionResponseBodyData getData() {
        return this.data;
    }

    public static class QueryEdgeDriverVersionResponseBodyDataDriverVersionList extends TeaModel {
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

        public static QueryEdgeDriverVersionResponseBodyDataDriverVersionList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverVersionResponseBodyDataDriverVersionList self = new QueryEdgeDriverVersionResponseBodyDataDriverVersionList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setDriverId(String driverId) {
            this.driverId = driverId;
            return this;
        }
        public String getDriverId() {
            return this.driverId;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setDriverVersion(String driverVersion) {
            this.driverVersion = driverVersion;
            return this;
        }
        public String getDriverVersion() {
            return this.driverVersion;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setVersionState(String versionState) {
            this.versionState = versionState;
            return this;
        }
        public String getVersionState() {
            return this.versionState;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setDriverConfig(String driverConfig) {
            this.driverConfig = driverConfig;
            return this;
        }
        public String getDriverConfig() {
            return this.driverConfig;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setContainerConfig(String containerConfig) {
            this.containerConfig = containerConfig;
            return this;
        }
        public String getContainerConfig() {
            return this.containerConfig;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setConfigCheckRule(String configCheckRule) {
            this.configCheckRule = configCheckRule;
            return this;
        }
        public String getConfigCheckRule() {
            return this.configCheckRule;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

    }

    public static class QueryEdgeDriverVersionResponseBodyData extends TeaModel {
        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("DriverVersionList")
        public java.util.List<QueryEdgeDriverVersionResponseBodyDataDriverVersionList> driverVersionList;

        public static QueryEdgeDriverVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverVersionResponseBodyData self = new QueryEdgeDriverVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverVersionResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeDriverVersionResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeDriverVersionResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeDriverVersionResponseBodyData setDriverVersionList(java.util.List<QueryEdgeDriverVersionResponseBodyDataDriverVersionList> driverVersionList) {
            this.driverVersionList = driverVersionList;
            return this;
        }
        public java.util.List<QueryEdgeDriverVersionResponseBodyDataDriverVersionList> getDriverVersionList() {
            return this.driverVersionList;
        }

    }

}
