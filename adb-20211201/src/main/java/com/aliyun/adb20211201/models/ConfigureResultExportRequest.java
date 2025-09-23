// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ConfigureResultExportRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9509beptiz****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    @NameInMap("OssInfo")
    public ConfigureResultExportRequestOssInfo ossInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SlsInfo")
    public ConfigureResultExportRequestSlsInfo slsInfo;

    public static ConfigureResultExportRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureResultExportRequest self = new ConfigureResultExportRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureResultExportRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ConfigureResultExportRequest setExportType(String exportType) {
        this.exportType = exportType;
        return this;
    }
    public String getExportType() {
        return this.exportType;
    }

    public ConfigureResultExportRequest setOssInfo(ConfigureResultExportRequestOssInfo ossInfo) {
        this.ossInfo = ossInfo;
        return this;
    }
    public ConfigureResultExportRequestOssInfo getOssInfo() {
        return this.ossInfo;
    }

    public ConfigureResultExportRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ConfigureResultExportRequest setSlsInfo(ConfigureResultExportRequestSlsInfo slsInfo) {
        this.slsInfo = slsInfo;
        return this;
    }
    public ConfigureResultExportRequestSlsInfo getSlsInfo() {
        return this.slsInfo;
    }

    public static class ConfigureResultExportRequestOssInfo extends TeaModel {
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

        public static ConfigureResultExportRequestOssInfo build(java.util.Map<String, ?> map) throws Exception {
            ConfigureResultExportRequestOssInfo self = new ConfigureResultExportRequestOssInfo();
            return TeaModel.build(map, self);
        }

        public ConfigureResultExportRequestOssInfo setExportBasePath(String exportBasePath) {
            this.exportBasePath = exportBasePath;
            return this;
        }
        public String getExportBasePath() {
            return this.exportBasePath;
        }

        public ConfigureResultExportRequestOssInfo setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public ConfigureResultExportRequestOssInfo setResultFileTtl(Integer resultFileTtl) {
            this.resultFileTtl = resultFileTtl;
            return this;
        }
        public Integer getResultFileTtl() {
            return this.resultFileTtl;
        }

    }

    public static class ConfigureResultExportRequestSlsInfo extends TeaModel {
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

        public static ConfigureResultExportRequestSlsInfo build(java.util.Map<String, ?> map) throws Exception {
            ConfigureResultExportRequestSlsInfo self = new ConfigureResultExportRequestSlsInfo();
            return TeaModel.build(map, self);
        }

        public ConfigureResultExportRequestSlsInfo setLogstoreTtl(Integer logstoreTtl) {
            this.logstoreTtl = logstoreTtl;
            return this;
        }
        public Integer getLogstoreTtl() {
            return this.logstoreTtl;
        }

        public ConfigureResultExportRequestSlsInfo setResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        public ConfigureResultExportRequestSlsInfo setSlsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }
        public String getSlsProject() {
            return this.slsProject;
        }

    }

}
