// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteTicketTemplateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ef1e71e9-ae9d-487c-96ad-9181d85cf802</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p><strong>43c2671b-8939-4223-</strong>*-6bd187905cc8_1717664210492</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteTicketTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTicketTemplateRequest self = new DeleteTicketTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTicketTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteTicketTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
