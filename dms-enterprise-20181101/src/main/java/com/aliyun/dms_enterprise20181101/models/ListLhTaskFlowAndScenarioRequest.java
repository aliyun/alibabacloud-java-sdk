// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLhTaskFlowAndScenarioRequest extends TeaModel {
    /**
     * <p>The ID of the workspace. You can call the [GetLhSpaceByName](https://help.aliyun.com/document_detail/424379.html) operation to obtain the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SpaceId")
    public Long spaceId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) or [ListUserTenants](https://help.aliyun.com/document_detail/198074.html) operation to obtain the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the user. You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetUser](https://help.aliyun.com/document_detail/147098.html) operation to obtain the user ID.</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static ListLhTaskFlowAndScenarioRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLhTaskFlowAndScenarioRequest self = new ListLhTaskFlowAndScenarioRequest();
        return TeaModel.build(map, self);
    }

    public ListLhTaskFlowAndScenarioRequest setSpaceId(Long spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public Long getSpaceId() {
        return this.spaceId;
    }

    public ListLhTaskFlowAndScenarioRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public ListLhTaskFlowAndScenarioRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
