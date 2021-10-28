// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ImportAppResponseBody extends TeaModel {
    // 安装后应用名
    @NameInMap("AppName")
    public String appName;

    // 主机 ID
    @NameInMap("HostId")
    public String hostId;

    // 区域名
    @NameInMap("RegionId")
    public String regionId;

    // 请求 ID
    @NameInMap("RequestId")
    public String requestId;

    // 工作空间
    @NameInMap("Workspace")
    public String workspace;

    public static ImportAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportAppResponseBody self = new ImportAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportAppResponseBody setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ImportAppResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public ImportAppResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ImportAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportAppResponseBody setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
