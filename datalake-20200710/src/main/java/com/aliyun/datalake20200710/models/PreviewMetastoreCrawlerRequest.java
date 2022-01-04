// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PreviewMetastoreCrawlerRequest extends TeaModel {
    @NameInMap("DatasourceExcludePath")
    public String datasourceExcludePath;

    @NameInMap("DatasourcePath")
    public String datasourcePath;

    @NameInMap("DatasourceType")
    public String datasourceType;

    @NameInMap("FileFormat")
    public String fileFormat;

    @NameInMap("FileFormatConfig")
    public String fileFormatConfig;

    @NameInMap("Name")
    public String name;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("TargetDatabase")
    public String targetDatabase;

    @NameInMap("TargetTablePrefix")
    public String targetTablePrefix;

    @NameInMap("TargetUpdateStrategy")
    public String targetUpdateStrategy;

    public static PreviewMetastoreCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewMetastoreCrawlerRequest self = new PreviewMetastoreCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public PreviewMetastoreCrawlerRequest setDatasourceExcludePath(String datasourceExcludePath) {
        this.datasourceExcludePath = datasourceExcludePath;
        return this;
    }
    public String getDatasourceExcludePath() {
        return this.datasourceExcludePath;
    }

    public PreviewMetastoreCrawlerRequest setDatasourcePath(String datasourcePath) {
        this.datasourcePath = datasourcePath;
        return this;
    }
    public String getDatasourcePath() {
        return this.datasourcePath;
    }

    public PreviewMetastoreCrawlerRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public PreviewMetastoreCrawlerRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public PreviewMetastoreCrawlerRequest setFileFormatConfig(String fileFormatConfig) {
        this.fileFormatConfig = fileFormatConfig;
        return this;
    }
    public String getFileFormatConfig() {
        return this.fileFormatConfig;
    }

    public PreviewMetastoreCrawlerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public PreviewMetastoreCrawlerRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public PreviewMetastoreCrawlerRequest setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }
    public String getTargetDatabase() {
        return this.targetDatabase;
    }

    public PreviewMetastoreCrawlerRequest setTargetTablePrefix(String targetTablePrefix) {
        this.targetTablePrefix = targetTablePrefix;
        return this;
    }
    public String getTargetTablePrefix() {
        return this.targetTablePrefix;
    }

    public PreviewMetastoreCrawlerRequest setTargetUpdateStrategy(String targetUpdateStrategy) {
        this.targetUpdateStrategy = targetUpdateStrategy;
        return this;
    }
    public String getTargetUpdateStrategy() {
        return this.targetUpdateStrategy;
    }

}
