// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class UpdateAuthorityTemplateRequest extends TeaModel {
    /**
     * <p>The description of the permission template.</p>
     * <br>
     * <p>>  You must specify the Name or Description parameter. Otherwise, the API call fails.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the permission template.</p>
     * <br>
     * <p>>  You must specify the Name or Description parameter. Otherwise, the API call fails.</p>
     */
    @NameInMap("Name")
    public String name;

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

    public static UpdateAuthorityTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAuthorityTemplateRequest self = new UpdateAuthorityTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAuthorityTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAuthorityTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAuthorityTemplateRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public UpdateAuthorityTemplateRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
