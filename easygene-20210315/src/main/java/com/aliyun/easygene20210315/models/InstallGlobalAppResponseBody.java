// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class InstallGlobalAppResponseBody extends TeaModel {
    // 主机 ID
    @NameInMap("HostId")
    public String hostId;

    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    // 安装后应用名
    @NameInMap("InstalledAppName")
    public String installedAppName;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    // 区域名
    @NameInMap("RegionId")
    public String regionId;

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

    public InstallGlobalAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InstallGlobalAppResponseBody setInstalledAppName(String installedAppName) {
        this.installedAppName = installedAppName;
        return this;
    }
    public String getInstalledAppName() {
        return this.installedAppName;
    }

    public InstallGlobalAppResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public InstallGlobalAppResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
