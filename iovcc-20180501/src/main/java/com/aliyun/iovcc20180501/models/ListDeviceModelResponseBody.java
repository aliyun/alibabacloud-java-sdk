// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceModelResponseBody extends TeaModel {
    @NameInMap("ModelList")
    public java.util.List<ListDeviceModelResponseBodyModelList> modelList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListDeviceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceModelResponseBody self = new ListDeviceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceModelResponseBody setModelList(java.util.List<ListDeviceModelResponseBodyModelList> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<ListDeviceModelResponseBodyModelList> getModelList() {
        return this.modelList;
    }

    public ListDeviceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListDeviceModelResponseBodyModelList extends TeaModel {
        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("HardwareType")
        public String hardwareType;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("CanCreateDeviceId")
        public Integer canCreateDeviceId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("OsPlatform")
        public String osPlatform;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("SecurityChip")
        public String securityChip;

        @NameInMap("Description")
        public String description;

        @NameInMap("InitUsageTypeDesc")
        public String initUsageTypeDesc;

        @NameInMap("InitUsageType")
        public Integer initUsageType;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

        public static ListDeviceModelResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceModelResponseBodyModelList self = new ListDeviceModelResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public ListDeviceModelResponseBodyModelList setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public ListDeviceModelResponseBodyModelList setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public ListDeviceModelResponseBodyModelList setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDeviceModelResponseBodyModelList setCanCreateDeviceId(Integer canCreateDeviceId) {
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        public ListDeviceModelResponseBodyModelList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDeviceModelResponseBodyModelList setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

        public ListDeviceModelResponseBodyModelList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListDeviceModelResponseBodyModelList setSecurityChip(String securityChip) {
            this.securityChip = securityChip;
            return this;
        }
        public String getSecurityChip() {
            return this.securityChip;
        }

        public ListDeviceModelResponseBodyModelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeviceModelResponseBodyModelList setInitUsageTypeDesc(String initUsageTypeDesc) {
            this.initUsageTypeDesc = initUsageTypeDesc;
            return this;
        }
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        public ListDeviceModelResponseBodyModelList setInitUsageType(Integer initUsageType) {
            this.initUsageType = initUsageType;
            return this;
        }
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        public ListDeviceModelResponseBodyModelList setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

    }

}
