// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetBroadcastTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BS1b2WNnRMu4ouRzT4clY9Jhg</p>
     */
    @NameInMap("templateId")
    public String templateId;

    public static GetBroadcastTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBroadcastTemplateRequest self = new GetBroadcastTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetBroadcastTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
