// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UnbindDeviceRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProjectId")
    public String projectId;

    public static UnbindDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindDeviceRequest self = new UnbindDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindDeviceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UnbindDeviceRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public UnbindDeviceRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
