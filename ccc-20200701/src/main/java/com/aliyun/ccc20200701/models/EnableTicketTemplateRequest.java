// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class EnableTicketTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>43c2671b-8939-4223-86d0-6bd187905cc8_1717664210492</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static EnableTicketTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableTicketTemplateRequest self = new EnableTicketTemplateRequest();
        return TeaModel.build(map, self);
    }

    public EnableTicketTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public EnableTicketTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
