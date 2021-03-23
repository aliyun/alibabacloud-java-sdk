// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListDeviceModelResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ModelList")
    public java.util.List<ListDeviceModelResponseBodyModelList> modelList;

    public static ListDeviceModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceModelResponseBody self = new ListDeviceModelResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceModelResponseBody setModelList(java.util.List<ListDeviceModelResponseBodyModelList> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<ListDeviceModelResponseBodyModelList> getModelList() {
        return this.modelList;
    }

    public static class ListDeviceModelResponseBodyModelList extends TeaModel {
        @NameInMap("DeviceModelId")
        public Long deviceModelId;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("HardwareType")
        public String hardwareType;

        @NameInMap("DeviceModel")
        public String deviceModel;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

        @NameInMap("CanCreateDeviceId")
        public Integer canCreateDeviceId;

        @NameInMap("InitUsageType")
        public Integer initUsageType;

        @NameInMap("InitUsageTypeDesc")
        public String initUsageTypeDesc;

        @NameInMap("Description")
        public String description;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("SecurityChip")
        public String securityChip;

        @NameInMap("OsPlatform")
        public String osPlatform;

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

        public ListDeviceModelResponseBodyModelList setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListDeviceModelResponseBodyModelList setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public ListDeviceModelResponseBodyModelList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListDeviceModelResponseBodyModelList setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public ListDeviceModelResponseBodyModelList setCanCreateDeviceId(Integer canCreateDeviceId) {
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        public ListDeviceModelResponseBodyModelList setInitUsageType(Integer initUsageType) {
            this.initUsageType = initUsageType;
            return this;
        }
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        public ListDeviceModelResponseBodyModelList setInitUsageTypeDesc(String initUsageTypeDesc) {
            this.initUsageTypeDesc = initUsageTypeDesc;
            return this;
        }
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        public ListDeviceModelResponseBodyModelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeviceModelResponseBodyModelList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDeviceModelResponseBodyModelList setSecurityChip(String securityChip) {
            this.securityChip = securityChip;
            return this;
        }
        public String getSecurityChip() {
            return this.securityChip;
        }

        public ListDeviceModelResponseBodyModelList setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

    }

}
