// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class EditProhibitedDevicesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("factoryId")
    public String factoryId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("hvacDeviceConfigVOList")
    public java.util.List<EditProhibitedDevicesRequestHvacDeviceConfigVOList> hvacDeviceConfigVOList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>system1</p>
     */
    @NameInMap("systemId")
    public String systemId;

    public static EditProhibitedDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        EditProhibitedDevicesRequest self = new EditProhibitedDevicesRequest();
        return TeaModel.build(map, self);
    }

    public EditProhibitedDevicesRequest setFactoryId(String factoryId) {
        this.factoryId = factoryId;
        return this;
    }
    public String getFactoryId() {
        return this.factoryId;
    }

    public EditProhibitedDevicesRequest setHvacDeviceConfigVOList(java.util.List<EditProhibitedDevicesRequestHvacDeviceConfigVOList> hvacDeviceConfigVOList) {
        this.hvacDeviceConfigVOList = hvacDeviceConfigVOList;
        return this;
    }
    public java.util.List<EditProhibitedDevicesRequestHvacDeviceConfigVOList> getHvacDeviceConfigVOList() {
        return this.hvacDeviceConfigVOList;
    }

    public EditProhibitedDevicesRequest setSystemId(String systemId) {
        this.systemId = systemId;
        return this;
    }
    public String getSystemId() {
        return this.systemId;
    }

    public static class EditProhibitedDevicesRequestHvacDeviceConfigVOList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>build_01</p>
         */
        @NameInMap("buildingId")
        public String buildingId;

        /**
         * <strong>example:</strong>
         * <p>id1</p>
         */
        @NameInMap("deviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>name1</p>
         */
        @NameInMap("deviceName")
        public String deviceName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("deviceType")
        public String deviceType;

        /**
         * <strong>example:</strong>
         * <p>fence_01</p>
         */
        @NameInMap("fenceId")
        public String fenceId;

        /**
         * <strong>example:</strong>
         * <p>floor_01</p>
         */
        @NameInMap("floorId")
        public String floorId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isForbidden")
        public Integer isForbidden;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("isUnfavorableArea")
        public Integer isUnfavorableArea;

        public static EditProhibitedDevicesRequestHvacDeviceConfigVOList build(java.util.Map<String, ?> map) throws Exception {
            EditProhibitedDevicesRequestHvacDeviceConfigVOList self = new EditProhibitedDevicesRequestHvacDeviceConfigVOList();
            return TeaModel.build(map, self);
        }

        public EditProhibitedDevicesRequestHvacDeviceConfigVOList setBuildingId(String buildingId) {
            this.buildingId = buildingId;
            return this;
        }
        public String getBuildingId() {
            return this.buildingId;
        }

        public EditProhibitedDevicesRequestHvacDeviceConfigVOList setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public EditProhibitedDevicesRequestHvacDeviceConfigVOList setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public EditProhibitedDevicesRequestHvacDeviceConfigVOList setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public EditProhibitedDevicesRequestHvacDeviceConfigVOList setFenceId(String fenceId) {
            this.fenceId = fenceId;
            return this;
        }
        public String getFenceId() {
            return this.fenceId;
        }

        public EditProhibitedDevicesRequestHvacDeviceConfigVOList setFloorId(String floorId) {
            this.floorId = floorId;
            return this;
        }
        public String getFloorId() {
            return this.floorId;
        }

        public EditProhibitedDevicesRequestHvacDeviceConfigVOList setIsForbidden(Integer isForbidden) {
            this.isForbidden = isForbidden;
            return this;
        }
        public Integer getIsForbidden() {
            return this.isForbidden;
        }

        public EditProhibitedDevicesRequestHvacDeviceConfigVOList setIsUnfavorableArea(Integer isUnfavorableArea) {
            this.isUnfavorableArea = isUnfavorableArea;
            return this;
        }
        public Integer getIsUnfavorableArea() {
            return this.isUnfavorableArea;
        }

    }

}
