// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHeadersRequest extends TeaModel {
    /**
     * <p>The key-value pair of the custom header. The key specifies the header name, and the value specifies the header value. You can specify up to five key-value pairs. The key-value pairs can be up to 200 characters in length.</p>
     * <p>Take note of the following items:</p>
     * <ul>
     * <li><p>Do not use the following default HTTP headers:</p>
     * <ul>
     * <li>X-Forwarded-ClientSrcPort: This header is used to obtain the source ports of clients that access Anti-DDoS Proxy (a Layer 7 proxy).</li>
     * <li>X-Forwarded-ProxyPort: This header is used to obtain the ports of listeners that access Anti-DDoS Proxy (a Layer 7 proxy).</li>
     * <li>X-Forwarded-For: This header is used to obtain the IP addresses of clients that access Anti-DDoS Proxy (a Layer 7 proxy).</li>
     * </ul>
     * </li>
     * <li><p>Do not use standard HTTP headers or specific widely used custom HTTP headers. The standard HTTP headers include Host, User-Agent, Connection, and Upgrade, and the widely used custom HTTP headers include X-Real-IP, X-True-IP, X-Client-IP, Web-Server-Type, WL-Proxy-Client-IP, eEagleEye-RpcID, EagleEye-TraceID, X-Forwarded-Cluster, and X-Forwarded-Proto. If the preceding headers are used, the original content of the headers is overwritten.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p> If you specify a key of X-Forwarded-ClientSrcPort, the system obtains the originating ports of clients that access Anti-DDoS Proxy (a Layer 7 proxy). In this case, the value is an empty string.</p>
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
     * <strong>example:</strong>
     * <p>{&quot;X-Client-IP&quot;:true,&quot;X-True-IP&quot;:true,&quot;Web-Server-Type&quot;:true,&quot;WL-Proxy-Client-IP&quot;:true,&quot;X-Forwarded-Proto&quot;:true}</p>
     */
    @NameInMap("EmbeddedHeaders")
    public String embeddedHeaders;

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
