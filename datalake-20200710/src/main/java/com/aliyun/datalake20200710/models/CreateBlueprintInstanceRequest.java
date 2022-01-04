// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateBlueprintInstanceRequest extends TeaModel {
    @NameInMap("BlueprintType")
    public String blueprintType;

    @NameInMap("DataSourceConfig")
    public String dataSourceConfig;

    @NameInMap("ExecuteCapacity")
    public String executeCapacity;

    @NameInMap("ExecuteParameters")
    public String executeParameters;

    @NameInMap("ExecuteType")
    public String executeType;

    @NameInMap("Name")
    public String name;

    @NameInMap("PreProcessingConfig")
    public String preProcessingConfig;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("TargetDatabase")
    public String targetDatabase;

    @NameInMap("TargetFormat")
    public String targetFormat;

    @NameInMap("TargetLocationUri")
    public String targetLocationUri;

    @NameInMap("TargetPartitions")
    public String targetPartitions;

    @NameInMap("TargetTable")
    public String targetTable;

    public static CreateBlueprintInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBlueprintInstanceRequest self = new CreateBlueprintInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateBlueprintInstanceRequest setBlueprintType(String blueprintType) {
        this.blueprintType = blueprintType;
        return this;
    }
    public String getBlueprintType() {
        return this.blueprintType;
    }

    public CreateBlueprintInstanceRequest setDataSourceConfig(String dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
        return this;
    }
    public String getDataSourceConfig() {
        return this.dataSourceConfig;
    }

    public CreateBlueprintInstanceRequest setExecuteCapacity(String executeCapacity) {
        this.executeCapacity = executeCapacity;
        return this;
    }
    public String getExecuteCapacity() {
        return this.executeCapacity;
    }

    public CreateBlueprintInstanceRequest setExecuteParameters(String executeParameters) {
        this.executeParameters = executeParameters;
        return this;
    }
    public String getExecuteParameters() {
        return this.executeParameters;
    }

    public CreateBlueprintInstanceRequest setExecuteType(String executeType) {
        this.executeType = executeType;
        return this;
    }
    public String getExecuteType() {
        return this.executeType;
    }

    public CreateBlueprintInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateBlueprintInstanceRequest setPreProcessingConfig(String preProcessingConfig) {
        this.preProcessingConfig = preProcessingConfig;
        return this;
    }
    public String getPreProcessingConfig() {
        return this.preProcessingConfig;
    }

    public CreateBlueprintInstanceRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateBlueprintInstanceRequest setTargetDatabase(String targetDatabase) {
        this.targetDatabase = targetDatabase;
        return this;
    }
    public String getTargetDatabase() {
        return this.targetDatabase;
    }

    public CreateBlueprintInstanceRequest setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
        return this;
    }
    public String getTargetFormat() {
        return this.targetFormat;
    }

    public CreateBlueprintInstanceRequest setTargetLocationUri(String targetLocationUri) {
        this.targetLocationUri = targetLocationUri;
        return this;
    }
    public String getTargetLocationUri() {
        return this.targetLocationUri;
    }

    public CreateBlueprintInstanceRequest setTargetPartitions(String targetPartitions) {
        this.targetPartitions = targetPartitions;
        return this;
    }
    public String getTargetPartitions() {
        return this.targetPartitions;
    }

    public CreateBlueprintInstanceRequest setTargetTable(String targetTable) {
        this.targetTable = targetTable;
        return this;
    }
    public String getTargetTable() {
        return this.targetTable;
    }

}
