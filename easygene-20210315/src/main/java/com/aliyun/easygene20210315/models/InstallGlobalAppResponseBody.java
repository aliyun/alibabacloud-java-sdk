// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class InstallGlobalAppResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>InstalledApp</p>
     */
    @NameInMap("InstalledAppName")
    public String installedAppName;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>TestWorkspace</p>
     */
    @NameInMap("Workspace")
    public String workspace;

    public static InstallGlobalAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InstallGlobalAppResponseBody self = new InstallGlobalAppResponseBody();
        return TeaModel.build(map, self);
    }

    public InstallGlobalAppResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public InstallGlobalAppResponseBody setInstalledAppName(String installedAppName) {
        this.installedAppName = installedAppName;
        return this;
    }
    public String getInstalledAppName() {
        return this.installedAppName;
    }

    public InstallGlobalAppResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public InstallGlobalAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallGlobalAppResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
