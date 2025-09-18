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

    public ExportApplicationConfigsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
