// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPriorityRequest extends TeaModel {
    /**
     * <p>The UUID of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3770d603-3534-4878-b845-f00095ee5048</p>
     */
    @NameInMap("AclUuid")
    public String aclUuid;

    /**
     * <p>The priority of the access control policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Order")
    public String order;

    public static ModifyControlPolicyPriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyPriorityRequest self = new ModifyControlPolicyPriorityRequest();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyPriorityRequest setAclUuid(String aclUuid) {
        this.aclUuid = aclUuid;
        return this;
    }
    public String getAclUuid() {
        return this.aclUuid;
    }

    public ModifyControlPolicyPriorityRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

}
