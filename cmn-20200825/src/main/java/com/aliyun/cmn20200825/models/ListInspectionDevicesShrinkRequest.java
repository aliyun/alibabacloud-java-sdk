// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionDevicesShrinkRequest extends TeaModel {
    @NameInMap("AppState")
    public String appState;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Model")
    public String modelShrink;

    @NameInMap("Role")
    public String role;

    @NameInMap("Space")
    public String space;

    @NameInMap("Vendor")
    public String vendor;

    public static ListInspectionDevicesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionDevicesShrinkRequest self = new ListInspectionDevicesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInspectionDevicesShrinkRequest setAppState(String appState) {
        this.appState = appState;
        return this;
    }
    public String getAppState() {
        return this.appState;
    }

    public ListInspectionDevicesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInspectionDevicesShrinkRequest setModelShrink(String modelShrink) {
        this.modelShrink = modelShrink;
        return this;
    }
    public String getModelShrink() {
        return this.modelShrink;
    }

    public ListInspectionDevicesShrinkRequest setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public ListInspectionDevicesShrinkRequest setSpace(String space) {
        this.space = space;
        return this;
    }
    public String getSpace() {
        return this.space;
    }

    public ListInspectionDevicesShrinkRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
