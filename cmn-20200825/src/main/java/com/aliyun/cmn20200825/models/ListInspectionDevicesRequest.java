// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionDevicesRequest extends TeaModel {
    @NameInMap("AppState")
    public String appState;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Model")
    public java.util.List<String> model;

    @NameInMap("Role")
    public String role;

    @NameInMap("Space")
    public String space;

    @NameInMap("Vendor")
    public String vendor;

    public static ListInspectionDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionDevicesRequest self = new ListInspectionDevicesRequest();
        return TeaModel.build(map, self);
    }

    public ListInspectionDevicesRequest setAppState(String appState) {
        this.appState = appState;
        return this;
    }
    public String getAppState() {
        return this.appState;
    }

    public ListInspectionDevicesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInspectionDevicesRequest setModel(java.util.List<String> model) {
        this.model = model;
        return this;
    }
    public java.util.List<String> getModel() {
        return this.model;
    }

    public ListInspectionDevicesRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListInspectionDevicesRequest setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public ListInspectionDevicesRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
