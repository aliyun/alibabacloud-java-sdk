// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GrantTemplateAuthorityRequest extends TeaModel {
    /**
     * <p>The reason why you want to grant permissions on resources to the users by using the permission template.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The time when the permission expires. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
     */
    @NameInMap("ExpireDate")
    public String expireDate;

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
     * <p>The IDs of users to which you want to grant permissions on resources by using the permission template.</p>
     */
    @NameInMap("UserIds")
    public String userIds;

    public static GrantTemplateAuthorityRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantTemplateAuthorityRequest self = new GrantTemplateAuthorityRequest();
        return TeaModel.build(map, self);
    }

    public GrantTemplateAuthorityRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public GrantTemplateAuthorityRequest setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public GrantTemplateAuthorityRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public GrantTemplateAuthorityRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GrantTemplateAuthorityRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

}
