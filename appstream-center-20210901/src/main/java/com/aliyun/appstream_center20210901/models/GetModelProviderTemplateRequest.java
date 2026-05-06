// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetModelProviderTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mpt-xxxx</p>
     */
    @NameInMap("ProviderTemplateId")
    public String providerTemplateId;

    public static GetModelProviderTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetModelProviderTemplateRequest self = new GetModelProviderTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetModelProviderTemplateRequest setProviderTemplateId(String providerTemplateId) {
        this.providerTemplateId = providerTemplateId;
        return this;
    }
    public String getProviderTemplateId() {
        return this.providerTemplateId;
    }

}
