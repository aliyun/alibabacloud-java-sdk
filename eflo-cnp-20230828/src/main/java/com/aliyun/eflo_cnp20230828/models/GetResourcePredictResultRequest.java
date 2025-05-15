// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetResourcePredictResultRequest extends TeaModel {
    /**
     * <p>Resource ID</p>
     * 
     * <strong>example:</strong>
     * <p>36</p>
     */
    @NameInMap("ResourceId")
    public Long resourceId;

    /**
     * <p>Template ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>315797</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    public static GetResourcePredictResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourcePredictResultRequest self = new GetResourcePredictResultRequest();
        return TeaModel.build(map, self);
    }

    public GetResourcePredictResultRequest setResourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public Long getResourceId() {
        return this.resourceId;
    }

    public GetResourcePredictResultRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

}
