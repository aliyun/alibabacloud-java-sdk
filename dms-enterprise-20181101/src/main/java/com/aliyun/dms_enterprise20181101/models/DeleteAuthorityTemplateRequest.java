// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteAuthorityTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the permission template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2592</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteAuthorityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorityTemplateRequest self = new DeleteAuthorityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorityTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public DeleteAuthorityTemplateRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
