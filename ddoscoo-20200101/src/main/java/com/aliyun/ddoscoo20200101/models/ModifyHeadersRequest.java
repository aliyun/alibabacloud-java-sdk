// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHeadersRequest extends TeaModel {
    /**
     * <p>The key-value pair of the custom header. Key indicates the header name and Value indicates the header value. You can specify up to five key-value pairs. The key-value pairs can be up to 200 characters in length.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li>Do not use X-Forwarded-ClientSrcPort as a custom header.</li>
     * <li>Do not use a standard HTTP header such as User-Agent. If you use a standard HTTP header, the original header may be overwritten.</li>
     * </ul>
     * <blockquote>
     * <p>If you set Key to X-Forwarded-ClientSrcPort, the actual source port of the client that accesses Anti-DDoS Pro or Anti-DDoS Premium (a Layer 7 proxy) is obtained. In this case, the Value is &quot;&quot;.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;X-Forwarded-ClientSrcPort\&quot;:\&quot;\&quot;}</p>
     */
    @NameInMap("CustomHeaders")
    public String customHeaders;

    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p>A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can query resource group IDs in the Anti-DDoS Pro or Anti-DDoS Premium console or by calling the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information of a resource group</a>.</p>
     * </li>
     * <li><p>Before you modify the resource group to which an instance belongs, you can call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation to view the current resource group of the instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmz6jbof5****</p>
     */
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

    public ModifyHeadersRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
