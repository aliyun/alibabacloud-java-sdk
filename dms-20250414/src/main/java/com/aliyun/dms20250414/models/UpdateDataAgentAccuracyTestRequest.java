// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class UpdateDataAgentAccuracyTestRequest extends TeaModel {
    /**
     * <p>The accuracy test instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestInsId")
    public String accuracyTestInsId;

    /**
     * <p>The new custom agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-xxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("CustomerAgentId")
    public String customerAgentId;

    /**
     * <p>The data source.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;DataSourceType\&quot;:\&quot;database\&quot;,\&quot;RegionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;DmsInstanceId\&quot;:\&quot;27xxxxx\&quot;,\&quot;DmsDatabaseId\&quot;:\&quot;752xxxxx\&quot;,\&quot;Database\&quot;:\&quot;employees\&quot;,\&quot;Tables\&quot;:[\&quot;employees\&quot;,\&quot;salaries\&quot;,\&quot;departments\&quot;]}]</p>
     */
    @NameInMap("Dataset")
    public String dataset;

    @NameInMap("Datasource")
    public String datasource;

    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The current Data Management unit.</p>
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
     * <p>f-8*******01m</p>
     */
    @NameInMap("FileId")
    public String fileId;

    /**
     * <p>The maximum number of concurrent sessions during the test.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MaxConcurrent")
    public Integer maxConcurrent;

    /**
     * <p>The analysis mode to be tested.</p>
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
     * <p>test123</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Specifies whether sessions are displayed after analysis. This parameter is not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>no use</p>
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
     * <p>8wfig6l33n4f4xxxxxxxxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static UpdateDataAgentAccuracyTestRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataAgentAccuracyTestRequest self = new UpdateDataAgentAccuracyTestRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataAgentAccuracyTestRequest setAccuracyTestInsId(String accuracyTestInsId) {
        this.accuracyTestInsId = accuracyTestInsId;
        return this;
    }
    public String getAccuracyTestInsId() {
        return this.accuracyTestInsId;
    }

    public UpdateDataAgentAccuracyTestRequest setCustomerAgentId(String customerAgentId) {
        this.customerAgentId = customerAgentId;
        return this;
    }
    public String getCustomerAgentId() {
        return this.customerAgentId;
    }

    public UpdateDataAgentAccuracyTestRequest setDataset(String dataset) {
        this.dataset = dataset;
        return this;
    }
    public String getDataset() {
        return this.dataset;
    }

    public UpdateDataAgentAccuracyTestRequest setDatasource(String datasource) {
        this.datasource = datasource;
        return this;
    }
    public String getDatasource() {
        return this.datasource;
    }

    public UpdateDataAgentAccuracyTestRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateDataAgentAccuracyTestRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public UpdateDataAgentAccuracyTestRequest setEvaluationPrompt(String evaluationPrompt) {
        this.evaluationPrompt = evaluationPrompt;
        return this;
    }
    public String getEvaluationPrompt() {
        return this.evaluationPrompt;
    }

    public UpdateDataAgentAccuracyTestRequest setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }
    public String getFileId() {
        return this.fileId;
    }

    public UpdateDataAgentAccuracyTestRequest setMaxConcurrent(Integer maxConcurrent) {
        this.maxConcurrent = maxConcurrent;
        return this;
    }
    public Integer getMaxConcurrent() {
        return this.maxConcurrent;
    }

    public UpdateDataAgentAccuracyTestRequest setMode(Integer mode) {
        this.mode = mode;
        return this;
    }
    public Integer getMode() {
        return this.mode;
    }

    public UpdateDataAgentAccuracyTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateDataAgentAccuracyTestRequest setNeedDelete(Boolean needDelete) {
        this.needDelete = needDelete;
        return this;
    }
    public Boolean getNeedDelete() {
        return this.needDelete;
    }

    public UpdateDataAgentAccuracyTestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataAgentAccuracyTestRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
