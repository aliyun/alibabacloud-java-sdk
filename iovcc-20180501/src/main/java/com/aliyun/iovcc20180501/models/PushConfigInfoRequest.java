// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class PushConfigInfoRequest extends TeaModel {
    // 项目ID
    @NameInMap("ProjectId")
    public String projectId;

    // 主机设备id
    @NameInMap("HostDeviceId")
    public String hostDeviceId;

    // 配置信息
    @NameInMap("Config")
    public String config;

    public static PushConfigInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        PushConfigInfoRequest self = new PushConfigInfoRequest();
        return TeaModel.build(map, self);
    }

    public PushConfigInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public PushConfigInfoRequest setHostDeviceId(String hostDeviceId) {
        this.hostDeviceId = hostDeviceId;
        return this;
    }
    public String getHostDeviceId() {
        return this.hostDeviceId;
    }

    public PushConfigInfoRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

}
