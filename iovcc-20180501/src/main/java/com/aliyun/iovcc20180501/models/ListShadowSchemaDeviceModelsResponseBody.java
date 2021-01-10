// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListShadowSchemaDeviceModelsResponseBody extends TeaModel {
    @NameInMap("ModelList")
    public java.util.List<ListShadowSchemaDeviceModelsResponseBodyModelList> modelList;

    @NameInMap("RequestId")
    public String requestId;

    public static ListShadowSchemaDeviceModelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListShadowSchemaDeviceModelsResponseBody self = new ListShadowSchemaDeviceModelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListShadowSchemaDeviceModelsResponseBody setModelList(java.util.List<ListShadowSchemaDeviceModelsResponseBodyModelList> modelList) {
        this.modelList = modelList;
        return this;
    }
    public java.util.List<ListShadowSchemaDeviceModelsResponseBodyModelList> getModelList() {
        return this.modelList;
    }

    public ListShadowSchemaDeviceModelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListShadowSchemaDeviceModelsResponseBodyModelList extends TeaModel {
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
        public Integer securityChip;

        @NameInMap("Description")
        public String description;

        @NameInMap("InitUsageTypeDesc")
        public String initUsageTypeDesc;

        @NameInMap("InitUsageType")
        public Integer initUsageType;

        @NameInMap("DeviceBrand")
        public String deviceBrand;

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

        public ListShadowSchemaDeviceModelsResponseBodyModelList setHardwareType(String hardwareType) {
            this.hardwareType = hardwareType;
            return this;
        }
        public String getHardwareType() {
            return this.hardwareType;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setCanCreateDeviceId(Integer canCreateDeviceId) {
            this.canCreateDeviceId = canCreateDeviceId;
            return this;
        }
        public Integer getCanCreateDeviceId() {
            return this.canCreateDeviceId;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setOsPlatform(String osPlatform) {
            this.osPlatform = osPlatform;
            return this;
        }
        public String getOsPlatform() {
            return this.osPlatform;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
            return this;
        }
        public String getDeviceModel() {
            return this.deviceModel;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setSecurityChip(Integer securityChip) {
            this.securityChip = securityChip;
            return this;
        }
        public Integer getSecurityChip() {
            return this.securityChip;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setInitUsageTypeDesc(String initUsageTypeDesc) {
            this.initUsageTypeDesc = initUsageTypeDesc;
            return this;
        }
        public String getInitUsageTypeDesc() {
            return this.initUsageTypeDesc;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setInitUsageType(Integer initUsageType) {
            this.initUsageType = initUsageType;
            return this;
        }
        public Integer getInitUsageType() {
            return this.initUsageType;
        }

        public ListShadowSchemaDeviceModelsResponseBodyModelList setDeviceBrand(String deviceBrand) {
            this.deviceBrand = deviceBrand;
            return this;
        }
        public String getDeviceBrand() {
            return this.deviceBrand;
        }

    }

}
