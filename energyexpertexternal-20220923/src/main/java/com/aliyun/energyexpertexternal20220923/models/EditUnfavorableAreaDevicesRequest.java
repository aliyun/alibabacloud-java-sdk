// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class EditUnfavorableAreaDevicesRequest extends TeaModel {
    @NameInMap("factoryId")
    public String factoryId;

    @NameInMap("hvacDeviceConfigVOList")
    public java.util.List<EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList> hvacDeviceConfigVOList;

    @NameInMap("systemId")
    public String systemId;

    public static EditUnfavorableAreaDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        EditUnfavorableAreaDevicesRequest self = new EditUnfavorableAreaDevicesRequest();
        return TeaModel.build(map, self);
    }

    public EditUnfavorableAreaDevicesRequest setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

    public EditUnfavorableAreaDevicesRequest setHvacDeviceConfigVOList(java.util.List<EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList> hvacDeviceConfigVOList) {
        this.hvacDeviceConfigVOList = hvacDeviceConfigVOList;
        return this;
    }
    public java.util.List<EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList> getHvacDeviceConfigVOList() {
        return this.hvacDeviceConfigVOList;
    }

    public EditUnfavorableAreaDevicesRequest setSystemId(String systemId) {
        this.systemId = systemId;
        return this;
    }
    public String getSystemId() {
        return this.systemId;
    }

    public static class EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList extends TeaModel {
        @NameInMap("buildingId")
        public String buildingId;

        @NameInMap("deviceId")
        public String deviceId;

        @NameInMap("deviceName")
        public String deviceName;

        @NameInMap("deviceType")
        public String deviceType;

        @NameInMap("fenceId")
        public String fenceId;

        @NameInMap("floorId")
        public String floorId;

        @NameInMap("isForbidden")
        public Integer isForbidden;

        @NameInMap("isUnfavorableArea")
        public Integer isUnfavorableArea;

        public static EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList build(java.util.Map<String, ?> map) throws Exception {
            EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList self = new EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList();
            return TeaModel.build(map, self);
        }

        public EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList setBuildingId(String buildingId) {
            this.buildingId = buildingId;
            return this;
        }
        public String getBuildingId() {
            return this.buildingId;
        }

        public EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList setFenceId(String fenceId) {
            this.fenceId = fenceId;
            return this;
        }
        public String getFenceId() {
            return this.fenceId;
        }

        public EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList setFloorId(String floorId) {
            this.floorId = floorId;
            return this;
        }
        public String getFloorId() {
            return this.floorId;
        }

        public EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList setIsForbidden(Integer isForbidden) {
            this.isForbidden = isForbidden;
            return this;
        }
        public Integer getIsForbidden() {
            return this.isForbidden;
        }

        public EditUnfavorableAreaDevicesRequestHvacDeviceConfigVOList setIsUnfavorableArea(Integer isUnfavorableArea) {
            this.isUnfavorableArea = isUnfavorableArea;
            return this;
        }
        public Integer getIsUnfavorableArea() {
            return this.isUnfavorableArea;
        }

    }

}
