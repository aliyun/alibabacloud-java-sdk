// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateMetastoreCrawlerRequest extends TeaModel {
    @NameInMap("DatasourceExcludePath")
    public String datasourceExcludePath;

    @NameInMap("DatasourcePath")
    public String datasourcePath;

    @NameInMap("DatasourceType")
    public String datasourceType;

    @NameInMap("ExecuteCron")
    public String executeCron;

    @NameInMap("ExecuteMode")
    public String executeMode;

    @NameInMap("ExecuteType")
    public String executeType;

    @NameInMap("FileFormat")
    public String fileFormat;

    @NameInMap("FileFormatConfig")
    public String fileFormatConfig;

    @NameInMap("ImmediatelyRun")
    public Boolean immediatelyRun;

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

    public static CreateMetastoreCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMetastoreCrawlerRequest self = new CreateMetastoreCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public CreateMetastoreCrawlerRequest setDatasourceExcludePath(String datasourceExcludePath) {
        this.datasourceExcludePath = datasourceExcludePath;
        return this;
    }
    public String getDatasourceExcludePath() {
        return this.datasourceExcludePath;
    }

    public CreateMetastoreCrawlerRequest setDatasourcePath(String datasourcePath) {
        this.datasourcePath = datasourcePath;
        return this;
    }
    public String getDatasourcePath() {
        return this.datasourcePath;
    }

    public CreateMetastoreCrawlerRequest setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }
    public String getDatasourceType() {
        return this.datasourceType;
    }

    public CreateMetastoreCrawlerRequest setExecuteCron(String executeCron) {
        this.executeCron = executeCron;
        return this;
    }
    public String getExecuteCron() {
        return this.executeCron;
    }

    public CreateMetastoreCrawlerRequest setExecuteMode(String executeMode) {
        this.executeMode = executeMode;
        return this;
    }
    public String getExecuteMode() {
        return this.executeMode;
    }

    public CreateMetastoreCrawlerRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public CreateMetastoreCrawlerRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public CreateMetastoreCrawlerRequest setFileFormatConfig(String fileFormatConfig) {
        this.fileFormatConfig = fileFormatConfig;
        return this;
    }
    public String getFileFormatConfig() {
        return this.fileFormatConfig;
    }

    public CreateMetastoreCrawlerRequest setImmediatelyRun(Boolean immediatelyRun) {
        this.immediatelyRun = immediatelyRun;
        return this;
    }
    public Boolean getImmediatelyRun() {
        return this.immediatelyRun;
    }

    public CreateMetastoreCrawlerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMetastoreCrawlerRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateMetastoreCrawlerRequest setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }
    public String getTargetDatabase() {
        return this.targetDatabase;
    }

    public CreateMetastoreCrawlerRequest setTargetTablePrefix(String targetTablePrefix) {
        this.targetTablePrefix = targetTablePrefix;
        return this;
    }
    public String getTargetTablePrefix() {
        return this.targetTablePrefix;
    }

    public CreateMetastoreCrawlerRequest setTargetUpdateStrategy(String targetUpdateStrategy) {
        this.targetUpdateStrategy = targetUpdateStrategy;
        return this;
    }
    public String getTargetUpdateStrategy() {
        return this.targetUpdateStrategy;
    }

}
