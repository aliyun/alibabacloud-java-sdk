// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentAccuracyTestRequest extends TeaModel {
    /**
     * <p>The accuracy test instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>at-106n4rg17gv9fxxxxxxxxxx</p>
     */
    @NameInMap("AccuracyTestInsId")
    public String accuracyTestInsId;

    /**
     * <p>The current DMS unit.</p>
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

    public static DeleteDataAgentAccuracyTestRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentAccuracyTestRequest self = new DeleteDataAgentAccuracyTestRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentAccuracyTestRequest setAccuracyTestInsId(String accuracyTestInsId) {
        this.accuracyTestInsId = accuracyTestInsId;
        return this;
    }
    public String getAccuracyTestInsId() {
        return this.accuracyTestInsId;
    }

    public DeleteDataAgentAccuracyTestRequest setDmsUnit(String dmsUnit) {
        this.dmsUnit = dmsUnit;
        return this;
    }
    public String getDmsUnit() {
        return this.dmsUnit;
    }

    public DeleteDataAgentAccuracyTestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteDataAgentAccuracyTestRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
