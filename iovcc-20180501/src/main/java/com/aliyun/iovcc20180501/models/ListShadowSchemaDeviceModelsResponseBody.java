// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListShadowSchemaDeviceModelsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ModelList")
    public java.util.List<ListShadowSchemaDeviceModelsResponseBodyModelList> modelList;

    public static ListShadowSchemaDeviceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShadowSchemaDeviceModelsResponseBody self = new ListShadowSchemaDeviceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShadowSchemaDeviceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListShadowSchemaDeviceModelsResponseBody setModelList(java.util.List<ListShadowSchemaDeviceModelsResponseBodyModelList> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<ListShadowSchemaDeviceModelsResponseBodyModelList> getModelList() {
        return this.modelList;
    }

    public static class ListShadowSchemaDeviceModelsResponseBodyModelList extends TeaModel {
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
        public Integer securityChip;

        @NameInMap("OsPlatform")
        public String osPlatform;

        public static ListShadowSchemaDeviceModelsResponseBodyModelList build(java.util.Map<String, ?> map) throws Exception {
            ListShadowSchemaDeviceModelsResponseBodyModelList self = new ListShadowSchemaDeviceModelsResponseBodyModelList();
            return TeaModel.build(map, self);
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDeviceModelId(Long deviceModelId) {
            this.deviceModelId = deviceModelId;
            return this;
        }
        public Long getDeviceModelId() {
            return this.deviceModelId;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setCanCreateDeviceId(Integer canCreateDeviceId) {
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setInitUsageType(Integer initUsageType) {
            this.initUsageType = initUsageType;
            return this;
        }
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setInitUsageTypeDesc(String initUsageTypeDesc) {
            this.initUsageTypeDesc = initUsageTypeDesc;
            return this;
        }
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setSecurityChip(Integer securityChip) {
            this.securityChip = securityChip;
            return this;
        }
        public Integer getSecurityChip() {
            return this.securityChip;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

    }

}
