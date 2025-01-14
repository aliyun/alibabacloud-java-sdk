// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListApprovalSchemasForApprovalProcessesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProcessIds")
    public java.util.List<String> processIds;

    public static ListApprovalSchemasForApprovalProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalSchemasForApprovalProcessesRequest self = new ListApprovalSchemasForApprovalProcessesRequest();
        return TeaModel.build(map, self);
    }

    public ListApprovalSchemasForApprovalProcessesRequest setProcessIds(java.util.List<String> processIds) {
        this.processIds = processIds;
        return this;
    }
    public java.util.List<String> getProcessIds() {
        return this.processIds;
    }

}
