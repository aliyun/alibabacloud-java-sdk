// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class UpdateDeviceNameRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceName")
    public String deviceName;

    public static UpdateDeviceNameRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceNameRequest self = new UpdateDeviceNameRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceNameRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateDeviceNameRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public UpdateDeviceNameRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public UpdateDeviceNameRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
