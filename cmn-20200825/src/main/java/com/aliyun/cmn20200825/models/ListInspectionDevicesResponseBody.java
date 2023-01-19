// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionDevicesResponseBody extends TeaModel {
    @NameInMap("InspectionScripts")
    public java.util.List<ListInspectionDevicesResponseBodyInspectionScripts> inspectionScripts;

    @NameInMap("RequestId")
    public String requestId;

    public static ListInspectionDevicesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionDevicesResponseBody self = new ListInspectionDevicesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInspectionDevicesResponseBody setInspectionScripts(java.util.List<ListInspectionDevicesResponseBodyInspectionScripts> inspectionScripts) {
        this.inspectionScripts = inspectionScripts;
        return this;
    }
    public java.util.List<ListInspectionDevicesResponseBodyInspectionScripts> getInspectionScripts() {
        return this.inspectionScripts;
    }

    public ListInspectionDevicesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListInspectionDevicesResponseBodyInspectionScripts extends TeaModel {
        @NameInMap("AppState")
        public String appState;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("DeviceState")
        public String deviceState;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("ManageIp")
        public String manageIp;

        @NameInMap("Model")
        public String model;

        @NameInMap("Role")
        public String role;

        @NameInMap("Space")
        public String space;

        @NameInMap("Vendor")
        public String vendor;

        public static ListInspectionDevicesResponseBodyInspectionScripts build(java.util.Map<String, ?> map) throws Exception {
            ListInspectionDevicesResponseBodyInspectionScripts self = new ListInspectionDevicesResponseBodyInspectionScripts();
            return TeaModel.build(map, self);
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setAppState(String appState) {
            this.appState = appState;
            return this;
        }
        public String getAppState() {
            return this.appState;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setDeviceState(String deviceState) {
            this.deviceState = deviceState;
            return this;
        }
        public String getDeviceState() {
            return this.deviceState;
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

        public ListInspectionDevicesResponseBodyInspectionScripts setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setSpace(String space) {
            this.space = space;
            return this;
        }
        public String getSpace() {
            return this.space;
        }

        public ListInspectionDevicesResponseBodyInspectionScripts setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }
        public String getVendor() {
            return this.vendor;
        }

    }

}
