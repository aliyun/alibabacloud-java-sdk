// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class SetTokenPlanOrgInviteConfigRequest extends TeaModel {
    /**
     * <p>The ID of the organization role assigned by default. Valid values:</p>
     * <ul>
     * <li>SYSTEM_ROLE_ORG_ADMIN</li>
     * <li>SYSTEM_ROLE_ORG_MEMBER</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ORG_MEMBER</p>
     */
    @NameInMap("DefaultRoleId")
    public String defaultRoleId;

    /**
     * <p>The default seat allocation policy. Valid values:</p>
     * <ul>
     * <li>HIGH_TO_LOW</li>
     * <li>LOW_TO_HIGH</li>
     * <li>NONE</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NONE</p>
     */
    @NameInMap("SeatAssignStrategy")
    public String seatAssignStrategy;

    public static SetTokenPlanOrgInviteConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetTokenPlanOrgInviteConfigRequest self = new SetTokenPlanOrgInviteConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetTokenPlanOrgInviteConfigRequest setDefaultRoleId(String defaultRoleId) {
        this.defaultRoleId = defaultRoleId;
        return this;
    }
    public String getDefaultRoleId() {
        return this.defaultRoleId;
    }

    public SetTokenPlanOrgInviteConfigRequest setSeatAssignStrategy(String seatAssignStrategy) {
        this.seatAssignStrategy = seatAssignStrategy;
        return this;
    }
    public String getSeatAssignStrategy() {
        return this.seatAssignStrategy;
    }

}
