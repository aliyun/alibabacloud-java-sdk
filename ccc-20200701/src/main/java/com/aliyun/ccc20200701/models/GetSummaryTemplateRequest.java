// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetSummaryTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43c2671b-8939-4223-86d0-6bd187905cc8_1717664210492</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetSummaryTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSummaryTemplateRequest self = new GetSummaryTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetSummaryTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSummaryTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
