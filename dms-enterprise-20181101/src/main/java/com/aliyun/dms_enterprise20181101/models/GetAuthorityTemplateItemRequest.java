// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetAuthorityTemplateItemRequest extends TeaModel {
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

    public static GetAuthorityTemplateItemRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorityTemplateItemRequest self = new GetAuthorityTemplateItemRequest();
        return TeaModel.build(map, self);
    }

    public GetAuthorityTemplateItemRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public GetAuthorityTemplateItemRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
