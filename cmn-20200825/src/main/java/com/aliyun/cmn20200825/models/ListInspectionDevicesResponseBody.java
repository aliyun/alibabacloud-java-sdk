// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionDevicesResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // content
    @NameInMap("InspectionScripts")
    public java.util.List<ListInspectionDevicesResponseBodyInspectionScripts> inspectionScripts;

    public static ListInspectionDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionDevicesResponseBody self = new ListInspectionDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectionDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInspectionDevicesResponseBody setInspectionScripts(java.util.List<ListInspectionDevicesResponseBodyInspectionScripts> inspectionScripts) {
        this.inspectionScripts = inspectionScripts;
        return this;
    }
    public java.util.List<ListInspectionDevicesResponseBodyInspectionScripts> getInspectionScripts() {
        return this.inspectionScripts;
    }

    public static class ListInspectionDevicesResponseBodyInspectionScripts extends TeaModel {
        // 角色
        @NameInMap("Role")
        public String role;

        // 厂商
        @NameInMap("Vendor")
        public String vendor;

        // 型号
        @NameInMap("Model")
        public String model;

        // 主机名
        @NameInMap("HostName")
        public String hostName;

        // 管理ip
        @NameInMap("ManageIp")
        public String manageIp;

        // 设备状态
        @NameInMap("DeviceState")
        public String deviceState;

        // 物理空间
        @NameInMap("Space")
        public String space;

        // 设备id
        @NameInMap("DeviceId")
        public String deviceId;

        public static ListInspectionDevicesResponseBodyInspectionScripts build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionDevicesResponseBodyInspectionScripts self = new ListInspectionDevicesResponseBodyInspectionScripts();
            return TeaModel.build(map, self);
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setManageIp(String manageIp) {
            this.manageIp = manageIp;
            return this;
        }
        public String getManageIp() {
            return this.manageIp;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setSpace(String space) {
            this.space = space;
            return this;
        }
        public String getSpace() {
            return this.space;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

    }

}
