// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetRumAppInfoRequest extends TeaModel {
    /**
     * <p>The group to which the application belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("AppGroup")
    public String appGroup;

    /**
     * <p>The process ID (PID) of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>atc889zkcf@d8deedfa9bf****</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Workspace")
    public String workspace;

    public static GetRumAppInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRumAppInfoRequest self = new GetRumAppInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetRumAppInfoRequest setAppGroup(String appGroup) {
        this.appGroup = appGroup;
        return this;
    }
    public String getAppGroup() {
        return this.appGroup;
    }

    public GetRumAppInfoRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public GetRumAppInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetRumAppInfoRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
