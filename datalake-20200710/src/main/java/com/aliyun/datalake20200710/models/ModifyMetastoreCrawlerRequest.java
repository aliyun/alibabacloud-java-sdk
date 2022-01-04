// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ModifyMetastoreCrawlerRequest extends TeaModel {
    @NameInMap("DatasourceExcludePath")
    public String datasourceExcludePath;

    @NameInMap("ExecuteCron")
    public String executeCron;

    @NameInMap("ExecuteType")
    public String executeType;

    @NameInMap("FileFormat")
    public String fileFormat;

    @NameInMap("FileFormatConfig")
    public String fileFormatConfig;

    @NameInMap("Id")
    public String id;

    @NameInMap("ImmediatelyRun")
    public Boolean immediatelyRun;

    @NameInMap("Name")
    public String name;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("TargetUpdateStrategy")
    public String targetUpdateStrategy;

    public static ModifyMetastoreCrawlerRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyMetastoreCrawlerRequest self = new ModifyMetastoreCrawlerRequest();
        return TeaModel.build(map, self);
    }

    public ModifyMetastoreCrawlerRequest setDatasourceExcludePath(String datasourceExcludePath) {
        this.datasourceExcludePath = datasourceExcludePath;
        return this;
    }
    public String getDatasourceExcludePath() {
        return this.datasourceExcludePath;
    }

    public ModifyMetastoreCrawlerRequest setExecuteCron(String executeCron) {
        this.executeCron = executeCron;
        return this;
    }
    public String getExecuteCron() {
        return this.executeCron;
    }

    public ModifyMetastoreCrawlerRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public ModifyMetastoreCrawlerRequest setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
        return this;
    }
    public String getFileFormat() {
        return this.fileFormat;
    }

    public ModifyMetastoreCrawlerRequest setFileFormatConfig(String fileFormatConfig) {
        this.fileFormatConfig = fileFormatConfig;
        return this;
    }
    public String getFileFormatConfig() {
        return this.fileFormatConfig;
    }

    public ModifyMetastoreCrawlerRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyMetastoreCrawlerRequest setImmediatelyRun(Boolean immediatelyRun) {
        this.immediatelyRun = immediatelyRun;
        return this;
    }
    public Boolean getImmediatelyRun() {
        return this.immediatelyRun;
    }

    public ModifyMetastoreCrawlerRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyMetastoreCrawlerRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public ModifyMetastoreCrawlerRequest setTargetUpdateStrategy(String targetUpdateStrategy) {
        this.targetUpdateStrategy = targetUpdateStrategy;
        return this;
    }
    public String getTargetUpdateStrategy() {
        return this.targetUpdateStrategy;
    }

}
