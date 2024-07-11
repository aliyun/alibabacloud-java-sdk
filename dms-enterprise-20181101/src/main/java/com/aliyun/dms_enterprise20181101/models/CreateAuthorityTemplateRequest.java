// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateAuthorityTemplateRequest extends TeaModel {
    /**
     * <p>The description of the permission template.</p>
     * 
     * <strong>example:</strong>
     * <p>This template is used for business testing.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the permission template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test template.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateAuthorityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorityTemplateRequest self = new CreateAuthorityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorityTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAuthorityTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAuthorityTemplateRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
