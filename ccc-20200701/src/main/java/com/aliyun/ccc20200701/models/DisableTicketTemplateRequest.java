// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DisableTicketTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TemplateId")
    public String templateId;

    public static DisableTicketTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableTicketTemplateRequest self = new DisableTicketTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DisableTicketTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableTicketTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
