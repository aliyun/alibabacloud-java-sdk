// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeDeviceShadowRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("Path")
    public String path;

    @NameInMap("ViewSubscribed")
    public Boolean viewSubscribed;

    public static DescribeDeviceShadowRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeviceShadowRequest self = new DescribeDeviceShadowRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDeviceShadowRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeDeviceShadowRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public DescribeDeviceShadowRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public DescribeDeviceShadowRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public DescribeDeviceShadowRequest setViewSubscribed(Boolean viewSubscribed) {
        this.viewSubscribed = viewSubscribed;
        return this;
    }
    public Boolean getViewSubscribed() {
        return this.viewSubscribed;
    }

}
