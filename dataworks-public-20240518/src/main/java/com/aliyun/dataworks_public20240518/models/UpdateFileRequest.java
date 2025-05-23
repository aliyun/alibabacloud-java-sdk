// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class UpdateFileRequest extends TeaModel {
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
     * <p>SELECT &quot;1&quot;;</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>00 00-59/5 1-23 * * ?</p>
     */
    @NameInMap("CronExpress")
    public String cronExpress;

    /**
     * <strong>example:</strong>
     * <p>NOT_DAY</p>
     */
    @NameInMap("CycleType")
    public String cycleType;

    /**
     * <strong>example:</strong>
     * <p>5,10,15,20</p>
     */
    @NameInMap("DependentNodeIdList")
    public String dependentNodeIdList;

    /**
     * <strong>example:</strong>
     * <p>USER_DEFINE</p>
     */
    @NameInMap("DependentType")
    public String dependentType;

    /**
     * <strong>example:</strong>
     * <p>4155787800000</p>
     */
    @NameInMap("EndEffectDate")
    public Long endEffectDate;

    /**
     * <strong>example:</strong>
     * <p>Here is the file description</p>
     */
    @NameInMap("FileDescription")
    public String fileDescription;

    /**
     * <strong>example:</strong>
     * <p>Business_process/First_Business_Process/data_integration/Folder_1/Folder_2</p>
     */
    @NameInMap("FileFolderPath")
    public String fileFolderPath;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000001</p>
     */
    @NameInMap("FileId")
    public Long fileId;

    /**
     * <strong>example:</strong>
     * <p>ods_user_info_d</p>
     */
    @NameInMap("FileName")
    public String fileName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IgnoreParentSkipRunningProperty")
    public Boolean ignoreParentSkipRunningProperty;

    /**
     * <strong>example:</strong>
     * <p>m-uf6d7npxk1hhek8ng0cb</p>
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
     * <p>dw_project.ods_user_info_d</p>
     */
    @NameInMap("OutputList")
    public String outputList;

    /**
     * <strong>example:</strong>
     * <p>[{&quot;Type&quot;: 1,&quot;Value&quot;: &quot;${bizdate}&quot;,&quot;ParameterName&quot;: &quot;bizdate_param&quot;}]</p>
     */
    @NameInMap("OutputParameters")
    public String outputParameters;

    /**
     * <strong>example:</strong>
     * <p>18023848927592</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>x=a y=b z=c</p>
     */
    @NameInMap("ParaValue")
    public String paraValue;

    /**
     * <strong>example:</strong>
     * <p>100001</p>
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
     * <p>default_group</p>
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
     * <p>936923400000</p>
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

    public static UpdateFileRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFileRequest self = new UpdateFileRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFileRequest setAdvancedSettings(String advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }
    public String getAdvancedSettings() {
        return this.advancedSettings;
    }

    public UpdateFileRequest setApplyScheduleImmediately(Boolean applyScheduleImmediately) {
        this.applyScheduleImmediately = applyScheduleImmediately;
        return this;
    }
    public Boolean getApplyScheduleImmediately() {
        return this.applyScheduleImmediately;
    }

    public UpdateFileRequest setAutoParsing(Boolean autoParsing) {
        this.autoParsing = autoParsing;
        return this;
    }
    public Boolean getAutoParsing() {
        return this.autoParsing;
    }

    public UpdateFileRequest setAutoRerunIntervalMillis(Integer autoRerunIntervalMillis) {
        this.autoRerunIntervalMillis = autoRerunIntervalMillis;
        return this;
    }
    public Integer getAutoRerunIntervalMillis() {
        return this.autoRerunIntervalMillis;
    }

    public UpdateFileRequest setAutoRerunTimes(Integer autoRerunTimes) {
        this.autoRerunTimes = autoRerunTimes;
        return this;
    }
    public Integer getAutoRerunTimes() {
        return this.autoRerunTimes;
    }

    public UpdateFileRequest setConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }
    public String getConnectionName() {
        return this.connectionName;
    }

    public UpdateFileRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateFileRequest setCronExpress(String cronExpress) {
        this.cronExpress = cronExpress;
        return this;
    }
    public String getCronExpress() {
        return this.cronExpress;
    }

    public UpdateFileRequest setCycleType(String cycleType) {
        this.cycleType = cycleType;
        return this;
    }
    public String getCycleType() {
        return this.cycleType;
    }

    public UpdateFileRequest setDependentNodeIdList(String dependentNodeIdList) {
        this.dependentNodeIdList = dependentNodeIdList;
        return this;
    }
    public String getDependentNodeIdList() {
        return this.dependentNodeIdList;
    }

    public UpdateFileRequest setDependentType(String dependentType) {
        this.dependentType = dependentType;
        return this;
    }
    public String getDependentType() {
        return this.dependentType;
    }

    public UpdateFileRequest setEndEffectDate(Long endEffectDate) {
        this.endEffectDate = endEffectDate;
        return this;
    }
    public Long getEndEffectDate() {
        return this.endEffectDate;
    }

    public UpdateFileRequest setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
        return this;
    }
    public String getFileDescription() {
        return this.fileDescription;
    }

    public UpdateFileRequest setFileFolderPath(String fileFolderPath) {
        this.fileFolderPath = fileFolderPath;
        return this;
    }
    public String getFileFolderPath() {
        return this.fileFolderPath;
    }

    public UpdateFileRequest setFileId(Long fileId) {
        this.fileId = fileId;
        return this;
    }
    public Long getFileId() {
        return this.fileId;
    }

    public UpdateFileRequest setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    public String getFileName() {
        return this.fileName;
    }

    public UpdateFileRequest setIgnoreParentSkipRunningProperty(Boolean ignoreParentSkipRunningProperty) {
        this.ignoreParentSkipRunningProperty = ignoreParentSkipRunningProperty;
        return this;
    }
    public Boolean getIgnoreParentSkipRunningProperty() {
        return this.ignoreParentSkipRunningProperty;
    }

    public UpdateFileRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UpdateFileRequest setInputList(String inputList) {
        this.inputList = inputList;
        return this;
    }
    public String getInputList() {
        return this.inputList;
    }

    public UpdateFileRequest setInputParameters(String inputParameters) {
        this.inputParameters = inputParameters;
        return this;
    }
    public String getInputParameters() {
        return this.inputParameters;
    }

    public UpdateFileRequest setOutputList(String outputList) {
        this.outputList = outputList;
        return this;
    }
    public String getOutputList() {
        return this.outputList;
    }

    public UpdateFileRequest setOutputParameters(String outputParameters) {
        this.outputParameters = outputParameters;
        return this;
    }
    public String getOutputParameters() {
        return this.outputParameters;
    }

    public UpdateFileRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public UpdateFileRequest setParaValue(String paraValue) {
        this.paraValue = paraValue;
        return this;
    }
    public String getParaValue() {
        return this.paraValue;
    }

    public UpdateFileRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public UpdateFileRequest setProjectIdentifier(String projectIdentifier) {
        this.projectIdentifier = projectIdentifier;
        return this;
    }
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    public UpdateFileRequest setRerunMode(String rerunMode) {
        this.rerunMode = rerunMode;
        return this;
    }
    public String getRerunMode() {
        return this.rerunMode;
    }

    public UpdateFileRequest setResourceGroupIdentifier(String resourceGroupIdentifier) {
        this.resourceGroupIdentifier = resourceGroupIdentifier;
        return this;
    }
    public String getResourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }

    public UpdateFileRequest setSchedulerType(String schedulerType) {
        this.schedulerType = schedulerType;
        return this;
    }
    public String getSchedulerType() {
        return this.schedulerType;
    }

    public UpdateFileRequest setStartEffectDate(Long startEffectDate) {
        this.startEffectDate = startEffectDate;
        return this;
    }
    public Long getStartEffectDate() {
        return this.startEffectDate;
    }

    public UpdateFileRequest setStartImmediately(Boolean startImmediately) {
        this.startImmediately = startImmediately;
        return this;
    }
    public Boolean getStartImmediately() {
        return this.startImmediately;
    }

    public UpdateFileRequest setStop(Boolean stop) {
        this.stop = stop;
        return this;
    }
    public Boolean getStop() {
        return this.stop;
    }

    public UpdateFileRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

}
