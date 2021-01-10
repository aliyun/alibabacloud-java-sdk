// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDevicesRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceModelId")
    public Integer deviceModelId;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("Start")
    public String start;

    @NameInMap("Length")
    public String length;

    public static ListDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDevicesRequest self = new ListDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListDevicesRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListDevicesRequest setDeviceModelId(Integer deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public Integer getDeviceModelId() {
        return this.deviceModelId;
    }

    public ListDevicesRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public ListDevicesRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public ListDevicesRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

}
