// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateExcessiveDeviceRegistrationApplicationsStatusRequest extends TeaModel {
    /**
     * <p>List of IDs for device registration applications that exceed your quota.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>Status of the device registration application. Valid values:</p>
     * <ul>
     * <li><p><strong>Approved</strong>: Approve the application. You can approve only applications with a Pending status.</p>
     * </li>
     * <li><p><strong>Rejected</strong>: Reject the application. You can reject only applications with a Pending status.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateExcessiveDeviceRegistrationApplicationsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExcessiveDeviceRegistrationApplicationsStatusRequest self = new UpdateExcessiveDeviceRegistrationApplicationsStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExcessiveDeviceRegistrationApplicationsStatusRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public UpdateExcessiveDeviceRegistrationApplicationsStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
