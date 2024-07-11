// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GrantTemplateAuthorityRequest extends TeaModel {
    /**
     * <p>The reason why you want to grant permissions on resources to the users by using the permission template.</p>
     * 
     * <strong>example:</strong>
     * <p>Business test.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The time when the permission expires. Specify the time in the yyyy-MM-DD HH:mm:ss format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-08 17:58:53</p>
     */
    @NameInMap("ExpireDate")
    public String expireDate;

    /**
     * <p>The ID of the permission template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1563</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The IDs of users to which you want to grant permissions on resources by using the permission template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[12***,34***,56***]</p>
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
