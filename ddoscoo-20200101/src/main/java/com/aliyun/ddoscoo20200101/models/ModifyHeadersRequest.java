// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyHeadersRequest extends TeaModel {
    /**
     * <p>The custom header, specified as a key-value pair. The key is the header name and the value is the header value. You can specify up to 5 key-value pairs. The total length cannot exceed 200 characters.</p>
     * <p>Important:</p>
     * <ul>
     * <li><ul>
     * <li><p>X-Forwarded-ClientSrcPort: Used by default to retrieve the client port that accesses the Layer 7 engine of Anti-DDoS Pro.</p>
     * </li>
     * <li><p>X-Forwarded-ProxyPort: Used by default to retrieve the listening port of the Layer 7 engine of Anti-DDoS Pro.</p>
     * </li>
     * <li><p>X-Forwarded-For: Used by default to retrieve the client IP address that accesses the Layer 7 engine of Anti-DDoS Pro.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>Do not use standard HTTP header fields (such as <code>host</code>, <code>user-agent</code>, <code>connection</code>, and <code>upgrade</code>) or common custom HTTP header fields (such as <code>x-real-ip</code>, <code>x-true-ip</code>, <code>x-client-ip</code>, <code>web-server-type</code>, <code>wl-proxy-client-ip</code>, <code>eagleeye-rpcid</code>, <code>eagleeye-traceid</code>, <code>x-forwarded-cluster</code>, and <code>x-forwarded-proto</code>) as they will overwrite the original header values in requests.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To use the <code>X-Forwarded-ClientSrcPort</code> key to retrieve the client port that accesses the Layer 7 engine of Anti-DDoS Pro, set the value to <code>&quot;&quot;</code>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;X-Forwarded-ClientSrcPort&quot;:&quot;&quot;}</p>
     */
    @NameInMap("CustomHeaders")
    public String customHeaders;

    /**
     * <p>The domain of the website.</p>
     * <blockquote>
     * <p>A website service forwarding rule must be configured for the domain. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all your domains.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.aliyundoc.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The forwarding configuration for request headers. This parameter is a JSON string of key-value pairs where the key is the header field name and the value is a boolean. Set the value to <code>true</code> to enable forwarding or <code>false</code> to disable it.</p>
     * <p>Field description:</p>
     * <p><code>X-Client-IP</code>: Forwards the client\&quot;s real IP address.</p>
     * <p><code>X-True-IP</code>: Forwards the client\&quot;s connection IP address.</p>
     * <p><code>Web-Server-Type</code>: Informs the back-end server about the type of front-end web server or proxy that is handling the request.</p>
     * <p><code>WL-Proxy-Client-IP</code>: A request header specific to Oracle WebLogic Server that provides the same functionality as <code>X-Client-IP</code>.</p>
     * <p><code>X-Forwarded-Proto</code>: Indicates the protocol used for the connection between the client and the first proxy.</p>
     * <p>Important:</p>
     * <ul>
     * <li><p><strong>Supported Headers</strong>: The configuration supports only the five preset header fields listed above.</p>
     * </li>
     * <li><p><strong>Default settings</strong>: All the listed header fields are enabled by default. To make changes, you must explicitly set the corresponding value to <code>false</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;X-Client-IP&quot;:true,&quot;X-True-IP&quot;:true,&quot;Web-Server-Type&quot;:true,&quot;WL-Proxy-Client-IP&quot;:true,&quot;X-Forwarded-Proto&quot;:true}</p>
     */
    @NameInMap("EmbeddedHeaders")
    public String embeddedHeaders;

    /**
     * <p>The ID of the resource group.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/158855.html">ListResourceGroups</a> operation or use the console to obtain a list of resource group IDs. For more information, see <a href="https://help.aliyun.com/document_detail/151181.html">View basic information about a resource group</a>.</li>
     * </ul>
     * </blockquote>
     * <ul>
     * <li>To find the current resource group of an instance before changing it, call the <a href="https://help.aliyun.com/document_detail/158866.html">ListResources</a> operation.</li>
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
