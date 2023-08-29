// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetNodeByUrlShrinkRequest extends TeaModel {
    @NameInMap("Option")
    public String optionShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("Url")
    public String url;

    public static GetNodeByUrlShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeByUrlShrinkRequest self = new GetNodeByUrlShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeByUrlShrinkRequest setOptionShrink(String optionShrink) {
        this.optionShrink = optionShrink;
        return this;
    }
    public String getOptionShrink() {
        return this.optionShrink;
    }

    public GetNodeByUrlShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GetNodeByUrlShrinkRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
