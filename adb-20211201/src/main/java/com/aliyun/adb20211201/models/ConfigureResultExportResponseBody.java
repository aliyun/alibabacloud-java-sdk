// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ConfigureResultExportResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ConfigureResultExportResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ConfigureResultExportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigureResultExportResponseBody self = new ConfigureResultExportResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigureResultExportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ConfigureResultExportResponseBody setData(ConfigureResultExportResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ConfigureResultExportResponseBodyData getData() {
        return this.data;
    }

    public ConfigureResultExportResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ConfigureResultExportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfigureResultExportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConfigureResultExportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConfigureResultExportResponseBodyDataOssInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://testBucketName/data_result</p>
         */
        @NameInMap("ExportBasePath")
        public String exportBasePath;

        /**
         * <strong>example:</strong>
         * <p>aps</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ResultFileTtl")
        public Integer resultFileTtl;

        public static ConfigureResultExportResponseBodyDataOssInfo build(java.util.Map<String, ?> map) throws Exception {
            ConfigureResultExportResponseBodyDataOssInfo self = new ConfigureResultExportResponseBodyDataOssInfo();
            return TeaModel.build(map, self);
        }

        public ConfigureResultExportResponseBodyDataOssInfo setExportBasePath(String exportBasePath) {
            this.exportBasePath = exportBasePath;
            return this;
        }
        public String getExportBasePath() {
            return this.exportBasePath;
        }

        public ConfigureResultExportResponseBodyDataOssInfo setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public ConfigureResultExportResponseBodyDataOssInfo setResultFileTtl(Integer resultFileTtl) {
            this.resultFileTtl = resultFileTtl;
            return this;
        }
        public Integer getResultFileTtl() {
            return this.resultFileTtl;
        }

    }

    public static class ConfigureResultExportResponseBodyDataSlsInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LogstoreTtl")
        public Integer logstoreTtl;

        /**
         * <strong>example:</strong>
         * <p>aps</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        @NameInMap("SlsProject")
        public String slsProject;

        public static ConfigureResultExportResponseBodyDataSlsInfo build(java.util.Map<String, ?> map) throws Exception {
            ConfigureResultExportResponseBodyDataSlsInfo self = new ConfigureResultExportResponseBodyDataSlsInfo();
            return TeaModel.build(map, self);
        }

        public ConfigureResultExportResponseBodyDataSlsInfo setLogstoreTtl(Integer logstoreTtl) {
            this.logstoreTtl = logstoreTtl;
            return this;
        }
        public Integer getLogstoreTtl() {
            return this.logstoreTtl;
        }

        public ConfigureResultExportResponseBodyDataSlsInfo setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public ConfigureResultExportResponseBodyDataSlsInfo setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

    }

    public static class ConfigureResultExportResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        @NameInMap("OssInfo")
        public ConfigureResultExportResponseBodyDataOssInfo ossInfo;

        @NameInMap("SlsInfo")
        public ConfigureResultExportResponseBodyDataSlsInfo slsInfo;

        public static ConfigureResultExportResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ConfigureResultExportResponseBodyData self = new ConfigureResultExportResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ConfigureResultExportResponseBodyData setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public ConfigureResultExportResponseBodyData setOssInfo(ConfigureResultExportResponseBodyDataOssInfo ossInfo) {
            this.ossInfo = ossInfo;
            return this;
        }
        public ConfigureResultExportResponseBodyDataOssInfo getOssInfo() {
            return this.ossInfo;
        }

        public ConfigureResultExportResponseBodyData setSlsInfo(ConfigureResultExportResponseBodyDataSlsInfo slsInfo) {
            this.slsInfo = slsInfo;
            return this;
        }
        public ConfigureResultExportResponseBodyDataSlsInfo getSlsInfo() {
            return this.slsInfo;
        }

    }

}
