// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class ListInspectionTaskReportsRequest extends TeaModel {
    @NameInMap("InspectionItemId")
    public String inspectionItemId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Vendor")
    public String vendor;

    public static ListInspectionTaskReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInspectionTaskReportsRequest self = new ListInspectionTaskReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListInspectionTaskReportsRequest setInspectionItemId(String inspectionItemId) {
        this.inspectionItemId = inspectionItemId;
        return this;
    }
    public String getInspectionItemId() {
        return this.inspectionItemId;
    }

    public ListInspectionTaskReportsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInspectionTaskReportsRequest setVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }
    public String getVendor() {
        return this.vendor;
    }

}
