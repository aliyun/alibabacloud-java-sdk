// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class StartDataAgentAccuracyTestTaskRequest extends TeaModel {
    /**
     * <p>The accuracy test instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestInsId")
    public String accuracyTestInsId;

    /**
     * <p>The accuracy test sample file.</p>
     * 
     * <strong>example:</strong>
     * <p>包含问题、答案[、SQL]的文件</p>
     */
    @NameInMap("CsvFile")
    public String csvFile;

    /**
     * <p>The DMS unit used to create the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DmsUnit")
    public String dmsUnit;

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

    public static StartDataAgentAccuracyTestTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDataAgentAccuracyTestTaskRequest self = new StartDataAgentAccuracyTestTaskRequest();
        return TeaModel.build(map, self);
    }

    public StartDataAgentAccuracyTestTaskRequest setAccuracyTestInsId(String accuracyTestInsId) {
        this.accuracyTestInsId = accuracyTestInsId;
        return this;
    }
    public String getAccuracyTestInsId() {
        return this.accuracyTestInsId;
    }

    public StartDataAgentAccuracyTestTaskRequest setCsvFile(String csvFile) {
        this.csvFile = csvFile;
        return this;
    }
    public String getCsvFile() {
        return this.csvFile;
    }

    public StartDataAgentAccuracyTestTaskRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public StartDataAgentAccuracyTestTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartDataAgentAccuracyTestTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
