// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateFileRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;queue&quot;:&quot;default&quot;,&quot;SPARK_CONF&quot;:&quot;--conf spark.driver.memory=2g&quot;}</p>
     */
    @NameInMap("AdvancedSettings")
    public String advancedSettings;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ApplyScheduleImmediately")
    public Boolean applyScheduleImmediately;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoParsing")
    public Boolean autoParsing;

    /**
     * <strong>example:</strong>
     * <p>120000</p>
     */
    @NameInMap("AutoRerunIntervalMillis")
    public Integer autoRerunIntervalMillis;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("AutoRerunTimes")
    public Integer autoRerunTimes;

    /**
     * <strong>example:</strong>
     * <p>odps_source</p>
     */
    @NameInMap("ConnectionName")
    public String connectionName;

    /**
     * <strong>example:</strong>
     * <p>SHOW TABLES;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateFolderIfNotExists")
    public Boolean createFolderIfNotExists;

    /**
     * <strong>example:</strong>
     * <p>00 05 00 * * ?</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <strong>example:</strong>
     * <p>1671694850000</p>
     */
    @NameInMap("EndEffectDate")
    public Long endEffectDate;

    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <strong>example:</strong>
     * <p>Business_process/First_Business_Process/MaxCompute/Folder_1/Folder_2</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>File name</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("FileType")
    public Integer fileType;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IgnoreParentSkipRunningProperty")
    public Boolean ignoreParentSkipRunningProperty;

    /**
     * <strong>example:</strong>
     * <p>m-bp1h4b5a8ogkbll2f3tr</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>project_root,project.file1,project.001_out</p>
     */
    @NameInMap("InputList")
    public String inputList;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;ValueSource&quot;: &quot;project_001.first_node:bizdate_param&quot;,&quot;ParameterName&quot;: &quot;bizdate_input&quot;}]</p>
     */
    @NameInMap("InputParameters")
    public String inputParameters;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;Type&quot;: 1,&quot;Value&quot;: &quot;${bizdate}&quot;,&quot;ParameterName&quot;: &quot;bizdate_param&quot;}]</p>
     */
    @NameInMap("OutputParameters")
    public String outputParameters;

    /**
     * <strong>example:</strong>
     * <p>1000000000001</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>a=x b=y</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <strong>example:</strong>
     * <p>dw_project</p>
     */
    @NameInMap("ProjectIdentifier")
    public String projectIdentifier;

    /**
     * <strong>example:</strong>
     * <p>ALL_ALLOWED</p>
     */
    @NameInMap("RerunMode")
    public String rerunMode;

    /**
     * <strong>example:</strong>
     * <p>375827434852437</p>
     */
    @NameInMap("ResourceGroupId")
    public Long resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>S_res_group_559_1613715566828</p>
     */
    @NameInMap("ResourceGroupIdentifier")
    public String resourceGroupIdentifier;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("SchedulerType")
    public String schedulerType;

    /**
     * <strong>example:</strong>
     * <p>1671608450000</p>
     */
    @NameInMap("StartEffectDate")
    public Long startEffectDate;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("StartImmediately")
    public Boolean startImmediately;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Stop")
    public Boolean stop;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Timeout")
    public Integer timeout;

    public static CreateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileRequest self = new CreateFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileRequest setAdvancedSettings(String advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }
    public String getAdvancedSettings() {
        return this.advancedSettings;
    }

    public CreateFileRequest setApplyScheduleImmediately(Boolean applyScheduleImmediately) {
        this.applyScheduleImmediately = applyScheduleImmediately;
        return this;
    }
    public Boolean getApplyScheduleImmediately() {
        return this.applyScheduleImmediately;
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

    public CreateFileRequest setCreateFolderIfNotExists(Boolean createFolderIfNotExists) {
        this.createFolderIfNotExists = createFolderIfNotExists;
        return this;
    }
    public Boolean getCreateFolderIfNotExists() {
        return this.createFolderIfNotExists;
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

    public CreateFileRequest setIgnoreParentSkipRunningProperty(Boolean ignoreParentSkipRunningProperty) {
        this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
        return this;
    }
    public Boolean getIgnoreParentSkipRunningProperty() {
        return this.ignoreParentSkipRunningProperty;
    }

    public CreateFileRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateFileRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public CreateFileRequest setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }
    public String getInputParameters() {
        return this.inputParameters;
    }

    public CreateFileRequest setOutputParameters(String outputParameters) {
        this.outputParameters = outputParameters;
        return this;
    }
    public String getOutputParameters() {
        return this.outputParameters;
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

    public CreateFileRequest setStartImmediately(Boolean startImmediately) {
        this.startImmediately = startImmediately;
        return this;
    }
    public Boolean getStartImmediately() {
        return this.startImmediately;
    }

    public CreateFileRequest setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }
    public Boolean getStop() {
        return this.stop;
    }

    public CreateFileRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
