// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetOnlineDDLProgressRequest extends TeaModel {
    /**
     * <p>The ID of the OnlineDDL SQL task details. You can call the [ListDBTaskSQLJobDetail](https://help.aliyun.com/document_detail/207073.html) operation to obtain the task detail ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobDetailId")
    public Long jobDetailId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetOnlineDDLProgressRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOnlineDDLProgressRequest self = new GetOnlineDDLProgressRequest();
        return TeaModel.build(map, self);
    }

    public GetOnlineDDLProgressRequest setJobDetailId(Long jobDetailId) {
        this.jobDetailId = jobDetailId;
        return this;
    }
    public Long getJobDetailId() {
        return this.jobDetailId;
    }

    public GetOnlineDDLProgressRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
