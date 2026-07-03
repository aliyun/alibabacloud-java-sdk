// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateDataAgentAccuracyTestRequest extends TeaModel {
    /**
     * <p>The ID of the custom agent for which you want to run the accuracy test.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("CustomAgentId")
    public String customAgentId;

    /**
     * <p>The data source. We recommend that you configure this in the custom agent.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;DataSourceType\&quot;:\&quot;database\&quot;,\&quot;RegionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;DmsInstanceId\&quot;:\&quot;27xxx49\&quot;,\&quot;DmsDatabaseId\&quot;:\&quot;75xxx6\&quot;,\&quot;Database\&quot;:\&quot;employees\&quot;,\&quot;Tables\&quot;:[\&quot;employees\&quot;,\&quot;salaries\&quot;,\&quot;departments\&quot;]}]</p>
     */
    @NameInMap("Dataset")
    public String dataset;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The DMS unit used to create the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

    /**
     * <p>The accuracy evaluation criteria. An empty value indicates the default criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("EvaluationPrompt")
    public String evaluationPrompt;

    /**
     * <p>The file ID in the data center.</p>
     * 
     * <strong>example:</strong>
     * <p>f-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The language used for the analysis task.</p>
     * 
     * <strong>example:</strong>
     * <p>ENGLISH</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The maximum number of concurrent sessions during the test.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxConcurrent")
    public Integer maxConcurrent;

    /**
     * <p>The analysis mode.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Mode")
    public Integer mode;

    /**
     * <p>The name of the test item.</p>
     * 
     * <strong>example:</strong>
     * <p>Test01</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether sessions are displayed after the analysis. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("NeedDelete")
    public Boolean needDelete;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateDataAgentAccuracyTestRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataAgentAccuracyTestRequest self = new CreateDataAgentAccuracyTestRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataAgentAccuracyTestRequest setCustomAgentId(String customAgentId) {
        this.customAgentId = customAgentId;
        return this;
    }
    public String getCustomAgentId() {
        return this.customAgentId;
    }

    public CreateDataAgentAccuracyTestRequest setDataset(String dataset) {
        this.dataset = dataset;
        return this;
    }
    public String getDataset() {
        return this.dataset;
    }

    public CreateDataAgentAccuracyTestRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateDataAgentAccuracyTestRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public CreateDataAgentAccuracyTestRequest setEvaluationPrompt(String evaluationPrompt) {
        this.evaluationPrompt = evaluationPrompt;
        return this;
    }
    public String getEvaluationPrompt() {
        return this.evaluationPrompt;
    }

    public CreateDataAgentAccuracyTestRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public CreateDataAgentAccuracyTestRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public CreateDataAgentAccuracyTestRequest setMaxConcurrent(Integer maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
        return this;
    }
    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }

    public CreateDataAgentAccuracyTestRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public CreateDataAgentAccuracyTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateDataAgentAccuracyTestRequest setNeedDelete(Boolean needDelete) {
        this.needDelete = needDelete;
        return this;
    }
    public Boolean getNeedDelete() {
        return this.needDelete;
    }

    public CreateDataAgentAccuracyTestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataAgentAccuracyTestRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
