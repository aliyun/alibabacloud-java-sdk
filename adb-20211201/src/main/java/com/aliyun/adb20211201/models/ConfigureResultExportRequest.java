// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ConfigureResultExportRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the information about all AnalyticDB for MySQL clusters within a region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-wz9509beptiz****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The export type. Valid values:</p>
     * <ul>
     * <li>SLS: Specifies that the export destination is SLS.</li>
     * <li>OSS: Specifies that the export destination is OSS.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SLS</p>
     */
    @NameInMap("ExportType")
    public String exportType;

    /**
     * <p>The OSS configuration details if the destination is of the OSS type.</p>
     */
    @NameInMap("OssInfo")
    public ConfigureResultExportRequestOssInfo ossInfo;

    /**
     * <p>The ID of the region where the instance resides.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The SLS configuration details if the destination is of the SLS type.</p>
     */
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
         * <p>The OSS path where the result sets are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://testBucketName/data_result</p>
         */
        @NameInMap("ExportBasePath")
        public String exportBasePath;

        /**
         * <p>The name of the resource group that runs the job.</p>
         * 
         * <strong>example:</strong>
         * <p>aps</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The expiration time of the OSS file. Unit: days. Minimum: 1 day, maximum: 30 days. Values outside this range will result in an error.</p>
         * 
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
         * <p>The expiration time of the Logstore temporarily generated during the result set export. Unit: days. The Logstore is automatically deleted after it expires. Minimum value: 1 day, maximum: 30 days. Values outside this range will result in an error.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("LogstoreTtl")
        public Integer logstoreTtl;

        /**
         * <p>The name of the resource group that runs the job.</p>
         * 
         * <strong>example:</strong>
         * <p>aps</p>
         */
        @NameInMap("ResourceGroup")
        public String resourceGroup;

        /**
         * <p>The name of the SLS project.</p>
         * 
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
