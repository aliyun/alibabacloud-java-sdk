// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UpdateUninstallApplicationsStatusRequest extends TeaModel {
    /**
     * <p>The list of uninstall application IDs.</p>
     */
    @NameInMap("ApplicationIds")
    public java.util.List<String> applicationIds;

    /**
     * <p>The status of the uninstall application. Valid values:</p>
     * <ul>
     * <li><strong>Approved</strong>: Approved.</li>
     * <li><strong>Rejected</strong>: Rejected.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateUninstallApplicationsStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUninstallApplicationsStatusRequest self = new UpdateUninstallApplicationsStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUninstallApplicationsStatusRequest setApplicationIds(java.util.List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }
    public java.util.List<String> getApplicationIds() {
        return this.applicationIds;
    }

    public UpdateUninstallApplicationsStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
