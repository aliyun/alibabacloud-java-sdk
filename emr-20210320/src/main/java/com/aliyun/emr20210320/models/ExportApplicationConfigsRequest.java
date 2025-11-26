// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ExportApplicationConfigsRequest extends TeaModel {
    /**
     * <p>导出应用配置。</p>
     */
    @NameInMap("ApplicationConfigFiles")
    public java.util.List<ApplicationConfigFile> applicationConfigFiles;

    /**
     * <p>集群ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b933c5aac8fe****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ConfigScope")
    public String configScope;

    /**
     * <strong>example:</strong>
     * <p>MODIFICATION</p>
     */
    @NameInMap("ExportMode")
    public String exportMode;

    /**
     * <p>导出应用配置的文件格式。</p>
     * 
     * <strong>example:</strong>
     * <p>XML</p>
     */
    @NameInMap("FileFormat")
    public String fileFormat;

    @NameInMap("NodeGroupIds")
    public java.util.List<String> nodeGroupIds;

    @NameInMap("NodeIds")
    public java.util.List<String> nodeIds;

    /**
     * <p>区域ID。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ExportApplicationConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportApplicationConfigsRequest self = new ExportApplicationConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ExportApplicationConfigsRequest setApplicationConfigFiles(java.util.List<ApplicationConfigFile> applicationConfigFiles) {
        this.applicationConfigFiles = applicationConfigFiles;
        return this;
    }
    public java.util.List<ApplicationConfigFile> getApplicationConfigFiles() {
        return this.applicationConfigFiles;
    }

    public ExportApplicationConfigsRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ExportApplicationConfigsRequest setConfigScope(String configScope) {
        this.configScope = configScope;
        return this;
    }
    public String getConfigScope() {
        return this.configScope;
    }

    public ExportApplicationConfigsRequest setExportMode(String exportMode) {
        this.exportMode = exportMode;
        return this;
    }
    public String getExportMode() {
        return this.exportMode;
    }

    public ExportApplicationConfigsRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public ExportApplicationConfigsRequest setNodeGroupIds(java.util.List<String> nodeGroupIds) {
        this.nodeGroupIds = nodeGroupIds;
        return this;
    }
    public java.util.List<String> getNodeGroupIds() {
        return this.nodeGroupIds;
    }

    public ExportApplicationConfigsRequest setNodeIds(java.util.List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public ExportApplicationConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
