// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateRealTimeProcessRequest extends TeaModel {
    @NameInMap("AutoAddTable")
    public String autoAddTable;

    @NameInMap("ClearBoundVpcs")
    public Boolean clearBoundVpcs;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Concurrent")
    public Integer concurrent;

    @NameInMap("CreateDstTableIfNotExist")
    public Boolean createDstTableIfNotExist;

    @NameInMap("CreateResGroup")
    public Boolean createResGroup;

    @NameInMap("DataSource")
    public String dataSource;

    @NameInMap("DataworksVersion")
    public String dataworksVersion;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("ReadSetting")
    public String readSetting;

    @NameInMap("ResGroupIdentifier")
    public String resGroupIdentifier;

    @NameInMap("ResourceSpec")
    public String resourceSpec;

    @NameInMap("TableRule")
    public String tableRule;

    @NameInMap("Tables")
    public String tables;

    @NameInMap("TaskMode")
    public String taskMode;

    @NameInMap("UseExistResGroup")
    public Boolean useExistResGroup;

    @NameInMap("WriteSetting")
    public String writeSetting;

    public static CreateRealTimeProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRealTimeProcessRequest self = new CreateRealTimeProcessRequest();
        return TeaModel.build(map, self);
    }

    public CreateRealTimeProcessRequest setAutoAddTable(String autoAddTable) {
        this.autoAddTable = autoAddTable;
        return this;
    }
    public String getAutoAddTable() {
        return this.autoAddTable;
    }

    public CreateRealTimeProcessRequest setClearBoundVpcs(Boolean clearBoundVpcs) {
        this.clearBoundVpcs = clearBoundVpcs;
        return this;
    }
    public Boolean getClearBoundVpcs() {
        return this.clearBoundVpcs;
    }

    public CreateRealTimeProcessRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRealTimeProcessRequest setConcurrent(Integer concurrent) {
        this.concurrent = concurrent;
        return this;
    }
    public Integer getConcurrent() {
        return this.concurrent;
    }

    public CreateRealTimeProcessRequest setCreateDstTableIfNotExist(Boolean createDstTableIfNotExist) {
        this.createDstTableIfNotExist = createDstTableIfNotExist;
        return this;
    }
    public Boolean getCreateDstTableIfNotExist() {
        return this.createDstTableIfNotExist;
    }

    public CreateRealTimeProcessRequest setCreateResGroup(Boolean createResGroup) {
        this.createResGroup = createResGroup;
        return this;
    }
    public Boolean getCreateResGroup() {
        return this.createResGroup;
    }

    public CreateRealTimeProcessRequest setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }
    public String getDataSource() {
        return this.dataSource;
    }

    public CreateRealTimeProcessRequest setDataworksVersion(String dataworksVersion) {
        this.dataworksVersion = dataworksVersion;
        return this;
    }
    public String getDataworksVersion() {
        return this.dataworksVersion;
    }

    public CreateRealTimeProcessRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public CreateRealTimeProcessRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public CreateRealTimeProcessRequest setReadSetting(String readSetting) {
        this.readSetting = readSetting;
        return this;
    }
    public String getReadSetting() {
        return this.readSetting;
    }

    public CreateRealTimeProcessRequest setResGroupIdentifier(String resGroupIdentifier) {
        this.resGroupIdentifier = resGroupIdentifier;
        return this;
    }
    public String getResGroupIdentifier() {
        return this.resGroupIdentifier;
    }

    public CreateRealTimeProcessRequest setResourceSpec(String resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public String getResourceSpec() {
        return this.resourceSpec;
    }

    public CreateRealTimeProcessRequest setTableRule(String tableRule) {
        this.tableRule = tableRule;
        return this;
    }
    public String getTableRule() {
        return this.tableRule;
    }

    public CreateRealTimeProcessRequest setTables(String tables) {
        this.tables = tables;
        return this;
    }
    public String getTables() {
        return this.tables;
    }

    public CreateRealTimeProcessRequest setTaskMode(String taskMode) {
        this.taskMode = taskMode;
        return this;
    }
    public String getTaskMode() {
        return this.taskMode;
    }

    public CreateRealTimeProcessRequest setUseExistResGroup(Boolean useExistResGroup) {
        this.useExistResGroup = useExistResGroup;
        return this;
    }
    public Boolean getUseExistResGroup() {
        return this.useExistResGroup;
    }

    public CreateRealTimeProcessRequest setWriteSetting(String writeSetting) {
        this.writeSetting = writeSetting;
        return this;
    }
    public String getWriteSetting() {
        return this.writeSetting;
    }

}
