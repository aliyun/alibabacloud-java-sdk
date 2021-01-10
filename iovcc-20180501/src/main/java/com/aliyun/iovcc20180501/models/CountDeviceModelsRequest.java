// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class CountDeviceModelsRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceModelId")
    public Integer deviceModelId;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("DeviceBrand")
    public String deviceBrand;

    public static CountDeviceModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        CountDeviceModelsRequest self = new CountDeviceModelsRequest();
        return TeaModel.build(map, self);
    }

    public CountDeviceModelsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public CountDeviceModelsRequest setDeviceModelId(Integer deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public Integer getDeviceModelId() {
        return this.deviceModelId;
    }

    public CountDeviceModelsRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public CountDeviceModelsRequest setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

}
