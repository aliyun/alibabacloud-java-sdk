// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeDriverVersionResponseBody extends TeaModel {
    /**
     * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see [Error codes](~~135200~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data that is returned if the call was successful.</p>
     */
    @NameInMap("Data")
    public QueryEdgeDriverVersionResponseBodyData data;

    /**
     * <p>The error message that is returned if the call failed.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeDriverVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeDriverVersionResponseBody self = new QueryEdgeDriverVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeDriverVersionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeDriverVersionResponseBody setData(QueryEdgeDriverVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeDriverVersionResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeDriverVersionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static class QueryEdgeDriverVersionResponseBodyDataDriverVersionList extends TeaModel {
        /**
         * <p>The Java Virtual Machine (JVM) startup parameter.</p>
         */
        @NameInMap("Argument")
        public String argument;

        /**
         * <p>The rule for verifying configurations. The value is a JSON string in the following format:</p>
         * <br>
         * <p>`{"deviceConfig":{"required":false},"driverConfig":{"required":false}`</p>
         * <br>
         * <p>The JSON string contains the following parameters:</p>
         * <br>
         * <p>*   driverConfig: the rule for verifying the configuration of the driver when the driver is to be deployed in an edge instance.</p>
         * <p>*   deviceConfig: the rule for verifying the configurations of devices that use the driver when the driver is to be deployed in an edge instance.</p>
         */
        @NameInMap("ConfigCheckRule")
        public String configCheckRule;

        /**
         * <p>The configuration of the container where the driver runs. The value is a JSON string. For more information about parameters in the JSON string, see the following parameter description of ContainerConfig.</p>
         */
        @NameInMap("ContainerConfig")
        public String containerConfig;

        /**
         * <p>The description of the driver.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The configuration of the driver. The value is a JSON string in the following format:</p>
         * <br>
         * <p>`{"format":"JSON","content":"{}"}`</p>
         * <br>
         * <p>The JSON string contains the following parameters:</p>
         * <br>
         * <p>*   format: the format of the driver configuration. Valid values: KV (key-value pair), JSON (JSON string), and FILE (configuration file).</p>
         * <p>*   content: the content of the driver configuration. If the format parameter is set to KV or JSON, the value of this parameter is the configuration content. If the format parameter is set to FILE, the value of this parameter is the URL of the configuration file stored in Object Storage Service (OSS).</p>
         */
        @NameInMap("DriverConfig")
        public String driverConfig;

        /**
         * <p>The ID of the driver.</p>
         */
        @NameInMap("DriverId")
        public String driverId;

        /**
         * <p>The version number of the driver.</p>
         */
        @NameInMap("DriverVersion")
        public String driverVersion;

        /**
         * <p>The earliest version of Link IoT Edge that is supported by the driver.</p>
         */
        @NameInMap("EdgeVersion")
        public String edgeVersion;

        /**
         * <p>The UNIX timestamp when the driver was created.</p>
         */
        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        /**
         * <p>The last UNIX timestamp when the driver was updated.</p>
         */
        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("SourceConfig")
        public String sourceConfig;

        /**
         * <p>The status of the driver version. Valid values:</p>
         * <br>
         * <p>*   0: The driver version was not published.</p>
         * <p>*   1: The driver version was published.</p>
         */
        @NameInMap("VersionState")
        public String versionState;

        public static QueryEdgeDriverVersionResponseBodyDataDriverVersionList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverVersionResponseBodyDataDriverVersionList self = new QueryEdgeDriverVersionResponseBodyDataDriverVersionList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setArgument(String argument) {
            this.argument = argument;
            return this;
        }
        public String getArgument() {
            return this.argument;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setConfigCheckRule(String configCheckRule) {
            this.configCheckRule = configCheckRule;
            return this;
        }
        public String getConfigCheckRule() {
            return this.configCheckRule;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setContainerConfig(String containerConfig) {
            this.containerConfig = containerConfig;
            return this;
        }
        public String getContainerConfig() {
            return this.containerConfig;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setDriverConfig(String driverConfig) {
            this.driverConfig = driverConfig;
            return this;
        }
        public String getDriverConfig() {
            return this.driverConfig;
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

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setEdgeVersion(String edgeVersion) {
            this.edgeVersion = edgeVersion;
            return this;
        }
        public String getEdgeVersion() {
            return this.edgeVersion;
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

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setSourceConfig(String sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public String getSourceConfig() {
            return this.sourceConfig;
        }

        public QueryEdgeDriverVersionResponseBodyDataDriverVersionList setVersionState(String versionState) {
            this.versionState = versionState;
            return this;
        }
        public String getVersionState() {
            return this.versionState;
        }

    }

    public static class QueryEdgeDriverVersionResponseBodyData extends TeaModel {
        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The information about each version of the driver.</p>
         */
        @NameInMap("DriverVersionList")
        public java.util.List<QueryEdgeDriverVersionResponseBodyDataDriverVersionList> driverVersionList;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The number of driver versions.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeDriverVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeDriverVersionResponseBodyData self = new QueryEdgeDriverVersionResponseBodyData();
            return TeaModel.build(map, self);
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

        public QueryEdgeDriverVersionResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeDriverVersionResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
