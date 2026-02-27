// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class DeleteDataServiceAppGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>550980364236</p>
     */
    @NameInMap("GroupId")
    public Integer groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static DeleteDataServiceAppGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataServiceAppGroupRequest self = new DeleteDataServiceAppGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataServiceAppGroupRequest setGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }
    public Integer getGroupId() {
        return this.groupId;
    }

    public DeleteDataServiceAppGroupRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
