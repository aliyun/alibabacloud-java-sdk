// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    @NameInMap("ConnectionName")
    public String connectionName;

    @NameInMap("Content")
    public String content;

    @NameInMap("CronExpress")
    public String cronExpress;

    @NameInMap("CycleType")
    public String cycleType;

    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    @NameInMap("DependentType")
    public String dependentType;

    @NameInMap("EndEffectDate")
    public Long endEffectDate;

    @NameInMap("FileDescription")
    public String fileDescription;

    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    @NameInMap("FileName")
    public String fileName;

    @NameInMap("FileType")
    public Integer fileType;

    @NameInMap("InputList")
    public String inputList;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ParaValue")
    public String paraValue;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    @NameInMap("RerunMode")
    public String rerunMode;

    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    @NameInMap("SchedulerType")
    public String schedulerType;

    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    @NameInMap("Stop")
    public Boolean stop;

    public static CreateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileRequest self = new CreateFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileRequest setAutoParsing(Boolean autoParsing) {
        this.autoParsing = autoParsing;
        return this;
    }
    public Boolean getAutoParsing() {
        return this.autoParsing;
    }

    public CreateFileRequest setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
        this.autoRerunIntervalMillis = autoRerunIntervalMillis;
        return this;
    }
    public Integer getAutoRerunIntervalMillis() {
        return this.autoRerunIntervalMillis;
    }

    public CreateFileRequest setAutoRerunTimes(Integer autoRerunTimes) {
        this.autoRerunTimes = autoRerunTimes;
        return this;
    }
    public Integer getAutoRerunTimes() {
        return this.autoRerunTimes;
    }

    public CreateFileRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public CreateFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateFileRequest setCronExpress(String cronExpress) {
        this.cronExpress = cronExpress;
        return this;
    }
    public String getCronExpress() {
        return this.cronExpress;
    }

    public CreateFileRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public CreateFileRequest setDependentNodeIdList(String dependentNodeIdList) {
        this.dependentNodeIdList = dependentNodeIdList;
        return this;
    }
    public String getDependentNodeIdList() {
        return this.dependentNodeIdList;
    }

    public CreateFileRequest setDependentType(String dependentType) {
        this.dependentType = dependentType;
        return this;
    }
    public String getDependentType() {
        return this.dependentType;
    }

    public CreateFileRequest setEndEffectDate(Long endEffectDate) {
        this.endEffectDate = endEffectDate;
        return this;
    }
    public Long getEndEffectDate() {
        return this.endEffectDate;
    }

    public CreateFileRequest setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }
    public String getFileDescription() {
        return this.fileDescription;
    }

    public CreateFileRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public CreateFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public CreateFileRequest setFileType(Integer fileType) {
        this.fileType = fileType;
        return this;
    }
    public Integer getFileType() {
        return this.fileType;
    }

    public CreateFileRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public CreateFileRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public CreateFileRequest setParaValue(String paraValue) {
        this.paraValue = paraValue;
        return this;
    }
    public String getParaValue() {
        return this.paraValue;
    }

    public CreateFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public CreateFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public CreateFileRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public CreateFileRequest setResourceGroupId(Long resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public Long getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFileRequest setResourceGroupIdentifier(String resourceGroupIdentifier) {
        this.resourceGroupIdentifier = resourceGroupIdentifier;
        return this;
    }
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    public CreateFileRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public CreateFileRequest setStartEffectDate(Long startEffectDate) {
        this.startEffectDate = startEffectDate;
        return this;
    }
    public Long getStartEffectDate() {
        return this.startEffectDate;
    }

    public CreateFileRequest setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }
    public Boolean getStop() {
        return this.stop;
    }

}
