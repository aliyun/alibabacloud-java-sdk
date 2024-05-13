// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ChangeLhDagOwnerRequest extends TeaModel {
    /**
     * <p>The ID of the task flow. You can call the [ListLhTaskFlowAndScenario](https://help.aliyun.com/document_detail/426672.html) operation to obtain the task flow ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DagId")
    public Long dagId;

    /**
     * <p>The ID of the user to be specified as the new owner of the task flow. You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetUser](https://help.aliyun.com/document_detail/147098.html) operation to obtain the user ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerUserId")
    public Long ownerUserId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ChangeLhDagOwnerRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeLhDagOwnerRequest self = new ChangeLhDagOwnerRequest();
        return TeaModel.build(map, self);
    }

    public ChangeLhDagOwnerRequest setDagId(Long dagId) {
        this.dagId = dagId;
        return this;
    }
    public Long getDagId() {
        return this.dagId;
    }

    public ChangeLhDagOwnerRequest setOwnerUserId(Long ownerUserId) {
        this.ownerUserId = ownerUserId;
        return this;
    }
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    public ChangeLhDagOwnerRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
