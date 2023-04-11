// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RevokeTemplateAuthorityRequest extends TeaModel {
    /**
     * <p>The ID of the permission template.</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The IDs of users from whom you want to revoke permissions by using a permission template.</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static RevokeTemplateAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeTemplateAuthorityRequest self = new RevokeTemplateAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public RevokeTemplateAuthorityRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public RevokeTemplateAuthorityRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public RevokeTemplateAuthorityRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
