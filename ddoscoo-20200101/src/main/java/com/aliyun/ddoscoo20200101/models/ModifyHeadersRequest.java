// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHeadersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustomHeaders")
    public String customHeaders;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <strong>example:</strong>
     * <p>{&quot;X-Client-IP&quot;:true,&quot;X-True-IP&quot;:true,&quot;Web-Server-Type&quot;:true,&quot;WL-Proxy-Client-IP&quot;:true,&quot;X-Forwarded-Proto&quot;:true}</p>
     */
    @NameInMap("EmbeddedHeaders")
    public String embeddedHeaders;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static ModifyHeadersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyHeadersRequest self = new ModifyHeadersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyHeadersRequest setCustomHeaders(String customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }
    public String getCustomHeaders() {
        return this.customHeaders;
    }

    public ModifyHeadersRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ModifyHeadersRequest setEmbeddedHeaders(String embeddedHeaders) {
        this.embeddedHeaders = embeddedHeaders;
        return this;
    }
    public String getEmbeddedHeaders() {
        return this.embeddedHeaders;
    }

    public ModifyHeadersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
