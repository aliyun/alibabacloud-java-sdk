// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Module extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("Device")
    public ModuleDevice device;

    @NameInMap("Id")
    public String id;

    @NameInMap("MaxCount")
    public Long maxCount;

    @NameInMap("MinCount")
    public Long minCount;

    @NameInMap("ModuleDetails")
    public java.util.List<ModuleModuleDetails> moduleDetails;

    @NameInMap("ModuleId")
    public String moduleId;

    @NameInMap("ModuleType")
    public String moduleType;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentModuleId")
    public String parentModuleId;

    @NameInMap("Stack")
    public Boolean stack;

    @NameInMap("UpdateTime")
    public String updateTime;

    public static Module build(java.util.Map<String, ?> map) throws Exception {
        Module self = new Module();
        return TeaModel.build(map, self);
    }

    public Module setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public Module setDevice(ModuleDevice device) {
        this.device = device;
        return this;
    }
    public ModuleDevice getDevice() {
        return this.device;
    }

    public Module setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public Module setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
        return this;
    }
    public Long getMaxCount() {
        return this.maxCount;
    }

    public Module setMinCount(Long minCount) {
        this.minCount = minCount;
        return this;
    }
    public Long getMinCount() {
        return this.minCount;
    }

    public Module setModuleDetails(java.util.List<ModuleModuleDetails> moduleDetails) {
        this.moduleDetails = moduleDetails;
        return this;
    }
    public java.util.List<ModuleModuleDetails> getModuleDetails() {
        return this.moduleDetails;
    }

    public Module setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public Module setModuleType(String moduleType) {
        this.moduleType = moduleType;
        return this;
    }
    public String getModuleType() {
        return this.moduleType;
    }

    public Module setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Module setParentModuleId(String parentModuleId) {
        this.parentModuleId = parentModuleId;
        return this;
    }
    public String getParentModuleId() {
        return this.parentModuleId;
    }

    public Module setStack(Boolean stack) {
        this.stack = stack;
        return this;
    }
    public Boolean getStack() {
        return this.stack;
    }

    public Module setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static class ModuleDevice extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("DeviceCount")
        public Long deviceCount;

        @NameInMap("DeviceRole")
        public String deviceRole;

        @NameInMap("DeviceX")
        public String deviceX;

        @NameInMap("DeviceY")
        public String deviceY;

        @NameInMap("Id")
        public String id;

        @NameInMap("Role")
        public String role;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("X")
        public String x;

        @NameInMap("Y")
        public String y;

        public static ModuleDevice build(java.util.Map<String, ?> map) throws Exception {
            ModuleDevice self = new ModuleDevice();
            return TeaModel.build(map, self);
        }

        public ModuleDevice setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ModuleDevice setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ModuleDevice setDeviceCount(Long deviceCount) {
            this.deviceCount = deviceCount;
            return this;
        }
        public Long getDeviceCount() {
            return this.deviceCount;
        }

        public ModuleDevice setDeviceRole(String deviceRole) {
            this.deviceRole = deviceRole;
            return this;
        }
        public String getDeviceRole() {
            return this.deviceRole;
        }

        public ModuleDevice setDeviceX(String deviceX) {
            this.deviceX = deviceX;
            return this;
        }
        public String getDeviceX() {
            return this.deviceX;
        }

        public ModuleDevice setDeviceY(String deviceY) {
            this.deviceY = deviceY;
            return this;
        }
        public String getDeviceY() {
            return this.deviceY;
        }

        public ModuleDevice setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModuleDevice setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ModuleDevice setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ModuleDevice setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public ModuleDevice setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class ModuleModuleDetailsDeviceDetails extends TeaModel {
        @NameInMap("OrderNumber")
        public Long orderNumber;

        public static ModuleModuleDetailsDeviceDetails build(java.util.Map<String, ?> map) throws Exception {
            ModuleModuleDetailsDeviceDetails self = new ModuleModuleDetailsDeviceDetails();
            return TeaModel.build(map, self);
        }

        public ModuleModuleDetailsDeviceDetails setOrderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public Long getOrderNumber() {
            return this.orderNumber;
        }

    }

    public static class ModuleModuleDetails extends TeaModel {
        @NameInMap("DeviceDetails")
        public java.util.List<ModuleModuleDetailsDeviceDetails> deviceDetails;

        @NameInMap("OrderNumber")
        public Long orderNumber;

        public static ModuleModuleDetails build(java.util.Map<String, ?> map) throws Exception {
            ModuleModuleDetails self = new ModuleModuleDetails();
            return TeaModel.build(map, self);
        }

        public ModuleModuleDetails setDeviceDetails(java.util.List<ModuleModuleDetailsDeviceDetails> deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }
        public java.util.List<ModuleModuleDetailsDeviceDetails> getDeviceDetails() {
            return this.deviceDetails;
        }

        public ModuleModuleDetails setOrderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }
        public Long getOrderNumber() {
            return this.orderNumber;
        }

    }

}
