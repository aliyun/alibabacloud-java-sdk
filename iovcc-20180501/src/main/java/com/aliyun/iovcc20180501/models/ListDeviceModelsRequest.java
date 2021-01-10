// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceModelsRequest extends TeaModel {
    @NameInMap("DeviceModelId")
    public Integer deviceModelId;

    @NameInMap("Length")
    public String length;

    @NameInMap("DeviceModel")
    public String deviceModel;

    @NameInMap("DeviceBrand")
    public String deviceBrand;

    @NameInMap("Start")
    public String start;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("DeviceBrandId")
    public Long deviceBrandId;

    public static ListDeviceModelsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceModelsRequest self = new ListDeviceModelsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceModelsRequest setDeviceModelId(Integer deviceModelId) {
        this.deviceModelId = deviceModelId;
        return this;
    }
    public Integer getDeviceModelId() {
        return this.deviceModelId;
    }

    public ListDeviceModelsRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public ListDeviceModelsRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public ListDeviceModelsRequest setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
        return this;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    public ListDeviceModelsRequest setStart(String start) {
        this.start = start;
        return this;
    }
    public String getStart() {
        return this.start;
    }

    public ListDeviceModelsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListDeviceModelsRequest setDeviceBrandId(Long deviceBrandId) {
        this.deviceBrandId = deviceBrandId;
        return this;
    }
    public Long getDeviceBrandId() {
        return this.deviceBrandId;
    }

}
