// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DeleteModelProviderTemplateRequest extends TeaModel {
    /**
     * <p>The ID of the model provider template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mpt-xxxx</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    public static DeleteModelProviderTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelProviderTemplateRequest self = new DeleteModelProviderTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteModelProviderTemplateRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

}
